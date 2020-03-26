/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p3ej22.Clases;

/**
 *
 * @author mario
 */
public class Obra {
    private String Titulo;
    private int AnoEdicion;

    public Obra() {
    }

    public Obra(String Titulo, int AnoEdicion) {
        this.Titulo = Titulo;
        this.AnoEdicion = AnoEdicion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getAnoEdicion() {
        return AnoEdicion;
    }

    public void setAnoEdicion(int AnoEdicion) {
        this.AnoEdicion = AnoEdicion;
    }
    
    
}
