package com.vegeta;

public class Validador {
    public boolean validar(String respuesta) {
        try {
            Integer.parseInt(respuesta);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}