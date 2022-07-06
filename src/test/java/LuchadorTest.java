import org.junit.Assert;
import org.junit.Test;

public class LuchadorTest {
    @Test
    public void un_luchador_debe_tener_una_fuerza() {
        Luchador luchador = new Luchador("Forzudo");
        luchador.setFuerza(1);
        Assert.assertEquals(1, luchador.getFuerza());
    }

    @Test
    public void un_luchador_debe_tener_una_destreza() {
        Luchador luchador = new Luchador("Diestro");
        luchador.setDestreza(1);
        Assert.assertEquals(1, luchador.getDestreza());
    }
}
