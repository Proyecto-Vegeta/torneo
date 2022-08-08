package com.vegeta;

import static java.lang.Integer.parseInt;

public class ValidadorNumerico implements Validador {
    public boolean validar(String respuesta) {
        if (parseInt(respuesta) < 1 || parseInt(respuesta) > 10) {
            System.out.println("ERROR: Numero invalido.");
            return false;
        }
        else return true;
    }
}