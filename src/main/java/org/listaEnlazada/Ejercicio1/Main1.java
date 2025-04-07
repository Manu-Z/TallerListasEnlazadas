package org.listaEnlazada.Ejercicio1;

public class Main1 {

    public static void main(String[] args) {
        //Obtener los números de las posiciones impares de una lista enlazada simple de números

        ListaEnlazadaSimple listaEnlazadaSimple = new ListaEnlazadaSimple();

        listaEnlazadaSimple.addFirst(1);// index 1*
        listaEnlazadaSimple.addFirst(4);// index 0
        listaEnlazadaSimple.addAtIndex(2,3);// index 2
        listaEnlazadaSimple.addEnd(8);// index 3*
        listaEnlazadaSimple.addEnd(7);// index 4
        listaEnlazadaSimple.addEnd(6);// index 5*
        listaEnlazadaSimple.getNumbersAtOddIndexes();
       // System.out.println(listaEnlazadaSimple.toString());

    }
}
