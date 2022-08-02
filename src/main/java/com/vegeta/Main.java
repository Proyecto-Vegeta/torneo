package com.vegeta;

import static java.lang.Integer.parseInt;

public class Main {
    static Torneo torneo = new Torneo();
    static CLI cli = new CLI(System.in, System.out);
    public static void main(String[] args) {
        int opcion = menuPrincipal();
        if (opcion==1) {
            nuevoLuchador();
        }
    }

    public static int menuPrincipal() {
        String opcion;
        cli.imprimir("com.vegeta.Torneo");
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
        return parseInt (opcion);
    }

    public static void nuevoLuchador() {
        String nombre = cli.preguntar("Nombre del luchador:", new Validador());
        torneo.nuevoLuchador(nombre);
        cli.imprimir("Nuevo luchador:" + torneo.getLuchador(nombre).getNombre());
    }
}