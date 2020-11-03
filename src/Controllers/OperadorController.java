package Controllers;

import views.GUI;
import views.InicioOperador;

/**
 *
 * Controlador para el operador
 */
public class OperadorController {
    
    private GUI ventana;
    private InicioOperador operador;

    public OperadorController(GUI ventana) {
        this.ventana = ventana;
        this.operador = new InicioOperador();
        this.cambiarPanel();
    }
    
    private void cambiarPanel() {
        this.ventana.setSize(operador.getWidth() + 18, operador.getHeight() + 46);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.getMainPanel().removeAll();
        this.ventana.getMainPanel().add(operador);
        this.ventana.getMainPanel().revalidate();
        this.ventana.repaint();
    }
}