package org.listaEnlazada.Ejercicio2y10;

import java.util.ArrayList;
import java.util.List;

public class ListaEnlazadaSimple2<T> {



    private int size;
    private Nodo2<T> head;

    public ListaEnlazadaSimple2(){
        this.size = 0;
        this.head = null;

    }

    public void addFirst2(T value ){
        Nodo2<T> nodo2 = new Nodo2(value);
        if (isEmpty2()) {
            head = nodo2;
        }else{
            nodo2.setNext(head);
            head = nodo2;
        }
        size++;


    }
    public void addEnd2(T value ){
        Nodo2<T> nodo2 = new Nodo2(value);
        if (isEmpty2()){
            head = nodo2;
        }else{
            Nodo2<T> aux = head;
            while (aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(nodo2);
        }
        size++;

    }
    public void addAtIndex2(int index, T value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Indice fuera de rango ");
        }

        Nodo2<T> nodo2 = new Nodo2<>(value);

        if (index == 0) {
            nodo2.setNext(head);
            head = nodo2;
        } else {
            Nodo2<T> aux = head;
            int counter = 0;
            while (counter < index - 1) {
                aux = aux.getNext();
                counter++;
            }
            nodo2.setNext(aux.getNext());
            aux.setNext(nodo2);
        }
        size++;
    }

    //Ejercicio2: //Obtener la lista de personas  tengan cédula con cantidad de números par de una lista
    //    //enlazada simple de personas.

    public List<Persona> obtenercantidadNumerosPar(ListaEnlazadaSimple2<Persona> lista ){
        List<Persona> cedulasCantidaPares = new ArrayList<>();
        if (isEmpty2()) {
            throw new RuntimeException("La lista está vacía");
        } else {
            Nodo2<Persona> aux = lista.getHead();
            while (aux != null) {
                Persona persona = aux.getValue();
                int cantidadDigitos = contarelementos(persona.getCedula());
                if (cantidadDigitos % 2 == 0) {
                    cedulasCantidaPares.add(persona);
                }
                aux = aux.getNext();
            }
            return cedulasCantidaPares;
        }
    }


    private int contarelementos(int value) {

        if(value == 0) {
            return 0;
        }
        return 1 + contarelementos(value/10);

    }
    ///Ejercicio10: Escribir un método que permita “concatenar” dos listas enlazadas simples, el método debe
    //recibir como parámetro dos objetos de tipo Lista, unirlas y retornar una lista que contenga
    //a ambas

    public static <T> ListaEnlazadaSimple2<T> concatenarDosListasEnlazadasSimples(ListaEnlazadaSimple2<T> listaEnlazada1, ListaEnlazadaSimple2<T> listaEnlazadaSimple2){
     ListaEnlazadaSimple2<T> listaCompleta = new ListaEnlazadaSimple2<>();

       Nodo2<T> aux1 = listaEnlazada1.getHead();
       while (aux1 != null){
         listaCompleta.addEnd2(aux1.getValue());
         aux1 = aux1.getNext();
       }
       Nodo2<T> aux2 = listaEnlazadaSimple2.getHead();
       while (aux2 !=null ){
           listaCompleta.addEnd2(aux2.getValue());
           aux2 = aux2.getNext();
       }
       return listaCompleta;



    }

    public String toString2(){
        if (isEmpty2()){
            throw new RuntimeException("La lista se encuentra vacia");

        }else{

            String result = "";
            Nodo2<T> aux = head;
            while (aux != null){
                result += aux.getValue();
                if (aux.getNext() != null) {
                    result += ", ";
                }
                aux = aux.getNext();
            }
            return result;
        }

    }
    public boolean isEmpty2(){
        return head == null;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Nodo2<T> getHead() {
        return head;
    }

    public void setHead(Nodo2<T> head) {
        this.head = head;
    }
}
