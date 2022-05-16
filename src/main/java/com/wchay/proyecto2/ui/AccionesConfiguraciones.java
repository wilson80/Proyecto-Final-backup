
package com.wchay.proyecto2.ui;

import com.wchay.proyecto2.backend.Jugadores.CrearJugadoress;
import com.wchay.proyecto2.backend.Jugadores.Jugador;
import com.wchay.proyecto2.backend.inicio_juego.MotorJuego;
import com.wchay.proyecto2.backend.listas_enlazadas.GuardarConfiguraciones;
import com.wchay.proyecto2.backend.listas_enlazadas.ListaEnlazada;
import com.wchay.proyecto2.backend.listas_enlazadas.ListaException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AccionesConfiguraciones implements ActionListener {
    
    
//    private Acciones principalAñadir;    
    private int jugadorEliminar;
    private CrearJugadoress crearJugador;           //Crea Jugadores y Nombre Aleatorios
    private Jugador jugadoraAgregado;                
    private Jugador jugadorBuscado;
    private int JugadoresAñadidos=-1;
    private panelNombreTipoJugador panelNombreTipo;             //Añade el panel con el nombre y tipo del Jugador y boton Eliminar y Posibilidad de cambiar NOmbre
    private  ListaEnlazada<Jugador> jugadoresSeleccionados;
//    Atributos VentanaPrincipal
    private  VentanaPrincipal ventanaPrincipal;
    private JPanel panelTurno;
    private JPanel panelMapa;
    private JButton botonPartidaNueva;
//    Atributos ConfiguracionPartida
    private ConfiguracionesPartidaNueva configuracionPartida;
    private JComboBox<String> comboboxJugadorNuevo;
    private JPanel panelAñadirJugadores;
    private JButton botonAñadirJugadores;
    private JButton botonContinuar;
    private JButton botonCancelar;
    private JButton botonGuardarMapa;
    private JButton btnEliminarJ0,btnEliminarJ1, btnEliminarJ2, btnEliminarJ3;
    private JButton btnEliminarJ4, btnEliminarJ5,btnEliminarJ6,btnEliminarJ7;
    private JPanel panelJugador0,panelJugador1,panelJugador2,panelJugador3;
    private JPanel panelJugador4,panelJugador5,panelJugador6,panelJugador7;
    
    
    public AccionesConfiguraciones(VentanaPrincipal ventanaPrincipal) {    //CONSTRUCTOR
        this.ventanaPrincipal = ventanaPrincipal;
        inicialiarAtributos();
//        jugadoresSeleccionados = crearJugador.getJugadoresSeleccionados();
    }
    
    
    public void inicialiarAtributos(){
        panelNombreTipo = new panelNombreTipoJugador();
        crearJugador = new CrearJugadoress();
        jugadoresSeleccionados =  crearJugador.getJugadoresSeleccionados();
        configuracionPartida = new ConfiguracionesPartidaNueva();
        panelAñadirJugadores = configuracionPartida.getPanelAñadirJugadores();
        comboboxJugadorNuevo = configuracionPartida.getComboboxJugadorNuevo();
        botonAñadirJugadores = configuracionPartida.getBotonAñadirJugadores();
        botonContinuar = configuracionPartida.getBotonContinuar();
        botonCancelar = configuracionPartida.getBotonCancelar();
        botonGuardarMapa = configuracionPartida.getBotonGuardarMapa();
        panelMapa = ventanaPrincipal.getPanelMapa();
        panelTurno = ventanaPrincipal.getPanelTurno();
    btnEliminarJ0 = configuracionPartida.getBotonEliminarJugador1();
    btnEliminarJ1 = configuracionPartida.getBotonEliminarJugador2();
    btnEliminarJ2 = configuracionPartida.getBotonEliminarJugador3();
    btnEliminarJ3 = configuracionPartida.getBotonEliminarJugador4();
    btnEliminarJ4 = configuracionPartida.getBotonEliminarJugador5();
    btnEliminarJ5 = configuracionPartida.getBotonEliminarJugador6();
    btnEliminarJ6 = configuracionPartida.getBotonEliminarJugador7();
    btnEliminarJ7 = configuracionPartida.getBotonEliminarJugador8();
    panelJugador0 = configuracionPartida.getPanelJugador1();
    panelJugador1 = configuracionPartida.getPanelJugador2();
    panelJugador2 = configuracionPartida.getPanelJugador3();
    panelJugador3 = configuracionPartida.getPanelJugador4();
    panelJugador4 = configuracionPartida.getPanelJugador5();
    panelJugador5 = configuracionPartida.getPanelJugador6();
    panelJugador6 = configuracionPartida.getPanelJugador7();
    panelJugador7 = configuracionPartida.getPanelJugador8();
        añadirAccionBotonAnadirJugadores();
        añadirAccionCancelar();
        añadirAccionContinuar();
        accionGuardarMapa();
        eliminarJugadoresAñadirAaccion(); /////////////////
               
    }
    
    public void accionPartidaNueva(){
        botonPartidaNueva = ventanaPrincipal.getBotonPartidaNueva();
        botonPartidaNueva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearConfiguracionPartida();
            }
        });
    }
    public void crearConfiguracionPartida( ){
        try {
            añadirPanelJugadorIndividual();
            añadirPanelJugadorIndividual();
        } catch (Exception e) {
        }
        configuracionPartida.setVisible(true);
        configuracionPartida.setBounds(225, 180, 1100, 600);
        ventanaPrincipal.setEnabled(false);
    }
 
////////////////////
    public void añadirAccionBotonAnadirJugadores() {
        botonAñadirJugadores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    añadirPanelJugadorIndividual();
                } catch (ListaException i) {
                    i.getMessage();
                }
            }
        });
    }
    
    public void añadirPanelJugadorIndividual() throws ListaException {
//        verificarJugadorEliminado();
        JugadoresAñadidos++;
         //Creando Nuevo Jugador
        if(JugadoresAñadidos>7) {
            JOptionPane.showMessageDialog(panelAñadirJugadores, "No puede añadir mas de 8 Jugadores");
        }else {
            int jugadorNuevoSeleccionado = comboboxJugadorNuevo.getSelectedIndex();
            try {
//creando Nuevo Jugador
                crearJugador.crearJugadores(jugadorNuevoSeleccionado);
                jugadoraAgregado=crearJugador.getJugadoresSeleccionados().obtenerContenido(JugadoresAñadidos);
                jugadoraAgregado.configurarPanelMostrarAñadirJugadores();
                //añadiendo el panel que contiene el nombre 
                                                                //y tipo al panel donde van la informacion de los Jugadores
                                                                agregarJugadoresEnsuPanel();
                                                                System.out.println("Anadiendo Jugador en su panel");
//                jugadoraAgregado.setNumeroJugador(JugadoresAñadidos);
                
                panelAñadirJugadores.doLayout();
                System.out.println("SeAnadio el Jugador " );
            } catch (ListaException e) {
                System.out.println("Error al Anadir Jugador");
            }
        }
    }
    
    public void agregarJugadoresEnsuPanel() {
        eliminarPanelJugador();
        for (int i = 0; i < 8; i++) {
            Jugador jugador;
            try {
                jugador = crearJugador.getJugadoresSeleccionados().obtenerContenido(i);
                if(i==0){
                    jugador.setNumeroJugador(i+1);
                    panelJugador0.add(jugador.getPanelJugador());
                    panelJugador0.doLayout();
                }else if(i==1){
                    panelJugador1.add(jugador.getPanelJugador());
                    jugador.setNumeroJugador(i+1);
                    panelJugador1.doLayout();
                }else if(i==2){
                    panelJugador2.add(jugador.getPanelJugador());
                    jugador.setNumeroJugador(i+1);
                    panelJugador2.doLayout();
                }else if(i==3){
                    panelJugador3.add(jugador.getPanelJugador());
                    jugador.setNumeroJugador(i+1);
                    jugador.setNumeroJugador(i+1);
                    panelJugador3.doLayout();
                }else if(i==4){
                    panelJugador4.add(jugador.getPanelJugador());
                    jugador.setNumeroJugador(i+1);
                    panelJugador4.doLayout();
                }else if(i==5){
                    panelJugador5.add(jugador.getPanelJugador());
                    jugador.setNumeroJugador(i+1);
                    panelJugador5.doLayout();
                }else if(i==6){
                    panelJugador6.add(jugador.getPanelJugador());
                    jugador.setNumeroJugador(i+1);
                    panelJugador6.doLayout();
                }else if(i==7){
                    panelJugador7.add(jugador.getPanelJugador());
                    jugador.setNumeroJugador(i+1);
                    panelJugador7.doLayout();
                }   
            } catch (Exception e) {
                System.out.println("NO hay contenido" +i);
            }
        }
    }
    
    public void eliminarPanelJugador() {
        for (int i = 0; i < 8; i++) {
            Jugador jugador;
            try {
                jugador = crearJugador.getJugadoresSeleccionados().obtenerContenido(i);
                if(i==0){
                    panelJugador0.remove(jugador.getPanelJugador());
                    panelJugador0.repaint();
                }else if(i==1){
                    panelJugador1.remove(jugador.getPanelJugador());
                    panelJugador1.repaint();
                }else if(i==2){
                    panelJugador2.remove(jugador.getPanelJugador());
                    panelJugador2.repaint();
                }else if(i==3){
                    panelJugador3.remove(jugador.getPanelJugador());
                    panelJugador3.repaint();
                }else if(i==4){
                    panelJugador4.remove(jugador.getPanelJugador());
                    panelJugador4.repaint();
                }else if(i==5){
                    panelJugador5.remove(jugador.getPanelJugador());
                    panelJugador5.repaint();
                }else if(i==6){
                    panelJugador6.remove(jugador.getPanelJugador());
                    panelJugador6.repaint();
                }else if(i==7){
                    panelJugador7.remove(jugador.getPanelJugador());
                    panelJugador7.repaint();
                }   
            } catch (Exception e) {
                System.out.println("NO hay contenido" +i);
            }
        }
    }
    
    
    public void eliminarJugadorSeleccionado(){          //hacer private
        try {
            eliminarPanelJugador();
//            panelJugador1.remove(crearJugador.getJugadoresSeleccionados().obtenerContenido(jugadorEliminar-1).getPanelJugador());
            crearJugador.getJugadoresSeleccionados().eliminarElementoEnIndice(jugadorEliminar);
//            JugadoresAñadidos--;
//                    panelJugador1.repaint();
//            System.out.println("Jugador eliminado" + jugadorEliminar);
//            eliminarPanelJugador();
            ordenarJugadores();
            agregarJugadoresEnsuPanel();
        } catch (Exception e) {
        }
    }
    
    private void ordenarJugadores(){
        for (int i = 0; i < 8; i++) {
            try {
                Jugador jugador = crearJugador.getJugadoresSeleccionados().obtenerContenido(i);
                jugador.setNumeroJugador(i+1);
            } catch (Exception e) {
               
            }
        }
    }
    public void eliminarJugadoresAñadirAaccion(){
        btnEliminarJ0.addActionListener(this);
        btnEliminarJ1.addActionListener(this);
        btnEliminarJ2.addActionListener(this);
        btnEliminarJ3.addActionListener(this);
        btnEliminarJ4.addActionListener(this);
        btnEliminarJ5.addActionListener(this);
        btnEliminarJ6.addActionListener(this);
        btnEliminarJ7.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent añadirAcciones){
        if(añadirAcciones.getSource()==btnEliminarJ0){
            jugadorEliminar=0;
            eliminarJugadorSeleccionado();
            panelJugador0.repaint();
        }else if(añadirAcciones.getSource()==btnEliminarJ1){
            jugadorEliminar=1;
            eliminarJugadorSeleccionado();
            panelJugador1.repaint();
        }else if(añadirAcciones.getSource()==btnEliminarJ2){
            jugadorEliminar=2;
            eliminarJugadorSeleccionado();
            panelJugador2.repaint();
        }else if(añadirAcciones.getSource()==btnEliminarJ3){
            jugadorEliminar=3;
            eliminarJugadorSeleccionado();
            panelJugador3.repaint();
        }else if(añadirAcciones.getSource()==btnEliminarJ4){
            jugadorEliminar=4;
            eliminarJugadorSeleccionado();
            panelJugador4.repaint();
        }else if(añadirAcciones.getSource()==btnEliminarJ5){
            jugadorEliminar=5;
            eliminarJugadorSeleccionado();
            panelJugador5.repaint();
        }else if(añadirAcciones.getSource()==btnEliminarJ6){
            jugadorEliminar=6;
            eliminarJugadorSeleccionado();
            panelJugador6.repaint();
        }else if(añadirAcciones.getSource()==btnEliminarJ7){
            jugadorEliminar=7;
            eliminarJugadorSeleccionado();
            panelJugador7.repaint();
        }
            System.out.println("seleccion botoBasura" + jugadorEliminar);
    }
    
    public void añadirAccionContinuar(){
        botonContinuar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarCreacionJuego();
            }
        });
    }
    
    
    public void añadirAccionCancelar(){
        botonCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cancelarCrearPartida();
            }
        });
    }
    
    public void cancelarCrearPartida(){
        configuracionPartida.setVisible(false);
        ventanaPrincipal.setEnabled(true);
        configuracionPartida.doLayout();
        ventanaPrincipal.doLayout();
    }
    
    
    public void accionGuardarMapa(){
        botonGuardarMapa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarConfiguracionesJuego();
            }
        });
    }   
    
    
    public void guardarConfiguracionesJuego() {
        GuardarConfiguraciones guardarMapa = new GuardarConfiguraciones(ventanaPrincipal, jugadoresSeleccionados  , configuracionPartida);
        guardarMapa.guardarConfiguracionesJuego();
        System.out.println("CARGANDO cONFIGURACIONES");
        guardarMapa.cargarConfiguracionesJuego();
        
        JOptionPane.showMessageDialog(null, "Se ha guardado el Mapa");
    }
    
    private void iniciarCreacionJuego() {
//        JugadoresAñadidos=0;
        GuardarConfiguraciones mapaNuevo = new GuardarConfiguraciones(ventanaPrincipal, jugadoresSeleccionados  , configuracionPartida);
        mapaNuevo.iniciarConfiguracionPartida();
        
    }


}
 