package com.wchay.proyecto2.backend.mapa;

import com.wchay.proyecto2.backend.Jugadores.Jugador;
import com.wchay.proyecto2.backend.listas_enlazadas.ListaEnlazada;
import com.wchay.proyecto2.backend.listas_enlazadas.ListaException;
import com.wchay.proyecto2.ui.ConfiguracionesPartidaNueva;
import com.wchay.proyecto2.ui.VentanaPrincipal;
import java.awt.Color;
import java.awt.GridLayout;
import java.io.Serializable;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class configuracionesMapa implements Serializable {
    
    private static final long serialVersionUID=98L;
    
//    VentanaPrincipal ventanaInicioPrincipal;
    ListaEnlazada<Jugador> jugadoresSeleccionados;
//    ConfiguracionesPartidaNueva configuracionPartida;
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

    public configuracionesMapa(ListaEnlazada<Jugador> jugadoresSeleccionados, String nombreMapa, int filas, int columnas, int turnosMaximos, boolean Al_Azar, int tipoMapa, int cantidadPFantasmas, int cantidadPZombies, boolean procuccionAcumulativa, boolean procuccionTrascaptura, boolean mapaCiego, int cantidadPN, boolean mostrarNaves, boolean mostrarAtributos, int produccionPN) {
        this.jugadoresSeleccionados = jugadoresSeleccionados;
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
    }

    
    
    public void imprimirDatos(){
        System.out.println("Primer Mapa guardado");
        System.out.println("NOmbre Mapa" +nombreMapa);
        System.out.println("cantidadFilas" + filas);
        System.out.println("cantidad Columnas" +columnas);
    }

    public ListaEnlazada<Jugador> getJugadoresSeleccionados() {
        return jugadoresSeleccionados;
    }
    
    
    public void imprimirNombreJugadores() {
        System.out.println("NOmbreJUgadoresssssssss");
        for (int i = 0; i < 10; i++) {
            try {
                String nom =jugadoresSeleccionados.obtenerContenido(i).getPanelJugador().getTituloNombreJugador().getText();
                System.out.println("JugadorArchivo:  " + i +nom);
            } catch (Exception e) {
            }
        }
        
        
    }
    
 
    
}
