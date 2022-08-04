package com.vegeta;

import org.junit.Assert;
import org.junit.Test;

public class BorrarLuchadorTest {

    @Test
    public void debe_borrar_un_luchador() {
        BorrarLuchadores borrar = new BorrarLuchadores();
        Luchador luchador = new Tirador("Nombre");
        Assert.assertEquals("Nombre", (luchador.getNombre()));
    }
}