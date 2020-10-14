package controllers;

import dao.UserDAO;
import dao.UserDAOImpl;
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

    public MainController(){
        this.user = new UserDAOImpl();
        this.gui = new GUI();
        
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
