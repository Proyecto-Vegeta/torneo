package com.vegeta;

import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;


import java.util.Map;

public class TorneoTest {

    @Test
    public void debe_crear_un_luchador_con_un_nombre() {
        Torneo torneo = new Torneo();
        Luchador luchador = torneo.nuevoLuchador("nombre");
        assertNotNull(luchador);
        assertEquals("nombre", luchador.getNombre());
    }

    @Test
    public void debe_listar_lucahdores_creados() {
        Torneo torneo = new Torneo();
        torneo.nuevoLuchador("luchador1");
        torneo.nuevoLuchador("luchador2");
        Map<String, Luchador> lista = torneo.getLuchadores();
        assertNotNull(lista);
    }

    @Ignore
    @Test
    public void debe_devolver_un_lucahdor_creado() {
        Torneo torneo = new Torneo();
        torneo.nuevoLuchador("luchador1");
        torneo.nuevoLuchador("luchador2");
        Luchador luchador = torneo.getLuchador("lucahdor2");
    }

    @Test
    public void debe_borrar_un_luchador() {
        Torneo torneo = new Torneo();
        torneo.nuevoLuchador("luchador1");
        torneo.nuevoLuchador("luchador2");
        torneo.borrarLuchador("luchador1");
        Map<String, Luchador> lista = torneo.getLuchadores();
        assertEquals(1, lista.size());
    }
}
