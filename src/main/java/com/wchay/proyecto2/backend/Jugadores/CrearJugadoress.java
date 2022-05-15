
package com.wchay.proyecto2.backend.Jugadores;

import com.wchay.proyecto2.backend.listas_enlazadas.ListaEnlazada;
import com.wchay.proyecto2.backend.listas_enlazadas.ListaException;
import java.io.Serializable;

/**
 *
 * @author Jonwil
 */
public class CrearJugadoress implements Serializable{
    private int Numero1 =8;
    
    private static final long serialVersionUID=98L;
    
    private ListaEnlazada<String> nombresJugadoresLista;
    private  ListaEnlazada<Jugador> jugadoresSeleccionados;
    private Jugador jugadorHumano;
    private Jugador jugadorIAFa;
    private Jugador jugadorIADi;

    
    public CrearJugadoress() {
        inicializar();
    }
    
    public void inicializar(){
        this.jugadoresSeleccionados = new ListaEnlazada<>();
        this.nombresJugadoresLista = new ListaEnlazada<>();
        agregarNombresJugadores();
    }
    
    public void crearJugadores(int jugadorSeleccionado) throws ListaException {
        //añadirVerificacion Jugador añadir Tipo
        if(jugadorSeleccionado==0) {
            jugadoresSeleccionados.agregar(new JugadorHumano());
//            return jugadorHumano = new JugadorHumano();
        }else if(jugadorSeleccionado==1) {
            jugadoresSeleccionados.agregar(new JugadorIAFacil());
//            return jugadorIAFa = new JugadorIAFacil();
        }else {
            jugadoresSeleccionados.agregar(new JugadorIADificil());
//            return jugadorIADi = new JugadorIADificil();
        }
        System.out.println("Longitud lista CrearJugadores " + jugadoresSeleccionados.obtenerLongitud());
    }
    
    public void agregarNombresJugadores(){
        nombresJugadoresLista.agregar("Wilson");
        nombresJugadoresLista.agregar("Juan");
        nombresJugadoresLista.agregar("Pedro");
        nombresJugadoresLista.agregar("Yordi");
        nombresJugadoresLista.agregar("Abner");
        nombresJugadoresLista.agregar("Pablo");
        nombresJugadoresLista.agregar("Jose");
        nombresJugadoresLista.agregar("Stuart");
        nombresJugadoresLista.agregar("David");
        nombresJugadoresLista.agregar("Mago");
        nombresJugadoresLista.agregar("Yong");
        nombresJugadoresLista.agregar("Emi");
        nombresJugadoresLista.agregar("Ronald");
        nombresJugadoresLista.agregar("Pepe");
        nombresJugadoresLista.agregar("Chepe");
        nombresJugadoresLista.agregar("Pepito");
        nombresJugadoresLista.agregar("Joel");
        nombresJugadoresLista.agregar("joel");
        nombresJugadoresLista.agregar("joan");
        
    }

    public ListaEnlazada<String> getNombresJugadoresLista() {
        return nombresJugadoresLista;
    }

    public ListaEnlazada<Jugador> getJugadoresSeleccionados() {
        return jugadoresSeleccionados;
    }

    public void imprimirDatos(){
        System.out.println("Suma " + Numero1);
    }

    
}
