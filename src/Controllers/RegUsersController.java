package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.UserDAO;
import dao.UserDAOImp;
import model.Usuario;
import views.GUI;
import views.RegistroUsuarios;

/**
 *
 * Controla la ventana para registrar usuarios
 */
public class RegUsersController {
    
    private AdminController admin;
    private RegistroUsuarios reg;
    private UserDAO usuarioDAO;

    public RegUsersController(AdminController admin) {
        this.admin = admin;
        this.reg = new RegistroUsuarios();
        this.usuarioDAO = new UserDAOImp();
        this.cambiarPanel();
        this.next();
    }
    
    private void cambiarPanel() {
        GUI ventana = admin.getPrincipal().getVentana();
        ventana.setSize(reg.getWidth() + 18, reg.getHeight() + 46);
        ventana.setLocationRelativeTo(null);
        ventana.getMainPanel().removeAll();
        ventana.getMainPanel().add(reg);
        ventana.getMainPanel().revalidate();
        ventana.repaint();
        ventana.setResizable(true);
    }
    
    private void next() {
        this.reg.getbtnDevolver().addActionListener((ActionEvent ev) -> {
            this.admin.cambiarPanel();
        });
        this.reg.getbtnRegistrar().addActionListener((ActionEvent ev) -> {
            this.registrarUsuario();
        });
    }
    
    private void registrarUsuario() {
        try {
            boolean actividadUsuario = false;
            short rolUsuario = 0;
            String cedula = reg.getjtCedula().getText();
            String nombre = reg.getjtNombre().getText();
            String apellido = reg.getjtApellido().getText();
            String celular = reg.getjtCelular().getText();
            String email = reg.getjtEmail().getText();
            char[] password = reg.getjtContrasenia().getPassword();
            String rol = reg.getcbRol().getSelectedItem().toString();
            String actividad = reg.getcbActividad().getSelectedItem().toString();

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
                    rolUsuario =  0;
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

                    if (!usuarioRegistado(id)) {
                        usuarioDAO.insertUser(usuario);
                        reg.getlabelMensaje().setText("Usuario registrado");
                    } else{
                        reg.getlabelMensaje().setText("El usuario ya existe");
                    }                                                   
                }else{
                    reg.getlabelMensaje().setText("La contraseña debe tener al menos 8 caracteres");
                }
            }else{
                reg.getlabelMensaje().setText("Completar todos los campos!");
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