package com.conversordemonedas;

// Clase principal
import java.util.Scanner;

public class ConversorDeMonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MonedaService monedaService = new MonedaService();
        Conversor conversor = new Conversor();

        boolean continuar = true;

        while (continuar) {
            Menu.mostrarMenuPrincipal();
            int opcion = Utilidades.leerEntero(scanner);

            switch (opcion) {
                case 1 -> {
                    System.out.println("Seleccionaste: Consultar tasas de cambio");
                    var conversionRates = monedaService.obtenerTasasDeCambio();
                    if (conversionRates != null) {
                        Menu.mostrarOpcionesMonedas(scanner, conversionRates);
                    }
                }
                case 2 -> {
                    System.out.println("Seleccionaste: Convertir monto entre monedas");
                    var conversionRates = monedaService.obtenerTasasDeCambio();
                    if (conversionRates != null) {
                        conversor.convertirMoneda(scanner, conversionRates);
                    }
                }
                case 3 -> {
                    continuar = false;
                    System.out.println("Gracias por usar el conversor de monedas. ¡Hasta luego!");
                }
                default -> System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        scanner.close();
    }
}
