
package com.wchay.proyecto2.backend.inicio_juego;

import com.wchay.proyecto2.backend.Jugadores.Jugador;
import com.wchay.proyecto2.backend.listas_enlazadas.ListaEnlazada;
import com.wchay.proyecto2.ui.ConfiguracionesPartidaNueva;
import com.wchay.proyecto2.ui.VentanaPrincipal;

/**
 *
 * @author Jonwil
 */
public class CrearJuego {
    VentanaPrincipal ventanaInicioPrincipal;
    ListaEnlazada<Jugador> jugadoresSeleccionados;
    ConfiguracionesPartidaNueva configuracionPartida;

    public CrearJuego(VentanaPrincipal ventanaInicioPrincipal, ListaEnlazada<Jugador> jugadoresSeleccionados) {
        this.ventanaInicioPrincipal = ventanaInicioPrincipal;
        this.jugadoresSeleccionados = jugadoresSeleccionados;
    }
    
    public void crearMapa(){
        
    }
    
    
    
    
}
