/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @Modelo para las mediciones de consumo del cliente
 */
public class Medidor {
    private int NoMedidor;
    private float lecturaActual;
    private float lecturaAnterior;
    private int consumoActual;
    private Date fechaMedicion;
    
    public Medidor(int NoMedidor, float lecturaActual, float lecturaAnterior, 
                    int consumoActual, Date fechaMedicion){
        
        this.NoMedidor = NoMedidor;
        this.lecturaActual =  lecturaActual;
        this.lecturaAnterior =  lecturaAnterior;
        this.consumoActual = consumoActual;
        this.fechaMedicion = fechaMedicion;
    }

    public void setNoMedidor(int NoMedidor) {
        this.NoMedidor = NoMedidor;
    }

    public int getNoMedidor() {
        return this.NoMedidor;
    }

    public void setLecturaActual(float lecturaActual) {
        this.lecturaActual = lecturaActual;
    }

    public float getLecturaActual() {
        return this.lecturaActual;
    }

    public void setLecturaAnterior(float lecturaAnterior) {
        this.lecturaAnterior = lecturaAnterior;
    }

    public float getLecturaAnterior() {
        return this.lecturaAnterior;
    }

    public void setConsumoActual(int consumoActual) {
        this.consumoActual = consumoActual;
    }

    public int getConsumoActual() {
        return this.consumoActual;
    }

    public void setFechaMedicion(Date fechaMedicion) {
        this.fechaMedicion = fechaMedicion;
    }

    public Date getFechaMedicion() {
        return this.fechaMedicion;
    }

    @Override
    public String toString() {
        return "Medidor: {" 
            + "\n\tNoMedidor: " + this.NoMedidor 
            + ",\n\tlecturaActual: " + this.lecturaActual 
            + ",\n\tlecturaAnterior: " + this.lecturaAnterior 
            + ",\n\tconsumoActual: " + this.consumoActual 
            + ",\n\tfechaMedicion: " + this.fechaMedicion 
            + "\n}";
    }
 
}
