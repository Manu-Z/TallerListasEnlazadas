package org.listaEnlazada.Ejercicio6l7l8;

public class Main6 {
    public static void main(String[] args) {
        ListaDobleEnlazada<Integer> listaDobleEnlazada = new ListaDobleEnlazada<>();

        listaDobleEnlazada.addEnd(10);
        listaDobleEnlazada.addEnd(20);
        listaDobleEnlazada.addEnd(30);
        listaDobleEnlazada.addEnd(40);
        listaDobleEnlazada.addEnd(50);
        listaDobleEnlazada.addEnd(60);

        // original(10, 20, 30, 40, 50, 60)

        System.out.println("Imprimir hacia atrás");

       listaDobleEnlazada.imprimirHaciaAtras();
    }


}
