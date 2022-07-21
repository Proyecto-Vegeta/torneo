package com.vegeta;

public class Yudoka extends Luchador{
    public Yudoka(String nombre) {
        super(nombre);
    }

    @Override
    public int getTipo() {
        return 2;
    }
}