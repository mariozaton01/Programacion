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
public class Disco extends Obra{
    private String Discografica;
    private int NumCanciones;

    public Disco() {
    }

    public Disco(String Discografica, int NumCanciones, String Titulo, int AnoEdicion,ArrayList listaArtistas_Obra) {
        super(Titulo, AnoEdicion, listaArtistas_Obra);
        this.Discografica = Discografica;
        this.NumCanciones = NumCanciones;
    }

    public String getDiscografica() {
        return Discografica;
    }

    public void setDiscografica(String Discografica) {
        this.Discografica = Discografica;
    }

    public int getNumCanciones() {
        return NumCanciones;
    }

    public void setNumCanciones(int NumCanciones) {
        this.NumCanciones = NumCanciones;
    }
    
    
    
}
