/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author jjat02
 */
public class Pago {
    private int idPago;
    private Date fecha;
    private short idBanco;
    private int idFactura;

    public Pago(int idPago, Date fecha, short idBanco, int idFactura) {
        this.idPago = idPago;
        this.fecha = fecha;
        this.idBanco = idBanco;
        this.idFactura = idFactura;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public short getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(short idBanco) {
        this.idBanco = idBanco;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
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
