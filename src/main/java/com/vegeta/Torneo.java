package com.vegeta;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Torneo {

    private final Map<String, Luchador> luchadores = new HashMap<>();

    public Luchador nuevoLuchador(String nombre) {
        Luchador luchador = new Yudoka(nombre);
        luchadores.put(nombre.toUpperCase(Locale.ROOT), luchador);
        return luchador;
    }

    public Map<String, Luchador> getLuchadores() {
        return luchadores;
    }

    public Luchador getLuchador(String nombre) {
        return luchadores.get(nombre.toUpperCase(Locale.ROOT));
    }

    public void borrarLuchador(String nombre) {
        luchadores.remove(nombre.toUpperCase(Locale.ROOT));
    }
}
