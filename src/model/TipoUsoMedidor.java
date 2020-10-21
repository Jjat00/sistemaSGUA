/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * Modelo para la tabla TipoUsoMedidor
 */
public class TipoUsoMedidor {
    private int idTipoUso;
    private String tipo;

    public TipoUsoMedidor(int idTipoUso, String tipo){
        this.idTipoUso = idTipoUso;
        this.tipo = tipo;
    }

    public int getIdTipoUso() {
        return idTipoUso;
    }

    public void setIdTipoUso(int idTipoUso) {
        this.idTipoUso = idTipoUso;
    }    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }    
}
