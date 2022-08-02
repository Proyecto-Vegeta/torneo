package com.vegeta;


import org.junit.Assert;
import org.junit.Test;


public class PeleaTest {
    @Test
    public void debe_crear_una_pelea() {
        Pelea pelea = new Pelea();
        Luchador luchador1 = new Tirador("Tirar");
        luchador1.setFuerza(2);
        luchador1.setresistencia(1);
        luchador1.setDestreza(1);
        Luchador luchador2 = new Boxeador("Boxear");
        luchador2.setFuerza(1);
        luchador2.setresistencia(1);
        luchador2.setDestreza(1);
        Assert.assertEquals(1,pelea.enfrentar(luchador1, luchador2));


    }

}


