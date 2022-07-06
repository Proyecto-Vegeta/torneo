public class Main {

    public static void main(String[] args) {
        CLI cli = new CLI();
        Torneo torneo = new Torneo();

        cli.imprimir("Torneo");
        String nombre = cli.preguntar("Nombre del luchador:", new Validador());
        torneo.nuevoLuchador(nombre);
        cli.imprimir("Nuevo luchador:" + torneo.getLuchador(nombre).getNombre());
    }
}
