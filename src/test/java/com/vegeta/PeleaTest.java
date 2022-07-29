package com.vegeta;

import org.junit.Assert;
import org.junit.Test;


public class PeleaTest {
    @Test
    public void debe_crear_una_pelea() {
        Pelea pelea = new Pelea();

    }

    @Test
    public void debe_recibir_luchadores() {
        Boxeador boxeador = new Boxeador("boxear");
        Tirador tirador = new Tirador("tirar");
        Assert.assertEquals("boxear", boxeador.getNombre());
        Assert.assertEquals("tirar", tirador.getNombre());

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
    public void debe_comparar_puntajes() {
        Boxeador boxeador = new Boxeador("boxear");
        boxeador.setFuerza(1);
        boxeador.setresistencia(1);
        boxeador.setDestreza(1);
        Tirador tirador = new Tirador("tirar");
        tirador.setFuerza(1);
        tirador.setresistencia(1);
        tirador.setDestreza(1);
        if (boxeador.pelear()> tirador.pelear()) {
            System.out.println("gano boxeador");}
        if (boxeador.pelear()< tirador.pelear()){
            System.out.println("gano el tirador");}
        if (boxeador.pelear()== tirador.pelear()){
            System.out.println("empate");}
        }

    }


