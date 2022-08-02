package com.vegeta;

public abstract class Luchador implements Pelear {

    private final String nombre;
    private int fuerza;
    private int destreza;
    private int resistencia;

    public Luchador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract int getTipo();

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public void setresistencia(int resistencia) { this.resistencia = resistencia; }

    public int getresistencia() {return resistencia;}

    public abstract int pelear();
}

