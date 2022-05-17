
package com.wchay.proyecto2.backend.listas_enlazadas;

import com.wchay.proyecto2.backend.Jugadores.Jugador;
import com.wchay.proyecto2.backend.inicio_juego.MotorJuego;
import com.wchay.proyecto2.backend.mapa.configuracionesMapa;
import com.wchay.proyecto2.ui.ConfiguracionesPartidaNueva;
import com.wchay.proyecto2.ui.VentanaPrincipal;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author Jonwil
 */
public class GuardarConfiguraciones {
    
    private File nuevoFile;
    private configuracionesMapa mapa;
    private configuracionesMapa mapaGuardado;          //
    VentanaPrincipal ventanaInicioPrincipal;
    ListaEnlazada<Jugador> jugadoresSeleccionados;
    ConfiguracionesPartidaNueva configuracionPartida;
    ////
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
    private Jugador jugador1; 
    private Jugador jugador2; 
    private Jugador jugador3; 
    private Jugador jugador4; 
    private Jugador jugador5; 
    private Jugador jugador6; 
    private Jugador jugador7; 
    private Jugador jugador8; 
    ////

    public GuardarConfiguraciones(VentanaPrincipal ventanaInicioPrincipal,
                                   ListaEnlazada<Jugador> jugadoresSeleccionados, 
                                   ConfiguracionesPartidaNueva configuracionPartida) {
        this.ventanaInicioPrincipal = ventanaInicioPrincipal;
        this.jugadoresSeleccionados = jugadoresSeleccionados;
        this.configuracionPartida = configuracionPartida;
        inicializarInformacion();
    }
    
    private void inicializarInformacion() {
        nombreMapa = configuracionPartida.getTituloNombreMapa().getText();
        filas = Integer.valueOf(configuracionPartida.getSpinnerFilas().getValue().toString());
        columnas = Integer.valueOf(configuracionPartida.getSpinnerColumnas().getValue().toString());
        turnosMaximos = Integer.valueOf(configuracionPartida.getSpinnerCantidadTurnos().getValue().toString());
        Al_Azar = configuracionPartida.getCheckBoxAl_Azar().isSelected();
        tipoMapa = configuracionPartida.getComboBoxTipoMapa().getSelectedIndex();
        cantidadPFantasmas = Integer.valueOf(configuracionPartida.getSpinnerPlanetasFantasmas().getValue().toString());
        cantidadPZombies = Integer.valueOf(configuracionPartida.getSpinnerPlanetasZombies().getValue().toString());
        procuccionAcumulativa = configuracionPartida.getCheckBoxAcumulacion().isSelected();
        procuccionTrascaptura = configuracionPartida.getCheckBoxProduccionTrasCaptura().isSelected();
        mapaCiego = configuracionPartida.getCheckBoxMapaCiego().isSelected();
        cantidadPN = Integer.valueOf(configuracionPartida.getSpinnerPlanetasNeutrales().getValue().toString());
        mapaCiego = configuracionPartida.getCheckBoxMostrarNaves().isSelected();
        mostrarAtributos = configuracionPartida.getCheckBoxMostrarAtributos().isSelected();
        produccionPN = Integer.valueOf(configuracionPartida.getSpinnerProduccion().getValue().toString());
        
        mapa = new configuracionesMapa(jugadoresSeleccionados, nombreMapa, filas, columnas, turnosMaximos, Al_Azar, tipoMapa, cantidadPFantasmas, cantidadPZombies, procuccionAcumulativa, procuccionTrascaptura, mapaCiego, cantidadPN, mostrarNaves, mostrarAtributos, produccionPN);

    }
    
    public void guardarConfiguracionesJuego() {
        nuevoFile = new File("C:\\Users\\Jonwil\\Desktop\\"+nombreMapa);
        //Almacenamiento de datos en archivos de texto(Tiene muchos inconvenientes) 
        
        try(FileOutputStream fileOutputStream = new FileOutputStream(nuevoFile);
            ObjectOutputStream objetStream = new ObjectOutputStream(fileOutputStream);){
            
            objetStream.writeObject(mapa);
            
        } catch (Exception e){
            System.out.println("Error al crear Archivo");
            e.printStackTrace();
        }
    }
    
    
    
    public void cargarConfiguracionesJuego(){
        try(FileInputStream fileInputStream = new FileInputStream(nuevoFile);
            ObjectInputStream objetStream = new ObjectInputStream(fileInputStream);){
             mapaGuardado = (configuracionesMapa)objetStream.readObject();
             mapaGuardado.imprimirDatos();
             mapaGuardado.FuncionanCargarPartidas();
        } catch (Exception e){
            System.out.println("El archivo no existe");
            e.printStackTrace();
        }
    }
    
    public void iniciarConfiguracionPartida() {
        MotorJuego iniciarJuego = new MotorJuego(mapa, ventanaInicioPrincipal, jugadoresSeleccionados, 
                configuracionPartida, nombreMapa, filas, columnas, turnosMaximos, Al_Azar, tipoMapa,
                cantidadPFantasmas, cantidadPZombies, procuccionAcumulativa, procuccionTrascaptura,
                mapaCiego, cantidadPN, mostrarNaves, mostrarAtributos, produccionPN);
    }    
    
    
                

    

    
    
}
