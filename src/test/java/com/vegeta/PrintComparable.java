package com.vegeta;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintComparable extends OutputStream {
    private List<Integer> array = new ArrayList<>();
    @Override
    public void write(int b) throws IOException {
        array.add(b);
    }

    public String impreso() {
        return null;
    }
}