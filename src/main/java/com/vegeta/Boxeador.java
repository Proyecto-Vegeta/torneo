package com.vegeta;

public class Boxeador extends Luchador {
    public Boxeador(String nombre) {
        super(nombre);

    }

    @Override
    public int getTipo() {
        return 1;
    }

    @Override
    public int pelear(){
        return 2*getFuerza()+getresistencia();

    }

}