package com.vegeta;

import com.google.common.primitives.Bytes;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintComparable extends OutputStream {
    private List<Byte> list = new ArrayList<>();
    @Override
    public void write(int b) throws IOException {
        list.add((byte)b);
    }

    public String impreso() {
        byte[] bytes = Bytes.toArray(list);
        return new String(bytes).replaceAll("(\\r|\\n)", "");
    }
}