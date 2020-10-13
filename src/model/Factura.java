/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @Modelo para la factura del cliente
 */
public class Factura {

    private long NoCuenta;
    private long cedulaCliente;
    private boolean estadoPago;
    private int tipoUso;
    private long NoMedidor;
    private float valorUnitario;
    private float subsidio;
    private float ajustePeso;

    public Factura(long NoCuenta, long cedulaCliente, long NoMedidor, boolean estadoPago,
                    int tipoUso, float valorUnitario, float subsidio, float ajustePeso) {                        
        this.NoCuenta = NoCuenta;
        this.cedulaCliente = cedulaCliente;
        this.NoMedidor = NoMedidor;
        this.estadoPago = estadoPago;
        this.tipoUso = tipoUso;
        this.valorUnitario = valorUnitario;
        this.subsidio = subsidio;
        this.ajustePeso = ajustePeso;
    }

    public void setNoCuenta(long NoCuenta) {
        this.NoCuenta = NoCuenta;
    }

    public long getNoCuenta() {
        return this.NoCuenta;
    }

    public void setCedulaCliente(long cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public long getCedulaCliente() {
        return this.cedulaCliente;
    }

    public void setNoMedidor(long NoMedidor) {
        this.NoMedidor = NoMedidor;
    }

    public long getNoMedidor() {
        return this.NoMedidor;
    }

    public void setEstadoPago(boolean estadoPago) {
        this.estadoPago = estadoPago;
    }

    public boolean getEstadoPago() {
        return this.estadoPago;
    }

    public void setTipoUso(int tipoUso) {
        this.tipoUso = tipoUso;
    }

    public int getTipoUso() {
        return this.tipoUso;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public float getValorUnitario() {
        return this.valorUnitario;
    }

    public void setSubsidio(float subsidio) {
        this.subsidio = subsidio;
    }

    public float getSubsidio() {
        return this.subsidio;
    }

    public void setAjustePeso(float ajustePeso) {
        this.ajustePeso = ajustePeso;
    }

    public float getAjustePeso() {
        return this.ajustePeso;
    }

    @Override
    public String toString() {
        return "Factura: {" 
            + "\n\tNoCuenta: " + this.NoCuenta 
            + ",\n\tcedulaCliente: " + this.cedulaCliente 
            + ",\n\testadoPago: " + this.estadoPago 
            + ",\n\ttipoUso: " + this.tipoUso 
            + ",\n\tvalorUnitario: " + this.valorUnitario 
            + ",\n\tsubsidio: " + this.subsidio 
            + ",\n\tajustePeso: " + this.ajustePeso 
            + "\n}";
    }

}
