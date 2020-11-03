package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.GUI;
import views.SesionGerente;

/**
 *
 * Controla la ventana para sesion gerente
 */
public class SesionGerenteController implements ActionListener {
    
    private GUI ventana;
    private SesionGerente sesion;

    public SesionGerenteController(GUI ventana) {
        this.ventana = ventana;
        this.sesion = new SesionGerente();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.cambiarPanel();
        this.sesion.getbtnCerrarSesionGerente().addActionListener((ActionEvent ev) -> {
            new controllers.MainController(ventana);
        });
        this.sesion.getbtnCerrarVentanaGerente().addActionListener((ActionEvent ev) -> {
            new AdminController(ventana);
        });
    }
    
    private void cambiarPanel() {
        this.ventana.setSize(sesion.getWidth() + 18, sesion.getHeight() + 46);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.getMainPanel().removeAll();
        this.ventana.getMainPanel().add(sesion);
        this.ventana.getMainPanel().revalidate();
        this.ventana.repaint();
    }
    
}
