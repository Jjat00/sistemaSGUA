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
public class RegUsersController implements ActionListener {
    
    private GUI ventana;
    private RegistroUsuarios reg;
    private UserDAO usuarioDAO;

    public RegUsersController(GUI ventana) {
        this.ventana = ventana;
        this.reg = new RegistroUsuarios();
        this.usuarioDAO = new UserDAOImp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.cambiarPanel();
        this.reg.getbtnDevolver().addActionListener(new GesUsersController(ventana));
        this.reg.getbtnRegistrar().addActionListener(new registrarUsuario());
    }
    
    private void cambiarPanel() {
        this.ventana.setSize(reg.getWidth() + 18, reg.getHeight() + 46);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.getMainPanel().removeAll();
        this.ventana.getMainPanel().add(reg);
        this.ventana.getMainPanel().revalidate();
        this.ventana.repaint();
    }
    
    private class registrarUsuario implements ActionListener {

        private short rolUsuario;
        private boolean actividadUsuario;

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
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
}