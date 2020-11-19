package Controllers;

import java.awt.event.ActionEvent;
import views.GestionClientesOp;
import views.VentanaEmergente;

/**
 *
 * Controla la ventana para gestionar clientes
 */
public class GesClientesController {
    
    private OperadorController operador;
    private VentanaEmergente ventanaGes;
    private GestionClientesOp ges;

    public GesClientesController(OperadorController operador) {
        this.operador = operador;
        this.ventanaGes = new VentanaEmergente(operador.getPrincipal().getVentana(), true);
        this.ges = new GestionClientesOp();
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
        this.ges.getbtnRegistroCliente().addActionListener((ActionEvent ev) -> {
            new RegClientesController(operador);
            this.ventanaGes.dispose();
        });
        this.ges.getbtnModificarCliente().addActionListener((ActionEvent ev) -> {
            new ModClientesController(operador);
            this.ventanaGes.dispose();
        });
        this.ges.getbtnConsultarCliente().addActionListener((ActionEvent ev) -> {
            new ConClientesController(operador);
            this.ventanaGes.dispose();
        });
    }
}
