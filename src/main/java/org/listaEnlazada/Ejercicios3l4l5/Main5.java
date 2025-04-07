package org.listaEnlazada.Ejercicios3l4l5;

public class Main5 {
    public static void main(String[] args) {

        ListaEnlazadaSimple3 listaEnlazadaNumeros = new ListaEnlazadaSimple3();

        listaEnlazadaNumeros.addEnd3(2);
        listaEnlazadaNumeros.addEnd3(3);
        listaEnlazadaNumeros.addEnd3(4);
        listaEnlazadaNumeros.addEnd3(3);
        listaEnlazadaNumeros.addEnd3(4);
        listaEnlazadaNumeros.addEnd3(1);

        System.out.println(listaEnlazadaNumeros.obtenerCantidadRepeticiones(listaEnlazadaNumeros,2));

    }
}
