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
        this.consulta.getbtnConsultarActivos().addActionListener((ActionEvent ev) -> {
            this.leerTodos();
        });
    }
    
    private void leerUno() {
        int idTransformador = Integer.parseInt(this.consulta.getjtID().getText());
        try {
            Transformador activo = this.activo.selectTransformador(idTransformador);
            Boolean actividad =  activo.getActividad();
            Short idFase = activo.getIdFase();
            String marca = activo.getMarca();
            float snom  = activo.getSnom();
            float v1nom = activo.getV1nom();
            float v2nom = activo.getV2nom();
            float frecuencia = activo.getFrecuencia();
            this.limpiarTabla();
            String datos[] = { idTransformador + "", marca, idFase +"", actividad + "", snom + "",  v1nom + "", v2nom + "", frecuencia + "" };
            this.consulta.getModelTbl().addRow(datos);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void leerTodos() {
        try {
            this.limpiarTabla();
            ArrayList<Transformador> transformadores = this.activo.selectAllTransformadores();
            for (Transformador transformador : transformadores) {
                Boolean actividad = transformador.getActividad();
                Short idFase = transformador.getIdFase();
                long idTransformador = transformador.getIdTransformador();
                String marca = transformador.getMarca();
                float snom = transformador.getSnom();
                float v1nom = transformador.getV1nom();
                float v2nom = transformador.getV2nom();
                float frecuencia = transformador.getFrecuencia();
                
                String datos[] = { idTransformador + "", marca, idFase + "", actividad + "", snom + "", v1nom + "",
                        v2nom + "", frecuencia + "" };

                this.consulta.getModelTbl().addRow(datos);                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void limpiarTabla() {
        while(consulta.getModelTbl().getRowCount() != 0) {
            consulta.getModelTbl().removeRow(0);
        }
    }
}
