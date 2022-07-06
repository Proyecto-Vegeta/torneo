import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

public class TorneoTest {

    @Test
    public void debe_crear_un_luchador_con_un_nombre() {
        Torneo torneo = new Torneo();
        Luchador luchador = torneo.nuevoLuchador("nombre");
        Assert.assertNotNull(luchador);
        Assert.assertEquals("nombre", luchador.getNombre());
    }

    @Test
    public void debe_listar_lucahdores_creados() {
        Torneo torneo = new Torneo();
        torneo.nuevoLuchador("luchador1");
        torneo.nuevoLuchador("luchador2");
        List<Luchador> lista = torneo.getLuchadores();
        Assert.assertNotNull(lista);
    }

    @Ignore
    @Test
    public void debe_devolver_un_lucahdor_creado() {
        Torneo torneo = new Torneo();
        torneo.nuevoLuchador("luchador1");
        torneo.nuevoLuchador("luchador2");
        Luchador luchador = torneo.getLuchador("lucahdor2");
    }
}
