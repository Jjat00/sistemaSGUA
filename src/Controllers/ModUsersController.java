package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.GUI;
import views.ModificarUsuarios;

/**
 *
 * Controla la ventana para modificar usuarios
 */
public class ModUsersController implements ActionListener {
    
    private GUI ventana;
    private ModificarUsuarios mod;

    public ModUsersController(GUI ventana) {
        this.ventana = ventana;
        this.mod = new ModificarUsuarios();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.cambiarPanel();
        this.mod.getbtnDevolver().addActionListener(new GesUsersController(ventana));
    }
    
    private void cambiarPanel() {
        this.ventana.setSize(mod.getWidth() + 18, mod.getHeight() + 46);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.getMainPanel().removeAll();
        this.ventana.getMainPanel().add(mod);
        this.ventana.getMainPanel().revalidate();
        this.ventana.repaint();
    }
}