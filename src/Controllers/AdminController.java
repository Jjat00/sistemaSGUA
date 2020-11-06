package Controllers;

import java.awt.event.ActionEvent;
import controllers.MainController;
import views.GUI;
import views.InicioAdmin;

/**
 *
 * controlador para el administrador
 */
public class AdminController {
    
    private MainController principal;
    private InicioAdmin admin;

    public AdminController(MainController principal) {
        this.principal = principal;
        this.admin = new InicioAdmin();
        this.cambiarPanel();
        this.next();
    }
    
    public void cambiarPanel() {
        GUI ventana = principal.getVentana();
        ventana.setSize(admin.getWidth() + 18, admin.getHeight() + 46);
        ventana.setLocationRelativeTo(null);
        ventana.getMainPanel().removeAll();
        ventana.getMainPanel().add(admin);
        ventana.getMainPanel().revalidate();
        ventana.repaint();
        ventana.setResizable(true);
    }
    
    private void next() {
        this.admin.getbtnGestionarUsuario().addActionListener((ActionEvent ev) -> {
            new GesUsersController(this);
        });
        this.admin.getbtnGestionarActivo().addActionListener((ActionEvent ev) -> {
            new GesActivosController(this);
        });
        this.admin.getbtnSalirAdmin().addActionListener((ActionEvent ev) -> {
            new SesionAdminController(principal);
        });
    }

    public MainController getPrincipal() {
        return principal;
    }
}