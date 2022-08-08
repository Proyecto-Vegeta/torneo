package com.vegeta;

import org.junit.Test;

import static java.lang.Integer.parseInt;

public class ValidadorTest {

    @Test
    public void debe_validar_nombre() {
        String nombre = "Leonardo";
        if (nombre.isBlank()) {
            System.out.println("ERROR: El luchador debe tener un nombre.");
        }
        if (nombre.length() > 21) {
            System.out.println("ERROR: El nombre del luchador es demasiado largo.");
        }
    }

    @Test
    public void debe_validar_numero() {
        int valorMaximo=10;
        String numero = "1";
        if (parseInt(numero) < 1|| parseInt(numero) > valorMaximo) {
            System.out.println("ERROR: Numero invalido.");
        }
    }
}