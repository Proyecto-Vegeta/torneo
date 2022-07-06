import java.util.ArrayList;
import java.util.List;

public class Torneo {
    private List<Luchador> luchadores = new ArrayList<>();

    public Luchador nuevoLuchador(String nombre) {
        return new Luchador(nombre);
    }

    public List<Luchador> getLuchadores() {
        return luchadores;
    }

    public Luchador getLuchador(String nombre) {
        return luchadores.get(nombre);
    }
}
