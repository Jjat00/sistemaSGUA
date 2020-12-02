package Controllers;

import java.awt.event.ActionEvent;
import views.GUI;
import views.Pagos;

/**
 *
 * Controla la ventana para registrar pagos
 */
public class PagoController {
    
    private OperadorController operador;
    private Pagos reg;

    public PagoController(OperadorController operador) {
        this.operador = operador;
        this.reg = new Pagos();
        this.cambiarPanel();
        this.next();
    }
    
    private void cambiarPanel() {
        GUI ventana = operador.getPrincipal().getVentana();
        ventana.setSize(reg.getWidth() + 18, reg.getHeight() + 46);
        ventana.setLocationRelativeTo(null);
        ventana.getMainPanel().removeAll();
        ventana.getMainPanel().add(reg);
        ventana.getMainPanel().revalidate();
        ventana.repaint();
        ventana.setResizable(false);
    }
    
    private void next() {
        this.reg.getbtnDevolver().addActionListener((ActionEvent ev) -> {
            this.operador.cambiarPanel();
        });
    }
}