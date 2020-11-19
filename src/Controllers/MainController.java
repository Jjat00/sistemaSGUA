package controllers;

import java.awt.event.ActionEvent;
import Controllers.LoginController;
import views.GUI;
import views.Principal;

/**
 *
 * Controlador para el manejo de la información de los usarios
 */
public class MainController {
    
    private GUI ventana;
    private Principal principal;

    public MainController(GUI ventana){
        this.principal = new Principal();
        this.ventana = ventana;
        this.cambiarPanel();
        this.next();
        this.ventana.setVisible(true);
    }
    
    public void cambiarPanel() {
        this.ventana.setSize(principal.getWidth() + 18, principal.getHeight() + 46);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.getMainPanel().removeAll();
        this.ventana.getMainPanel().add(principal);
        this.ventana.getMainPanel().revalidate();
        this.ventana.repaint();
        this.ventana.setResizable(true);
    }
    
    private void next() {
        this.principal.getbtnIngresarInicio().addActionListener((ActionEvent ev) -> {
            new LoginController(this);
        });
        this.principal.getbtnCerrarPrincipal().addActionListener((ActionEvent ev) -> {
            System.exit(0); // Cerrar ventana
        });
    }

    public GUI getVentana() {
        return ventana;
    }
}
