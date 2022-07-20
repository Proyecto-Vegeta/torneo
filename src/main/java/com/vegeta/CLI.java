package com.vegeta;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CLI {

    private final PrintStream out;
    private final Scanner scanner;

    public void imprimir(String texto) {
        out.println(texto);
    }

    public CLI(InputStream in, PrintStream out) {
        this.scanner = new Scanner(in);
        this.out = out;
    }

    public String preguntar(String texto, Validador validador) {
        String respuesta;
        do {
            imprimir(texto);
            respuesta = scanner.nextLine();
        } while(!validador.validar(respuesta));
        return respuesta;
    }
}
