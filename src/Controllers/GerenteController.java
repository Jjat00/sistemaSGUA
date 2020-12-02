package Controllers;

import java.awt.event.ActionEvent;
import controllers.MainController;
import views.GUI;
import views.InicioGerente;

/**
 *
 * Controlador para el gerente
 */
public class GerenteController {
    
    private MainController principal;
    private InicioGerente gerente;

    public GerenteController(MainController principal) {
        this.principal = principal;
        this.gerente = new InicioGerente();
        this.cambiarPanel();
        this.next();
    }
    
    public void cambiarPanel() {
        GUI ventana = principal.getVentana();
        ventana.setSize(gerente.getWidth() + 18, gerente.getHeight() + 46);
        ventana.setLocationRelativeTo(null);
        ventana.getMainPanel().removeAll();
        ventana.getMainPanel().add(gerente);
        ventana.getMainPanel().revalidate();
        ventana.repaint();
    }
    
    private void next() {
        this.gerente.getbtnSalirGerente().addActionListener((ActionEvent ev) -> {
            new SesionGerenteController(principal);
        });
        this.gerente.getbtnConsultaUsuario().addActionListener((ActionEvent ev) -> {
            new ConUserGerenteController(this);
        });
    }

    public MainController getPrincipal() {
        return principal;
    }
}