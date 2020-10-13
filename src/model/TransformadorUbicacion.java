/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jjat02
 */
public class TransformadorUbicacion {
    private int idTransformador;
    private String georeferencia; 
    private String barrio;
    private int comuna;

    public TransformadorUbicacion(int idTransformador, String georeferencia, String barrio, int comuna){
        this.idTransformador = idTransformador;
        this.georeferencia = georeferencia;
        this.barrio = barrio;
        this.comuna = comuna;
    }

    public void setIdTransformador(int idTransformador) {
        this.idTransformador = idTransformador;
    }

    public int getIdTransformador() {
        return this.idTransformador;
    }

    public void setGeoreferencia(String georeferencia) {
        this.georeferencia = georeferencia;
    }

    public String getGeoreferencia() {
        return this.georeferencia;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getBarrio() {
        return this.barrio;
    }

    public void setComuna(int comuna) {
        this.comuna = comuna;
    }

    public int getComuna() {
        return this.comuna;
    }

    @Override
    public String toString() {
        return "TransformadorUbicacion: {" 
            + "\n\tidTransformador: " + this.idTransformador
            + ",\n\tgeoreferencia: " + this.georeferencia
            + ",\n\tbarrio: " + this.barrio
            + ",\n\tcomuna: " + this.comuna
            + "\n}";
    }
}
