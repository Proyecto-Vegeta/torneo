package com.vegeta;

public class Yudoka extends Luchador{
    public Yudoka(String nombre) {
        super(nombre);
    }

    @Override
    public int getTipo() {
        return 2;
    }
    @Override
    public int pelear(){
        return 2*getresistencia()+getDestreza();

    }
        }
