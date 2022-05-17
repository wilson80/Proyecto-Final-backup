
package com.wchay.proyecto2.ui.planetas;


import com.wchay.proyecto2.ui.PanelPlaneta;
import com.wchay.proyecto2.ui.VentanaPrincipal;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

/**
 *
 * @author Jonwil
 */
public class Planeta implements Serializable{
    
    private static final long serialVersionUID=98L;
     private int noCasilla;
     private int loctionX;    
     private int loctiony;    
     private Color colorFondo;
     private JLabel nombrePlaneta;
     private JLabel cantidadNavesLabel;
     private JLabel planetaImagenYFondo;   
     private JTextArea popupInfo;
     private ImageIcon imagenPlaneta; 
     private PanelPlaneta panelPlaneta;
      
     private String textoNombre;
     private String dueño;  
     private int cantidadNaves;
     private int Produccion;
     private double porcentajeMuertes;
     
     private int posicionInsertado;   
     private int posicionEnLista;   
     private int posicionFila;   
     private int posicionColumna;   
     private int ancho;    
     private int alto;    
     private String tipoPlaneta;
    private static final String IMAGES_ROOT_PATH = "/imagenes/tiposPlanetas/";
//               
    
    public Planeta() {
        panelPlaneta = new PanelPlaneta();
         planetaImagenYFondo = new JLabel();
         
    }
    
     public void setPlaneta() {//agrega el el Panel del Planeta a la casilla del Mapa
        nombrePlaneta = new JLabel(textoNombre);
//        nombrePlaneta.setBounds(0, 0, 40, 20);
        String cN = String.valueOf(cantidadNaves);
        cantidadNavesLabel = new JLabel(cN);
//        cantidadNaves.setBounds(30, 0, 40, 20);
        
        planetaImagenYFondo.setBackground(colorFondo);
//        planetaImagenYFondo.setBackground(colorFondo);
        planetaImagenYFondo.setOpaque(true);
//        planetaImagenYFondo.setBounds(0, 20, 60, 60);
        
        ImageIcon imagenPlanetaSinAjuste = new ImageIcon(getClass().getResource(IMAGES_ROOT_PATH+tipoPlaneta));
        imagenPlaneta = new ImageIcon(imagenPlanetaSinAjuste.getImage().getScaledInstance(alto, ancho, Image.SCALE_DEFAULT));
        planetaImagenYFondo.setIcon(imagenPlaneta);
        
        panelPlaneta.add(nombrePlaneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 20));
        panelPlaneta.add(cantidadNavesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 40, 20));
        panelPlaneta.add(planetaImagenYFondo,new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, ancho, alto));
        panelPlaneta.doLayout();
        panelPlaneta.repaint();
        
    }
     
     
    public void configuracionPopup() {
//        panelMapa.add(panelMapa, new contr);
        popupInfo = new JTextArea();
//        popupInfo.setBorder(new LineBorder(Color.green));
//        popupInfo.setFont(new java.awt.Font("Segoe UI", 1, 14));
        popupInfo.setText(String.format("NOmbre Planeta: %s\nDueño:%s \nCantidad Naves: "
                                        + "%d\nProduccion: %d\nPorcentaje de Muertes: %f"
                                           ,textoNombre,dueño,cantidadNaves,Produccion,porcentajeMuertes));
        popupInfo.setVisible(false);
        popupInfo.setEditable(false);
        
    } 
    public void setTipoPlaneta(String nombreMapa) {
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
        this.dueño = conquistador;
    }

    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;
    }

    public void setNombrePlaneta(String nombrePlaneta) {
        this.nombrePlaneta.setText(nombrePlaneta);
    }
    public void setCantidadNavesLabel(String nombrePlaneta) {
        this.cantidadNavesLabel.setText(nombrePlaneta);
    }

    public void setTextoNombre(String textoNombre) {
        this.textoNombre = textoNombre;
    }

    public void setCantidadNavesLabel(JLabel cantidadNaves) {
        this.cantidadNavesLabel = cantidadNaves;
    }

    public void setCantidadNaves(int cantidadNaves) {
        this.cantidadNaves = cantidadNaves;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public void setProduccion(int Produccion) {
        this.Produccion = Produccion;
    }

    public void setPorcentajeMuertes(double porcentajeMuertes) {
        this.porcentajeMuertes = porcentajeMuertes;
    }

    public void setLoctionX(int loctionX) {
        this.loctionX = loctionX;
    }

    public void setLoctiony(int loctiony) {
        this.loctiony = loctiony;
    }

    public JLabel getPlanetaImagenYFondo() {
        return planetaImagenYFondo;
    }

    public JTextArea getPopupInfo() {
        return popupInfo;
    }

    public void setPosicionInsertado(int posicionInsertado) {
        this.posicionInsertado = posicionInsertado;
    }

    public int getPosicionInsertado() {
        return posicionInsertado;
    }

    public double getPorcentajeMuertes() {
        return porcentajeMuertes;
    }

    public String getTextoNombre() {
        return textoNombre;
    }

    public void setPosicionEnLista(int posicionEnLista) {
        this.posicionEnLista = posicionEnLista;
    }

    public int getPosicionEnLista() {
        return posicionEnLista;
    }

    public void setPlanetaImagenYFondo(JLabel planetaImagenYFondo) {
        this.planetaImagenYFondo = planetaImagenYFondo;
    }
        
    
    
    
    
    
}
