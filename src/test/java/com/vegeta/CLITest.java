package com.vegeta;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.InputStream;
import java.io.PrintStream;

public class CLITest {

    @Test
    public void debe_imprimir_algo() {
        InputStream in=System.in;
        PrintComparable pantalla = new PrintComparable();
        PrintStream out=new PrintStream(pantalla);
        CLI cli = new CLI(in, out);
        cli.imprimir("Menu principal:");
        assertEquals("Menu principal:", pantalla.impreso());
    }
}
