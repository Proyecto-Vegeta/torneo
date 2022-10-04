package com.vegeta;

import static java.lang.Integer.parseInt;

public class ValidadorNumerico implements Validador {
    private final int valMax;

    public ValidadorNumerico(int valMax) {
        this.valMax=valMax;
    }

    public boolean validar(String respuesta) {
        try {
            if (parseInt(respuesta) < 1 || parseInt(respuesta) > valMax) {
                System.out.println("ERROR: Numero invalido.");
                return false;
            } else return true;
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Ingrese un numero");
            return false;
        }
    }
}