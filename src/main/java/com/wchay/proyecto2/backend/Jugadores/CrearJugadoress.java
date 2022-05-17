
package com.wchay.proyecto2.backend.Jugadores;

import com.wchay.proyecto2.backend.listas_enlazadas.ListaEnlazada;
import com.wchay.proyecto2.backend.listas_enlazadas.ListaException;
import com.wchay.proyecto2.ui.planetas.Planeta_jugador;
import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author Jonwil
 */
public class CrearJugadoress implements Serializable{
    private int Numero1 =8;
    
    private static final long serialVersionUID=98L;
    
    private int contador=0;
    private ListaEnlazada<String> nombresJugadoresLista;
    private  ListaEnlazada<Jugador> jugadoresSeleccionados;
    private Jugador jugadorHumano;
    private Jugador jugadorIAFa;
    private Jugador jugadorIADi;

    
    public CrearJugadoress() {
        inicializar();
    }
    
    public void inicializar() {
        
        this.jugadoresSeleccionados = new ListaEnlazada<>();
        this.nombresJugadoresLista = new ListaEnlazada<>();
        agregarNombresJugadores();
    }
    
    public void crearJugadores(int jugadorSeleccionado) throws ListaException {
        //añadirVerificacion Jugador añadir Tipo
        contador++;
        Jugador jugador;
        if(jugadorSeleccionado==0) {
            jugador = new JugadorHumano();
            jugador.setNumeroJugador(contador);
            setColorJugador_Y_Tipo(jugador);
            darPlanetaJugador(jugador);
            establecerImagenPlanetasJugador(jugador, 1);
            jugadoresSeleccionados.agregar(jugador);
            
        }else if(jugadorSeleccionado==1) {
            jugador = new JugadorIAFacil();
            setColorJugador_Y_Tipo(jugador);
            jugador.setNumeroJugador(contador);
            jugadoresSeleccionados.agregar(new JugadorIAFacil());
        }else {
            jugador = new JugadorIADificil();
            setColorJugador_Y_Tipo(jugador);
            jugadoresSeleccionados.agregar(new JugadorIADificil());
            jugador.setNumeroJugador(contador);
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
    
    public void setColorJugador_Y_Tipo(Jugador jugador) {
        if(contador==1){
            jugador.setColorJugador(Color.orange);
            jugador.setTipoJugador("1.png");
        }else if(contador==2){
            jugador.setColorJugador(Color.GREEN);
            jugador.setTipoJugador("2.png");
        }else if(contador==3){
            jugador.setColorJugador(Color.blue);
            jugador.setTipoJugador("3.png");
        }else if(contador==4){
            jugador.setColorJugador(Color.YELLOW);
            jugador.setTipoJugador("4.png");
        }else if(contador==5){
            jugador.setColorJugador(Color.MAGENTA);
            jugador.setTipoJugador("5.png");
        }else if(contador==6){
            jugador.setColorJugador(Color.pink);
            jugador.setTipoJugador("6.png");
        }else if(contador==7){
            jugador.setColorJugador(Color.RED);
            jugador.setTipoJugador("7.png");
        }else if(contador==8){
            jugador.setColorJugador(Color.cyan);
            jugador.setTipoJugador("8.png");
        }
    }
    
    public void darPlanetaJugador(Jugador jugador) {
        Planeta_jugador planeta = new Planeta_jugador();
        planeta.setColorFondo(jugador.getColorJugador());
        jugador.getPlanetas_de_Jugador().agregar(planeta);
    }
    
    public void establecerImagenPlanetasJugador(Jugador jugador, int planetasJugador) {
        
        String imagenPlanetasJ = jugador.getTipoJugador();
        try {
            jugador.getPlanetas_de_Jugador().obtenerContenido(0).setTipoPlaneta(imagenPlanetasJ);
        } catch (ListaException e) {
            e.getMessage();
        }
        
    }
        
        
                
}
    

    

