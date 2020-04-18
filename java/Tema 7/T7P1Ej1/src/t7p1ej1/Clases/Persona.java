/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7p1ej1.Clases;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Persona {
    private String Nombre;
    private String Apellido;
    private int Telefono;
    private String Direccion;
    private ArrayList <Vehiculo> VehiculosEnPropiedad= new ArrayList();
    
    //Constructores
    public Persona() {
    }

    public Persona(String Nombre, String Apellido, int Telefono, String Direccion, ArrayList<Vehiculo> VehiculosEnPropiedad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.VehiculosEnPropiedad = VehiculosEnPropiedad;
    }
    //Gettter & Setter
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

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public ArrayList<Vehiculo> getVehiculosEnPropiedad() {
        return VehiculosEnPropiedad;
    }

    public void setVehiculosEnPropiedad(Vehiculo v) {
        VehiculosEnPropiedad.add(v);
    }
    
    
}
