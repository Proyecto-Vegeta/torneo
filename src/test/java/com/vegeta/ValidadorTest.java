package com.vegeta;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidadorTest {
    @Test
    public void debe_no_ser_vacio() {
        Validador validador = new ValidadorNumerico(10);
        assertFalse(validador.validar(""));
    }
    @Test
    public void debe_no_ser_un_nombre_vacio() {
        Validador validador = new ValidadorNombre();
        assertFalse(validador.validar(""));
    }
    @Test
    public void debe_tener_un_nombre() {
        Validador validador = new ValidadorNombre();
        assertTrue(validador.validar("Leonardo"));
    }
    @Test
    public void no_debe_ser_un_nombre_muy_largo() {
        Validador validador = new ValidadorNombre();
        assertFalse(validador.validar("Leonardo el amo de la destruccion"));
    }
    @Test
    public void debe_no_ser_menor_que_1() {
        Validador validador = new ValidadorNumerico(10);
        assertFalse(validador.validar("0"));
    }
    @Test
    public void debe_no_ser_mayor_que_el_maximo() {
        Validador validador = new ValidadorNumerico(10);
        assertFalse(validador.validar("11"));
    }
    @Test
    public void debe_ser_entre_1_y_el_maximo() {
        Validador validador = new ValidadorNumerico(10);
        assertTrue(validador.validar("5"));
    }
}