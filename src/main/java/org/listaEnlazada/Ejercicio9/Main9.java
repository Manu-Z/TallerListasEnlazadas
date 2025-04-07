package org.listaEnlazada.Ejercicio9;

public class Main9 {
    public static void main(String[] args) {
        ListaCircularSimple<Integer> lista = new ListaCircularSimple<>();

        // Agregar elementos
        lista.addFirst(10);
        lista.addAtIndex(1, 20);
        lista.addAtIndex(2, 30);
        lista.addAtIndex(1, 15);
        lista.addEnd(50);



        System.out.println("Buscando 50: ");
        boolean encontrado1 = lista.buscar(50);

        System.out.println("Buscando 99: ");
        boolean encontrado2 = lista.buscar(99);

        System.out.println("¿Esta el número 20? " + encontrado1);
        System.out.println("¿Esta el número 99? " + encontrado2);
    }
}
