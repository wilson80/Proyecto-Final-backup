
package com.wchay.proyecto2.ui;

import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;

public class ConfiguracionesPartidaNueva extends javax.swing.JFrame  {
//    private int jugadorAEliminar;
    public ConfiguracionesPartidaNueva( ) {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondoConfiguracionesPartidaNueva = new javax.swing.JPanel();
        titiloNuevaPartida = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        botonGuardarMapa = new javax.swing.JButton();
        botonContinuar = new javax.swing.JButton();
        botonSeleccionarMapa = new javax.swing.JButton();
        panelConfiguracionesPlanetasNeutrales = new javax.swing.JPanel();
        CheckBoxMostrarNaves = new javax.swing.JCheckBox();
        tituloCantidadPlanetasNeutrales = new javax.swing.JLabel();
        CheckBoxMostrarAtributos = new javax.swing.JCheckBox();
        SpinnerPlanetasNeutrales = new javax.swing.JSpinner();
        tituloProduccion = new javax.swing.JLabel();
        SpinnerProduccion = new javax.swing.JSpinner();
        panelConfiguracionesJugadores = new javax.swing.JPanel();
        comboboxJugadorNuevo = new javax.swing.JComboBox<>();
        panelAñadirJugadores = new javax.swing.JPanel();
        panelJugador1 = new javax.swing.JPanel();
        panelJugador2 = new javax.swing.JPanel();
        panelJugador3 = new javax.swing.JPanel();
        panelJugador4 = new javax.swing.JPanel();
        panelJugador5 = new javax.swing.JPanel();
        panelJugador6 = new javax.swing.JPanel();
        panelJugador7 = new javax.swing.JPanel();
        panelJugador8 = new javax.swing.JPanel();
        tituloJugadores1 = new javax.swing.JLabel();
        tituloTipo = new javax.swing.JLabel();
        tituloNombre = new javax.swing.JLabel();
        botonAñadirJugadores = new javax.swing.JButton();
        panelBotonesEliminar = new javax.swing.JPanel();
        botonEliminarJugador1 = new javax.swing.JButton();
        botonEliminarJugador2 = new javax.swing.JButton();
        botonEliminarJugador3 = new javax.swing.JButton();
        botonEliminarJugador4 = new javax.swing.JButton();
        botonEliminarJugador5 = new javax.swing.JButton();
        botonEliminarJugador6 = new javax.swing.JButton();
        botonEliminarJugador7 = new javax.swing.JButton();
        botonEliminarJugador8 = new javax.swing.JButton();
        panelConfiguracionesMapa = new javax.swing.JPanel();
        tituloMapa = new javax.swing.JLabel();
        panelConfiguracionesMapas = new javax.swing.JPanel();
        SpinnerFilas = new javax.swing.JSpinner();
        SpinnerColumnas = new javax.swing.JSpinner();
        tituloColumnas = new javax.swing.JLabel();
        tituloFilas = new javax.swing.JLabel();
        CheckBoxAl_Azar = new javax.swing.JCheckBox();
        tituloIngresarNombreMapa = new javax.swing.JLabel();
        tituloTipoMapa = new javax.swing.JLabel();
        ComboBoxTipoMapa = new javax.swing.JComboBox<>();
        tituloNombreMapa = new javax.swing.JLabel();
        tituloPlanetasZombies = new javax.swing.JLabel();
        tituloPlanetasFantasmas = new javax.swing.JLabel();
        SpinnerPlanetasFantasmas = new javax.swing.JSpinner();
        SpinnerPlanetasZombies = new javax.swing.JSpinner();
        panelConfiguracionesOpciones = new javax.swing.JPanel();
        tituloOpciones = new javax.swing.JLabel();
        CheckBoxMapaCiego = new javax.swing.JCheckBox();
        CheckBoxProduccionTrasCaptura = new javax.swing.JCheckBox();
        CheckBoxAcumulacion = new javax.swing.JCheckBox();
        SpinnerCantidadTurnos = new javax.swing.JSpinner();
        tituloCantidadTurnos = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 0, 204));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondoConfiguracionesPartidaNueva.setBackground(new java.awt.Color(0, 51, 153));
        panelFondoConfiguracionesPartidaNueva.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titiloNuevaPartida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titiloNuevaPartida.setForeground(new java.awt.Color(255, 255, 255));
        titiloNuevaPartida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titiloNuevaPartida.setText("Comenzar Partida Nueva (Mapa Por defecto)");
        panelFondoConfiguracionesPartidaNueva.add(titiloNuevaPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 0, 339, 45));

        botonCancelar.setBackground(new java.awt.Color(0, 0, 0));
        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setText("Cancelar");
        botonCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        botonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelFondoConfiguracionesPartidaNueva.add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(894, 544, 126, 38));

        botonGuardarMapa.setBackground(new java.awt.Color(0, 0, 0));
        botonGuardarMapa.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardarMapa.setText("Guardar Configuraciones Mapa");
        botonGuardarMapa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 1, true));
        botonGuardarMapa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardarMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarMapaActionPerformed(evt);
            }
        });
        panelFondoConfiguracionesPartidaNueva.add(botonGuardarMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 544, 189, 38));

        botonContinuar.setBackground(new java.awt.Color(0, 0, 0));
        botonContinuar.setForeground(new java.awt.Color(255, 255, 255));
        botonContinuar.setText("Continuar");
        botonContinuar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 193, 14), 1, true));
        botonContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarActionPerformed(evt);
            }
        });
        panelFondoConfiguracionesPartidaNueva.add(botonContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 544, 126, 38));

        botonSeleccionarMapa.setBackground(new java.awt.Color(0, 0, 0));
        botonSeleccionarMapa.setForeground(new java.awt.Color(255, 255, 255));
        botonSeleccionarMapa.setText("Seleccionar Mapa");
        botonSeleccionarMapa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 1, true));
        botonSeleccionarMapa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSeleccionarMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarMapaActionPerformed(evt);
            }
        });
        panelFondoConfiguracionesPartidaNueva.add(botonSeleccionarMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 544, 126, 38));

        panelConfiguracionesPlanetasNeutrales.setBackground(new java.awt.Color(0, 0, 102));
        panelConfiguracionesPlanetasNeutrales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelConfiguracionesPlanetasNeutrales.setForeground(new java.awt.Color(102, 102, 102));

        CheckBoxMostrarNaves.setBackground(new java.awt.Color(0, 0, 0));
        CheckBoxMostrarNaves.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxMostrarNaves.setSelected(true);
        CheckBoxMostrarNaves.setText("Mostrar Naves");

        tituloCantidadPlanetasNeutrales.setForeground(new java.awt.Color(255, 255, 255));
        tituloCantidadPlanetasNeutrales.setText("Cantidad Planetas Neutrales");

        CheckBoxMostrarAtributos.setBackground(new java.awt.Color(0, 0, 0));
        CheckBoxMostrarAtributos.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxMostrarAtributos.setSelected(true);
        CheckBoxMostrarAtributos.setText("Mostrar Atributos");

        SpinnerPlanetasNeutrales.setModel(new javax.swing.SpinnerNumberModel(6, 6, 14, 1));
        SpinnerPlanetasNeutrales.setValue(6);

        tituloProduccion.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduccion.setText(" Produccion");

        SpinnerProduccion.setValue(5);

        javax.swing.GroupLayout panelConfiguracionesPlanetasNeutralesLayout = new javax.swing.GroupLayout(panelConfiguracionesPlanetasNeutrales);
        panelConfiguracionesPlanetasNeutrales.setLayout(panelConfiguracionesPlanetasNeutralesLayout);
        panelConfiguracionesPlanetasNeutralesLayout.setHorizontalGroup(
            panelConfiguracionesPlanetasNeutralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfiguracionesPlanetasNeutralesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelConfiguracionesPlanetasNeutralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConfiguracionesPlanetasNeutralesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panelConfiguracionesPlanetasNeutralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloCantidadPlanetasNeutrales, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelConfiguracionesPlanetasNeutralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SpinnerPlanetasNeutrales, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(SpinnerProduccion)))
                    .addComponent(CheckBoxMostrarAtributos)
                    .addComponent(CheckBoxMostrarNaves))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        panelConfiguracionesPlanetasNeutralesLayout.setVerticalGroup(
            panelConfiguracionesPlanetasNeutralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfiguracionesPlanetasNeutralesLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panelConfiguracionesPlanetasNeutralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloCantidadPlanetasNeutrales, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerPlanetasNeutrales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckBoxMostrarNaves)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckBoxMostrarAtributos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConfiguracionesPlanetasNeutralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelFondoConfiguracionesPartidaNueva.add(panelConfiguracionesPlanetasNeutrales, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 340, 140));

        panelConfiguracionesJugadores.setBackground(new java.awt.Color(0, 0, 102));
        panelConfiguracionesJugadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelConfiguracionesJugadores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboboxJugadorNuevo.setBackground(new java.awt.Color(0, 0, 0));
        comboboxJugadorNuevo.setForeground(new java.awt.Color(255, 255, 255));
        comboboxJugadorNuevo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jugador(Humano)", "Jugador IA(Modo Facil)", "Jugador IA(Modo Dificil)" }));
        comboboxJugadorNuevo.setToolTipText("");
        comboboxJugadorNuevo.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.SystemColor.textHighlight));
        comboboxJugadorNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboboxJugadorNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboboxJugadorNuevoMouseClicked(evt);
            }
        });
        comboboxJugadorNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxJugadorNuevoActionPerformed(evt);
            }
        });
        panelConfiguracionesJugadores.add(comboboxJugadorNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 150, 20));

        panelAñadirJugadores.setBackground(new java.awt.Color(0, 0, 102));
        panelAñadirJugadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelAñadirJugadores.setPreferredSize(new java.awt.Dimension(100, 35));
        panelAñadirJugadores.setLayout(new java.awt.GridLayout(0, 1));

        panelJugador1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelJugador1.setLayout(new java.awt.GridLayout(0, 1));
        panelAñadirJugadores.add(panelJugador1);

        panelJugador2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelJugador2.setLayout(new java.awt.GridLayout(0, 1));
        panelAñadirJugadores.add(panelJugador2);

        panelJugador3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelJugador3.setLayout(new java.awt.GridLayout(0, 1));
        panelAñadirJugadores.add(panelJugador3);

        panelJugador4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelJugador4.setLayout(new java.awt.GridLayout(0, 1));
        panelAñadirJugadores.add(panelJugador4);

        panelJugador5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelJugador5.setLayout(new java.awt.GridLayout(0, 1));
        panelAñadirJugadores.add(panelJugador5);

        panelJugador6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelJugador6.setLayout(new java.awt.GridLayout(0, 1));
        panelAñadirJugadores.add(panelJugador6);

        panelJugador7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelJugador7.setLayout(new java.awt.GridLayout(0, 1));
        panelAñadirJugadores.add(panelJugador7);

        panelJugador8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelJugador8.setLayout(new java.awt.GridLayout(0, 1));
        panelAñadirJugadores.add(panelJugador8);

        panelConfiguracionesJugadores.add(panelAñadirJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 270, 370));

        tituloJugadores1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tituloJugadores1.setForeground(new java.awt.Color(204, 204, 204));
        tituloJugadores1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloJugadores1.setText("Jugadores");
        panelConfiguracionesJugadores.add(tituloJugadores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 7, 256, 29));

        tituloTipo.setForeground(new java.awt.Color(255, 255, 255));
        tituloTipo.setText("Tipo");
        panelConfiguracionesJugadores.add(tituloTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 42, 153, 25));

        tituloNombre.setForeground(new java.awt.Color(255, 255, 255));
        tituloNombre.setText("Nombre");
        panelConfiguracionesJugadores.add(tituloNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 42, 153, 25));

        botonAñadirJugadores.setBackground(new java.awt.Color(0, 0, 0));
        botonAñadirJugadores.setForeground(new java.awt.Color(255, 255, 255));
        botonAñadirJugadores.setText("Añadir");
        botonAñadirJugadores.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.SystemColor.textHighlight));
        botonAñadirJugadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelConfiguracionesJugadores.add(botonAñadirJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 60, 20));

        panelBotonesEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBotonesEliminar.setLayout(new java.awt.GridLayout(0, 1));

        botonEliminarJugador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/iconoEliminar1.png"))); // NOI18N
        botonEliminarJugador1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBotonesEliminar.add(botonEliminarJugador1);

        botonEliminarJugador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/iconoEliminar1.png"))); // NOI18N
        botonEliminarJugador2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBotonesEliminar.add(botonEliminarJugador2);

        botonEliminarJugador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/iconoEliminar1.png"))); // NOI18N
        botonEliminarJugador3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBotonesEliminar.add(botonEliminarJugador3);

        botonEliminarJugador4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/iconoEliminar1.png"))); // NOI18N
        botonEliminarJugador4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBotonesEliminar.add(botonEliminarJugador4);

        botonEliminarJugador5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/iconoEliminar1.png"))); // NOI18N
        botonEliminarJugador5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBotonesEliminar.add(botonEliminarJugador5);

        botonEliminarJugador6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/iconoEliminar1.png"))); // NOI18N
        botonEliminarJugador6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBotonesEliminar.add(botonEliminarJugador6);

        botonEliminarJugador7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/iconoEliminar1.png"))); // NOI18N
        botonEliminarJugador7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBotonesEliminar.add(botonEliminarJugador7);

        botonEliminarJugador8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/iconoEliminar1.png"))); // NOI18N
        botonEliminarJugador8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBotonesEliminar.add(botonEliminarJugador8);

        panelConfiguracionesJugadores.add(panelBotonesEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 50, 370));

        panelFondoConfiguracionesPartidaNueva.add(panelConfiguracionesJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 340, 490));

        panelConfiguracionesMapa.setBackground(new java.awt.Color(0, 0, 102));
        panelConfiguracionesMapa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelConfiguracionesMapa.setForeground(new java.awt.Color(102, 102, 102));

        tituloMapa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tituloMapa.setForeground(new java.awt.Color(204, 204, 204));
        tituloMapa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloMapa.setText("Mapa");

        panelConfiguracionesMapas.setBackground(new java.awt.Color(0, 0, 102));
        panelConfiguracionesMapas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelConfiguracionesMapas.setForeground(new java.awt.Color(255, 255, 255));
        panelConfiguracionesMapas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SpinnerFilas.setModel(new javax.swing.SpinnerNumberModel(4, 4, 7, 1));
        SpinnerFilas.setValue(7);
        panelConfiguracionesMapas.add(SpinnerFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 60, -1));

        SpinnerColumnas.setValue(10);
        panelConfiguracionesMapas.add(SpinnerColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 60, -1));

        tituloColumnas.setForeground(new java.awt.Color(255, 255, 255));
        tituloColumnas.setText("Columnas");
        panelConfiguracionesMapas.add(tituloColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 70, -1));

        tituloFilas.setForeground(new java.awt.Color(255, 255, 255));
        tituloFilas.setText("Filas");
        panelConfiguracionesMapas.add(tituloFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 50, -1));

        CheckBoxAl_Azar.setBackground(new java.awt.Color(0, 0, 0));
        CheckBoxAl_Azar.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxAl_Azar.setSelected(true);
        CheckBoxAl_Azar.setText("Al Azar");
        panelConfiguracionesMapas.add(CheckBoxAl_Azar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 80, 30));

        tituloIngresarNombreMapa.setForeground(new java.awt.Color(255, 255, 255));
        tituloIngresarNombreMapa.setText("Ingrese el nombre del Mapa");
        panelConfiguracionesMapas.add(tituloIngresarNombreMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 20));

        tituloTipoMapa.setBackground(new java.awt.Color(0, 0, 0));
        tituloTipoMapa.setForeground(new java.awt.Color(255, 255, 255));
        tituloTipoMapa.setText("Tipo de Mapa ");
        panelConfiguracionesMapas.add(tituloTipoMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, -1));

        ComboBoxTipoMapa.setBackground(new java.awt.Color(0, 0, 0));
        ComboBoxTipoMapa.setForeground(new java.awt.Color(255, 255, 255));
        ComboBoxTipoMapa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agua", "Fuego", "Arena" }));
        ComboBoxTipoMapa.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.SystemColor.textHighlight));
        ComboBoxTipoMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTipoMapaActionPerformed(evt);
            }
        });
        panelConfiguracionesMapas.add(ComboBoxTipoMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        tituloNombreMapa.setBackground(new java.awt.Color(0, 0, 0));
        tituloNombreMapa.setForeground(new java.awt.Color(255, 255, 255));
        tituloNombreMapa.setText("Mapa por Defecto");
        tituloNombreMapa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tituloNombreMapa.setOpaque(true);
        tituloNombreMapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tituloNombreMapaMouseClicked(evt);
            }
        });
        panelConfiguracionesMapas.add(tituloNombreMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, 20));

        tituloPlanetasZombies.setForeground(new java.awt.Color(255, 255, 255));
        tituloPlanetasZombies.setText("Cantidad Plantetas Zombies");
        panelConfiguracionesMapas.add(tituloPlanetasZombies, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, 30));

        tituloPlanetasFantasmas.setForeground(new java.awt.Color(255, 255, 255));
        tituloPlanetasFantasmas.setText("Cantidad Plantetas Fantasmas");
        panelConfiguracionesMapas.add(tituloPlanetasFantasmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 170, 30));

        SpinnerPlanetasFantasmas.setValue(3);
        panelConfiguracionesMapas.add(SpinnerPlanetasFantasmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 80, 30));

        SpinnerPlanetasZombies.setValue(3);
        panelConfiguracionesMapas.add(SpinnerPlanetasZombies, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 80, 30));

        javax.swing.GroupLayout panelConfiguracionesMapaLayout = new javax.swing.GroupLayout(panelConfiguracionesMapa);
        panelConfiguracionesMapa.setLayout(panelConfiguracionesMapaLayout);
        panelConfiguracionesMapaLayout.setHorizontalGroup(
            panelConfiguracionesMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfiguracionesMapaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(tituloMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConfiguracionesMapaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelConfiguracionesMapas, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        panelConfiguracionesMapaLayout.setVerticalGroup(
            panelConfiguracionesMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfiguracionesMapaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelConfiguracionesMapas, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelFondoConfiguracionesPartidaNueva.add(panelConfiguracionesMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 340, 490));

        panelConfiguracionesOpciones.setBackground(new java.awt.Color(0, 0, 102));
        panelConfiguracionesOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelConfiguracionesOpciones.setForeground(new java.awt.Color(102, 102, 102));

        tituloOpciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tituloOpciones.setForeground(new java.awt.Color(204, 204, 204));
        tituloOpciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloOpciones.setText("Opciones");

        CheckBoxMapaCiego.setBackground(new java.awt.Color(0, 0, 0));
        CheckBoxMapaCiego.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxMapaCiego.setText("Mapa Ciego");

        CheckBoxProduccionTrasCaptura.setBackground(new java.awt.Color(0, 0, 0));
        CheckBoxProduccionTrasCaptura.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxProduccionTrasCaptura.setSelected(true);
        CheckBoxProduccionTrasCaptura.setText("Produccion tras la captura");

        CheckBoxAcumulacion.setBackground(new java.awt.Color(0, 0, 0));
        CheckBoxAcumulacion.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxAcumulacion.setText("Produccion Acumulacion");

        SpinnerCantidadTurnos.setValue(100);

        tituloCantidadTurnos.setBackground(new java.awt.Color(0, 0, 0));
        tituloCantidadTurnos.setForeground(new java.awt.Color(255, 255, 255));
        tituloCantidadTurnos.setText("Cantidad de Turnos Maximos");

        javax.swing.GroupLayout panelConfiguracionesOpcionesLayout = new javax.swing.GroupLayout(panelConfiguracionesOpciones);
        panelConfiguracionesOpciones.setLayout(panelConfiguracionesOpcionesLayout);
        panelConfiguracionesOpcionesLayout.setHorizontalGroup(
            panelConfiguracionesOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfiguracionesOpcionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelConfiguracionesOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelConfiguracionesOpcionesLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(panelConfiguracionesOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckBoxProduccionTrasCaptura)
                            .addGroup(panelConfiguracionesOpcionesLayout.createSequentialGroup()
                                .addGroup(panelConfiguracionesOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CheckBoxAcumulacion)
                                    .addComponent(tituloCantidadTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelConfiguracionesOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SpinnerCantidadTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CheckBoxMapaCiego))))))
                .addGap(58, 58, 58))
        );
        panelConfiguracionesOpcionesLayout.setVerticalGroup(
            panelConfiguracionesOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfiguracionesOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConfiguracionesOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckBoxAcumulacion)
                    .addComponent(CheckBoxMapaCiego))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckBoxProduccionTrasCaptura)
                .addGap(18, 18, 18)
                .addGroup(panelConfiguracionesOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpinnerCantidadTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloCantidadTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        panelFondoConfiguracionesPartidaNueva.add(panelConfiguracionesOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 340, 170));

        getContentPane().add(panelFondoConfiguracionesPartidaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarMapaActionPerformed

    }//GEN-LAST:event_botonGuardarMapaActionPerformed

    private void botonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContinuarActionPerformed
        
    }//GEN-LAST:event_botonContinuarActionPerformed

    private void botonSeleccionarMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarMapaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeleccionarMapaActionPerformed

    private void comboboxJugadorNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboboxJugadorNuevoMouseClicked
    }//GEN-LAST:event_comboboxJugadorNuevoMouseClicked

    private void comboboxJugadorNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxJugadorNuevoActionPerformed
    }//GEN-LAST:event_comboboxJugadorNuevoActionPerformed

    private void ComboBoxTipoMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTipoMapaActionPerformed
    }//GEN-LAST:event_ComboBoxTipoMapaActionPerformed

    private void tituloNombreMapaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloNombreMapaMouseClicked
        if(evt.getClickCount()==2){
                    JOptionPane cambiarNombre = new JOptionPane();
                     String nuevoNombreIngresado = cambiarNombre.showInputDialog(null, "Introduce Un Nombre Nuevo", JOptionPane.INFORMATION_MESSAGE);
                    int letrasNombre =nuevoNombreIngresado.length();
//***Añdir verificacion Nombre Largo
                    if(letrasNombre>0){
//                        nuevoNombre = nuevoNombreIngresado;
                          tituloNombreMapa.setText(nuevoNombreIngresado);
//                        tituloNombreJugador.setText(nuevoNombre);
                        this.doLayout();
                    }else{
                        JOptionPane error = new JOptionPane();
                        error.showMessageDialog(null, "No ingreso nada", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                
                }
    }//GEN-LAST:event_tituloNombreMapaMouseClicked


///
    public JComboBox<String> getComboboxJugadorNuevo() {
        return comboboxJugadorNuevo;
    }
    public JPanel getPanelAñadirJugadores() {
        return panelAñadirJugadores;
    }
    
    public JButton getBotonAñadirJugadores() {
        return botonAñadirJugadores;
    }
    public JButton getBotonContinuar() {
        return botonContinuar;
    }
    public JButton getBotonGuardarMapa() {
        return botonGuardarMapa;
    }
    //
    public JButton getBotonCancelar() {
        return botonCancelar;
    }
///
    public JButton getBotonEliminarJugador1() {
        return botonEliminarJugador1;
    }
    public JButton getBotonEliminarJugador2() {
        return botonEliminarJugador2;
    }
    public JButton getBotonEliminarJugador3() {
        return botonEliminarJugador3;
    }
    public JButton getBotonEliminarJugador4() {
        return botonEliminarJugador4;
    }
    public JButton getBotonEliminarJugador5() {
        return botonEliminarJugador5;
    }
    public JButton getBotonEliminarJugador6() {
        return botonEliminarJugador6;
    }
    public JButton getBotonEliminarJugador7() {
        return botonEliminarJugador7;
    }
    public JButton getBotonEliminarJugador8() {
        return botonEliminarJugador8;
    }
    public JPanel getPanelJugador1() {
        return panelJugador1;
    }
    public JPanel getPanelJugador2() {
        return panelJugador2;
    }
    public JPanel getPanelJugador3() {
        return panelJugador3;
    }
    public JPanel getPanelJugador4() {
        return panelJugador4;
    }
    public JPanel getPanelJugador5() {
        return panelJugador5;
    }
    public JPanel getPanelJugador6() {
        return panelJugador6;
    }
    public JPanel getPanelJugador7() {
        return panelJugador7;
    }
    public JPanel getPanelJugador8() {
        return panelJugador8;
    }

    public JCheckBox getCheckBoxAcumulacion() {
        return CheckBoxAcumulacion;
    }
    public JCheckBox getCheckBoxAl_Azar() {
        return CheckBoxAl_Azar;
    }
    public JCheckBox getCheckBoxMapaCiego() {
        return CheckBoxMapaCiego;
    }
    public JCheckBox getCheckBoxMostrarAtributos() {
        return CheckBoxMostrarAtributos;
    }
    public JCheckBox getCheckBoxMostrarNaves() {
        return CheckBoxMostrarNaves;
    }
    public JCheckBox getCheckBoxProduccionTrasCaptura() {
        return CheckBoxProduccionTrasCaptura;
    }
    public JComboBox<String> getComboBoxTipoMapa() {
        return ComboBoxTipoMapa;
    }
    public JSpinner getSpinnerCantidadTurnos() {
        return SpinnerCantidadTurnos;
    }
    public JSpinner getSpinnerColumnas() {
        return SpinnerColumnas;
    }
    public JSpinner getSpinnerFilas() {
        return SpinnerFilas;
    }
    public JSpinner getSpinnerPlanetasFantasmas() {
        return SpinnerPlanetasFantasmas;
    }
    public JSpinner getSpinnerPlanetasNeutrales() {
        return SpinnerPlanetasNeutrales;
    }
    public JSpinner getSpinnerPlanetasZombies() {
        return SpinnerPlanetasZombies;
    }
    public JSpinner getSpinnerProduccion() {
        return SpinnerProduccion;
    }
    public JLabel getTituloNombreMapa() {
        return tituloNombreMapa;
    }
    
    
    
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxAcumulacion;
    private javax.swing.JCheckBox CheckBoxAl_Azar;
    private javax.swing.JCheckBox CheckBoxMapaCiego;
    private javax.swing.JCheckBox CheckBoxMostrarAtributos;
    private javax.swing.JCheckBox CheckBoxMostrarNaves;
    private javax.swing.JCheckBox CheckBoxProduccionTrasCaptura;
    private javax.swing.JComboBox<String> ComboBoxTipoMapa;
    private javax.swing.JSpinner SpinnerCantidadTurnos;
    private javax.swing.JSpinner SpinnerColumnas;
    private javax.swing.JSpinner SpinnerFilas;
    private javax.swing.JSpinner SpinnerPlanetasFantasmas;
    private javax.swing.JSpinner SpinnerPlanetasNeutrales;
    private javax.swing.JSpinner SpinnerPlanetasZombies;
    private javax.swing.JSpinner SpinnerProduccion;
    private javax.swing.JButton botonAñadirJugadores;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonContinuar;
    private javax.swing.JButton botonEliminarJugador1;
    private javax.swing.JButton botonEliminarJugador2;
    private javax.swing.JButton botonEliminarJugador3;
    private javax.swing.JButton botonEliminarJugador4;
    private javax.swing.JButton botonEliminarJugador5;
    private javax.swing.JButton botonEliminarJugador6;
    private javax.swing.JButton botonEliminarJugador7;
    private javax.swing.JButton botonEliminarJugador8;
    private javax.swing.JButton botonGuardarMapa;
    private javax.swing.JButton botonSeleccionarMapa;
    private javax.swing.JComboBox<String> comboboxJugadorNuevo;
    private javax.swing.JPanel panelAñadirJugadores;
    private javax.swing.JPanel panelBotonesEliminar;
    private javax.swing.JPanel panelConfiguracionesJugadores;
    private javax.swing.JPanel panelConfiguracionesMapa;
    private javax.swing.JPanel panelConfiguracionesMapas;
    private javax.swing.JPanel panelConfiguracionesOpciones;
    private javax.swing.JPanel panelConfiguracionesPlanetasNeutrales;
    private javax.swing.JPanel panelFondoConfiguracionesPartidaNueva;
    private javax.swing.JPanel panelJugador1;
    private javax.swing.JPanel panelJugador2;
    private javax.swing.JPanel panelJugador3;
    private javax.swing.JPanel panelJugador4;
    private javax.swing.JPanel panelJugador5;
    private javax.swing.JPanel panelJugador6;
    private javax.swing.JPanel panelJugador7;
    private javax.swing.JPanel panelJugador8;
    private javax.swing.JLabel titiloNuevaPartida;
    private javax.swing.JLabel tituloCantidadPlanetasNeutrales;
    private javax.swing.JLabel tituloCantidadTurnos;
    private javax.swing.JLabel tituloColumnas;
    private javax.swing.JLabel tituloFilas;
    private javax.swing.JLabel tituloIngresarNombreMapa;
    private javax.swing.JLabel tituloJugadores1;
    private javax.swing.JLabel tituloMapa;
    private javax.swing.JLabel tituloNombre;
    private javax.swing.JLabel tituloNombreMapa;
    private javax.swing.JLabel tituloOpciones;
    private javax.swing.JLabel tituloPlanetasFantasmas;
    private javax.swing.JLabel tituloPlanetasZombies;
    private javax.swing.JLabel tituloProduccion;
    private javax.swing.JLabel tituloTipo;
    private javax.swing.JLabel tituloTipoMapa;
    // End of variables declaration//GEN-END:variables
}
