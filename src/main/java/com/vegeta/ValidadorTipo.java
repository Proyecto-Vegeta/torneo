package com.vegeta;

import static java.lang.Integer.parseInt;

public class ValidadorTipo implements Validador {
    public boolean validar(String respuesta) {
        if (parseInt(respuesta) < 1 || parseInt(respuesta) > 3) {
            System.out.println("ERROR: Tipo invalido.");
            return false;
        }
        else return true;
    }
}