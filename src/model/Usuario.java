package model;

/**
 * User model
 */
public class Usuario {
    
    private long cedula;
    private short rol;
    private String nombre;
    private String apellido;
    private boolean actividad;
    private long celular;
    private String email;
    private String password;

    public Usuario(long cedula, short rol, String nombre, String apellido, boolean actividad, long celular, String email, String password) {
        this.cedula = cedula;
        this.rol = rol;
        this.nombre = nombre;
        this.apellido = apellido;
        this.actividad = actividad;
        this.celular = celular;
        this.email = email;
        this.password = password;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public short getRol() {
        return rol;
    }

    public void setRol(short rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isActividad() {
        return actividad;
    }

    public void setActividad(boolean actividad) {
        this.actividad = actividad;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario: {" 
            + "\n\tcedula=" + this.cedula 
            + "\n\t, rol=" + this.rol 
            + "\n\t, nombre=" + this.nombre 
            + "\n\t, apellido=" + this.apellido 
            + "\n\t, actividad=" + this.actividad 
            + "\n\t, celular=" + this.celular 
            + "\n\t, email=" + this.email 
            + "\n\t, password=" + this.password 
            + "\n}";
    }
}