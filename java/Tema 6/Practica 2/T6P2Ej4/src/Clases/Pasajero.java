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
public class Pasajero {
    
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Sexo;
    private int Edad;
    private Asiento asient;
    
    /*constructor*/

    public Pasajero(String Cedula, String Nombre, String Apellido, String Sexo, int Edad) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Sexo = Sexo;
        this.Edad = Edad;
    }
    
    /*Get & Set*/

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public Asiento getAsient() {
        return asient;
    }

    public void setAsient(Asiento asient) {
        this.asient = asient;
    }
    
    
    
    /*Metodos*/
    
    public void agregarNuevo(){
        
    }
    public void modificar(){
        
    }
    public void asignarVuelo(){
        
    }
    public Pasajero buscar(){
        
    }
    
}
