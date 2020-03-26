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
    
    private int NumAsiento;
    private boolean Estado;
    private String Compartimento;
    private Pasajero Pasajer;
    
    /*Constructor*/

    public Asiento(int NumAsiento, boolean Estado, String Compartimento) {
        this.NumAsiento = NumAsiento;
        this.Estado = Estado;
        this.Compartimento = Compartimento;
        
    }
    
    /*Get &Set*/

    public int getNumAsientos() {
        return NumAsiento;
    }

    public void setNumAsientos(int NumAsientos) {
        this.NumAsiento = NumAsientos;
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

    public Pasajero getPasajer() {
        return Pasajer;
    }

    public void setPasajer(Pasajero Pasajer) {
        this.Pasajer = Pasajer;
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
