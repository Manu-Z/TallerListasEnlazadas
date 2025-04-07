package org.listaEnlazada.Ejercicios3l4l5;

public class Main3 {
    public static void main(String[] args) {


        ListaEnlazadaSimple3 listaEnlazadaSimple3 = new ListaEnlazadaSimple3();

        listaEnlazadaSimple3.addFirst3(2);
        listaEnlazadaSimple3.addFirst3(5);
        listaEnlazadaSimple3.addFirst3(4);
        listaEnlazadaSimple3.addAtIndex3(3, 6);
        listaEnlazadaSimple3.addEnd3(7);
        listaEnlazadaSimple3.addEnd3(9);
        listaEnlazadaSimple3.addEnd3(2);

        System.out.println("Ejercicio 3 ");
        System.out.println("Lista Original: ");
        System.out.println( listaEnlazadaSimple3.toString());
        listaEnlazadaSimple3.deleteEvenNumbers(listaEnlazadaSimple3);
        System.out.println("Lista Sin valores pares: ");
        System.out.println(listaEnlazadaSimple3.toString());
    }
}
