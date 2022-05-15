
package com.wchay.proyecto2.ui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class panelNombreTipoJugador extends javax.swing.JPanel {
    private boolean eliminarJugador;
    private String nuevoNombre;

    public panelNombreTipoJugador() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloNombreJugador = new javax.swing.JLabel();
        botonTipoJugador = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloNombreJugador.setForeground(new java.awt.Color(255, 255, 255));
        tituloNombreJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloNombreJugador.setText("Jugador1");
        tituloNombreJugador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        tituloNombreJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tituloNombreJugadorMouseClicked(evt);
            }
        });
        add(tituloNombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 100, -1));

        botonTipoJugador.setBackground(new java.awt.Color(0, 0, 0));
        botonTipoJugador.setForeground(new java.awt.Color(255, 255, 255));
        botonTipoJugador.setText("TipoJugador");
        add(botonTipoJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 120, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void tituloNombreJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloNombreJugadorMouseClicked
                if(evt.getClickCount()==2){
                    JOptionPane cambiarNombre = new JOptionPane();
                     String nuevoNombreIngresado = cambiarNombre.showInputDialog(null, "Introduce Un Nombre Nuevo", JOptionPane.INFORMATION_MESSAGE);
                    int letrasNombre =nuevoNombreIngresado.length();
//***Añdir verificacion Nombre Largo
                    if(letrasNombre>0){
                        nuevoNombre = nuevoNombreIngresado;
                        tituloNombreJugador.setText(nuevoNombre);
                        this.doLayout();
                    }else{
                        JOptionPane error = new JOptionPane();
                        error.showMessageDialog(null, "No ingreso nada", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                
                }
    }//GEN-LAST:event_tituloNombreJugadorMouseClicked
    
    
    //sets
    public void setBotonTipoJugador(JButton botonTipoJugador) {
        this.botonTipoJugador = botonTipoJugador;
    }
    public void setTituloNombreJugador(JLabel tituloNombreJugador) {
        this.tituloNombreJugador = tituloNombreJugador;
    }
    //gets
    public JButton getBotonTipoJugador() {
        return botonTipoJugador;
    }

    public JLabel getTituloNombreJugador() {
        return tituloNombreJugador;
    }

//    public JButton getBotonEliminarJugador() {
//        return botonEliminarJugador;
//    }
    

    
    
    
    
    

    
    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonTipoJugador;
    private javax.swing.JLabel tituloNombreJugador;
    // End of variables declaration//GEN-END:variables
}
