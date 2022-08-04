package com.vegeta;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BorrarLuchadores {
    Map<String, Luchador> listaluchadores = new HashMap<String, Luchador>();
    boolean error;
    Scanner scanner = new Scanner(System.in);

     {
        System.out.println("Nombre");
        String Nombre = scanner.nextLine();
        listaluchadores.remove(Nombre.toUpperCase());
    }
}

