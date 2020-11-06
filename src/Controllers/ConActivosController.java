package Controllers;

import dao.TransformadorDAO;
import dao.TransformadorDAOImp;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Transformador;
import views.ConsultaActivos;
import views.GUI;

/**
 *
 * Controlador para leer activos
 */
public class ConActivosController {
    
    private AdminController admin;
    private ConsultaActivos consulta;
    private TransformadorDAO activo;

    public ConActivosController(AdminController admin) {
        this.admin = admin;
        this.consulta = new ConsultaActivos();
        this.activo = new TransformadorDAOImp();
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
        this.consulta.getbtnConsultarActivo().addActionListener((ActionEvent ev) -> {
            this.leerUno();
        });
    }
    
    private void leerUno() {}
    
    private void leerTodos() {}
    
    private void limpiarTabla() {
        while(consulta.getModelTbl().getRowCount() != 0) {
            consulta.getModelTbl().removeRow(0);
        }
    }
}
