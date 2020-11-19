package Controllers;

import dao.UserDAO;
import dao.UserDAOImp;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Usuario;
import views.ConsultaUsuario;
import views.GUI;

/**
 *
 * Controlador para leer usuarios
 */
public class ConUsersController {
    
    private AdminController admin;
    private ConsultaUsuario consulta;
    private UserDAO userDAO;

    public ConUsersController(AdminController admin) {
        this.admin = admin;
        this.consulta = new ConsultaUsuario();
        this.userDAO = new UserDAOImp();
        this.cambiarPanel();
        this.next();
        this.leerTodos();
    }
    
    private void cambiarPanel() {
        GUI ventana = admin.getPrincipal().getVentana();
        ventana.setSize(consulta.getWidth() + 18, consulta.getHeight() + 46);
        ventana.setLocationRelativeTo(null);
        ventana.getMainPanel().removeAll();
        ventana.getMainPanel().add(consulta);
        ventana.getMainPanel().revalidate();
        ventana.repaint();
        ventana.setResizable(true);        
    }
    
    private void next() {
        this.consulta.getbtnDevolver().addActionListener((ActionEvent ev) -> {
            this.admin.cambiarPanel();
        });
        this.consulta.getbtnConsultarUsuario().addActionListener((ActionEvent ev) -> {
            this.leerUno();
        });
    }
    
    private void leerUno() {}
    
    private void leerTodos() {
        try {
            this.limpiarTabla();
            ArrayList<Usuario> usuarios = userDAO.selectAllUsers();
            long cedula = 0;
            short rol = 0;
            String nombre = "";
            String apellido = "";
            boolean actividad = false;
            long celular = 0;
            String email = "";
            String password = "";
            for (Usuario user : usuarios) {
                cedula = user.getCedula();
                rol = user.getRol();
                nombre = user.getNombre();
                apellido = user.getApellido();
                actividad = user.isActividad();
                celular = user.getCelular();
                email = user.getEmail();
                password = user.getPassword();
                String datos[] = { cedula + "", rol + "", nombre, apellido,
                                   actividad + "", celular + "", email,
                                   password };
                this.consulta.getModelTbl().addRow(datos);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private void limpiarTabla() {
        while(consulta.getModelTbl().getRowCount() != 0) {
            this.consulta.getModelTbl().removeRow(0);
        }
    }
}