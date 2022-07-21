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
}
