package com.vegeta;

import org.junit.Test;

import java.io.InputStream;
import java.io.PrintStream;

public class CLITest {

    private InputStream in;
    private PrintStream out;

    @Test
    public void debe_imprimir_algo() {
        CLI cli = new CLI(in, out);
    }
}
