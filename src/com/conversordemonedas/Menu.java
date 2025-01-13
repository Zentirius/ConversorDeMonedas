package com.conversordemonedas;

import com.google.gson.JsonObject;
import java.util.Scanner;

public class Menu {
    public static void mostrarMenuPrincipal() {
        System.out.println("\n==== Conversor de Monedas ====");
        System.out.println("1. Consultar tasas de cambio");
        System.out.println("2. Convertir monto entre monedas");
        System.out.println("3. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static void mostrarOpcionesMonedas(Scanner scanner, JsonObject conversionRates) {
        System.out.println("Ingresa las monedas a consultar separadas por comas (ejemplo: USD,EUR,JPY):");
        scanner.nextLine(); // Consumir línea
        String input = scanner.nextLine();
        String[] monedas = input.split(",");

        for (String moneda : monedas) {
            moneda = moneda.trim().toUpperCase();
            if (conversionRates.has(moneda)) {
                System.out.println(moneda + ": " + conversionRates.get(moneda).getAsDouble());
            } else {
                System.out.println(moneda + ": No disponible.");
            }
        }
    }
}
