package org.listaEnlazada.Ejercicio9;

public class ListaCircularSimple<T> {
    private NodoCircular<T> head;
    private NodoCircular<T> ultimo;
    private int size;

    public ListaCircularSimple(){
        this.head = null;
        this.ultimo = null;
        this.size = 0;

    }
/// metodos para agregar inicio, final, por medio de indice

    public void addFirst(T value) {
        NodoCircular<T>  nodoCircular = new NodoCircular<>(value);
        if (isEmpty()) {
            nodoCircular.setNext(nodoCircular);
            head = nodoCircular;
            ultimo = nodoCircular;
        } else {
            NodoCircular<T> aux = head;
            while (aux.getNext() != head) {
                aux = aux.getNext();
            }
            nodoCircular.setNext(head);
            aux.setNext(nodoCircular);
            head = nodoCircular;
        }
        size++;
    }
    public void addEnd(T value){
        NodoCircular<T> nodoCircular = new NodoCircular<>(value);

        if(isEmpty()){
           head = nodoCircular;
           ultimo = nodoCircular;
           nodoCircular.setNext(head);
        }else{
            ultimo.setNext(nodoCircular);
            nodoCircular.setNext(head);
            ultimo = nodoCircular;
        }
        size++;
        System.out.println("hola");
    }
    public void addAtIndex(int index, T value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(" El indice esta fuera del rango");
        }

        if (index == 0) {
            addFirst(value);
            return;
        }

        NodoCircular<T> nodoCircular = new NodoCircular<>(value);
        NodoCircular<T> aux = head;
        for (int i = 0; i < index - 1; i++) {
            aux = aux.getNext();
        }
        nodoCircular.setNext(aux.getNext());
        aux.setNext(nodoCircular);
        size++;
    }

    public boolean buscar(T value) {
        if (isEmpty()) {
            throw new RuntimeException("La lista está vacía");
        }

        NodoCircular<T> aux = head;
        int counter = 0;

        do {
            if (aux.getValue() == value) {
                System.out.println("Sí se encuentra en la lista");
                return true;
            }
            aux = aux.getNext();
            counter++;
        } while (aux != head);

        System.out.println("No está el valor en la lista");
        return false;
    }




    public Boolean isEmpty(){
        return head == null;
    }

    public NodoCircular<T> getHead() {
        return head;
    }

    public void setHead(NodoCircular<T> head) {
        this.head = head;
    }

    public NodoCircular<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoCircular<T> ultimo) {
        this.ultimo = ultimo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
