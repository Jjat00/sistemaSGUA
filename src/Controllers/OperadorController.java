package Controllers;

import java.awt.event.ActionEvent;
import controllers.MainController;
import views.GUI;
import views.InicioOperador;

/**
 *
 * Controlador para el operador
 */
public class OperadorController {
    
    private MainController principal;
    private InicioOperador operador;

    public OperadorController(MainController principal) {
        this.principal = principal;
        this.operador = new InicioOperador();
        this.cambiarPanel();
        this.next();
    }
    
    public void cambiarPanel() {
        GUI ventana = principal.getVentana();
        ventana.setSize(operador.getWidth() + 18, operador.getHeight() + 46);
        ventana.setLocationRelativeTo(null);
        ventana.getMainPanel().removeAll();
        ventana.getMainPanel().add(operador);
        ventana.getMainPanel().revalidate();
        ventana.repaint();
    }
    
    private void next() {
        this.operador.getbtnGestionarCliente().addActionListener((ActionEvent ev) -> {
            new GesClientesController(this);
        });
        this.operador.getbtnSalirOperador().addActionListener((ActionEvent ev) -> {
            new SesionAdminController(principal);
        });
    }

    public MainController getPrincipal() {
        return principal;
    }
    
}