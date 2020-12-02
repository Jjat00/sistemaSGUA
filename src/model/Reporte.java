package model;

import java.sql.Date;

/**
 * reporte model
 */
public class Reporte {
    
    private long cedula;
    private float total;
    private Date fecha;
    private float interes;
    private float totalxmora;

    public Reporte(long cedula, float total, Date fecha) {
        this.cedula = cedula;
        this.total = total;
        this.fecha = fecha;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public float getTotalxmora() {
        return totalxmora;
    }

    public void setTotalxmora(float totalxmora) {
        this.totalxmora = totalxmora;
    }
}
