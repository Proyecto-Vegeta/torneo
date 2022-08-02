package com.vegeta;

public class Pelea {

    public int enfrentar(Luchador luchador1, Luchador luchador2) {
        int ganador = 0;

        if (luchador1.pelear() > luchador2.pelear()) {
            System.out.println("gana "+ luchador1.getNombre());
            ganador = 1;
        }
        if (luchador1.pelear() < luchador2.pelear()) {
            System.out.println("gano "+ luchador2.getNombre());
            ganador = 2;
        }
        if (luchador1.pelear() == luchador2.pelear()) {
            System.out.println("empate");
            ganador = 0;
        }
        return ganador;
    }
}



