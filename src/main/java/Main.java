import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean error = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Torneo");
            System.out.println("1.- Agregar luchador");
            System.out.println("2.- Borrar luchador");
            System.out.println("3.- Listar luchadores");
            System.out.println("4.- Salir");
            System.out.println("");
            System.out.print("Opcion: ");
            String opcion = scanner.nextLine();
            Validador val = new Validador();
            error = val.buscarError(opcion, 4);
        } while (error);
    }
}