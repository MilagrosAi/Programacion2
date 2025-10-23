/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase main que demuestra los ejercicios de la Parte 2:
 * - División segura (try-catch y throws)
 * - Conversión segura (try-catch y throws)
 * - Lectura de archivo (try-with-resources, manejo y propagación)
 * - Excepción personalizada EdadInvalidaException (throws y captura)
 *
 * Incluye una pequeña interactividad con Scanner para que pruebes diferentes entradas.
 */
public class Parte2Main {

    public static void main(String[] args) {
        System.out.println("=== Parte 2: Ejercicios de Excepciones ===\n");

        // --- División segura (demostración no interactiva) ---
        System.out.println("-> División segura (manejada internamente):");
        DivisionSegura.dividirYSolicitar(10, 2);
        DivisionSegura.dividirYSolicitar(10, 0);

        System.out.println("-> División con throws (propaga ArithmeticException):");
        try {
            int r = DivisionSegura.dividirConThrows(20, 4);
            System.out.println("Resultado: " + r);
            // Forzamos excepción:
            r = DivisionSegura.dividirConThrows(5, 0);
            System.out.println("Resultado: " + r);
        } catch (ArithmeticException ex) {
            System.out.println("Capturado en main: división por cero. Detalle: " + ex.getMessage());
        } finally {
            System.out.println("Finalizo sección division con throws.\n");
        }

        // --- Conversión ---
        System.out.println("-> Conversion segura (manejada internamente):");
        ConversionSegura.convertirYSolicitar("123");
        ConversionSegura.convertirYSolicitar("no-es-numero");

        System.out.println("-> Conversion con throws (propaga NumberFormatException):");
        try {
            int val = ConversionSegura.convertirConThrows("456");
            System.out.println("Valor convertido: " + val);
            // Forzar excepción:
            val = ConversionSegura.convertirConThrows("x789");
            System.out.println("Valor convertido: " + val);
        } catch (NumberFormatException ex) {
            System.out.println("Capturado en main: formato invalido. Detalle: " + ex.getMessage());
        } finally {
            System.out.println("Finalizo seccion conversion con throws.\n");
        }

        // --- Lectura de archivo ---
        System.out.println("-> Lectura de archivo (try-with-resources, manejo interno):");
        LecturaArchivo.lecturaSegura("test.txt"); // si no existe, veremos el manejo

        System.out.println("-> Lectura de archivo con propagación (leerYPropagar):");
        try {
            LecturaArchivo.leerYPropagar("test.txt");
        } catch (IOException ex) {
            System.out.println("IOException capturada en main al leer archivo: " + ex.getMessage());
        } finally {
            System.out.println("Finalizó sección lectura con propagación.\n");
        }

        // --- Excepción personalizada: EdadInvalidaException ---
        System.out.println("-> Validación de edad (manejo interno):");
        ValidacionEdad.validarEdadYSolicitar(30);
        ValidacionEdad.validarEdadYSolicitar(-10);
        ValidacionEdad.validarEdadYSolicitar(999);

        System.out.println("-> Validación con throws (propaga EdadInvalidaException):");
        try {
            ValidacionEdad.validarEdadConThrows(25);
            ValidacionEdad.validarEdadConThrows(-3);
        } catch (EdadInvalidaException ex) {
            System.out.println("Capturado en main: " + ex.getMessage());
        } finally {
            System.out.println("Finalizó sección validación de edad con throws.\n");
        }

        // --- Ejemplo interactivo simple (Scanner) ---
        System.out.println("-> Ahora probá entradas interactiva (división y conversión). Escribí 'salir' para terminar.");
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("Escribí 'div' para dividir, 'conv' para convertir, 'edad' para validar edad, 'salir' para terminar: ");
                String comando = sc.next();
                if ("salir".equalsIgnoreCase(comando)) {
                    System.out.println("Saliendo de la demo interactiva.");
                    break;
                }
                try {
                    if ("div".equalsIgnoreCase(comando)) {
                        System.out.print("Ingresá dividendo (int): ");
                        int a = sc.nextInt();
                        System.out.print("Ingresá divisor (int): ");
                        int b = sc.nextInt();
                        // usamos dividirConThrows para demostrar captura aquí
                        try {
                            int res = DivisionSegura.dividirConThrows(a, b);
                            System.out.println("Resultado: " + res);
                        } catch (ArithmeticException ex) {
                            System.out.println("No se puede dividir por cero. Detalle: " + ex.getMessage());
                        }
                    } else if ("conv".equalsIgnoreCase(comando)) {
                        System.out.print("Ingresá texto para convertir a int: ");
                        String texto = sc.next();
                        try {
                            int v = ConversionSegura.convertirConThrows(texto);
                            System.out.println("Valor convertido: " + v);
                        } catch (NumberFormatException ex) {
                            System.out.println("Texto inválido para convertir: " + texto);
                        }
                    } else if ("edad".equalsIgnoreCase(comando)) {
                        System.out.print("Ingresá edad (int): ");
                        int edad = sc.nextInt();
                        try {
                            ValidacionEdad.validarEdadConThrows(edad);
                        } catch (EdadInvalidaException ex) {
                            System.out.println("Edad inválida: " + ex.getMessage());
                        }
                    } else {
                        System.out.println("Comando no reconocido: " + comando);
                    }
                } catch (InputMismatchException ime) {
                    System.out.println("Entrada inválida. Por favor ingresá valores correctos.");
                    sc.nextLine(); // limpiar buffer
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error en la demo interactiva: " + e.getMessage());
        }

        System.out.println("\n=== Fin Parte 2 Demo ===");
    }
}
