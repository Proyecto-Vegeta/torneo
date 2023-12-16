package com.vegeta.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class PeleaSteps {

    String Luchador1_nombre;
    int Luchador1_tipo;
    int Luchador1_fuerza;
    int Luchador1_resistencia;
    int Luchador1_destreza;
    int Luchador1_puntuacion;
    String Luchador2_nombre;
    int Luchador2_tipo;
    int Luchador2_fuerza;
    int Luchador2_resistencia;
    int Luchador2_destreza;
    int Luchador2_puntuacion;
    String Ganador;

    @Given("$Luchador1_nombre de tipo $Luchador1_tipo con estadisticas de $Luchador1_fuerza, $Luchador1_resistencia y $Luchador1_destreza y $Luchador2_nombre de tipo $Luchador2_tipo con estadisticas de $Luchador2_fuerza, $Luchador2_resistencia y $Luchador2_destreza")
    public void PresentarLuchadores(String Luchador1_nombre, int Luchador1_tipo, int Luchador1_fuerza, int Luchador1_resistencia, int Luchador1_destreza, String Luchador2_nombre, int Luchador2_tipo, int Luchador2_fuerza, int Luchador2_resistencia, int Luchador2_destreza) {
        if (Luchador1_tipo==1) {
            Luchador1_puntuacion = 2 * Luchador1_fuerza + Luchador1_resistencia;
        } else if (Luchador1_tipo==2) {
            Luchador1_puntuacion = 2 * Luchador1_resistencia + Luchador1_destreza;
        } else if (Luchador1_tipo==3) {
            Luchador1_puntuacion = 2 * Luchador1_destreza + Luchador1_fuerza;
        }
        if (Luchador2_tipo==1) {
            Luchador2_puntuacion = 2 * Luchador2_fuerza + Luchador2_resistencia;
        } else if (Luchador2_tipo==2) {
            Luchador2_puntuacion = 2 * Luchador2_resistencia + Luchador2_destreza;
        } else if (Luchador2_tipo==3) {
            Luchador2_puntuacion = 2 * Luchador2_destreza + Luchador2_fuerza;
        }
    }
    @When("$Luchador1_nombre con $Luchador1_puntuacion puntos pelea contra $Luchador2_nombre con $Luchador2_puntuacion puntos")
    public void LuchadoresPelean(String Luchador1_nombre, int Luchador1_puntuacion, String Luchador2_nombre, int Luchador2_puntuacion) {
        if (Luchador1_puntuacion>Luchador2_puntuacion) {
            Ganador = Luchador1_nombre;
        } else if (Luchador1_puntuacion<Luchador2_puntuacion) {
            Ganador = Luchador2_nombre;
        } else if (Luchador1_puntuacion==Luchador2_puntuacion) {
            Ganador = "Nadie";
        }
    }
    @Then("$Ganador gana")
    public void HayGanador(String Ganador_esperado) {
        Assert.assertEquals(Ganador_esperado, Ganador);
    }
}