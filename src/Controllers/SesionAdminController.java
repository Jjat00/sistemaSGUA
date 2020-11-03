package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.GUI;
import views.SesionAdmin;

/**
 *
 * Controla la ventana para sesion admin
 */
public class SesionAdminController implements ActionListener {
    
    private GUI ventana;
    private SesionAdmin sesion;

    public SesionAdminController(GUI ventana) {
        this.ventana = ventana;
        this.sesion = new SesionAdmin();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.cambiarPanel();
        this.sesion.getbtnCerrarSesion().addActionListener((ActionEvent ev) -> {
            new controllers.MainController(ventana);
        });
        this.sesion.getbtnCerrarVentana().addActionListener((ActionEvent ev) -> {
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
