package org.listaEnlazada.Ejercicio9;

public class NodoCircular <T>{

    private T value;
    private NodoCircular<T> next;

    public NodoCircular(T value){
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NodoCircular<T> getNext() {
        return next;
    }

    public void setNext(NodoCircular<T> next) {
        this.next = next;
    }
}
