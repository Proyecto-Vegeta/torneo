package com.vegeta;

public class Main {

    public static void main(String[] args) {
        CLI cli = new CLI(System.in, System.out);
        Torneo torneo = new Torneo();

        cli.imprimir("com.vegeta.Torneo");
        String nombre = cli.preguntar("Nombre del luchador:", new Validador());
        torneo.nuevoLuchador(nombre);
        cli.imprimir("Nuevo luchador:" + torneo.getLuchador(nombre).getNombre());

    }
}
