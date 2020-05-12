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
public class Proveedor {
   private  String Nombre;
   private  ArrayList <Producto> listaProductosOficiales;

    public Proveedor() {
    }

    public Proveedor(String Nombre, ArrayList<Producto> listaProductosOficiales) {
        this.Nombre = Nombre;
        this.listaProductosOficiales = listaProductosOficiales;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Producto> getListaProductosOficiales() {
        return listaProductosOficiales;
    }

    public void setListaProductosOficiales(ArrayList<Producto> listaProductosOficiales) {
        this.listaProductosOficiales = listaProductosOficiales;
    }

    

    
   
   
    
}
