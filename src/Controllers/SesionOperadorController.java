package Controllers;

import controllers.MainController;
import java.awt.event.ActionEvent;
import views.SesionOperador;
import views.VentanaEmergente;

/**
 *
 * Controla la ventana para sesion operador
 */
public class SesionOperadorController {
    
    private MainController principal;
    private VentanaEmergente ventanaSalir;
    private SesionOperador sesion;

    public SesionOperadorController(MainController principal) {
        this.principal = principal;
        this.ventanaSalir = new VentanaEmergente(principal.getVentana(), true);
        this.sesion = new SesionOperador();
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
        this.sesion.getbtnCerrarSesionOperador().addActionListener((ActionEvent ev) -> {
            this.principal.cambiarPanel();
            this.ventanaSalir.dispose();
        });
    }
}