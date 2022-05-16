
package com.wchay.proyecto2.ui;

import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JPanel;

public class VentanaPrincipal extends javax.swing.JFrame  {
    
    private AccionesConfiguraciones añadir;

    
    public VentanaPrincipal() {
        
        initComponents();
        añadir = new AccionesConfiguraciones(this);
        panelTurnoJugador.setVisible(false);
        panelMapa.setVisible(false);
        añadirAcciones();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelOpciones = new javax.swing.JPanel();
        botonPartidaNueva = new javax.swing.JButton();
        botonFinalizarPartida = new javax.swing.JButton();
        botonVistaFlota = new javax.swing.JButton();
        botonMedirDistancias = new javax.swing.JButton();
        botonFinTurno2 = new javax.swing.JButton();
        botonMostrarOpciones1 = new javax.swing.JButton();
        panelTurnoJugador = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelMapa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaMensajes = new javax.swing.JTextArea();
        pruebaTextArea = new javax.swing.JButton();
        fondoInicio = new javax.swing.JLabel();
        menuBarraPrincipal = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        menuCargarPartida = new javax.swing.JMenuItem();
        menuReplay = new javax.swing.JMenuItem();
        menuMover = new javax.swing.JMenu();
        menuVer = new javax.swing.JMenu();
        menuPreferencias = new javax.swing.JMenu();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Konquest");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelOpciones.setBackground(new java.awt.Color(0, 0, 51));
        panelOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelOpciones.setForeground(new java.awt.Color(255, 255, 255));

        botonPartidaNueva.setBackground(new java.awt.Color(0, 0, 51));
        botonPartidaNueva.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonPartidaNueva.setForeground(new java.awt.Color(255, 255, 255));
        botonPartidaNueva.setText("Nueva Partida");
        botonPartidaNueva.setBorder(null);
        botonPartidaNueva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonFinalizarPartida.setBackground(new java.awt.Color(0, 0, 51));
        botonFinalizarPartida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonFinalizarPartida.setForeground(new java.awt.Color(255, 255, 255));
        botonFinalizarPartida.setText("Finalizar Partida");
        botonFinalizarPartida.setBorder(null);
        botonFinalizarPartida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonFinalizarPartida.setPreferredSize(new java.awt.Dimension(115, 25));
        botonFinalizarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFinalizarPartidaActionPerformed(evt);
            }
        });

        botonVistaFlota.setBackground(new java.awt.Color(0, 0, 51));
        botonVistaFlota.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonVistaFlota.setForeground(new java.awt.Color(255, 255, 255));
        botonVistaFlota.setText("Vista General De La Flota");
        botonVistaFlota.setBorder(null);
        botonVistaFlota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonMedirDistancias.setBackground(new java.awt.Color(0, 0, 51));
        botonMedirDistancias.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonMedirDistancias.setForeground(new java.awt.Color(255, 255, 255));
        botonMedirDistancias.setText("Medir Distancias");
        botonMedirDistancias.setBorder(null);
        botonMedirDistancias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonFinTurno2.setBackground(new java.awt.Color(0, 0, 51));
        botonFinTurno2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonFinTurno2.setForeground(new java.awt.Color(255, 255, 255));
        botonFinTurno2.setText("Fin del Turno");
        botonFinTurno2.setBorder(null);
        botonFinTurno2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonMostrarOpciones1.setBackground(new java.awt.Color(0, 0, 51));
        botonMostrarOpciones1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonMostrarOpciones1.setForeground(new java.awt.Color(255, 255, 255));
        botonMostrarOpciones1.setText("Mostrar Opciones");
        botonMostrarOpciones1.setBorder(null);
        botonMostrarOpciones1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(botonPartidaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonFinalizarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(botonFinTurno2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonMedirDistancias, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonMostrarOpciones1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVistaFlota, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(404, Short.MAX_VALUE))
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVistaFlota)
                    .addComponent(botonFinalizarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPartidaNueva)
                    .addComponent(botonMedirDistancias)
                    .addComponent(botonFinTurno2)
                    .addComponent(botonMostrarOpciones1))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        getContentPane().add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 40));

        panelTurnoJugador.setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Turno Jugador :");

        javax.swing.GroupLayout panelTurnoJugadorLayout = new javax.swing.GroupLayout(panelTurnoJugador);
        panelTurnoJugador.setLayout(panelTurnoJugadorLayout);
        panelTurnoJugadorLayout.setHorizontalGroup(
            panelTurnoJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTurnoJugadorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(1391, Short.MAX_VALUE))
        );
        panelTurnoJugadorLayout.setVerticalGroup(
            panelTurnoJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTurnoJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panelTurnoJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1550, 40));

        panelMapa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 1, true));
        panelMapa.setOpaque(false);

        javax.swing.GroupLayout panelMapaLayout = new javax.swing.GroupLayout(panelMapa);
        panelMapa.setLayout(panelMapaLayout);
        panelMapaLayout.setHorizontalGroup(
            panelMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1468, Short.MAX_VALUE)
        );
        panelMapaLayout.setVerticalGroup(
            panelMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        getContentPane().add(panelMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 1470, 540));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 153), 2, true));

        TextAreaMensajes.setBackground(new java.awt.Color(0, 0, 51));
        TextAreaMensajes.setColumns(20);
        TextAreaMensajes.setForeground(new java.awt.Color(255, 255, 255));
        TextAreaMensajes.setRows(5);
        jScrollPane1.setViewportView(TextAreaMensajes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 930, 130));

        pruebaTextArea.setText("jButton1");
        pruebaTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pruebaTextAreaActionPerformed(evt);
            }
        });
        getContentPane().add(pruebaTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 640, 130, 60));

        fondoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/fondoPrincipal.png"))); // NOI18N
        getContentPane().add(fondoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 770));

        menuBarraPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        menuBarraPrincipal.setBorder(null);
        menuBarraPrincipal.setForeground(new java.awt.Color(255, 255, 255));

        menuJuego.setBackground(new java.awt.Color(255, 255, 255));
        menuJuego.setForeground(new java.awt.Color(255, 255, 255));
        menuJuego.setText("Juego");
        menuJuego.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menuCargarPartida.setText("Cargar Partida");
        menuJuego.add(menuCargarPartida);

        menuReplay.setText("Replay ");
        menuJuego.add(menuReplay);

        menuBarraPrincipal.add(menuJuego);

        menuMover.setForeground(new java.awt.Color(255, 255, 255));
        menuMover.setText("Mover");
        menuMover.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuBarraPrincipal.add(menuMover);

        menuVer.setForeground(new java.awt.Color(255, 255, 255));
        menuVer.setText("Ver");
        menuVer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuBarraPrincipal.add(menuVer);

        menuPreferencias.setForeground(new java.awt.Color(255, 255, 255));
        menuPreferencias.setText("Preferencias");
        menuPreferencias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuBarraPrincipal.add(menuPreferencias);

        menuAyuda.setForeground(new java.awt.Color(255, 255, 255));
        menuAyuda.setText("Ayuda");
        menuAyuda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuBarraPrincipal.add(menuAyuda);

        setJMenuBar(menuBarraPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void añadirAcciones(){
        añadir.accionPartidaNueva();
    }
    
    private void botonFinalizarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFinalizarPartidaActionPerformed
    }//GEN-LAST:event_botonFinalizarPartidaActionPerformed

    private void pruebaTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pruebaTextAreaActionPerformed
        TextAreaMensajes.setEnabled(false);
        
        
    }//GEN-LAST:event_pruebaTextAreaActionPerformed

    public JPanel getPanelMapa() {
        return panelMapa;
    }

    public JPanel getPanelTurno() {
        return panelTurnoJugador;
    }

    public JButton getBotonPartidaNueva() {
        return botonPartidaNueva;
    }

    public AccionesConfiguraciones getAñadir() {
        return añadir;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextAreaMensajes;
    private javax.swing.JButton botonFinTurno2;
    private javax.swing.JButton botonFinalizarPartida;
    private javax.swing.JButton botonMedirDistancias;
    private javax.swing.JButton botonMostrarOpciones1;
    private javax.swing.JButton botonPartidaNueva;
    private javax.swing.JButton botonVistaFlota;
    private javax.swing.JLabel fondoInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuBar menuBarraPrincipal;
    private javax.swing.JMenuItem menuCargarPartida;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JMenu menuMover;
    private javax.swing.JMenu menuPreferencias;
    private javax.swing.JMenuItem menuReplay;
    private javax.swing.JMenu menuVer;
    private javax.swing.JPanel panelMapa;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelTurnoJugador;
    private javax.swing.JButton pruebaTextArea;
    // End of variables declaration//GEN-END:variables
}
