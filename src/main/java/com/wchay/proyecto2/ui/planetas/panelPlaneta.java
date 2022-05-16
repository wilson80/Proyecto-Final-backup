
package com.wchay.proyecto2.ui.planetas;

import javax.swing.JButton;

/**
 *
 * @author Jonwil
 */
public class panelPlaneta extends javax.swing.JPanel {
    
    public panelPlaneta() {
        initComponents();
        
        
        imagenPlaneta.setBounds(0, 0, this.getWidth(), this.getHeight());
        
    }

    public JButton getjButton1() {
        return imagenPlaneta;
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        imagenPlaneta = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ABC");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 10));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("123");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 10));

        imagenPlaneta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tiposPlanetas/hieloTipoPlaneta.png"))); // NOI18N
        add(imagenPlaneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 110));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton imagenPlaneta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
