package org.listaEnlazada.Ejercicio6l7l8;

public class Persona2 {
    private String nombre2;
    private int cedula2;

    public Persona2(String nombre, int cedula) {
        this.nombre2 = nombre;
        this.cedula2 = cedula;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre2 + ", Cédula: " + cedula2;
    }


    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public int getCedula2() {
        return cedula2;
    }

    public void setCedula2(int cedula2) {
        this.cedula2 = cedula2;
    }
}
