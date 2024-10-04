package com.vegeta;

import org.junit.Assert;
import org.junit.Test;

public class LuchadorTest {
    @Test
    public void un_luchador_debe_tener_una_fuerza() {
        Luchador luchador = new Yudoka("Forzudo");
        luchador.setFuerza(1);
        Assert.assertEquals(1, luchador.getFuerza());
    }

    @Test
    public void un_luchador_debe_tener_una_destreza() {
        Luchador luchador = new Tirador("Diestro");
        luchador.setDestreza(1);
        Assert.assertEquals(1, luchador.getDestreza());
    }
    @Test
    public void un_luchador_debe_tener_una_resistencia() {
        Luchador luchador = new Boxeador("Duro");
        luchador.setresistencia(1);
        Assert.assertEquals(1, luchador.getresistencia());
    }

    @Test
    public void un_luchador_tipo_boxeador() {
        Boxeador boxeador = new Boxeador("Boxear");
        Assert.assertEquals(1, boxeador.getTipo());
    }
    @Test
    public void un_luchador_tipo_yudoka() {
        Yudoka yudoka = new Yudoka("Yudoka");
        Assert.assertEquals(2, yudoka.getTipo());
    }
    @Test
    public void un_luchador_tipo_tirador() {
        Tirador tirador = new Tirador("Tirador");
        Assert.assertEquals(3, tirador.getTipo());
    }
    @Test
    public void luchador_debe_dar_puntaje() {
        Boxeador boxeador = new Boxeador("boxear");
        boxeador.setFuerza(1);
        boxeador.setresistencia(1);
        boxeador.setDestreza(1);
        Assert.assertEquals(3, boxeador.pelear());
    }

    @Test
    public void un_luchador_tipo_capoeira() {
        Capoeira capoeira = new Capoeira("Chiquinha");
        capoeira.setFuerza(1);
        capoeira.setresistencia(1);
        capoeira.setDestreza(1);
        Assert.assertEquals(4, capoeira.getTipo());
    }

    @Test
    public void capoeira_debe_dar_puntaje() {
        Capoeira capoeira = new Capoeira("Miku");
        capoeira.setFuerza(1);
        capoeira.setresistencia(1);
        capoeira.setDestreza(1);
        Assert.assertEquals(3, capoeira.pelear());
    }

    @Test
    public void capoeira_debe_vencer_a_boxeador() {
        Luchador luchador1 = new Capoeira("Chun Li");
        luchador1.setFuerza(4);
        luchador1.setresistencia(8);
        luchador1.setDestreza(10);
        Luchador luchador2 = new Boxeador("Balrog");
        luchador2.setFuerza(10);
        luchador2.setresistencia(7);
        luchador2.setDestreza(7);
        Pelea pelea = new Pelea();
        Assert.assertEquals(1, pelea.enfrentar(luchador1, luchador2));
    }
    @Test
    public void capoeira_debe_perder_contra_yudoka() {
        Luchador luchador1 = new Capoeira("Chun Li");
        luchador1.setFuerza(4);
        luchador1.setresistencia(8);
        luchador1.setDestreza(10);
        Luchador luchador2 = new Yudoka("Ryu");
        luchador2.setFuerza(7);
        luchador2.setresistencia(10);
        luchador2.setDestreza(9);
        Pelea pelea = new Pelea();
        Assert.assertEquals(2, pelea.enfrentar(luchador1, luchador2));
    }
}
