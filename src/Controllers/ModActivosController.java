package Controllers;

import java.awt.event.ActionEvent;

import dao.TransformadorDAO;
import dao.TransformadorDAOImp;
import views.GUI;
import views.ModificarActivos;
import model.Transformador;

/**
 *
 * Controlador para la actulizacion de la información de los activos
 */
public class ModActivosController {
    
    private AdminController admin;
    private ModificarActivos modActivo;
    private TransformadorDAO transformadorDao;

    public ModActivosController(AdminController admin){
        this.admin = admin;
        this.modActivo = new ModificarActivos();
        this.transformadorDao = new TransformadorDAOImp();
        this.cambiarPanel();
        this.next();

    }

    private void cambiarPanel() {
        GUI ventana = admin.getPrincipal().getVentana();
        ventana.setSize(modActivo.getWidth() + 18, modActivo.getHeight() + 46);
        ventana.setLocationRelativeTo(null);
        ventana.getMainPanel().removeAll();
        ventana.getMainPanel().add(modActivo);
        ventana.getMainPanel().revalidate();
        ventana.repaint();
        ventana.setResizable(true);
    }
    
    private void next() {
        this.modActivo.getbtnDevolver().addActionListener((ActionEvent ev) -> {
            this.admin.cambiarPanel();
        });
        this.modActivo.getbtnModificarActivo().addActionListener((ActionEvent ev) -> {
            this.modificar();
        });
    }
    
    private void modificar() {
        try {
            Boolean actividad = false;
            Short idFase = 0;
            String idtransformador = modActivo.getjtID().getText();
            String marca = modActivo.getjtMarca().getText();
            String faseTransformador = modActivo.getcbFases().getSelectedItem().toString();
            String snom = modActivo.getjtSnom().getText();
            String actividadTransformador = modActivo.getcbActividad().getSelectedItem().toString();
            String v1nom = modActivo.getjtV1nom().getText();
            String v2nom = modActivo.getjtV2nom().getText();
            String frecuencia = modActivo.getjtFrecuencia().getText();

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

            transformadorDao.updateTransformador(transformador);
            modActivo.getLabelMensaje().setText("Transformador actualizado");                
        } catch (Exception e) {
            System.out.println(e);
            modActivo.getLabelMensaje().setText("Completar todos los campos!");
        }
    }

}
