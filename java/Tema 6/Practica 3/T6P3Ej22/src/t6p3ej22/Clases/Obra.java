/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p3ej22.Clases;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Obra {
    private String Titulo;
    private int AnoEdicion;
    private ArrayList <Artista> listaArtistas_Obra;

    public Obra() {
    }

    public Obra(String Titulo, int AnoEdicion, ArrayList listaArtistas_Obra) {
        this.Titulo = Titulo;
        this.AnoEdicion = AnoEdicion;
        this.listaArtistas_Obra= listaArtistas_Obra;
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

    public ArrayList<Artista> getListaArtistas_Obra() {
        return listaArtistas_Obra;
    }

    public void setListaArtistas_Obra(ArrayList<Artista> listaArtistas_Obra) {
        this.listaArtistas_Obra = listaArtistas_Obra;
    }
    
    
}
