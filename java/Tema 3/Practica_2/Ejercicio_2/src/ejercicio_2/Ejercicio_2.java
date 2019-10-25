/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

import javax.swing.JOptionPane;
public class Ejercicio_2 {

   public static String notaVisual, notaCobol, notaSQL, notaJava;
    public static void main(String[] args) {
        {
           
            
        
           VisualNet();
           Cobol();
           SQL();
           java();
        
           JOptionPane.showMessageDialog(null, notaVisual+"\n"+notaCobol+"\n"+notaSQL+"\n"+notaJava);
           if (notaVisual.equals(" VisualNet: apto")&& notaCobol.equals("Cobol: apto")&& notaSQL.equals("SQL: apto")&& notaJava.equals("Java: apto")){
               JOptionPane.showMessageDialog(null, "sobresaliente");
           }
           if (notaVisual.equals(" VisualNet: apto")&& notaCobol.equals("Cobol: apto")&& notaSQL.equals("SQL: apto")){
               JOptionPane.showMessageDialog(null, "Notable");
           }
           if (notaCobol.equals("Cobol: apto")&& notaSQL.equals("SQL: apto")&& notaJava.equals("Java: apto")){
               JOptionPane.showMessageDialog(null, "Notable");
           }
           if(notaCobol.equals("Cobol: apto")&& notaSQL.equals("SQL: apto"))
           {
               JOptionPane.showMessageDialog(null, "Bien");
           }
           if (notaSQL.equals("SQL: apto")&& ((notaVisual.equals("VisualNet: apto")||notaJava.equals("Java: apto")) ))
           {
               JOptionPane.showMessageDialog(null, "Suficiente");
           }
           if (notaCobol.equals("Cobol: apto")&&(notaJava.equals("Java: apto")|| (notaVisual.equals("visualNet: apto"))))
           {
               JOptionPane.showMessageDialog(null, "Suficiente");
           }
           else
               JOptionPane.showMessageDialog(null, "Insuficiente");
           
        }

           
           
        
    }
    public static void VisualNet(){
        
        
        String mensaje=JOptionPane.showInputDialog(null, "Has aprobado VisualNet?");
        if (mensaje.equalsIgnoreCase("si"))
        {
            notaVisual=(" VisualNet: apto");
            
        }
                    else 
            if(mensaje.equalsIgnoreCase("no"))
        {
                        notaVisual=("VisualNet:no apto");
                        
        }
        
        
        
        {
            JOptionPane.showMessageDialog(null, "Respuesta no valida, repite.");
        }
        
    }
     public static void Cobol(){
        
        String mensaje=JOptionPane.showInputDialog(null, "Has aprobado Cobol?");
        if (mensaje.equalsIgnoreCase("si"))
        {
            notaCobol=("Cobol: apto");
        }
                    else 
                        notaCobol=("Cobol: no apto");
}
     public static void SQL(){
        
        String mensaje=JOptionPane.showInputDialog(null, "Has aprobado SQL?");
        if (mensaje.equalsIgnoreCase("si"))
        {
            notaSQL=("SQL: apto");
        }
                    else 
                        notaSQL=("SQL:no apto");
}
     public static void java(){
        
        String mensaje=JOptionPane.showInputDialog(null, "Has aprobado Java?");
        if (mensaje.equalsIgnoreCase("si"))
        {
            notaJava=("Java: apto");
        }
                    else 
                        notaJava=("Java: no apto");
}
}
