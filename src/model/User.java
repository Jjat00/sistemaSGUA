package model;

/**
 * User model
 */
public class User {
    
    private long cedula;
    private int rol;
    private String nombre;
    private String apellido;
    private boolean actividad;
    private long celular;
    private String email;
    private String password;

    public User(long cedula, int rol, String nombre, String apellido, boolean actividad, long celular, String email, String password) {
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

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
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
        return "User{" + "cedula=" + cedula + ", rol=" + rol + ", nombre=" + nombre + ", apellido=" + apellido + ", actividad=" + actividad + ", celular=" + celular + ", email=" + email + ", password=" + password + '}';
    }
}