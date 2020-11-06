package Controllers;

import java.awt.event.ActionEvent;

import dao.UserDAO;
import dao.UserDAOImp;
import model.Usuario;
import views.GUI;
import views.ModificarUsuarios;

/**
 *
 * Controla la ventana para modificar usuarios
 */
public class ModUsersController {
    
    private AdminController admin;
    private ModificarUsuarios mod;
    private UserDAO usuarioDAO;

    public ModUsersController(AdminController admin) {
        this.admin = admin;
        this.mod = new ModificarUsuarios();
        this.usuarioDAO = new UserDAOImp();
        this.cambiarPanel();
        this.next();
    }
    
    private void cambiarPanel() {
        GUI ventana = admin.getPrincipal().getVentana();
        ventana.setSize(mod.getWidth() + 18, mod.getHeight() + 46);
        ventana.setLocationRelativeTo(null);
        ventana.getMainPanel().removeAll();
        ventana.getMainPanel().add(mod);
        ventana.getMainPanel().revalidate();
        ventana.repaint();
    }
    
    private void next() {
        this.mod.getbtnDevolver().addActionListener((ActionEvent ev) -> {
            this.admin.cambiarPanel();
        });
        this.mod.getbtnModificar().addActionListener((ActionEvent ev) -> {
            this.modificarUsuario();
        });
    }
    
    private void modificarUsuario() {
        try {
            boolean actividadUsuario = false;
            short rolUsuario = 0;
            String cedula = mod.getjtCedula().getText();
            String nombre = mod.getjtNombre().getText();
            String apellido = mod.getjtApellido().getText();
            String celular = mod.getjtCelular().getText();
            String email = mod.getjtEmail().getText();
            char[] password = mod.getjtContrasenia().getPassword();
            String rol = mod.getcbRol().getSelectedItem().toString();
            String actividad = mod.getcbActividad().getSelectedItem().toString();       

            switch (rol) {
                case "Administrador":
                    rolUsuario = 1;
                    break;
                case "Gerente":
                    rolUsuario = 2;
                    break;
                case "Operador":
                    rolUsuario = 3;
                    break;
                default:
                    rolUsuario = 0;
                    break;
            }

            switch (actividad) {
                case "Activo":
                    actividadUsuario = true;
                    break;
                case "Inactivo":
                    actividadUsuario = false;
                    break;
                default:
                    break;
            }

            if (!(cedula.equals("") || nombre.equals("") || apellido.equals("") || celular.equals("")
                    || email.equals("") || password.length == 0 || rol.equals("Seleccione un rol...")
                    || actividad.equals("Seleccione la actividad..."))) {
                System.out.println(password.length);
                if (password.length > 7) {
                    Long id = Long.parseLong(cedula);
                    Long cel = Long.parseLong(celular);
                    String psw = String.valueOf(password);
                    Usuario usuario = new Usuario(id, rolUsuario, nombre, apellido, actividadUsuario, cel, email, psw);

                    System.out.println(usuario.toString());

                    if (usuarioRegistado(id)) {
                        usuarioDAO.updateUser(usuario);
                        mod.getcbMensaje().setText("Usuario actualizado");
                    } else {
                        mod.getcbMensaje().setText("El usuario no existe");
                    }
                } else {
                    mod.getcbMensaje().setText("La contraseña debe tener al menos 8 caracteres");
                }
            } else {
                mod.getcbMensaje().setText("Completar todos los campos!");
            }                                
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
    
    private boolean usuarioRegistado(Long idUsuario) {
        Boolean registrado = false;
        try {
            Usuario usuario = usuarioDAO.selectUser(idUsuario);
            registrado = (usuario != null);
        } catch (Exception e) {
            System.out.println(e);
        }
        return registrado;
    }
}