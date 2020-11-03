package model;

/**
 *
 * Modelo para la tabla rol
 */
public class Rol {
    private short id;
    private String nombre;

    public Rol(short id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Rol{" + "id=" + id + ", nombre=" + nombre + '}';
    }
}
