package org.listaEnlazada.Ejercicios3l4l5;

import java.util.List;
/// Ejercicios: 3,4 y5
public class ListaEnlazadaSimple3 {


    private int size3;
    private Nodo3 head3;

    public ListaEnlazadaSimple3() {
        this.size3 = 0;
        this.head3 = null;
    }

    public void addFirst3(int value){
        Nodo3 nodo3 = new Nodo3(value);
        if (isEmpty3()) {
            head3 = nodo3;
        }else{
            nodo3.setNext3(head3);
            head3 = nodo3;
        }
        size3++;
    }
    public void addEnd3(int value){
        Nodo3 nodo3 = new Nodo3(value);
        if (isEmpty3()){
            head3 = nodo3;
        }else{
            Nodo3 aux = head3;
            while (aux.getNext3() != null){
                aux = aux.getNext3();
            }
            aux.setNext3(nodo3);
        }
        size3++;

    }
    public void addAtIndex3(int index, int value){
        if (index<0 || index> size3) {
            throw  new IndexOutOfBoundsException("El indice esta fuera del rango: ");

        }
        Nodo3 nodo3 = new Nodo3(value);
        if (isEmpty3()){
            head3 = nodo3;
        }else{
            Nodo3 aux = head3;
            int counter = 0;
            while (counter < index-1){
                aux = aux.getNext3();
                counter++;
            }
            nodo3.setNext3(aux.getNext3());
            aux.setNext3(nodo3);


        }
        size3++;

    }
    public void removeFirst3(){
        if (isEmpty3()){
            throw new RuntimeException("La lista se encuentra vacia ");
        }else{
            Nodo3 inicial = head3;
           head3 = head3.getNext3();
            inicial.setNext3(null);
            size3--;
        }
    }

    //Ejercicio3: Eliminar los números pares de una lista enlazada simple
    public void deleteEvenNumbers(ListaEnlazadaSimple3 listaEnlazadaSimple3){

        if (isEmpty3()){
            throw  new RuntimeException("La lista esta vacia: ");
        }else {
            Nodo3 aux = head3;
            int counter = 0;
            while(aux != null){
                if (aux.getValue3()%2 == 0){
                    remove(counter);
                    aux = head3;
                    counter = 0;
                }else{
                    counter++;
                    aux = aux.getNext3();
                }

            }

        }
    }

    private void remove(int index) {
        if(isEmpty3()){
            throw new RuntimeException("La lista esta vacia: ");

        }
        if(index <0 || index>= size3){
            throw new IndexOutOfBoundsException("El indice esta fuera del rango");
        }

        if (index == 0){
            removeFirst3();
            return;
        }
        Nodo3 aux = head3;
        int counter = 0;

        while (counter < (index-1)){
            aux = aux.getNext3();
            counter++;
        }
        Nodo3 value = aux.getNext3();
        aux.setNext3(value.getNext3());
        value.setNext3(null);
        size3--;




    }

  //Ejercicio4: Escribir un método que devuelva una lista enlazada con los valores impares de una lista de
    //números
    public ListaEnlazadaSimple3 obtenerValoresImpares(List<Integer> list){
        ListaEnlazadaSimple3 listaSimpleImpares = new ListaEnlazadaSimple3();
        if (list.isEmpty()){
            throw  new RuntimeException("La lista esta vacia");
        }else {
            for(int number: list){
                if (number % 2 != 0) {
                    listaSimpleImpares.addEnd3(number);
                }
            }
            return listaSimpleImpares;
        }

    }
    // Ejercicio5: Escribir un método que retorne la cantidad de veces que se repite un valor en una lista
    //enlazada.

    public int obtenerCantidadRepeticiones(ListaEnlazadaSimple3 listaEnlazadaSimple, int value){

        if (listaEnlazadaSimple.isEmpty3()){
            throw new RuntimeException("La lista esta vacia: ");
        }else {
            Nodo3 aux = head3;
            int counter = 0;
            while (aux != null){
                if (aux.getValue3() == value){
                    counter++;
                }
                aux = aux.getNext3();
            }
            return counter;
        }

    }
    public boolean isEmpty3(){
        return head3 == null;

    }

    public String toString(){
        if ((isEmpty3())){
            throw new RuntimeException("La lista esta vacia");

        }else{


            String result = "";
            Nodo3 aux = head3;
            while (aux != null){
                result += aux.getValue3();
                if (aux.getNext3() != null) {
                    result += ", ";
                }
                aux = aux.getNext3();
            }
            return result;
        }

    }

    public int getSize3() {
        return size3;
    }

    public void setSize3(int size3) {
        this.size3 = size3;
    }

    public Nodo3 getHead3() {
        return head3;
    }

    public void setHead3(Nodo3 head3) {
        this.head3 = head3;
    }
}
