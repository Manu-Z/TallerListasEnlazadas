package org.listaEnlazada.Ejercicio6l7l8;

import java.util.Iterator;
/// Ejercicios 6,7,8
public class ListaDobleEnlazada<T> implements Iterable<T> {
    private NodoDoble<T> head;
    private  NodoDoble<T> ultimo;
    private  int size;

    public ListaDobleEnlazada(){
        this.head = null;
        this.ultimo = null;
        this.size = 0;

    }
    public void addFirst(T value) {
        NodoDoble<T> nodoNuevo = new NodoDoble<>(value);
        if (isEmpty()) {
            head = nodoNuevo;
            ultimo = nodoNuevo;
        } else {
            nodoNuevo.setNext(head);
            head.setAnterior(nodoNuevo);
            head = nodoNuevo;
        }
        size++;

    }
    public void addEnd(T value) {
        NodoDoble<T> nodoNuevo = new NodoDoble<>(value);
        if (isEmpty()) {
            head = nodoNuevo;
            ultimo = nodoNuevo;
        } else {
            ultimo.setNext(nodoNuevo);
            nodoNuevo.setAnterior(ultimo);
            ultimo = nodoNuevo;
        }
        size++;
    }
    public void addAtIndex(int index, T value){
        if (index < 0 || index > size){
            throw  new RuntimeException("El indice esta fuera del rango");
        }
        if (index==0){
            addFirst(value);
            return;
        }
        if (index == size) {
            addEnd(value);
            return;
        }
        NodoDoble<T> nodoNuevo = new NodoDoble<>(value);
        NodoDoble<T> aux = head;
        int counter = 0;
        while (counter<index-1){
            aux = aux.getNext();
            counter++;
        }
        NodoDoble<T> anterior = aux.getAnterior();
        nodoNuevo.setNext(aux);
        nodoNuevo.setAnterior(anterior);
        anterior.setNext(nodoNuevo);
        aux.setAnterior(nodoNuevo);

        size++;

    }
    public void imprimir() {
        if (isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }

        NodoDoble<T> actual = head;
        while (actual != null) {
            System.out.println(actual.getValue());
            actual = actual.getNext();
        }
    }


    //Ejercicio 6: Escribir el método imprimirHaciaAtras() de una lista doblemente enlazada
    public void imprimirHaciaAtras(){
        if (isEmpty()){
            System.out.println("Lista vacia ");
        }
        NodoDoble<T> aux = ultimo;
        while (aux !=null){
            System.out.println(aux.getValue() +" " );
            aux = aux.getAnterior();
        }
        System.out.println(" ");


    }

    //Obtener la lista de personas tengan cédula con cantidad de elementos par de una lista
    //enlazada doble de personas.

    public ListaDobleEnlazada<Persona2> obtenercantidadNumerosPar(ListaDobleEnlazada<Persona2> listaPersonas ){
        ListaDobleEnlazada<Persona2> cedulasCantidadPares = new ListaDobleEnlazada<>();
        if (isEmpty()){
            throw  new RuntimeException("La lista esta vacia");
        }
        NodoDoble<Persona2> aux = listaPersonas.getHead();
        while (aux != null) {
            Persona2 persona2 = aux.getValue();
            int cantidadDigitos = contarelementos(persona2.getCedula2());
            if (cantidadDigitos % 2 == 0) {
                cedulasCantidadPares.addEnd(persona2);
            }
            aux = aux.getNext();
        }
        return cedulasCantidadPares;

    }

    private int contarelementos(int value) {
        if(value == 0) {
            return 0;
        }
        return 1 + contarelementos(value/10);
    }

    public boolean isEmpty(){
        return head == null;
    }
//Ejercicio7
    @Override
    public Iterator<T> iterator() {
        return new IteradorListaDobleEnlazada(getHead());
    }

    public NodoDoble<T> getHead() {
        return head;
    }

    public void setHead(NodoDoble<T> head) {
        this.head = head;
    }

    public NodoDoble<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoDoble<T> ultimo) {
        this.ultimo = ultimo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}
