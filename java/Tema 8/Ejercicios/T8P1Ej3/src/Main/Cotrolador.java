/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Clases.*;
import Ventanas.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class Cotrolador {

    /**
     * @param args the command line arguments
     */private static ArrayList<Productos> listaProductos;
     private static VentanaPrincipal vPrincipal;
     private static VentanaCompraVentas vCompras;
    public static void main(String[] args) {
        // TODO code application logic here
        crearProductos();
        vPrincipal= new VentanaPrincipal();
        vPrincipal.setVisible(true);
        vPrincipal.setLocationRelativeTo(null);
    }

    public static void Salir() {
        vPrincipal.dispose();
        System.exit(0);
    }
    public static void crearProductos(){
        Productos p= new Productos();
        p.setNombre("manzanas");
        p.setImporte(0.50);
        p.setUnidades(500);
        
        listaProductos= new ArrayList();
        listaProductos.add(p);
        
        p=new Productos();
        p.setNombre("naranjas");
        p.setImporte(0.45);
        p.setUnidades(500);
        
        listaProductos.add(p);
        
        p= new Productos();
        p.setNombre("peras");
        p.setImporte(0.62);
        p.setUnidades(500);
        
        listaProductos.add(p);
    }

    public static void cambiarVentanaComprar() {
        vPrincipal.setVisible(false);
        
        vCompras= new VentanaCompraVentas();
        vCompras.setVisible(true);
        vCompras.setLocationRelativeTo(null);
        vCompras.setTitle("Comprar");
        vCompras.ponerCompra();
    }

    public static void cambiarVentanaVender() {
        vCompras= new VentanaCompraVentas();
        vCompras.setVisible(true);
        vCompras.setLocationRelativeTo(null);
        vCompras.setTitle("Vender");
        
        vCompras.ponerVenta();
        
        
        
    }

    public static void cambiarVentanaPrincipal() {
        vCompras.setVisible(false);
        
        vPrincipal.setVisible(true);
        vPrincipal.setLocationRelativeTo(null);
    }


    public static void comprarVender(String producto, String unidades, String importe, String stock) {
        try{
            if( producto.isEmpty() || unidades.isEmpty())
                throw new Clases.ValorVacio();
            int x;
            for( x=0;x<listaProductos.size()&& producto.compareToIgnoreCase(listaProductos.get(x).getNombre())!=0;x++){}
            if(x< listaProductos.size()){
               JOptionPane.showMessageDialog(null, "Se han comprado "+ unidades+" "+producto + " con un importe de "+importe+"€.\nActualmente hay "+(Integer.parseInt(stock)-Integer.parseInt(unidades))+ " unidades en stock");
               guardarProducto(x);
            }
            else
                throw new ProductoNoExiste();
            
        }
        catch (ValorVacio e){
            JOptionPane.showMessageDialog(null,"No se puede dejar vacio el apartado de productos o unidades");
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El formato debe ser numerico");
        }
        catch(ProductoNoExiste e){
            JOptionPane.showMessageDialog(null, "El producto indicado no existe");
        }
    }

    private static void guardarProducto(int x) {
        Productos p= new Productos();
        p=listaProductos.get(x);
        
        
        
        
    }

    public static int anadirStock(String producto, int stock) {
        
        int x;    
          for( x=0;x<listaProductos.size()&& producto.compareToIgnoreCase(listaProductos.get(x).getNombre())!=0;x++){}
            if(listaProductos.get(x).getNombre().equalsIgnoreCase(producto)){
                stock=listaProductos.get(x).getUnidades(); 
            }     
            return stock;
        }

    public static double crearImporte(String unidades, double importe, String producto) {
        int x;
        for( x=0;x<listaProductos.size()&& producto.compareToIgnoreCase(listaProductos.get(x).getNombre())!=0;x++){}
        importe=Integer.parseInt(unidades)*listaProductos.get(x).getImporte();
        return importe;
    }

    public static int restarStock(String producto, int stock, String unidades) {
        int x;    
          for( x=0;x<listaProductos.size()&& producto.compareToIgnoreCase(listaProductos.get(x).getNombre())!=0;x++){}
            if(listaProductos.get(x).getNombre().equalsIgnoreCase(producto)){
                stock=listaProductos.get(x).getUnidades()-Integer.parseInt(unidades); 
                listaProductos.get(x).setUnidades(stock);
            } 
            return stock;
    }
         
    
}
