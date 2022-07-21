package com.vegeta;

public class Boxeador extends Luchador{
    public Boxeador(String nombre) {
        super(nombre);

    }
        @Override
    public int getTipo() {
        return 1;
    }
}
