package controllers;

import java.awt.event.ActionEvent;
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
        this.ventana.setVisible(true);
        
        this.principal.getbtnIngresarInicio()
                .addActionListener(new Controllers.LoginController(ventana));
        this.principal.getbtnCerrarPrincipal()
                .addActionListener((ActionEvent e) -> {
                    System.exit(0); // Cerrar ventana
                });
    }
    
    private void cambiarPanel() {
        this.ventana.setSize(principal.getWidth() + 18, principal.getHeight() + 46);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.getMainPanel().removeAll();
        this.ventana.getMainPanel().add(principal);
        this.ventana.getMainPanel().revalidate();
        this.ventana.repaint();
        this.ventana.setResizable(true);        
    }
}