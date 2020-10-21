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
    private long idPago;
    private String fecha;
    private long idBanco;
    private long idFactura;

    public Pago(long idPago, String fecha, long idBanco, long idFactura){
        this.idPago = idPago;
        this.fecha = fecha;
        this.idBanco = idBanco;
        this.idFactura = idFactura;
    }
    
    public void setIdPago(long idPago) {
        this.idPago = idPago;
    }
    
    public long getIdPago() {
        return this.idPago;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getFecha() {
        return this.fecha;
    }
    
    public void setIdBanco(long idBanco) {
        this.idBanco = idBanco;
    }
    
    public long getIdBanco() {
        return this.idBanco;
    }
    
    public void setIdFactura(long idFactura) {
        this.idFactura = idFactura;
    }
    
    public long getIdFactura() {
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
