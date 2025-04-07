package org.listaEnlazada.Ejercicio2y10;

public class Main2 {
    public static void main(String[] args) {


        Persona persona1 = new Persona("Martin", 19345);
        Persona persona2 = new Persona("Sofia", 1834);
        Persona persona3 = new Persona("Carolina", 193);
        Persona persona4 = new Persona("Jose", 193454);
        Persona persona5 = new Persona("Felipe", 1845);
        Persona persona6 = new Persona("Esteban", 22345);

        ListaEnlazadaSimple2<Persona> listaPersonas = new ListaEnlazadaSimple2<>();

        listaPersonas.addFirst2(persona1); // lista: [Martin]
        listaPersonas.addFirst2(persona2); // lista: [Sofia, Martin]
        listaPersonas.addAtIndex2(2, persona3); // lista: [Sofia, Martin, Carolina]
        listaPersonas.addAtIndex2(3, persona4); // lista: [Sofia, Martin, Carolina, Jose]
        listaPersonas.addEnd2(persona5);        // lista: [Sofia, Martin, Carolina, Jose, Felipe]
        listaPersonas.addEnd2(persona6);        // lista: [Sofia, Martin, Carolina, Jose, Felipe, Esteban]

        System.out.println(listaPersonas.obtenercantidadNumerosPar(listaPersonas));

        //System.out.println(listaPersonas.toString2());


    }
}
