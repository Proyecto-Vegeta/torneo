import java.util.Scanner;

public class Registrador {
    public Luchador registrar () {
        boolean error = false;
        Scanner scanner = new Scanner(System.in);
        ValidadorStrings valStr = new ValidadorStrings();
        ValidadorEnteros valInt = new ValidadorEnteros();
        Luchador nuevoLuchador = new Luchador();
        do {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            error = valStr.buscarError(nombre, 21)
            nuevoLuchador.nombre = nombre;
        } while (!error);
        do {
            System.out.println("Tipo: ");
            System.out.println("1.- Boxeador ");
            System.out.println("2.- Yudoka ");
            System.out.println("3.- Tirador ");
            System.out.println("");
            System.out.print("Opcion: ");
            String tipo = scanner.nextLine();
            error = valInt.buscarError(tipo, 3);
            if (!error) {
                nuevoLuchador.tipo = Integer.parseInt(tipo);
            }
        } while (error);
        do {
            System.out.print("Fuerza (1..10): ");
            String fuerza = scanner.nextLine();
            error = valInt.buscarError(fuerza, 10);
            if (!error) {
                nuevoLuchador.fuerza = Integer.parseInt(fuerza);
            }
        } while (error);
        do {
            System.out.print("Resistencia (1..10): ");
            String resistencia = scanner.nextLine();
            error = valInt.buscarError(resistencia, 10);
            if (!error) {
                nuevoLuchador.resistencia = Integer.parseInt(resistencia);
            }
        } while (error);
        do {
            System.out.print("Destreza (1..10): ");
            String destreza = scanner.nextLine();
            error = valInt.buscarError(destreza, 10);
            if (!error) {
                nuevoLuchador.destreza = Integer.parseInt(destreza);
            }
        } while (error);
        return nuevoLuchador;
    }
}