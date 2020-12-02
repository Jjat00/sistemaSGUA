package Controllers;

import java.awt.event.ActionEvent;
import views.ConsultaReportes;
import views.GUI;

/**
 *
 * @author Milton Lenis
 */
public class ReporteController {
    
    private OperadorController operador;
    private ConsultaReportes reg;

    public ReporteController(OperadorController operador) {
        this.operador = operador;
        this.reg = new ConsultaReportes();
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
