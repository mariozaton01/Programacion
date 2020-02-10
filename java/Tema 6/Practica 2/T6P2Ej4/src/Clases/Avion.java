/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author mario
 */
public class Avion {
    
    private String Aerolinea;
    private String CodigoAvion;
    private int NumAsientos;
    private String Compartimentos;
    
    
   /*Constructor*/

    public Avion(String Aerolinea, String CodigoAvion, int NumAsientos, String Compartimentos) {
        this.Aerolinea = Aerolinea;
        this.CodigoAvion = CodigoAvion;
        this.NumAsientos = NumAsientos;
        this.Compartimentos = Compartimentos;
    }
    
    /*Get & Set*/

    public String getAerolinea() {
        return Aerolinea;
    }

    public void setAerolinea(String Aerolinea) {
        this.Aerolinea = Aerolinea;
    }

    public String getCodigoAvion() {
        return CodigoAvion;
    }

    public void setCodigoAvion(String CodigoAvion) {
        this.CodigoAvion = CodigoAvion;
    }

    public int getNumAsientos() {
        return NumAsientos;
    }

    public void setNumAsientos(int NumAsientos) {
        this.NumAsientos = NumAsientos;
    }

    public String getCompartimentos() {
        return Compartimentos;
    }

    public void setCompartimentos(String Compartimentos) {
        this.Compartimentos = Compartimentos;
    }
    
    /*Metodos*/
    
    public void asignarAVuelo(){
        
    }
    public Avion obtener(){
        
    }
    public void cancelarVuelo(){
        
    }
    
    
    
}
