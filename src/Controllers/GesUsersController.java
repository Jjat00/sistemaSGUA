package Controllers;

import java.awt.event.ActionEvent;
import views.GestionUsuariosAdmin;
import views.VentanaEmergente;

/**
 *
 * Controla la ventana para gestionar usuarios
 */
public class GesUsersController {
    
    private AdminController admin;
    private VentanaEmergente ventanaGes;
    private GestionUsuariosAdmin ges;

    public GesUsersController(AdminController admin) {
        this.admin = admin;
        this.ventanaGes = new VentanaEmergente(admin.getPrincipal().getVentana(), true);
        this.ges = new GestionUsuariosAdmin();
        this.cambiarPanel();
        this.next();
        this.ventanaGes.setVisible(true);
    }
    
    private void cambiarPanel() {
        this.ventanaGes.setSize(ges.getWidth() + 18, ges.getHeight() + 46);
        this.ventanaGes.setLocationRelativeTo(null);
        this.ventanaGes.getMainPanel().removeAll();
        this.ventanaGes.getMainPanel().add(ges);
        this.ventanaGes.getMainPanel().revalidate();
        this.ventanaGes.repaint();
        this.ventanaGes.setResizable(false);        
    }
    
    private void next() {
        this.ges.getbtnRegistroUsuario().addActionListener((ActionEvent ev) -> {
            new RegUsersController(admin);
            this.ventanaGes.dispose();
        });
        this.ges.getbtnModificarUsuario().addActionListener((ActionEvent ev) -> {
            new ModUsersController(admin);
            this.ventanaGes.dispose();
        });
        this.ges.getbtnConsultarUsuario().addActionListener((ActionEvent ev) -> {
            new ConUsersController(admin);
            this.ventanaGes.dispose();
        });
    }
}
