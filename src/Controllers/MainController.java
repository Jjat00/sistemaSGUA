package controllers;

import dao.UserDAO;
import dao.UserDAOImp;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import views.*;

/**
 *
 * Controlador para el manejo de la información de los usarios
 */
public class MainController {
    
    private UserDAO user;
    private GUI gui;
    private GestionActivos gestionDeActivos;
    private GestionUsuariosAdmin gestionDeUsuarios;
    private InicioAdmin inicioAdmin;
    private InicioGerente inicioGerente;
    private InicioOperador inicioOperador;
    private Login login;
    private Principal principal;
    private RegistroUsuarios registroUsuarios;
    private ModificarUsuarios modificarUsuarios;
    private SesionAdmin sesionAdmin;
    private SesionGerente sesionGerente;
    private RegistroExitoso registroExitoso;
    private ModificacionExitosa modificacionExitosa;

    public MainController(){
        this.user = new UserDAOImp();
        this.gui = new GUI();
        this.gestionDeActivos = new GestionActivos();
        this.gestionDeUsuarios = new GestionUsuariosAdmin();
        this.inicioAdmin = new InicioAdmin();
        this.inicioGerente = new InicioGerente();
        this.inicioOperador = new InicioOperador();
        this.login = new Login();
        this.principal = new Principal();
        this.registroUsuarios = new RegistroUsuarios();
        this.modificarUsuarios = new ModificarUsuarios();
        this.sesionAdmin = new SesionAdmin();
        this.sesionGerente = new SesionGerente();
        this.registroExitoso = new RegistroExitoso();
        this.modificacionExitosa = new ModificacionExitosa();
        
               
        gui.getTempButton().addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "Si ves esto borra el boton");
        });
        
        handlerObtenerUsuario();
        gui.setVisible(true);
    }

    private void handlerObtenerUsuario() {
        try {
            System.out.println(this.user.selectUser(1144111111).toString()); ;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
