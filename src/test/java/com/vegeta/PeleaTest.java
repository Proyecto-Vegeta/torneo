package com.vegeta;


import org.junit.Assert;
import org.junit.Test;


public class PeleaTest {
    @Test
    public void debe_crear_una_pelea_gana_el_1() {
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
    @Test
    public void debe_crear_una_pelea_gana_el_2() {
        Pelea pelea = new Pelea();
        Luchador luchador1 = new Tirador("Tirar");
        luchador1.setFuerza(2);
        luchador1.setresistencia(1);
        luchador1.setDestreza(1);
        Luchador luchador2 = new Boxeador("Boxear");
        luchador2.setFuerza(3);
        luchador2.setresistencia(3);
        luchador2.setDestreza(3);
        Assert.assertEquals(2,pelea.enfrentar(luchador1, luchador2));
        }
    @Test
    public void debe_crear_una_pelea_empate() {
        Pelea pelea = new Pelea();
        Luchador luchador1 = new Tirador("Tirar");
        luchador1.setFuerza(2);
        luchador1.setresistencia(2);
        luchador1.setDestreza(2);
        Luchador luchador2 = new Boxeador("Boxear");
        luchador2.setFuerza(2);
        luchador2.setresistencia(2);
        luchador2.setDestreza(2);
        Assert.assertEquals(0,pelea.enfrentar(luchador1, luchador2));
    }
}


