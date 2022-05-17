
package com.wchay.proyecto2.ui;

import com.wchay.proyecto2.backend.inicio_juego.AccionesConfiguraciones;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class VentanaPrincipal extends javax.swing.JFrame  {
    
    private AccionesConfiguraciones añadir;

    JTextArea popupPrincipal;
    public VentanaPrincipal() {
        
        initComponents();
        añadir = new AccionesConfiguraciones(this);
        panelTurnoJugador.setVisible(false);
        panelMapa.setVisible(false);
        TextAreaMensajes.setEditable(false);
        TextAreaMensajes.setVisible(false);
        ScrollPaneAreaMensajes.setVisible(false);
        
        añadirAcciones();
        popupPrincipal = new JTextArea();
        panelMapa.add(popupPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 300, 125));
        panelMapa.setBorder(new LineBorder(Color.green));
        panelMapa.setFont(new java.awt.Font("Segoe UI", 1, 20));
        popupPrincipal.setText(String.format("NOmbre Planeta: \nDueño: \nCantidad Naves: \nProduccion: \nPorcentaje de Muertes: "));
        popupPrincipal.setEditable(false);
        popupPrincipal.setVisible(false);
        panelMapa.doLayout();
        int d = panelMapa.getLocation().x;
        int e = panelMapa.getLocation().y;
        System.out.println("location x" +d);
        System.out.println("location y" +e);
        
        popupPrincipal.doLayout();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelOpciones = new javax.swing.JPanel();
        botonPartidaNueva = new javax.swing.JButton();
        botonFinalizarPartida = new javax.swing.JButton();
        botonVistaFlota = new javax.swing.JButton();
        botonMedirDistancias = new javax.swing.JButton();
        botonFinTurno = new javax.swing.JButton();
        botonMostrarOpciones1 = new javax.swing.JButton();
        panelTurnoJugador = new javax.swing.JPanel();
        tituloTurno = new javax.swing.JLabel();
        botonPlanetaOrigen = new javax.swing.JButton();
        botonPlanetaDestino = new javax.swing.JButton();
        panelJugador_en_Turno = new javax.swing.JPanel();
        planetaOseleccionado = new javax.swing.JLabel();
        planetaDseleccionado = new javax.swing.JLabel();
        panelMapa = new javax.swing.JPanel();
        ScrollPaneAreaMensajes = new javax.swing.JScrollPane();
        TextAreaMensajes = new javax.swing.JTextArea();
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

        botonFinTurno.setBackground(new java.awt.Color(0, 0, 51));
        botonFinTurno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonFinTurno.setForeground(new java.awt.Color(255, 255, 255));
        botonFinTurno.setText("Fin del Turno");
        botonFinTurno.setBorder(null);
        botonFinTurno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
                .addComponent(botonFinTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(botonFinTurno)
                    .addComponent(botonMostrarOpciones1))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        getContentPane().add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 40));

        panelTurnoJugador.setBackground(new java.awt.Color(102, 0, 102));

        tituloTurno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloTurno.setForeground(new java.awt.Color(255, 255, 255));
        tituloTurno.setText("Turno Jugador :");

        botonPlanetaOrigen.setText("SeleccionarComoPlaneta Origen");

        botonPlanetaDestino.setText("SeleccionarComo Planeta Destino");

        panelJugador_en_Turno.setBackground(new java.awt.Color(0, 0, 0));
        panelJugador_en_Turno.setLayout(new javax.swing.BoxLayout(panelJugador_en_Turno, javax.swing.BoxLayout.LINE_AXIS));

        planetaOseleccionado.setForeground(new java.awt.Color(255, 255, 255));
        planetaOseleccionado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        planetaDseleccionado.setForeground(new java.awt.Color(255, 255, 255));
        planetaDseleccionado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelTurnoJugadorLayout = new javax.swing.GroupLayout(panelTurnoJugador);
        panelTurnoJugador.setLayout(panelTurnoJugadorLayout);
        panelTurnoJugadorLayout.setHorizontalGroup(
            panelTurnoJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTurnoJugadorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tituloTurno)
                .addGap(46, 46, 46)
                .addComponent(panelJugador_en_Turno, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(botonPlanetaOrigen)
                .addGap(18, 18, 18)
                .addComponent(planetaOseleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonPlanetaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(planetaDseleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );
        panelTurnoJugadorLayout.setVerticalGroup(
            panelTurnoJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTurnoJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTurnoJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelJugador_en_Turno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tituloTurno, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addGroup(panelTurnoJugadorLayout.createSequentialGroup()
                        .addGroup(panelTurnoJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTurnoJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botonPlanetaOrigen)
                                .addComponent(planetaOseleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelTurnoJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botonPlanetaDestino)
                                .addComponent(planetaDseleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(panelTurnoJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1550, 40));

        panelMapa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 0), 1, true));
        panelMapa.setOpaque(false);
        panelMapa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panelMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 1470, 540));

        ScrollPaneAreaMensajes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 153), 2, true));

        TextAreaMensajes.setBackground(new java.awt.Color(0, 0, 51));
        TextAreaMensajes.setColumns(20);
        TextAreaMensajes.setForeground(new java.awt.Color(255, 255, 255));
        TextAreaMensajes.setRows(5);
        ScrollPaneAreaMensajes.setViewportView(TextAreaMensajes);

        getContentPane().add(ScrollPaneAreaMensajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 930, 130));

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

    public JTextArea getTextAreaMensajes() {
        return TextAreaMensajes;
    }

    public JScrollPane getScrollPaneAreaMensajes() {
        return ScrollPaneAreaMensajes;
    }

    public JTextArea getPopupPrincipal() {
        return popupPrincipal;
    }

    public JButton getBotonMedirDistancias() {
        return botonMedirDistancias;
    }

    public JButton getBotonPlanetaOrigen() {
        return botonPlanetaOrigen;
    }

    public JButton getBotonPlanetaDestino() {
        return botonPlanetaDestino;
    }

    public JLabel getPlanetaOseleccionado() {
        return planetaOseleccionado;
    }

    public JLabel getPlanetaDseleccionado() {
        return planetaDseleccionado;
    }

    public JButton getBotonFinTurno() {
        return botonFinTurno;
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPaneAreaMensajes;
    private javax.swing.JTextArea TextAreaMensajes;
    private javax.swing.JButton botonFinTurno;
    private javax.swing.JButton botonFinalizarPartida;
    private javax.swing.JButton botonMedirDistancias;
    private javax.swing.JButton botonMostrarOpciones1;
    private javax.swing.JButton botonPartidaNueva;
    private javax.swing.JButton botonPlanetaDestino;
    private javax.swing.JButton botonPlanetaOrigen;
    private javax.swing.JButton botonVistaFlota;
    private javax.swing.JLabel fondoInicio;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuBar menuBarraPrincipal;
    private javax.swing.JMenuItem menuCargarPartida;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JMenu menuMover;
    private javax.swing.JMenu menuPreferencias;
    private javax.swing.JMenuItem menuReplay;
    private javax.swing.JMenu menuVer;
    private javax.swing.JPanel panelJugador_en_Turno;
    private javax.swing.JPanel panelMapa;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelTurnoJugador;
    private javax.swing.JLabel planetaDseleccionado;
    private javax.swing.JLabel planetaOseleccionado;
    private javax.swing.JLabel tituloTurno;
    // End of variables declaration//GEN-END:variables
}
