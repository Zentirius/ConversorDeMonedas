package com.conversordemonedas;

import com.google.gson.JsonObject;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Conversor {
    public void convertirMoneda(Scanner scanner, JsonObject conversionRates) {
        System.out.println("Ingresa la moneda de origen (ejemplo: USD):");
        String monedaOrigen = scanner.next().toUpperCase();
        System.out.println("Ingresa la moneda de destino (ejemplo: EUR):");
        String monedaDestino = scanner.next().toUpperCase();

        System.out.println("Ingresa el monto a convertir:");
        double monto = Utilidades.leerDouble(scanner);

        if (conversionRates.has(monedaOrigen) && conversionRates.has(monedaDestino)) {
            double tasaOrigen = conversionRates.get(monedaOrigen).getAsDouble();
            double tasaDestino = conversionRates.get(monedaDestino).getAsDouble();
            double montoConvertido = monto / tasaOrigen * tasaDestino;

            // Formatear el resultado a 2 decimales
            DecimalFormat formato = new DecimalFormat("#,##0.00");
            String resultadoFormateado = formato.format(montoConvertido);

            System.out.println("El monto convertido es: " + resultadoFormateado + " " + monedaDestino);
        } else {
            System.out.println("Una o ambas monedas no están disponibles.");
        }
    }
}

