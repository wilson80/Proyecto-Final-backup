package com.wchay.proyecto2.backend.inicio_juego;

import com.wchay.proyecto2.backend.Jugadores.Jugador;
import com.wchay.proyecto2.backend.listas_enlazadas.ListaEnlazada;
import com.wchay.proyecto2.backend.listas_enlazadas.ListaException;
import com.wchay.proyecto2.backend.mapa.configuracionesMapa;
import com.wchay.proyecto2.ui.ConfiguracionesPartidaNueva;
import com.wchay.proyecto2.ui.MapaPruebas;
import com.wchay.proyecto2.ui.VentanaPrincipal;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/** 
 *
 * @author Jonwil
 */


public class MotorJuego {
    configuracionesMapa iniciarMapa;  
    VentanaPrincipal ventanaInicioPrincipal;
    ListaEnlazada<Jugador> jugadoresSeleccionados;
    ConfiguracionesPartidaNueva configuracionPartida;
    
//    private JPanel panelContenedor;
    
    
    private String nombreMapa;
    private int filas;
    private int columnas;
    private int turnosMaximos;
    private boolean Al_Azar;
    
    private int tipoMapa;
    private int cantidadPFantasmas;
    private int cantidadPZombies;
    private boolean procuccionAcumulativa;
    private boolean procuccionTrascaptura;
    private boolean mapaCiego;
    
    private int cantidadPN;
    private boolean mostrarNaves;
    private boolean mostrarAtributos;
    private int produccionPN;

    public MotorJuego(configuracionesMapa iniciarMapa, VentanaPrincipal ventanaInicioPrincipal, ListaEnlazada<Jugador> jugadoresSeleccionados, ConfiguracionesPartidaNueva configuracionPartida, String nombreMapa, int filas, int columnas, int turnosMaximos, boolean Al_Azar, int tipoMapa, int cantidadPFantasmas, int cantidadPZombies, boolean procuccionAcumulativa, boolean procuccionTrascaptura, boolean mapaCiego, int cantidadPN, boolean mostrarNaves, boolean mostrarAtributos, int produccionPN) {
        this.iniciarMapa = iniciarMapa;
        this.ventanaInicioPrincipal = ventanaInicioPrincipal;
        this.jugadoresSeleccionados = jugadoresSeleccionados;
        this.configuracionPartida = configuracionPartida;
        this.nombreMapa = nombreMapa;
        this.filas = filas;
        this.columnas = columnas;
        this.turnosMaximos = turnosMaximos;
        this.Al_Azar = Al_Azar;
        this.tipoMapa = tipoMapa;
        this.cantidadPFantasmas = cantidadPFantasmas;
        this.cantidadPZombies = cantidadPZombies;
        this.procuccionAcumulativa = procuccionAcumulativa;
        this.procuccionTrascaptura = procuccionTrascaptura;
        this.mapaCiego = mapaCiego;
        this.cantidadPN = cantidadPN;
        this.mostrarNaves = mostrarNaves;
        this.mostrarAtributos = mostrarAtributos;
        this.produccionPN = produccionPN;
        inicializar();
        crearMapa();
    }

    
    
  
    public void inicializar(){
        configuracionPartida.setVisible(false);
        ventanaInicioPrincipal.setEnabled(true);
        
    }
    
    public void crearMapa(){
        configuracionPartida.setVisible(false);
        ventanaInicioPrincipal.setEnabled(true);
        ventanaInicioPrincipal.getBotonPartidaNueva().setEnabled(false);
        try {
            for (int i = 0; i < 8; i++) {
                int numeroJugadorr =jugadoresSeleccionados.obtenerContenido(i).getNumeroJugador();
                String nombreJugado_aPartida  =jugadoresSeleccionados.obtenerContenido(i).getPanelJugador().getTituloNombreJugador().getText();
                System.out.println("NumeroJugador A partida " + numeroJugadorr);
                System.out.println("NombreJugador A partida " + nombreJugado_aPartida);
            }
        } catch (ListaException e) {
             System.out.println("Error en crear Partidas");       
        }
       
//        mapaPruebas.setBounds(300, 1, 600, 540);

        int rows=Integer.valueOf(configuracionPartida.getSpinnerFilas().getValue().toString());
        int col=Integer.valueOf(configuracionPartida.getSpinnerColumnas().getValue().toString());
        GridLayout cuadricula = new GridLayout(rows, 0);
        int cantidadCasillas = (rows*col);
        
        JPanel mapaPruebas = new JPanel();
        mapaPruebas.setBorder(new LineBorder(Color.PINK, 3, true));
        mapaPruebas.setVisible(true);
        mapaPruebas.setLayout(cuadricula);
        
        //rectangular
//        mapaPruebas.setBounds(100, 1, 1200, 540);
          //cuadrado  
        mapaPruebas.setBounds(100, 1, 600, 540);
        mapaPruebas.setOpaque(false);
        
        for (int i = 0; i < cantidadCasillas; i++) {
            
//            GridLayout planetaIndividual = new GridLayout(1, 0);
            JPanel panel = new JPanel();
            panel.setOpaque(false);
            panel.setBorder(new LineBorder(Color.BLACK, 1, true));
//            panel.setLayout(planetaIndividual);
            panel.setVisible(true);
            if(i==10){
                
            }
            mapaPruebas.add(panel);
        }
        
        mapaPruebas.doLayout();
        JPanel panelMapa = ventanaInicioPrincipal.getPanelMapa(); ///////////
        panelMapa.add(mapaPruebas); ///////////
        panelMapa.setVisible(true);
        ventanaInicioPrincipal.getPanelTurno().setVisible(true);
        panelMapa.doLayout();
        
        ventanaInicioPrincipal.doLayout();
        //GuardarConfiguracion Para Cargarla
//        crearMapa();
    
    }
    
    
    
    
    
    
    
    
    
}