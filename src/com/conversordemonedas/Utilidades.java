package com.conversordemonedas;

import java.util.Scanner;

public class Utilidades {
    public static int leerEntero(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Ingresa un número entero:");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static double leerDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Ingresa un número válido:");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
