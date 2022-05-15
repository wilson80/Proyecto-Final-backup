package com.wchay.proyecto2.backend.listas_enlazadas;

import java.io.Serializable;

/**
 *
 * @author Jonwil
 */
public class Nodo<T> implements Serializable {
    
    private static final long serialVersionUID=98L;
    
    private T contenido;
    private Nodo<T> siguiente;

    public Nodo(T contenido) {
        this.contenido = contenido;
    }

    public T getContenido() {
        return contenido;
    }
    
    public void setContenido(T nuevoContenido) {
        contenido = nuevoContenido;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
    
}
