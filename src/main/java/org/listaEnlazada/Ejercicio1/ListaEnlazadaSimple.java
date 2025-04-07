package org.listaEnlazada.Ejercicio1;

public class ListaEnlazadaSimple {
    //Obtener los números de las posiciones impares de una lista enlazada simple de números

    private int size;
    private Nodo head;

    public ListaEnlazadaSimple(){
        this.size = 0;
        this.head = null;
    }

    public void addFirst(int valor ){
        Nodo nodo = new Nodo(valor);
        if (isEmpty()){
            head = nodo;
        }else{
            nodo.setNext(head);
            head = nodo;
        }
         size++;


    }

    public void addAtIndex(int index, int valor){
        Nodo nodo = new Nodo(valor);
        if (isEmpty()){
            head = nodo;
        }
        if(index<0 || index>size ){
            throw  new IndexOutOfBoundsException("Indice fuera de rango ");

        }else {
            Nodo aux = head;
            int counter = 0;
            while (counter < index - 1){
                aux = aux.getNext();
                counter ++;

            }
            nodo.setNext(aux.getNext());
            aux.setNext(nodo);
        }
        size++;

    }

    public void addEnd(int valor){
        Nodo nodo = new Nodo(valor);
        if (isEmpty()){
            head = nodo;
        }else{
            Nodo aux = head;
            while (aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(nodo);
        }
        size++;

    }

    public void getNumbersAtOddIndexes(){
        if (isEmpty()){
            throw new RuntimeException("La lista esta vacia");

        }else {
            Nodo aux = head;
            int counter = 0;
            while (aux!= null){
                if((counter % 2)!= 0){
                    System.out.println(aux.getValor());
                }
                aux = aux.getNext();
                counter++;



            }
        }


    }
    public String toString(){
        if (isEmpty()){
            throw new RuntimeException("La lista esta vacia");

        }else{

            String result = "";
            Nodo aux = head;
            while (aux != null){
                result += aux.getValor();
                if (aux.getNext() != null) {
                    result += ", ";
                }
                aux = aux.getNext();
            }
            return result;
        }

    }



    public boolean isEmpty(){
        return head == null;

    }

    public int getSize() {
        return size;
    }

    public Nodo getHead(){
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

