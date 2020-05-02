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
public class Coche {
    private String Matricula;
    private String Marca;
    private String Modelo;
    private String Color;
    private String Nombre;
    private String DNI;

    public Coche() {
    }

    public Coche(String Matricula, String Marca, String Modelo, String Color, String Nombre, String DNI) {
        this.Matricula = Matricula;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Color = Color;
        this.Nombre = Nombre;
        this.DNI = DNI;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return  "Matricula: " + Matricula + " |  Marca: " + Marca + " |  Propietario: " + Nombre + " |  DNI: " + DNI;
    }
    
    
    
}
