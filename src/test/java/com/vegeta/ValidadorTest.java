package com.vegeta;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidadorTest {

    @Test
    public void debe_comprobar_valor_menu(){
        Validador validador = new ValidadorMenu();
        Boolean respuesta = validador.validar("6");
        assertTrue(respuesta);
    }
    @Test
    public void debe_comprobar_valor_nombre(){
        Validador validador = new ValidadorNombre();
        Boolean respuesta = validador.validar("goku");
        assertTrue(respuesta);
    }
    @Test
    public void debe_comprobar_valor_numerico(){
        Validador validador = new ValidadorNumerico();
        Boolean respuesta = validador.validar("1");
        assertTrue(respuesta);
    }
        @Test
    public void debe_comprobar_valor_Tipo(){
        Validador validador = new ValidadorTipo();
        Boolean respuesta = validador.validar("3");
        assertTrue(respuesta);
    }
}
