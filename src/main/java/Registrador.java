import java.util.Scanner;

public class Registrador {
    public void registrar () {
        boolean error = false;
        Scanner scanner = new Scanner(System.in);
        Validador val = new Validador();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        do {
            System.out.println("Tipo: ");
            System.out.println("1.- Boxeador ");
            System.out.println("2.- Yudoka ");
            System.out.println("3.- Tirador ");
            System.out.println("");
            System.out.print("Opcion: ");
            String tipo = scanner.nextLine();
            error = val.buscarError(tipo, 3);
        } while (error);
        do {
            System.out.print("Fuerza (1..10): ");
            String fuerza = scanner.nextLine();
            error = val.buscarError(fuerza, 10);
        } while (error);
        do {
            System.out.print("Resistencia (1..10): ");
            String resistencia = scanner.nextLine();
            error = val.buscarError(resistencia, 10);
        } while (error);
        do {
            System.out.print("Destreza (1..10): ");
            String destreza = scanner.nextLine();
            error = val.buscarError(destreza, 10);
        } while (error);
    }
}