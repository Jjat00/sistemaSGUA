/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * Modelo para la tabla FasesTransformador
 */
public class FasesTransformador {
    private int idFase;
    private String tipo;

    public FasesTransformador(int idFase, String tipo){
        this.idFase = idFase;
        this.tipo = tipo;
    }

    public int getIdFase() {
        return idFase;
    }

    public void setIdFase(int idFase) {
        this.idFase = idFase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
        
}
