package com.vegeta;

public class Tirador extends Luchador{
    public Tirador(String nombre) {
        super(nombre);

    }

    @Override
    public int getTipo() {
        return 3;
    }
}
