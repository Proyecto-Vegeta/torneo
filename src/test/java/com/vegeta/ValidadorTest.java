package com.vegeta;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidadorTest {
    @Test
    public void debe_no_elegir_una_opcion_vacia() {
        Validador validador = new ValidadorMenu();
        assertFalse(validador.validar(""));
    }
    @Test
    public void debe_no_poner_letras() {
        Validador validador = new ValidadorMenu();
        assertFalse(validador.validar("A"));
    }
    @Test
    public void debe_no_elegir_una_opcion_menor_que_1() {
        Validador validador = new ValidadorMenu();
        assertFalse(validador.validar("0"));
    }
    @Test
    public void debe_no_elegir_una_opcion_mayor_que_6() {
        Validador validador = new ValidadorMenu();
        assertFalse(validador.validar("7"));
    }
    @Test
    public void debe_ser_una_opcion__entre_1_y_6() {
        Validador validador = new ValidadorMenu();
        assertTrue(validador.validar("3"));
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
    public void debe_no_ser_un_nombre_vacio() {
        Validador validador = new ValidadorNombre();
        assertFalse(validador.validar(""));
    }
    @Test
    public void debe_no_poner_un_tipo_vacio() {
        Validador validador = new ValidadorTipo();
        assertFalse(validador.validar(""));
    }
    @Test
    public void debe_no_poner_letras_en_el_tipo() {
        Validador validador = new ValidadorTipo();
        assertFalse(validador.validar("A"));
    }
    @Test
    public void debe_no_elegir_un_tipo_menor_que_1() {
        Validador validador = new ValidadorTipo();
        assertFalse(validador.validar("0"));
    }
    @Test
    public void debe_no_elegir_un_tipo_mayor_que_3() {
        Validador validador = new ValidadorTipo();
        assertFalse(validador.validar("4"));
    }
    @Test
    public void debe_ser_una_opcion__entre_1_y_3() {
        Validador validador = new ValidadorTipo();
        assertTrue(validador.validar("2"));
    }
    @Test
    public void debe_no_ser_vacio() {
        Validador validador = new ValidadorNumerico(10);
        assertFalse(validador.validar(""));
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
        assertTrue(validador.validar("6"));
    }
    @Test
    public void debe_ser_entre_1_y_el_valorMaximo6() {
        Validador validador = new ValidadorMenu();
        assertTrue(validador.validar("5"));
    }
    @Test
    public void debe_ser_entre_1_y_el_valorMaximo3() {
        Validador validador = new ValidadorTipo();
        assertTrue(validador.validar("3"));
    }
}