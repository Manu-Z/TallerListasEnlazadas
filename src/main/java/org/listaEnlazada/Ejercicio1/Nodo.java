package org.listaEnlazada.Ejercicio1;

public class Nodo {

    private int valor;
    private Nodo next;

    public Nodo(int valor){
        this.valor = valor;
        this.next = null;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public void setNext(Nodo next){
        this.next = next;
    }

    public  int  getValor() {
        return valor;
    }

    public Nodo getNext() {
        return next;
    }
}
