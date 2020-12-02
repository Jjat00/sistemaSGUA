package model;

/**
 * reporte final model
 */
public class ReporteFinal {
    
    private long cliente;
    private float totalinteres;
    private float totalsininteres;

    public ReporteFinal(long cliente, float totalinteres, float totalsininteres) {
        this.cliente = cliente;
        this.totalinteres = totalinteres;
        this.totalsininteres = totalsininteres;
    }

    public long getCliente() {
        return cliente;
    }

    public void setCliente(long cliente) {
        this.cliente = cliente;
    }

    public float getTotalinteres() {
        return totalinteres;
    }

    public void setTotalinteres(float totalinteres) {
        this.totalinteres = totalinteres;
    }

    public float getTotalsininteres() {
        return totalsininteres;
    }

    public void setTotalsininteres(float totalsininteres) {
        this.totalsininteres = totalsininteres;
    }
}
