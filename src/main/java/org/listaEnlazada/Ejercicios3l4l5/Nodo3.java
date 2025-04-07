package org.listaEnlazada.Ejercicios3l4l5;

public class Nodo3 {
    private int value3;
    private Nodo3 next3;

    public Nodo3(int value3){
        this.value3 = value3;
        this.next3 = null;
    }

    public void setValue3(int value3){
        this.value3 = value3;
    }

    public void setNext3(Nodo3 next3){
        this.next3 = next3;
    }

    public  int  getValue3() {
        return value3;
    }

    public Nodo3 getNext3() {
        return next3;
    }
}
