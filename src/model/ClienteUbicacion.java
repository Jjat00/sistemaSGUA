/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * Modelo para la ubicación del cliente
 */
public class ClienteUbicacion {
    private long cedulaCliente;
    private String direccion;
    private int estrato;

    public ClienteUbicacion(long cedulaCliente, String direccion, int estrato){
        this.cedulaCliente = cedulaCliente;
        this.direccion = direccion;
        this.estrato = estrato;
    }

    public long getCedula() {
        return this.cedulaCliente;
    }

    public void setCedula(long cedula) {
        this.cedulaCliente = cedula;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEstrado() {
        return this.estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }
    
    @Override
    public String toString() {
        return "ClienteUbicacion: {" 
            + "\n\tcedulaCliente: " + this.cedulaCliente 
            + ",\n\tdireccion: " + this.direccion 
            + ",\n\testrato: " + this.estrato 
            + "\n}";
    }
 
}
