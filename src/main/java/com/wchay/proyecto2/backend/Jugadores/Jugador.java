
package com.wchay.proyecto2.backend.Jugadores;

import com.wchay.proyecto2.backend.listas_enlazadas.ListaException;
import com.wchay.proyecto2.ui.panelNombreTipoJugador;
import java.io.Serializable;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonwil
 */
public class Jugador  implements Serializable{
   private static final long serialVersionUID = 98L;
   private String nombreJugador;
   private String tipoJugador;
   private String nombreNuevo; 
   private int numeroJugador=0;
   private panelNombreTipoJugador panelNombreTipo;
   private CrearJugadoress jugadoresNuevos;
   
    public Jugador() {
//        labelEnPanelJugador = new String();  
//         botonTipo = new String();
        panelNombreTipo = new panelNombreTipoJugador();
        establecerNombresRandoms();
    }
    
    public void establecerNombresRandoms() {
        System.out.println("pruebas");
        jugadoresNuevos = new CrearJugadoress();
        int longitud = jugadoresNuevos.getNombresJugadoresLista().obtenerLongitud();
        Random random = new Random();
        int numeroAlAzar = random.nextInt(10);
        
        try {
            nombreJugador=jugadoresNuevos.getNombresJugadoresLista().obtenerContenido(numeroAlAzar);
            
        } catch (ListaException e) {
            e.getMessage();
        }
    }

    
    public void configurarPanelMostrarAñadirJugadores(){
        panelNombreTipo.getTituloNombreJugador().setText(nombreJugador);
        panelNombreTipo.getBotonTipoJugador().setText(tipoJugador);
        panelNombreTipo.doLayout();
    }
    
    
//    
    public String getNombreJugador() {
        return nombreJugador;
    }
     
    public void setNombreJugador(String nombreNombrejugador) {
        this.nombreJugador = nombreNombrejugador;
    }
//
    public void setNombreNuevo(String nombreNuevo) {
        this.nombreNuevo = nombreNuevo;
    }
//
    public void setTipoJugador(String tipoJugador) {
        this.tipoJugador = tipoJugador;
    }

    public String getTipoJugador() {
        return tipoJugador;
    }
    
//

    public panelNombreTipoJugador getPanelJugador() {
        return panelNombreTipo;
    }

    public int getNumeroJugador() {
        return numeroJugador;
    }

    public void setNumeroJugador(int numeroJugador) {
        this.numeroJugador = numeroJugador;
    }

    
    
    
    
    
    
    
   
   
}
