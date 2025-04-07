package org.listaEnlazada.Ejercicio6l7l8;

import java.util.Iterator;
import java.util.NoSuchElementException;

//Ejercicio7: Escribir el Iterador para una lista doblemente enlazada.
public class IteradorListaDobleEnlazada<T> implements Iterator<T> {

    private NodoDoble<T> aux;
    public IteradorListaDobleEnlazada(NodoDoble<T> head){
        this.aux = head;
    }
    @Override
    public boolean hasNext() {
        return aux != null;
    }

    @Override
    public T next() {
        if (!hasNext()){
            throw  new NoSuchElementException();
        }
        T value = aux.getValue();
        aux = aux.getNext();
        return value;
    }
}
