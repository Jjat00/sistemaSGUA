package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.GUI;
import views.GestionUsuariosAdmin;

/**
 *
 * Controla la ventana para gestionar usuarios
 */
public class GesUsersController implements ActionListener {
    
    private GUI ventana;
    private GestionUsuariosAdmin ges;

    public GesUsersController(GUI ventana) {
        this.ventana = ventana;
        this.ges = new GestionUsuariosAdmin();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.cambiarPanel();
        this.ges.getbtnRegistroUsuario().addActionListener(new RegUsersController(ventana));
        this.ges.getbtnModificarUsuario().addActionListener(new ModUsersController(ventana));
        this.ges.getbtnCerrarGestion().addActionListener((ActionEvent ev) -> {
            new AdminController(ventana);
        });
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
