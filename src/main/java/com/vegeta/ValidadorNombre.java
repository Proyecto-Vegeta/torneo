package com.vegeta;

public class ValidadorNombre implements Validador {
    public boolean validar(String respuesta) {
        if (respuesta.isBlank()) {
            System.out.println("ERROR: El luchador debe tener un nombre.");
            return false;
        }
        if (respuesta.length() > 21) {
            System.out.println("ERROR: El nombre del luchador es demasiado largo.");
            return false;
        }
        return true;
    }
}