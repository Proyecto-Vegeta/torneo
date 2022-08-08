package com.vegeta;

import static java.lang.Integer.parseInt;

public class ValidadorMenu implements Validador {
    public boolean validar(String respuesta) {
        if (parseInt(respuesta) < 1 || parseInt(respuesta) > 6) {
            System.out.println("ERROR: Opcion invalida.");
            return false;
        }
        else return true;
    }
}