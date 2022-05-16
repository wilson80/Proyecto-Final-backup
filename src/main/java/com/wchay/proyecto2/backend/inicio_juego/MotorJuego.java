package com.wchay.proyecto2.backend.inicio_juego;

import com.wchay.proyecto2.backend.Jugadores.Jugador;
import com.wchay.proyecto2.backend.listas_enlazadas.ListaEnlazada;
import com.wchay.proyecto2.backend.listas_enlazadas.ListaException;
import com.wchay.proyecto2.backend.mapa.configuracionesMapa;
import com.wchay.proyecto2.ui.ConfiguracionesPartidaNueva;
import com.wchay.proyecto2.ui.MapaPruebas;
import com.wchay.proyecto2.ui.VentanaPrincipal;
import com.wchay.proyecto2.ui.planetas.Planeta;
import com.wchay.proyecto2.ui.planetas.Planeta_jugador;
import com.wchay.proyecto2.ui.planetas.Planetas_Fantasmas;
import com.wchay.proyecto2.ui.planetas.Planetas_Neutrales;
import com.wchay.proyecto2.ui.planetas.Planetas_Zombies;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.GridLayout;
import java.util.Random;
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
    ///
    private JPanel contenedorCasillas;
    private ListaEnlazada<JPanel> casillasMapa;
    private ListaEnlazada<String> posicionesAleatorias;
    private ListaEnlazada<String> nombrePlanetas;
    private ListaEnlazada<String> planetasNeutrales;
    private ListaEnlazada<String> planetasFantasmas;
    private ListaEnlazada<String> planetasZombies;
    private int cantidadCasillas;
    private int planetasTotales;
    
    private  int numeroAleatorio;
     private  int contador =-1;
     private  int [] numerosGenerados;
     
     //
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
        
    }
     
    
    
    public void inicializar() {
        configuracionPartida.setVisible(false);
        ventanaInicioPrincipal.setEnabled(true);
        ventanaInicioPrincipal.getTextAreaMensajes().setVisible(true);
        ventanaInicioPrincipal.getScrollPaneAreaMensajes().setVisible(true);
        crearMapa();
        ventanaInicioPrincipal.getBotonPartidaNueva().setEnabled(false);
    }
    
    public void crearMapa(){
        GridLayout cuadricula = new GridLayout(0, columnas);
        contenedorCasillas = new JPanel();
        contenedorCasillas.setBorder(new LineBorder(Color.PINK, 3, true));
        contenedorCasillas.setVisible(true);
        contenedorCasillas.setLayout(cuadricula);
        contenedorCasillas.setOpaque(false);
        //rectangular
//        mapaPruebas.setBounds(100, 1, 1200, 540);
          //cuadrado  
          contenedorCasillas.setBounds(100, 1, 800, 540);
        cantidadCasillas = (filas*columnas); //cantidad de casillas en el mapa
        
      crearPosicionesAleatorios();
        casillasMapa = new ListaEnlazada<>();  
        //creando Casillas
        for (int i = 0; i < cantidadCasillas; i++) {
            GridLayout planetaIndividual = new GridLayout(1, 0);
            JPanel casillaIndvidual = new JPanel();
            casillaIndvidual.setOpaque(false);
            casillaIndvidual.setBorder(new LineBorder(Color.BLACK, 1, true));
            casillaIndvidual.setLayout(planetaIndividual);
            casillaIndvidual.setVisible(true);
            casillasMapa.agregar(casillaIndvidual);
            contenedorCasillas.add(casillaIndvidual);
        }
        
        try {
            agregarPlanetasNeutralesCasillasAleatorias();
            
            contenedorCasillas.doLayout();
        } catch (Exception e) {
            System.out.println("Error al agregar PN");
            e.printStackTrace();
        }
        
        JPanel panelMapa = ventanaInicioPrincipal.getPanelMapa(); ///////////
        panelMapa.add(contenedorCasillas); ///////////
        panelMapa.setVisible(true);
        ventanaInicioPrincipal.getPanelTurno().setVisible(true);
        panelMapa.doLayout();
        
        ventanaInicioPrincipal.doLayout();

    }
    
    public void agregarPlanetasNeutralesCasillasAleatorias() {
        
        AñadirPlanetaC(0, cantidadPN, planetasNeutrales, 1);
        AñadirPlanetaC(cantidadPN, cantidadPN+cantidadPFantasmas, planetasFantasmas, 2);
        AñadirPlanetaC(cantidadPN+cantidadPFantasmas, cantidadPN+cantidadPFantasmas+cantidadPZombies, planetasZombies, 3);
       
    }
    
    public void AñadirPlanetaC(int cantidadInicio, int cantidadFin, ListaEnlazada lista, int quePlaneta) {
        try {
            for (int i = cantidadInicio; i < cantidadFin; i++) {
                Planeta planeta;
                if(quePlaneta==1){
                     planeta =new Planetas_Neutrales();
                }else if(quePlaneta==2) {
                     planeta = new Planetas_Fantasmas();
                }else {
                     planeta = new Planetas_Zombies();
                }
                lista = new ListaEnlazada();
                lista.agregar(planeta);        //Agregando el Planeta a su Lista
                
    //            planeta = new Planetas_Neutrales();
                int posicionAleatoria = numerosGenerados[i];
                JPanel panel = casillasMapa.obtenerContenido(posicionAleatoria);
                planeta.setAncho(78);
                planeta.setAlto(78);
                planeta.setPlaneta();
                panel.add(planeta.getPanelPlaneta());
                panel.repaint();
                System.out.println("longitud casillas" + casillasMapa.obtenerLongitud());
            }
        } catch (ListaException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
    public void agregarAccionesPlanetas(){
    }

//    public void crearPosicionesAleatorias() {
        
//        try {
//            posicionesAleatorias = new ListaEnlazada<>();
//            boolean numeroRepetido=false;    
//            Random random = new Random();
//            planetasTotales = cantidadPN+cantidadPFantasmas+cantidadPZombies+jugadoresSeleccionados.obtenerLongitud();
//            String numero = String.valueOf(random.nextInt(cantidadCasillas));
//            posicionesAleatorias.agregar(numero);
//
//            for (int i = 0; i < planetasTotales; i++) {
//                numeroRepetido=false;                    
//                //
//                do{
//                    numero = String.valueOf(random.nextInt(cantidadCasillas));
//                    int tamano = posicionesAleatorias.obtenerLongitud();
//                    
//                    for (int j = 0; j < cantidadCasillas; j++) {
//                        String numeroEvaluar = posicionesAleatorias.obtenerContenido(i);
//                        if(numero.equals(numeroEvaluar)){
//                            numeroRepetido = true;
//                        }
//                    }
//                }while(numeroRepetido);
//                //
//                posicionesAleatorias.agregar(numero);
//            }
//            //eliminar esto
//            for (int k = 0; k < posicionesAleatorias.obtenerLongitud(); k++) {
//                System.out.println("posicionesAAleatorias " + posicionesAleatorias.obtenerContenido(k));
//            }
//        } catch (ListaException e) {
//            e.getMessage();
//        }
        
//    }
    
    
    public void crearNOmbresAletoriosPlaneta(){
        nombrePlanetas.agregar("ABA");
        nombrePlanetas.agregar("ABI");
        nombrePlanetas.agregar("ABE");
        nombrePlanetas.agregar("ABE");
        nombrePlanetas.agregar("ABE");
        nombrePlanetas.agregar("ABE");
        nombrePlanetas.agregar("ABE");
        nombrePlanetas.agregar("ABE");
        nombrePlanetas.agregar("ABE");
        nombrePlanetas.agregar("ABE");
        nombrePlanetas.agregar("ABE");
        nombrePlanetas.agregar("ABE");
        nombrePlanetas.agregar("ABE");
        nombrePlanetas.agregar("ABE");
        nombrePlanetas.agregar("ABE");
        nombrePlanetas.agregar("ABE");
        nombrePlanetas.agregar("ABE");
        nombrePlanetas.agregar("ABE");
        nombrePlanetas.agregar("ABE");
        nombrePlanetas.agregar("ABE");
        
    }
    public  void generarNumeroRandom(){
        Random random = new Random();
        numeroAleatorio = random.nextInt(cantidadCasillas);
        System.out.println(numeroAleatorio);
    }
    public  void verificarNoRepetir() {
        contador++;
            boolean repetido = false;
            do{
                repetido=false;                  //verifica que no se generen cartasRepetidas 
                generarNumeroRandom();
                for (int i = 0; i <numerosGenerados.length; i++){
                    if(numeroAleatorio==numerosGenerados[i]){
                        repetido = true;
                    }
                }
            }while(repetido);
        numerosGenerados[contador]=numeroAleatorio;    
    }
    
    public  void crearPosicionesAleatorios(){
        planetasTotales = cantidadPN+cantidadPFantasmas+cantidadPZombies+jugadoresSeleccionados.obtenerLongitud();
        numerosGenerados = new int[planetasTotales];
        for (int i = 0; i < numerosGenerados.length; i++) {
            verificarNoRepetir();
        }
        
    }
    
    
    
    
    
    
    
}