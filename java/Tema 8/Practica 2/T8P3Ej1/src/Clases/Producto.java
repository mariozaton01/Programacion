/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Producto {
    private String Nombre;
    private int Unidades;
    private double precioUnitario;
    private ArrayList<Proveedor> Proveedores;

    public Producto() {
    }

    public Producto(String Nombre, int Unidades, double precioUnitario, ArrayList<Proveedor> Proveedores) {
        this.Nombre = Nombre;
        this.Unidades = Unidades;
        this.precioUnitario = precioUnitario;
        this.Proveedores = Proveedores;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getUnidades() {
        return Unidades;
    }

    public void setUnidades(int Unidades) {
        this.Unidades = Unidades;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public ArrayList<Proveedor> getProveedores() {
        return Proveedores;
    }

    public void setProveedores(Proveedor prov) {
        this.Proveedores.add(prov);
    }

    
    
    
}
