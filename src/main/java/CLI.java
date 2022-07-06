import java.util.Scanner;

public class CLI {

    private Scanner scanner = new Scanner(System.in);

    public void imprimir(String texto) {
        System.out.println(texto);
    }

    public String preguntar(String texto, Validador validador) {
        String respuesta;
        do {
            imprimir(texto);
            respuesta = scanner.nextLine();
        } while(!validador.validar(respuesta));
        return respuesta;
    }
}
