/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * Modelo para la tabla cliente
 */
public class Cliente {
    private long cedula;
    private String nombre;
    private String apellido;
    private long celular;
    private String email;
    private boolean actividad;

    public Cliente(long cedula, String nombre, String apellido, long celular, String email, boolean actividad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.email = email;
        this.actividad = actividad;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean getActividad() {
        return actividad;
    }

    public void setActividad(boolean actividad) {
        this.actividad = actividad;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente: {" 
                + "\n\tcedula: " + this.cedula 
                + ",\n\tnombre: " + this.nombre
                + ",\n\tapellido: " + this.apellido
                + ",\n\tactividad: " + this.actividad 
                + ",\n\tcelular: " + this.celular 
                + ",\n\temail: " + this.email  
                + "\n}";
    }
}
