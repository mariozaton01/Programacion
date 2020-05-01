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
public class Productos {
    private String Nombre;
    private Integer Unidades;
    private double Importe;

    public Productos() {
    }

    public Productos(String Nombre, Integer Unidades, double Importe) {
        this.Nombre = Nombre;
        this.Unidades = Unidades;
        this.Importe = Importe;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getUnidades() {
        return Unidades;
    }

    public void setUnidades(Integer Unidades) {
        this.Unidades = Unidades;
    }

    public double getImporte() {
        return Importe;
    }

    public void setImporte(double Importe) {
        this.Importe = Importe;
    }
    
    

    
    
    
    
}
