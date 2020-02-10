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
public class Asiento {
    
    private int NumAsientos;
    private boolean Estado;
    private String Compartimento;
    
    /*Constructor*/

    public Asiento(int NumAsientos, boolean Estado, String Compartimento) {
        this.NumAsientos = NumAsientos;
        this.Estado = Estado;
        this.Compartimento = Compartimento;
    }
    
    /*Get &Set*/

    public int getNumAsientos() {
        return NumAsientos;
    }

    public void setNumAsientos(int NumAsientos) {
        this.NumAsientos = NumAsientos;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public String getCompartimento() {
        return Compartimento;
    }

    public void setCompartimento(String Compartimento) {
        this.Compartimento = Compartimento;
    }
    
    /*Metodos*/
    
    public void reservar(){
        
    }
    public void comprar(){
        
    }
    public void mostrarDisponibilidad(){
        
    }
    public void desbloquear(){
        
    }
    
}
