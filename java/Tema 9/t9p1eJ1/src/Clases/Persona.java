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
public class Persona {
    
    private int ID;
    private String Nombre;
    private int Edad;
    private String Profesion;
    private int Telefono;

    public Persona() {
    }
    
    public Persona( int ID, String Nombre, int Edad, String Profesion, int Telefono) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Profesion = Profesion;
        this.Telefono = Telefono;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    
    
    
    
}
