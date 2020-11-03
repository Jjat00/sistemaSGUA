package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.GUI;

/**
 *
 * Controla la ventana para registrar activos
 */
public class RegActivosController implements ActionListener {
    
    private GUI ventana;

    public RegActivosController(GUI ventana) {
        this.ventana = ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.cambiarPanel();
    }
    
    private void cambiarPanel() {}
    
}