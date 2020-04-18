/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p3ej22.Clases;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Artista {
    private String Nombre;
    private LocalDate FechaNac;
    private ArrayList <Obra> listaObras_Artista;

    public Artista() {
    }

    public Artista(String Nombre, LocalDate FechaNac, ArrayList listaObras_Artista) {
        this.Nombre = Nombre;
        this.FechaNac = FechaNac;
        this.listaObras_Artista= listaObras_Artista;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public LocalDate getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(LocalDate FechaNac) {
        this.FechaNac = FechaNac;
    }

    public ArrayList<Obra> getListaObras_Artista() {
        return listaObras_Artista;
    }

    public void setListaObras_Artista(ArrayList<Obra> listaObras_Artista) {
        this.listaObras_Artista = listaObras_Artista;
    }

    
    
    
}
