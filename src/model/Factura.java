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

    private int NoCuenta;
    private long cedulaCliente;
    private boolean estadoPago;
    private int tipoUso;
    private int NoMedidor;
    private float valorUnitario;
    private float subsidio;

    public Factura(int NoCuenta, long cedulaCliente, int NoMedidor, boolean estadoPago,
                    int tipoUso, float valorUnitario, float subsidio) {                        
        this.NoCuenta = NoCuenta;
        this.cedulaCliente = cedulaCliente;
        this.NoMedidor = NoMedidor;
        this.estadoPago = estadoPago;
        this.tipoUso = tipoUso;
        this.valorUnitario = valorUnitario;
        this.subsidio = subsidio;
    }

    public void setNoCuenta(int NoCuenta) {
        this.NoCuenta = NoCuenta;
    }
    
    public int getNoCuenta() {
        return this.NoCuenta;
    }

    public void setCedulaCliente(long cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public long getCedulaCliente() {
        return this.cedulaCliente;
    }

    public void setNoMedidor(int NoMedidor) {
        this.NoMedidor = NoMedidor;
    }

    public int getNoMedidor() {
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

    @Override
    public String toString() {
        return "Factura: {" 
            + "\n\tNoCuenta: " + this.NoCuenta 
            + ",\n\tcedulaCliente: " + this.cedulaCliente 
            + ",\n\testadoPago: " + this.estadoPago 
            + ",\n\ttipoUso: " + this.tipoUso 
            + ",\n\tvalorUnitario: " + this.valorUnitario 
            + ",\n\tsubsidio: " + this.subsidio 
            + "\n}";
    }

}
