/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t8p1ej1;

import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    private Integer aciertos;
        private Integer intentos;
        private Integer fallos;
        
    public Ventana() {
        initComponents();
        
        setLocationRelativeTo(null);
        setTitle("Suma de 2 numeros al azar");
        
        aciertos=0;
        intentos=0;
        fallos=0;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TNumeroUno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TNumeroDos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tIntentos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tAciertos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tFallos = new javax.swing.JTextField();
        bActivar = new javax.swing.JButton();
        bComprobar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Numero 1:");

        TNumeroUno.setEditable(false);
        TNumeroUno.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TNumeroUnoPropertyChange(evt);
            }
        });

        jLabel2.setText("+ Numero 2:");

        TNumeroDos.setEditable(false);

        jLabel3.setText("Intentos:");

        tIntentos.setEditable(false);
        tIntentos.setText("0");

        jLabel4.setText("Aciertos:");

        tAciertos.setEditable(false);
        tAciertos.setText("0");
        tAciertos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tAciertosActionPerformed(evt);
            }
        });

        jLabel5.setText("Fallos:");

        tFallos.setEditable(false);
        tFallos.setText("0");
        tFallos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFallosActionPerformed(evt);
            }
        });

        bActivar.setText("Activar");
        bActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActivarActionPerformed(evt);
            }
        });

        bComprobar.setText("Comprobar");
        bComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComprobarActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(TNumeroUno, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bActivar)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(tAciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(bComprobar)))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(tFallos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bSalir)
                    .addComponent(TNumeroDos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TNumeroDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(TNumeroUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tAciertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tFallos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bActivar)
                    .addComponent(bComprobar)
                    .addComponent(bSalir))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActivarActionPerformed
        // TODO add your handling code here:
        Integer numero1 = (int)(Math.random()*1000);
        Integer numero2 = (int)(Math.random()*1000);
        
        TNumeroUno.setText(numero1.toString());
        TNumeroDos.setText(numero2.toString());
        
    }//GEN-LAST:event_bActivarActionPerformed

    private void TNumeroUnoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TNumeroUnoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_TNumeroUnoPropertyChange

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        // TODO add your handling code here:
        T8P1Ej1.salir();
    }//GEN-LAST:event_bSalirActionPerformed

    private void tFallosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFallosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFallosActionPerformed

    private void tAciertosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tAciertosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tAciertosActionPerformed

    private void bComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprobarActionPerformed
        // TODO add your handling code here:
        try{
            if(TNumeroUno.getText().isEmpty()){
                throw new ExcepcionOrden();
            }
            intentos= intentos +1;
            tIntentos.setText(intentos.toString());
            int pregunta= Integer.parseInt(JOptionPane.showInputDialog("La suma es: "));
            int suma= Integer.parseInt(TNumeroUno.getText()) + Integer.parseInt(TNumeroDos.getText());

            if(suma!=pregunta){
                fallos= fallos+1;
                tFallos.setText(fallos.toString());
                
            }
            if(suma==pregunta){
                aciertos= aciertos +1;
                tAciertos.setText(aciertos.toString());

            }
            
        }
        catch (ExcepcionOrden e){
            JOptionPane.showMessageDialog(null, "Para comprobar primero hay  que generar numeros clickando en activar.");  
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El dato introducido debe ser numerico.");             
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas");
        }
        
    }//GEN-LAST:event_bComprobarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TNumeroDos;
    private javax.swing.JTextField TNumeroUno;
    private javax.swing.JButton bActivar;
    private javax.swing.JButton bComprobar;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tAciertos;
    private javax.swing.JTextField tFallos;
    private javax.swing.JTextField tIntentos;
    // End of variables declaration//GEN-END:variables
}
