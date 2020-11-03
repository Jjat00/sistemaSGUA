package model;

/**
 *
 * Modelo para la tabla metodo_pago
 */
public class MetodoPago {
    private short idMetodoPago;
    private String nombre;

    public MetodoPago(short idMetodoPago, String nombre){
        this.idMetodoPago = idMetodoPago;
        this.nombre = nombre;
    }

    public short getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(short idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "MetodoPago{" + "idMetodoPago=" + idMetodoPago + ", nombre=" + nombre + '}';
    }
}