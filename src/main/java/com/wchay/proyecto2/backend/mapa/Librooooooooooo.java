package com.wchay.proyecto2.backend.mapa;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author jose
 */
public class Librooooooooooo implements Serializable{
                                                        //serializable sirve para que se puedan guardar archivos en series( se usa al usar ObjetOutput Stream)
    private static final long serialVersionUID=100L;   //Sirve al sobrescribir Archivos

    private String isbn;
    private String autor;
    private String nombre;
    private String editorial;
    private int año;
    private LocalDate fecha;
    private boolean activo ;
    

    
    public Librooooooooooo(String isbn, String autor, String nombre, String editorial, int año, LocalDate fecha) {
        this.isbn = isbn;
        this.autor = autor;
        this.nombre = nombre;
        this.editorial = editorial;
        this.año = año;
        this.fecha = fecha;
                
    }
    
    @Override
    public String toString() {
        return String.format(
                "LIBRO: isbn: %s, autor: %s, nombre: %s, editorial: %s, Año: %d, Fecha: %s, Activo: %s",
                isbn,
                autor,
                nombre,
                editorial,
                año,
                fecha,
                activo);
    }
    
    public void imprimirDatos() {
        System.out.println(toString());
    }
    
    //getter
    public String obtenerISBN() {
        return isbn;
    }
    
    public boolean tieneISBN(String isbnAComparar) {
        return isbn.equals(isbnAComparar);
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerAutor() {
        return autor;
    }

    public int getAño() {
        return año;
    }

    public String getEditorial() {
        return editorial;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    
    
       
    
    
    
}
