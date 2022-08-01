package com.vegeta;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        CLI cli = new CLI(System.in, System.out);
        Torneo torneo = new Torneo();
        String opcion = "0";

        do {
            cli.imprimir("Seleccione una opcion:/n");
            cli.imprimir("1. Registrar nuevo luchador/n");
            cli.imprimir("2. Listar luchadores/n");
            cli.imprimir("3. Borrar luchador/n");
            cli.imprimir("4. Salir/n");
            cli.imprimir("5. Pelear/n");
            cli.imprimir("6. Torneo/n/n");
            opcion = cli.preguntar("Opcion: ", new Validador());
        } while (parseInt(opcion) != 4);

        if (parseInt(opcion)==1) {
            String nombre = cli.preguntar("Nombre del luchador:", new Validador());
            torneo.nuevoLuchador(nombre);
            cli.imprimir("Nuevo luchador:" + torneo.getLuchador(nombre).getNombre());
        }
    }
}