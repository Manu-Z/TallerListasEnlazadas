package org.listaEnlazada.Ejercicios3l4l5;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {

        List<Integer> listaDenumeros = new ArrayList<>();

        listaDenumeros.add(2);
        listaDenumeros.add(1);
        listaDenumeros.add(5);
        listaDenumeros.add(6);
        listaDenumeros.add(8);
        listaDenumeros.add(3);


        System.out.println("Ejercicio 4");
        System.out.println("Lista Original");
        System.out.println(listaDenumeros);

        ListaEnlazadaSimple3 listaEnlazadaSimple3 = new ListaEnlazadaSimple3();
        ListaEnlazadaSimple3 listaNumerosImapres = listaEnlazadaSimple3.obtenerValoresImpares(listaDenumeros);
        listaNumerosImapres.obtenerValoresImpares(listaDenumeros);
        System.out.println("Lista enlazada con valores impares");
        System.out.println(listaNumerosImapres.toString());





    }
}
