package model;

/**
 *
 * Modelo para la tabla rol
 */
public class Uso {
    private short id;
    private String tipo;

    public Uso(short id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}