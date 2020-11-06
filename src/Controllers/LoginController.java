package Controllers;

import dao.UserDAO;
import dao.UserDAOImp;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import controllers.MainController;
import model.Usuario;
import views.Login;
import views.VentanaEmergente;

/**
 *
 * Controlador del inicio de sesión
 */
public class LoginController {

    private MainController principal;
    private VentanaEmergente ventanaLogin;
    private Login login;
    private UserDAO user;

    public LoginController(MainController principal) {
        this.principal = principal;
        this.ventanaLogin = new VentanaEmergente(principal.getVentana(), false);
        this.user = new UserDAOImp();
        this.login = new Login();
        this.cambiarPanel();
        this.next();
        this.ventanaLogin.setVisible(true);
    }
    
    private void cambiarPanel() {
        this.ventanaLogin.setSize(login.getWidth() + 18, login.getHeight() + 46);
        this.ventanaLogin.setLocationRelativeTo(null);
        this.ventanaLogin.getMainPanel().removeAll();
        this.ventanaLogin.getMainPanel().add(login);
        this.ventanaLogin.getMainPanel().revalidate();
        this.ventanaLogin.repaint();
        this.ventanaLogin.setResizable(false);
    }
    
    private void next() {
        this.login.getbtnIngresoLogin().addActionListener((ActionEvent ev) -> {
            this.tryLogin();
        });
    }
    
    private void tryLogin() {
        try {
            String correo = login.getjtIngresoUser().getText();
            char[] psw = login.getJtIngresoContrasenia().getPassword();
            if (!(correo.equals("") || psw.length == 0)) {
                Usuario usuario = user.selectUser(correo, psw);
                if (usuario != null) {
                    ventanaLogin.dispose();
                    switch (usuario.getRol()) {
                        case 1:
                            new AdminController(principal);
                            break;
                        case 2:
                            new GerenteController(principal);
                            break;
                        default:
                            new OperadorController(principal);
                            break;
                    }
                } else {
                    login.getJlInfoIncorrecta().setText("usuario o contraseña incorrecta");
                }
            }else{
                login.getJlInfoIncorrecta().setText("Completar campos!");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}