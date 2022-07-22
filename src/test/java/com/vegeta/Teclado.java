package com.vegeta;

import java.io.IOException;
import java.io.InputStream;

public class Teclado extends InputStream {

    int indice = 0;
    private byte[] bytes;

    public void escribir(String linea) {
        bytes = linea.getBytes();
    }

    @Override
    public int read() throws IOException {
        try {
            int respuesta = bytes[indice];
            indice = indice + 1;
            return respuesta;
        } catch (ArrayIndexOutOfBoundsException e) {
            return -1;
        }
    }
}
