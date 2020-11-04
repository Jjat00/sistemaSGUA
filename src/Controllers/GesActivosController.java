package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.GUI;
import views.GestionActivos;

/**
 *
 * Controla la ventana para gestionar activos
 */
public class GesActivosController implements ActionListener {

    private GUI ventana;
    private GestionActivos ges;

    public GesActivosController(GUI ventana) {
        this.ventana = ventana;
        this.ges = new GestionActivos();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.cambiarPanel();
        this.ges.getbtnRegistroActivos().addActionListener(new RegActivosController(this.ventana));
        this.ges.getbtnModificarActivos().addActionListener(new ModActivosController(this.ventana));
        this.ges.getbtnConsultarActivos();
    }
    
    private void cambiarPanel() {
        this.ventana.setSize(ges.getWidth() + 18, ges.getHeight() + 46);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.getMainPanel().removeAll();
        this.ventana.getMainPanel().add(ges);
        this.ventana.getMainPanel().revalidate();
        this.ventana.repaint();
    }
    
}
