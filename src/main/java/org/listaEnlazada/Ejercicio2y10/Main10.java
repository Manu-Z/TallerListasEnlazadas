package org.listaEnlazada.Ejercicio2y10;

public class Main10 {

    public static void main(String[] args) {


        /// Ejercicio 10
        ListaEnlazadaSimple2<String> listaColores = new ListaEnlazadaSimple2<>();
        ListaEnlazadaSimple2<String> listaNombres = new ListaEnlazadaSimple2<>();

        listaColores.addEnd2("Azul");
        listaColores.addEnd2("Rojo");
        listaColores.addEnd2("Morado");
        listaNombres.addEnd2("Santiago");
        listaNombres.addEnd2("Leydi");
        listaNombres.addEnd2("Martin");

       ListaEnlazadaSimple2<String> listaCompleta = ListaEnlazadaSimple2.concatenarDosListasEnlazadasSimples(listaColores,listaNombres);
        System.out.println(listaCompleta.toString2());

    }
}
