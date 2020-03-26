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
public class Pelicula extends Obra {
     private String Productora;
     private int Duracion;

    public Pelicula() {
    }

    public Pelicula(String Productora, int Duracion, String Titulo, int AnoEdicion) {
        super(Titulo, AnoEdicion);
        this.Productora = Productora;
        this.Duracion = Duracion;
    }

    public String getProductora() {
        return Productora;
    }

    public void setProductora(String Productora) {
        this.Productora = Productora;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }
     
     
}
