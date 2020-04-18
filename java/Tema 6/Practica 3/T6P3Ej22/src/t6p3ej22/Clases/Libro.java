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
public class Libro extends Obra{
    private String Editorial;
    private int NumPaginas;

    public Libro() {
    }

    public Libro(String Editorial, int NumPaginas, String Titulo, int AnoEdicion, ArrayList listaArtistas_Obra) {
        super(Titulo, AnoEdicion, listaArtistas_Obra);
        this.Editorial = Editorial;
        this.NumPaginas = NumPaginas;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(int NumPaginas) {
        this.NumPaginas = NumPaginas;
    }
    
    
    
}
