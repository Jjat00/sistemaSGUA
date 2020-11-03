package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.GUI;
import views.RegistroUsuarios;

/**
 *
 * Controla la ventana para registrar usuarios
 */
public class RegUsersController implements ActionListener {
    
    private GUI ventana;
    private RegistroUsuarios reg;

    public RegUsersController(GUI ventana) {
        this.ventana = ventana;
        this.reg = new RegistroUsuarios();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.cambiarPanel();
        this.reg.getbtnDevolver().addActionListener(new GesUsersController(ventana));
    }
    
    private void cambiarPanel() {
        this.ventana.setSize(reg.getWidth() + 18, reg.getHeight() + 46);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.getMainPanel().removeAll();
        this.ventana.getMainPanel().add(reg);
        this.ventana.getMainPanel().revalidate();
        this.ventana.repaint();
    }
}