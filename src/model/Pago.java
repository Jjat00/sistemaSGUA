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
public class Pago {
    private int idPago;
    private String fecha;
    private int idBanco;
    private int idFactura;

    public Pago(int idPago, String fecha, int idBanco, int idFactura){
        this.idPago = idPago;
        this.fecha = fecha;
        this.idBanco = idBanco;
        this.idFactura = idFactura;
    }
    
    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }
    
    public int getIdPago() {
        return this.idPago;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getFecha() {
        return this.fecha;
    }
    
    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }
    
    public int getIdBanco() {
        return this.idBanco;
    }
    
    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }
    
    public int getIdFactura() {
        return this.idFactura;
    }

    @Override
    public String toString() {
        return "Pago: {" 
            + "\n\tidPago: " + this.idPago
            + ",\n\tfecha: " + this.fecha
            + ",\n\tidBanco: " + this.idBanco
            + ",\n\tidFactura: " + this.idFactura
            + "\n}";
    }
}
