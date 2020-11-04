package Controllers;

import dao.UserDAO;
import dao.UserDAOImp;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import model.Usuario;
import views.GUI;
import views.Login;

/**
 *
 * Controlador del inicio de sesión
 */
public class LoginController implements ActionListener {

    private GUI ventana;
    private Login login;
    private UserDAO user;

    public LoginController(GUI gui) {
        this.ventana = gui;
        this.user = new UserDAOImp();
        this.login = new Login();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.cambiarPanel();
        this.login.getbtnIngresoLogin().addActionListener(new TryLogin());
        this.login.getbtnExitLogin().addActionListener((ActionEvent ev) -> {
            new controllers.MainController(ventana);
        });
    }
    
    private void cambiarPanel() {
        this.ventana.setSize(login.getWidth() + 18, login.getHeight() + 46);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.getMainPanel().removeAll();
        this.ventana.getMainPanel().add(login);
        this.ventana.getMainPanel().revalidate();
        this.ventana.repaint();
        this.ventana.setResizable(false);
    }
    
    private class TryLogin implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String correo = login.getjtIngresoUser().getText();
                char[] psw = login.getJtIngresoContrasenia().getPassword();
                if (!(correo.equals("") || psw.length == 0)) {
                    Usuario usuario = user.selectUser(correo, psw);
                    if (usuario != null) {
                        login.getJlInfoIncorrecta().setText("");
                        switch (usuario.getRol()) {
                            case 1:
                                new AdminController(ventana);
                                break;
                            case 2:
                                new GerenteController(ventana);
                                break;
                            default:
                                new OperadorController(ventana);
                                break;
                        }
                    } else {
                        login.getJlInfoIncorrecta().setText("usuario o contraseña incorrecta");
                        login.getJlInfoIncorrecta().setForeground(Color.red);
                        System.out.println("usuario o contraseña incorrecta");
                    }
                }else{
                    login.getJlInfoIncorrecta().setText("Completar campos!");
                    login.getJlInfoIncorrecta().setForeground(Color.red);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
    }
}