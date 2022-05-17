package com.wchay.proyecto2.backend.inicio_juego;

import com.wchay.proyecto2.backend.Jugadores.Jugador;
import com.wchay.proyecto2.backend.listas_enlazadas.ListaEnlazada;
import com.wchay.proyecto2.backend.listas_enlazadas.ListaException;
import com.wchay.proyecto2.backend.mapa.configuracionesMapa;
import com.wchay.proyecto2.ui.ConfiguracionesPartidaNueva;

import com.wchay.proyecto2.ui.PanelPlaneta;
import com.wchay.proyecto2.ui.VentanaPrincipal;
import com.wchay.proyecto2.ui.planetas.Planeta;
import com.wchay.proyecto2.ui.planetas.Planeta_jugador;
import com.wchay.proyecto2.ui.planetas.Planetas_Fantasmas;
import com.wchay.proyecto2.ui.planetas.Planetas_Neutrales;
import com.wchay.proyecto2.ui.planetas.Planetas_Zombies;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dialog;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
/** 
 *
 * @author Jonwil
 */
public class MotorJuego   {
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
    private ListaEnlazada<Planeta> todosLosPlanetas;
    private ListaEnlazada<String> planetasNeutrales;
    private ListaEnlazada<String> planetasFantasmas;
    private ListaEnlazada<String> planetasZombies;
    private int cantidadCasillas;
    private int planetasTotales;
    
    private  int numeroAleatorio;
    private  int contador =-1;
    private  int [] numerosGenerados;
    private  String [] nombresAleatorios;
    private int planetaSeleccionado;
    private JPanel panelMapa;
    private JButton botonPlanetaOrigen;
    private JButton botonPlanetaDestino;
    private JButton botonMedirDistancias;
    private JLabel planetaOseleccionado;
    private JLabel planetaDseleccionado;
    
    private int hayPlanetaSeleccionado=0; 
     //
    private int planetaOrigen;    
    private int planetaDestino;    
    private int planetas_a_Medir;    
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
        todosLosPlanetas = new ListaEnlazada<>();
        botonPlanetaOrigen = ventanaInicioPrincipal.getBotonPlanetaOrigen();
        botonPlanetaDestino = ventanaInicioPrincipal.getBotonPlanetaDestino();
        botonMedirDistancias = ventanaInicioPrincipal.getBotonMedirDistancias();
        planetaOseleccionado = ventanaInicioPrincipal.getPlanetaOseleccionado();
        planetaDseleccionado = ventanaInicioPrincipal.getPlanetaDseleccionado();
        configuracionPartida.setVisible(false);
        ventanaInicioPrincipal.setEnabled(true);
        ventanaInicioPrincipal.getTextAreaMensajes().setVisible(true);
        ventanaInicioPrincipal.getScrollPaneAreaMensajes().setVisible(true);
        crearMapa();
        ventanaInicioPrincipal.getBotonPartidaNueva().setEnabled(false);
    }
    
    public void crearMapa() {
        
        GridLayout cuadricula = new GridLayout(0, columnas);
        contenedorCasillas = new JPanel();
        contenedorCasillas.setBorder(new LineBorder(Color.PINK, 3, true));
        contenedorCasillas.setVisible(true);
        contenedorCasillas.setLayout(cuadricula);
        contenedorCasillas.setOpaque(false);
        panelMapa = ventanaInicioPrincipal.getPanelMapa(); ///////////
        panelMapa.add(contenedorCasillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1, 800, 540));
        //rectangular
//        mapaPruebas.setBounds(100, 1, 1200, 540);
          //cuadrado  
//          contenedorCasillas.setBounds(100, 1, 800, 540);
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
            agregarPlanetasCasillasAleatorias();
            contenedorCasillas.doLayout();
        } catch (Exception e) {
            System.out.println("Error al agregar PN");
            e.printStackTrace();
        }
        
        panelMapa.setVisible(true);
        ventanaInicioPrincipal.getPanelTurno().setVisible(true);
        panelMapa.doLayout();
        ventanaInicioPrincipal.doLayout();
        //Acciones
        seleccionarPlanetaOrigen();
        seleccionarPlanetaDestino();
        botonMedirDistancias();
    }
    
    public void agregarPlanetasCasillasAleatorias() {
        //planetas neutrales, fantasmas, y Zombies
        Planeta noUso = new Planeta();
        AñadirPlanetas_a_Mapa(0, cantidadPN, planetasNeutrales, 1,noUso);
        AñadirPlanetas_a_Mapa(cantidadPN, cantidadPN+cantidadPFantasmas, planetasFantasmas, 2, noUso);
        AñadirPlanetas_a_Mapa(cantidadPN+cantidadPFantasmas
                       ,cantidadPN+cantidadPFantasmas+cantidadPZombies, planetasZombies, 3, noUso);
        //Planetas de Jugador
        int PlanetasJugadorI ;
        int PlanetasJugadorF;
        PlanetasJugadorI = cantidadPN+cantidadPFantasmas+cantidadPZombies;
        PlanetasJugadorF = PlanetasJugadorI+1;
        
        Planeta planeta;
        try {              //iniciociclo      //Finciclo      //jugador          //listaPlanetas         //planeta
            //jugador 1
            
            for (int i = 0; i < jugadoresSeleccionados.obtenerLongitud(); i++) {
                planeta = jugadoresSeleccionados.obtenerContenido(i).getPlanetas_de_Jugador().obtenerContenido(0);
                AñadirPlanetas_a_Mapa(PlanetasJugadorI,PlanetasJugadorF, planetasZombies, 4,planeta);
                PlanetasJugadorI++;
                PlanetasJugadorF++;
            }
            
        } catch (ListaException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
    
    public void AñadirPlanetas_a_Mapa(int cantidadInicio, int cantidadFin, ListaEnlazada lista, int quePlaneta, Planeta planeta) {
        try {
            for (int i = cantidadInicio; i < cantidadFin; i++) {
                
                if(quePlaneta<=3){
                    if(quePlaneta==1){
                     planeta =new Planetas_Neutrales();
                     asignarNOmbreJugador(i, planeta);
                    }else if(quePlaneta==2) {
                        planeta = new Planetas_Fantasmas();
                        asignarNOmbreJugador(i, planeta);
                    }else {
                         planeta = new Planetas_Zombies();
                         asignarNOmbreJugador(i, planeta);
                    }
                    asignarNOmbreJugador(i, planeta);
                    lista = new ListaEnlazada();
                    lista.agregar(planeta);
//                    planeta.setAccion();
                }
                //arreglo de Todos los Planetas
                todosLosPlanetas.agregar(planeta);
                        //Agregando el Planeta a su Lista
                
    //            planeta = new Planetas_Neutrales();
                
                int posicionAleatoria = numerosGenerados[i];
                JPanel panelCasilla = casillasMapa.obtenerContenido(posicionAleatoria);
                planeta.setPosicionInsertado(posicionAleatoria);
                planeta.setPosicionEnLista(i);
                
                
                planeta.setAncho(78);
                planeta.setAlto(78);
                planeta.setPlaneta();
                JLabel imagenYFondo = planeta.getPlanetaImagenYFondo();
                imagenYFondo.setCursor(new Cursor(Cursor.HAND_CURSOR));
                planeta.configuracionPopup();
                
                panelCasilla.add(planeta.getPanelPlaneta());
                planeta.configuracionPopup();
                setAccionPlanetaSeleccionado(imagenYFondo,planeta);
                panelMapa.add(planeta.getPopupInfo(), new org.netbeans.lib.awtextra.AbsoluteConstraints(panelCasilla.getLocation().x+900,
                                    panelCasilla.getLocation().y, 300, 100));
                panelCasilla.doLayout();
                panelCasilla.repaint();
                System.out.println("longitud casillas" + casillasMapa.obtenerLongitud());
                
            }
                 
                 

        } catch (ListaException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }

    
    public void setAccionPlanetaSeleccionado(JLabel planetaImagenYFondo, Planeta planeta) {
        planetaImagenYFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                planetaImagenYFondoMouseClicked(evt,planeta);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                planetaImagenYFondoMouseExited(evt);
            }

            private void planetaImagenYFondoMouseClicked(MouseEvent evt, Planeta planeta) {
                 if(evt.getClickCount()==2){
                     hayPlanetaSeleccionado++;
                     planetaSeleccionado = planeta.getPosicionInsertado();
                     System.out.println("Planeta Selecionado" + planetaSeleccionado);
                 }else if(evt.getClickCount()==1){
                    planeta.getPopupInfo().setVisible(true);
                 }
            }
            private void planetaImagenYFondoMouseExited(MouseEvent evt) {
                planeta.getPopupInfo().setVisible(false);
            }
        });
    } 
    
    
    public void seleccionarPlanetaOrigen() {
        botonPlanetaOrigen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonPlanetaOrigenMouseClicked(evt);
            }
            private void botonPlanetaOrigenMouseClicked(MouseEvent evt) {
                int lista;
                int planetaOr=0;
                if(hayPlanetaSeleccionado==1){
                    try {
                        hayPlanetaSeleccionado=2;
                        planetas_a_Medir=1;
                        
                        for (int i = 0; i < todosLosPlanetas.obtenerLongitud(); i++) {
                            Planeta planeta = todosLosPlanetas.obtenerContenido(i);
                             lista = planeta.getPosicionEnLista();
                            if(lista==planetaSeleccionado){
                                planetaOr=lista;
                            } 
                        }
                        
                        String planetaSel = todosLosPlanetas.obtenerContenido(planetaOr).getTextoNombre();
                         planetaOseleccionado.setText(planetaSel);
                         planetaOrigen = planetaOr;
                    } catch (ListaException e) {
                        e.getMessage();
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "no ha seleccionado un planeta\nSeleccione un planeta dando doble click");
                }
                
            }
        });
    } 
    
    public void seleccionarPlanetaDestino() {
        botonPlanetaDestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonPlanetaDestinoMouseClicked(evt);
            }
  
            private void botonPlanetaDestinoMouseClicked(MouseEvent evt) {
                int lista;
                int planetadesDes=0;
                if(hayPlanetaSeleccionado>1) {
                    try {
                        planetas_a_Medir=2;
                        
                        for (int i = 0; i < todosLosPlanetas.obtenerLongitud(); i++) {
                            Planeta planeta = todosLosPlanetas.obtenerContenido(i);
                             lista = planeta.getPosicionEnLista();
                            if(lista==planetaSeleccionado){
                                planetadesDes=lista;
                            } 
                        }
                        
                        String planetaSel = todosLosPlanetas.obtenerContenido(planetadesDes).getTextoNombre();
                         planetaDseleccionado.setText(planetaSel);
                         planetaDestino = planetadesDes;
                    } catch (ListaException e) {
                        e.getMessage();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "no ha seleccionado un planeta de origen \nSeleccione un planeta dando doble click");
                }
                
            }
        });
    } 
    
    public void botonMedirDistancias() {
        botonMedirDistancias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMedirDistanciasMouseClicked(evt);
            }
  
            private void botonMedirDistanciasMouseClicked(MouseEvent evt) {
                if(planetas_a_Medir==2){
                    JOptionPane.showMessageDialog(null, "La diastancia entre el planeta:  al Planeta:  es de1 Años luz",
                            "Distancia entre Planetas", JOptionPane.INFORMATION_MESSAGE);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Selecione Primero un Planeta de Origen Luego uno de destino");
                }
                
            }
        });
    } 
    
    
    public void asignarNOmbreJugador(int i, Planeta planeta){
        crearNOmbresAletoriosPlaneta();
        try {
            planeta.setTextoNombre(nombresAleatorios[i]);
            planeta.setCantidadNavesLabel("5");
            planeta.setProduccion(5);
            planeta.setPorcentajeMuertes(0.4);
            
        } catch (Exception e) {
        }
        
    }
    
    private void crearNOmbresAletoriosPlaneta(){
       nombresAleatorios = new String[30];
       nombresAleatorios[0]="A";
       nombresAleatorios[1]="B";
       nombresAleatorios[2]="C";
       nombresAleatorios[3]="D";
       nombresAleatorios[4]="E";
       nombresAleatorios[5]="E";
       nombresAleatorios[6]="F";
       nombresAleatorios[7]="G";
       nombresAleatorios[8]="H";
       nombresAleatorios[9]="I";
       nombresAleatorios[0]="K";
       nombresAleatorios[11]="L";
       nombresAleatorios[12]="M";
       nombresAleatorios[13]="N";
       nombresAleatorios[14]="O";
       nombresAleatorios[15]="AP";
       nombresAleatorios[16]="Q";
       nombresAleatorios[17]="R";
       nombresAleatorios[18]="A";
       nombresAleatorios[19]="T";
       nombresAleatorios[20]="AU";
       nombresAleatorios[21]="U";
       nombresAleatorios[22]="V";
       nombresAleatorios[23]="W";
       nombresAleatorios[24]="X";
       nombresAleatorios[25]="Y";
       nombresAleatorios[26]="Z";
       nombresAleatorios[27]="AZ";
       nombresAleatorios[28]="AM";
       nombresAleatorios[29]="AMI";
    }
    
    private  void generarNumeroRandom() {
        Random random = new Random();
        numeroAleatorio = random.nextInt(cantidadCasillas);
        System.out.println(numeroAleatorio);
    }
    
    private void verificarNoRepetir() {
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