package Controllers;

import java.awt.event.ActionEvent;
import controllers.MainController;
import views.SesionGerente;
import views.VentanaEmergente;

/**
 *
 * Controla la ventana para sesion gerente
 */
public class SesionGerenteController {
    
    private MainController principal;
    private VentanaEmergente ventanaSalir;
    private SesionGerente sesion;

    public SesionGerenteController(MainController principal) {
        this.principal = principal;
        this.ventanaSalir = new VentanaEmergente(principal.getVentana(), true);
        this.sesion = new SesionGerente();
        this.cambiarPanel();
        this.next();
        this.ventanaSalir.setVisible(true);
    }
    
    private void cambiarPanel() {
        this.ventanaSalir.setSize(sesion.getWidth() + 18, sesion.getHeight() + 46);
        this.ventanaSalir.setLocationRelativeTo(null);
        this.ventanaSalir.getMainPanel().removeAll();
        this.ventanaSalir.getMainPanel().add(sesion);
        this.ventanaSalir.getMainPanel().revalidate();
        this.ventanaSalir.repaint();
        this.ventanaSalir.setResizable(false);
    }
    
    private void next() {
        this.sesion.getbtnCerrarSesionGerente().addActionListener((ActionEvent ev) -> {
            this.principal.cambiarPanel();
            this.ventanaSalir.dispose();
        });
    }
    
}
