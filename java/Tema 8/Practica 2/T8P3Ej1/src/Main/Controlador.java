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
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
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
        crearObjetos();
        
    }

    private static void crearObjetos() {
        //Proveedores
        Proveedor prov= new Proveedor();
        prov.setNombre("Lays");
        listaProveedores= new ArrayList();
        listaProveedores.add(prov);
        
        
        prov= new Proveedor();
        prov.setNombre("Gallo");
        listaProveedores.add(prov);
        
        
        prov= new Proveedor();
        prov.setNombre("Barilla");
        listaProveedores.add(prov);
        
        //Productos
        Producto p= new Producto();
        p.setNombre("Patatas");
        p.setPrecioUnitario(2.00f);
        p.setUnidades(500);
        
        ArrayList<Proveedor> proveedor = new ArrayList();       
        proveedor.add(listaProveedores.get(1));
        proveedor.add(listaProveedores.get(2));        
        p.setProveedores(proveedor);
         
        listaProductos = new ArrayList();
        listaProductos.add(p);
        
        
        p= new Producto();
        p.setNombre("Spaguettis");
        p.setPrecioUnitario(1.70f);
        p.setUnidades(500);
        
        proveedor= new ArrayList();
        proveedor.add(listaProveedores.get(2));        
        p.setProveedores(proveedor);
        listaProductos.add(p);
        
        p = new Producto();
        p.setNombre("Macarrones");
        p.setPrecioUnitario(1.85f);
        p.setUnidades(500);
        
        proveedor= new ArrayList();
        proveedor.add(listaProveedores.get(0)); 
        proveedor.add(listaProveedores.get(1)); 
        proveedor.add(listaProveedores.get(2)); 
        p.setProveedores(proveedor);
        
        
 
        listaProductos.add(p);
           
        ArrayList <Producto> productos= new ArrayList();
        productos.add(listaProductos.get(0));
        productos.add(listaProductos.get(1));
        productos.add(listaProductos.get(2));
        listaProveedores.get(2).setListaProductosOficiales(productos);
        
        productos= new ArrayList();
        productos.add(listaProductos.get(0));
        productos.add(listaProductos.get(2));
        listaProveedores.get(1).setListaProductosOficiales(productos);
        
        
        productos= new ArrayList();
        productos.add(listaProductos.get(2));
        listaProveedores.get(0).setListaProductosOficiales(productos);
       
   
        
        
        
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

    public static void rellenarComboBox(JComboBox combobox, String producto) {
       combobox.removeAllItems();
        for (int x = 0; x < listaProductos.size(); x++) {
            if(producto.equalsIgnoreCase(listaProductos.get(x).getNombre())){    
                for (int i = 0; i < listaProductos.get(x).getProveedores().size(); i++) {
                    
                    combobox.addItem(listaProductos.get(x).getProveedores().get(i).getNombre()); 
                }
                               
            }
            
            
        }
        
    }

    public static String setearPrecio(String producto, String precio, String unidades) {
        try{
            int x;   
            String productos;
            for(x=0;x<listaProductos.size() && !producto.equalsIgnoreCase(listaProductos.get(x).getNombre());x++){}
            if (x<listaProductos.size()){ 
                double unidad = Double.parseDouble(unidades);
                
               
               precio=String.valueOf(String.format("%.2f",unidad*listaProductos.get(x).getPrecioUnitario()));
            }
            else
                throw new Excepciones.ProductoNoExiste();
        }
        catch (Excepciones.ProductoNoExiste e){
            JOptionPane.showMessageDialog(null, "No existe el producto, vuelve a intentarlo");   
        }
        return precio;
    }

    public static double calcularTotal(String precio, String unidades) {
        double total=0;
        try{
            if(!precio.isEmpty()){
                Double preci= Double.parseDouble(precio);
                Double unidad= Double.parseDouble(unidades);
                total= preci*unidad;
            } 
            else
                throw new Excepciones.CampoVacio();
            
        }
        catch (Excepciones.CampoVacio e){
            JOptionPane.showMessageDialog(null, "El campo 'Precio' esta vacio, rellenalo");
        }
        return total;
    }

    public static void comprobarVacio(String unidades) {
        try{
            if(unidades.isEmpty())
                throw new Excepciones.CampoVacio();
        }
        catch(Excepciones.CampoVacio e){
            JOptionPane.showMessageDialog(null, "El campo 'Unidades' esta vacio, rellenalo.");
        }
    }

    public static String aplicarDescuentoVolumen(JCheckBox checkbVolumen, String precio ) {
        double total=0;
        if (checkbVolumen.isSelected()){
            double preci= Double.parseDouble(precio);
            total= preci-preci*0.02;
        }
        
        return String.valueOf(total);
    }

    public static String aplicarDescuentoPagoPronto(JCheckBox checkbProntoPago, String precio) {
        double total=0;
        if(checkbProntoPago.isSelected()){
            double preci= Double.parseDouble(precio);
            total= preci-preci*0.03;
        }
        return String.valueOf(total);
    }

    
    
}
