package org.listaEnlazada.Ejercicio6l7l8;

public class Main8 {
    public static void main(String[] args) {

        Persona2 persona1 = new Persona2("Manuela", 1094);
        Persona2 persona2 = new Persona2("Santiago", 10944);
        Persona2 persona3 = new Persona2("Carolina", 109467);
        Persona2 persona4 = new Persona2("Manuel", 109422);
        Persona2 persona5 = new Persona2("Nicolas", 109);

        ListaDobleEnlazada<Persona2> listaPersonas = new ListaDobleEnlazada<>();

        listaPersonas.addEnd(persona1);
        listaPersonas.addEnd(persona2);
        listaPersonas.addEnd(persona3);
        listaPersonas.addEnd(persona4);
        listaPersonas.addEnd(persona5);

        ListaDobleEnlazada<Persona2> resultado = listaPersonas.obtenercantidadNumerosPar(listaPersonas);
        resultado.imprimir();


    }
}
