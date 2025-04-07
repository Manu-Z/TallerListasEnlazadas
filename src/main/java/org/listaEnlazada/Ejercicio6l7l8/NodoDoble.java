package org.listaEnlazada.Ejercicio6l7l8;

public class NodoDoble<T> {
    private T value;
    private NodoDoble<T> next;
    private NodoDoble<T> anterior;

    public  NodoDoble(T value){
        this.value = value;
        this.next = null;
        this.anterior = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NodoDoble<T> getNext() {
        return next;
    }

    public void setNext(NodoDoble<T> next) {
        this.next = next;
    }

    public NodoDoble<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble<T> anterior) {
        this.anterior = anterior;
    }
}
