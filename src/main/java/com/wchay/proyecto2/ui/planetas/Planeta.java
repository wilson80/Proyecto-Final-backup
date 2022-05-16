
package com.wchay.proyecto2.ui.planetas;

import com.wchay.proyecto2.ui.PanelPlaneta;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jonwil
 */
public class Planeta  {
     private Color colorFondo;   
     private JLabel nombrePlaneta;
     private JLabel cantidadNaves;
     private JLabel planetaImagenYFondo;   
     private String conquistador;   
     private int posicionInsertado;   
     private int posicionFila;   
     private int posicionColumna;   
     private int ancho;    
     private int alto;    
     private String tipoPlaneta;
     private ImageIcon imagenPlaneta; 
     private PanelPlaneta panelPlaneta; 
    private static final String IMAGES_ROOT_PATH = "/imagenes/tiposPlanetas/";
//               
    
    public Planeta() {
        panelPlaneta = new PanelPlaneta();
        
    }
    
    
     public void setPlaneta(){
        nombrePlaneta = new JLabel("ABC");
//        nombrePlaneta.setBounds(0, 0, 40, 20);
        cantidadNaves = new JLabel("123");
//        cantidadNaves.setBounds(30, 0, 40, 20);
        planetaImagenYFondo = new JLabel();
        planetaImagenYFondo.setBackground(colorFondo);
        planetaImagenYFondo.setOpaque(true);
//        planetaImagenYFondo.setBounds(0, 20, 60, 60);
        
        ImageIcon imagenPlanetaSinAjuste = new ImageIcon(getClass().getResource(IMAGES_ROOT_PATH+tipoPlaneta));
        imagenPlaneta = new ImageIcon(imagenPlanetaSinAjuste.getImage().getScaledInstance(alto, ancho, Image.SCALE_DEFAULT));
        planetaImagenYFondo.setIcon(imagenPlaneta);
        
        panelPlaneta.add(nombrePlaneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 20));
        panelPlaneta.add(cantidadNaves,new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 40, 20));
        panelPlaneta.add(planetaImagenYFondo,new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, ancho, alto));
        panelPlaneta.doLayout();
        panelPlaneta.repaint();
        
    }
     
    
    public void setTipoMapa(String nombreMapa) {
        this.tipoPlaneta = nombreMapa;
    }
    
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public void setAlto(int alto) {
        this.alto = alto;
    }

    public PanelPlaneta getPanelPlaneta() {
        return panelPlaneta;
    }

    public void setPosicionFila(int posicionFila) {
        this.posicionFila = posicionFila;
    }

    public void setPosicionColumna(int posicionColumna) {
        this.posicionColumna = posicionColumna;
    }

    public int getPosicionFila() {
        return posicionFila;
    }

    public int getPosicionColumna() {
        return posicionColumna;
    }

    public void setConquistador(String conquistador) {
        this.conquistador = conquistador;
    }

    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;
    }
    
   
    
    
       
    
    
}
