/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Clases.*;
import Ventanas.VentanaAlmacen;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */private static VentanaAlmacen valmacen;
     private static ArrayList <Producto>listaProductos;
     private static ArrayList <Proveedor> listaProveedores;
     
    public static void main(String[] args) {
        // TODO code application logic here
        valmacen= new VentanaAlmacen();
        valmacen.setVisible(true);
        valmacen.setLocationRelativeTo(null);
        valmacen.setTitle("CompraVenta de productos");
        crearProductos();
        crearProveedores();
        relacionProductoProveedor();
    }

    private static void crearProductos() {
        Producto p= new Producto();
        p.setNombre("Patatas");
        p.setPrecioUnitario(2.0);
        p.setUnidades(500);
        listaProductos = new ArrayList();
        listaProductos.add(p);
        
        p= new Producto();
        p.setNombre("Spaguettis");
        p.setPrecioUnitario(1.70);
        p.setUnidades(500);
        listaProductos.add(p);
        
        p = new Producto();
        p.setNombre("Macarrones");
        p.setPrecioUnitario(1.85);
        p.setUnidades(500);
        
        listaProductos.add(p);
        
    }

    private static void crearProveedores() {
        Proveedor prov= new Proveedor();
        prov.setNombre("Lays");
        listaProveedores= new ArrayList();
        listaProveedores.add(prov);
        prov.setListaProductosOficiales(listaProductos.get(0));
        
        prov= new Proveedor();
        prov.setNombre("Gallo");
        listaProveedores.add(prov);
        prov.setListaProductosOficiales(listaProductos.get(1));
        prov.setListaProductosOficiales(listaProductos.get(2));
        
        prov= new Proveedor();
        prov.setNombre("Barilla");
        listaProveedores.add(prov);
        prov.setListaProductosOficiales(listaProductos.get(1));
        prov.setListaProductosOficiales(listaProductos.get(2));
    }

    private static void relacionProductoProveedor() {
        listaProductos.get(0).setProveedores(listaProveedores.get(0));
        
        listaProductos.get(1).setProveedores(listaProveedores.get(1));
        listaProductos.get(1).setProveedores(listaProveedores.get(2));
        
        listaProductos.get(2).setProveedores(listaProveedores.get(1));
        listaProductos.get(2).setProveedores(listaProveedores.get(2));
    }

    public static String elegirProducto(String producto, String stock) {
        try{
            int x;   
            String productos;
            for(x=0;x<listaProductos.size() && !producto.equalsIgnoreCase(listaProductos.get(x).getNombre());x++){}
            if (x<listaProductos.size()){                
               stock=String.valueOf(listaProductos.get(x).getUnidades());  
            }
            else
                throw new Excepciones.ProductoNoExiste();
        }
        catch (Excepciones.ProductoNoExiste e){
            JOptionPane.showMessageDialog(null, "No existe el producto, vuelve a intentarlo");   
        }
        
        return stock;
        
    }

    public static DefaultComboBoxModel rellenarComboBox(String producto, DefaultComboBoxModel cbmodelo) {
       
        int x;
        int y;
        for( x=0;x <listaProductos.size() && !producto.equalsIgnoreCase(listaProductos.get(x).getNombre());x++){}
        if (x<listaProductos.size()){
            for(y=0; y<listaProductos.get(x).getProveedores().size();y++){
                cbmodelo.addElement(listaProductos.get(x).getProveedores().get(y).getNombre());
            }
        }
        return cbmodelo;
    }

    
    
}
