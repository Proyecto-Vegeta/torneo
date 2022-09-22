package com.vegeta;

import org.junit.Assert;
import org.junit.Test;

public class ValidadorTest {
    @Test
    public void debe_comprobar_que_no_es_null() {
        Validador validador = new Validador();
        Boolean respuesta = validador.validar(null);
        Assert.assertFalse(respuesta);
    }

    @Test
    public void debe_comprobar_que_no_esta_vacio() {
        Validador validador = new Validador();
        Boolean respuesta = validador.validar("");
        Assert.assertFalse(respuesta);
    }

    @Test
    public void debe_comprobar_que_es_un_numero() {
        Validador validador = new Validador();
        Boolean respuesta = validador.validar("1");
        Assert.assertTrue(respuesta);
    }

    @Test
    public void debe_validar_numero_del_1_al_6() {

    }
}
