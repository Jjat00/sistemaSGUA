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
public class Transformador {
    private long idTransformador;
    private boolean actividad;
    private String marca;
    private int idFase;
    private float snom;
    private float v1nom;
    private float v2nom;
    private float frecuencia;

    public Transformador(long idTransformador, boolean actividad, String marca, 
        int idFase, float snom, float v1nom, float v2nom, float frecuencia) {
        this.idTransformador = idTransformador;
        this.actividad = actividad;
        this.marca = marca;
        this.idFase = idFase;
        this.snom = snom;
        this.v1nom = v1nom;
        this.v2nom = v2nom;
        this.frecuencia = frecuencia;
    }

    public void setIdTransformador(long idTransformador) {
        this.idTransformador = idTransformador;
    }

    public long getIdTransformador() {
        return this.idTransformador;
    }

    public void setActividad(boolean actividad) {
        this.actividad = actividad;
    }

    public boolean getActividad() {
        return this.actividad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }
    
    public void setIdFase(int idFase) {
        this.idFase = idFase;
    }

    public int getIdFase() {
        return this.idFase;
    }
    
    public void setSnom(float snom) {
        this.snom = snom;
    }

    public float getSnom() {
        return this.snom;
    }
    
    public void setV1nom(float v1nom) {
        this.v1nom = v1nom;
    }

    public float getV1nom() {
        return this.v1nom;
    }
    
    public void setV2nom(float v2nom) {
        this.v2nom = v2nom;
    }

    public float getV2nom() {
        return this.v2nom;
    }
    
    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }

    public float getFrecuencia() {
        return this.frecuencia;
    }
    
    @Override
    public String toString() {
        return "Transformador: {" 
            + "\n\tidTransformador: " + this.idTransformador
            + ",\n\tactividad: " + this.actividad
            + ",\n\tmarca: " + this.marca
            + ",\n\tidFase: " + this.idFase
            + ",\n\tsnom: " + this.snom
            + ",\n\tv1nom: " + this.v1nom
            + ",\n\tv2nom: " + this.v2nom
            + ",\n\tfrecuencia: " + this.frecuencia
            + "\n}";
    }
    
}
