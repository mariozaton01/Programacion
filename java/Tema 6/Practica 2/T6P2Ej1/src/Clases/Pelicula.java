/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author 1GDAW08
 */
public class Pelicula {
    private String Titulo;
    private int Año;
    private float Duracion;
    private String Tipo;
    ArrayList<Estudio> lista;
    
    //Constructor

    public Pelicula(String Titulo, int Año, float Duracion, String Tipo, ArrayList<Estudio> lista) {
        this.Titulo = Titulo;
        this.Año = Año;
        this.Duracion = Duracion;
        this.Tipo = Tipo;
        this.lista= lista;
    }
    
    //Get & Set

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public float getDuracion() {
        return Duracion;
    }

    public void setDuracion(float Duracion) {
        this.Duracion = Duracion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public ArrayList<Estudio> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Estudio> lista) {
        this.lista = lista;
    }
    
    
}
