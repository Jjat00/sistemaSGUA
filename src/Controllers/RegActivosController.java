package Controllers;

import java.awt.event.ActionEvent;

import dao.TransformadorDAO;
import dao.TransformadorDAOImp;
import model.Transformador;
import views.GUI;
import views.RegistroActivos;

/**
 *
 * Controla la ventana para registrar activos
 */
public class RegActivosController {
    
    private AdminController admin;
    private RegistroActivos registro;
    private TransformadorDAO transformadorDao;

    public RegActivosController(AdminController admin) {
        this.admin = admin;
        this.registro = new RegistroActivos();
        this.transformadorDao = new TransformadorDAOImp();
        this.cambiarPanel();
        this.next();
    }
    
    private void cambiarPanel() {
        GUI ventana = admin.getPrincipal().getVentana();
        ventana.setSize(registro.getWidth() + 18, registro.getHeight() + 46);
        ventana.setLocationRelativeTo(null);
        ventana.getMainPanel().removeAll();
        ventana.getMainPanel().add(registro);
        ventana.getMainPanel().revalidate();
        ventana.repaint();
        ventana.setResizable(true);        
    }
    
    private void next() {
        this.registro.getbtnDevolver().addActionListener((ActionEvent ev) -> {
            this.admin.cambiarPanel();
        });
        this.registro.getbtnRegistrarActivo().addActionListener((ActionEvent ev) -> {
            this.registrarActivo();
        });
    }
    
    private void registrarActivo() {
        try {
            Boolean actividad = false;
            Short idFase = 0;
            String idtransformador = registro.getjtID().getText();
            String marca = registro.getjtMarca().getText();
            String faseTransformador = registro.getcbFases().getSelectedItem().toString();
            String snom = registro.getjtSnom().getText();
            String actividadTransformador = registro.getcbActividad().getSelectedItem().toString();
            String v1nom = registro.getjtV1nom().getText();
            String v2nom = registro.getjtV2nom().getText();
            String frecuencia = registro.getjtFrecuencia().getText();

            switch (actividadTransformador) {
                case "Verdadero":
                    actividad = true;
                    break;
                case "Falso":
                    actividad = false;
                    break;                
                default:
                    break;
            }         

            switch (faseTransformador) {
                case "Monofásico":
                    idFase = 1;
                    break;
                case "Bifásico":
                    idFase = 2;
                    break;                
                case "Trifásico":
                    idFase = 3;
                    break;                
                default:
                    break;
            }                

            int id = Integer.parseInt(idtransformador);
            float s = Float.parseFloat(snom);
            float v1 = Float.parseFloat(v1nom);
            float v2 = Float.parseFloat(v2nom);
            float frec = Float.parseFloat(frecuencia);
            Transformador transformador = new Transformador(id, actividad, marca, idFase, s, v1, v2, frec);

            transformadorDao.insertTransformador(transformador);
            registro.getLabelMensaje().setText("Transformador registrado");

            System.out.println(transformador.toString());
        } catch (Exception e) {
            System.out.println(e);
            registro.getLabelMensaje().setText("Completar todos los campos!");
        }
    }
}