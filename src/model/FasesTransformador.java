package model;

/**
 *
 * Modelo para la tabla FasesTransformador
 */
public class FasesTransformador {
    private short idFase;
    private String tipo;

    public FasesTransformador(short idFase, String tipo){
        this.idFase = idFase;
        this.tipo = tipo;
    }

    public short getIdFase() {
        return idFase;
    }

    public void setIdFase(short idFase) {
        this.idFase = idFase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
        
}
