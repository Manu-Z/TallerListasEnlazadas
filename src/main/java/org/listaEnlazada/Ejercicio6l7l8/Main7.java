package org.listaEnlazada.Ejercicio6l7l8;

import java.util.Iterator;

public class Main7 {
    public static void main(String[] args) {

        ListaDobleEnlazada<Integer> lista = new ListaDobleEnlazada<>();

        lista.addEnd(5);
        lista.addEnd(10);
        lista.addEnd(15);
        lista.addEnd(25);
        lista.addEnd(30);

        Iterator<Integer> iterador = lista.iterator();

        while (iterador.hasNext()){
            Integer value = iterador.next();
            System.out.println(value);
        }
    }
}
