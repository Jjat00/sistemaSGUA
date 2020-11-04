package controllers;

import java.awt.event.ActionEvent;
import views.GUI;
import views.Principal;

/**
 *
 * Controlador para el manejo de la información de los usarios
 */
public class MainController {
    
    private GUI ventana;
    private Principal principal;
    private RegistroUsuarios registroUsuarios;
    private ModificarUsuarios modificarUsuarios;
    private SesionAdmin sesionAdmin;
    private SesionGerente sesionGerente;
    private RegistroExitoso registroExitoso;
    private ModificacionExitosa modificacionExitosa;
    private ConsultaUsuario consultaUsuario;
    private RegistroActivos registroActivos;
    private ModificarActivos modificarActivos;
    private ConsultaActivos consultaActivos;

    public MainController(GUI ventana){
        this.principal = new Principal();
        this.registroUsuarios = new RegistroUsuarios();
        this.modificarUsuarios = new ModificarUsuarios();
        this.sesionAdmin = new SesionAdmin();
        this.sesionGerente = new SesionGerente();
        this.registroExitoso = new RegistroExitoso();
        this.modificacionExitosa = new ModificacionExitosa();
        this.consultaUsuario = new ConsultaUsuario();
        this.registroActivos = new RegistroActivos();
        this.modificarActivos = new ModificarActivos();
        this.consultaActivos = new ConsultaActivos();
        
        this.principal.getbtnIngresarInicio()
                .addActionListener(new Controllers.LoginController(ventana));
        this.principal.getbtnCerrarPrincipal()
                .addActionListener((ActionEvent e) -> {
                    System.exit(0); // Cerrar ventana
                });
    }
    
    private void cambiarPanel() {
        this.ventana.setSize(principal.getWidth() + 18, principal.getHeight() + 46);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.getMainPanel().removeAll();
        this.ventana.getMainPanel().add(principal);
        this.ventana.getMainPanel().revalidate();
        this.ventana.repaint();
    }
}
