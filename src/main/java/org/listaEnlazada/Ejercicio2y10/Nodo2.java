package org.listaEnlazada.Ejercicio2y10;

public class Nodo2<T>{

    private T value;
    private Nodo2<T> next;

    public Nodo2(T value){
        this.value = value;
        this.next = null;

    }

    public Nodo2<T> getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }

    public void setNext(Nodo2<T> next) {
        this.next = next;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
