package Controllers;

import views.GUI;
import views.InicioAdmin;

/**
 *
 * controlador para el administrador
 */
public class AdminController {
    
    private GUI ventana;
    private InicioAdmin admin;

    public AdminController(GUI ventana) {
        this.ventana = ventana;
        this.admin = new InicioAdmin();
        this.cambiarPanel();
        
        this.admin.getbtnGestionarUsuario().addActionListener(new GesUsersController(ventana));
        this.admin.getbtnGestionarActivo().addActionListener(new GesActivosController(ventana));
        this.admin.getbtnSalirAdmin().addActionListener(new SesionAdminController(ventana));
    }
    
    private void cambiarPanel() {
        this.ventana.setSize(admin.getWidth() + 18, admin.getHeight() + 46);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.getMainPanel().removeAll();
        this.ventana.getMainPanel().add(admin);
        this.ventana.getMainPanel().revalidate();
        this.ventana.repaint();
        this.ventana.setResizable(true);        
    }
}