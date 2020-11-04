/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.TransformadorDAO;
import dao.TransformadorDAOImp;
import views.GUI;
import views.ModificarActivos;
import model.Transformador;

/**
 *
 * 
 */
public class ModActivosController implements ActionListener {
    
    private GUI ventana;
    private ModificarActivos modActivo;
    private TransformadorDAO transformadorDao;

    public ModActivosController(GUI ventana){
        this.ventana = ventana;
        this.modActivo = new ModificarActivos();
        this.transformadorDao = new TransformadorDAOImp();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        cambiarPanel();
        this.modActivo.getbtnDevolver().addActionListener(new GesActivosController(ventana));
        this.modActivo.getbtnModificarActivo().addActionListener(new Modificar());
    }

    private void cambiarPanel() {
        this.ventana.setSize(modActivo.getWidth() + 18, modActivo.getHeight() + 46);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.getMainPanel().removeAll();
        this.ventana.getMainPanel().add(modActivo);
        this.ventana.getMainPanel().revalidate();
        this.ventana.repaint();
        this.ventana.setResizable(true);
    }    

    private class Modificar implements ActionListener {
        Boolean actividad;
        Short idFase;
        @Override
        public void actionPerformed(ActionEvent ae) {

            try {

                String idtransformador = modActivo.getjtID().getText();
                String marca = modActivo.getjtMarca().getText();
                String faseTransformador = modActivo.getcbFases().getSelectedItem().toString();
                String snom = modActivo.getjtSnom().getText();
                String actividadTransformador = modActivo.getcbActividad().getSelectedItem().toString();
                String v1nom = modActivo.getjtV1nom().getText();
                String v2nom = modActivo.getjtV2nom().getText();
                String frecuencia = modActivo.getjtFrecuencia().getText();

                System.out.println(actividadTransformador);
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

                System.out.println(transformador.toString());

                transformadorDao.updateTransformador(transformador);
                modActivo.getLabelMensaje().setText("Transformador actualizado");                
            } catch (Exception e) {
                System.out.println(e);
                modActivo.getLabelMensaje().setText("Completar todos los campos!");
            }

        }

    }
}
