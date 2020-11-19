package Controllers;

import java.awt.event.ActionEvent;
import views.GestionActivos;
import views.VentanaEmergente;

/**
 *
 * Controla la ventana para gestionar activos
 */
public class GesActivosController {

    private AdminController admin;
    private VentanaEmergente ventanaGes;
    private GestionActivos ges;

    public GesActivosController(AdminController admin) {
        this.admin = admin;
        this.ventanaGes = new VentanaEmergente(admin.getPrincipal().getVentana(), true);
        this.ges = new GestionActivos();
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
        this.ges.getBtnRegistroActivos().addActionListener((ActionEvent ev) -> {
            new RegActivosController(admin);
            this.ventanaGes.dispose();
        });
        this.ges.getbtnModificarActivos().addActionListener((ActionEvent ev) -> {
            new ModActivosController(admin);
            this.ventanaGes.dispose();
        });
        this.ges.getbtnConsultarActivos().addActionListener((ActionEvent ev) -> {
            new ConActivosController(admin);
            this.ventanaGes.dispose();
        });
    }
}
