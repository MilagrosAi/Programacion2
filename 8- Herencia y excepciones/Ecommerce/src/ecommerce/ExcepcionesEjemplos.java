/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase que muestra ejemplos prácticos de manejo de excepciones:
 * - División segura (ArithmeticException)
 * - Conversión de String a int (NumberFormatException)
 * - Lectura de archivo con try-with-resources (FileNotFoundException / IOException)
 * - Excepción personalizada EdadInvalidaException
 */
public class ExcepcionesEjemplos {

    public static void divisionSegura(int a, int b) {
        try {
            int resultado = a / b;
            System.out.println("Resultado de " + a + " / " + b + " = " + resultado);
        } catch (ArithmeticException ex) {
            System.out.println("Error: division por cero. Detalle: " + ex.getMessage());
        } finally {
            System.out.println("Operacion division finalizada.\n");
        }
    }

    public static void conversionSegura(String texto) {
        try {
            int valor = Integer.parseInt(texto);
            System.out.println("Conversion exitosa: " + valor);
        } catch (NumberFormatException ex) {
            System.out.println("Error: el texto no es un numero valido. Texto: '" + texto + "'.");
        } finally {
            System.out.println("Operacion conversion finalizada.\n");
        }
    }

    public static void lecturaArchivo(String ruta) {
        // try-with-resources libera automáticamente el recurso.
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            System.out.println("Contenido del archivo " + ruta + ":");
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException ex) {
            System.out.println("No se pudo leer el archivo '" + ruta + "'. Detalle: " + ex.getMessage());
        } finally {
            System.out.println("Intento de lectura de archivo finalizado.\n");
        }
    }

    public static void validarEdad(int edad) {
        try {
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad invalida: " + edad);
            }
            System.out.println("Edad valida: " + edad);
        } catch (EdadInvalidaException ex) {
            System.out.println("Error de validacion: " + ex.getMessage());
        } finally {
            System.out.println("Validacion de edad finalizada.\n");
        }
    }

    // Método que ejecuta todos los ejemplos para demostración
    public static void demoAll() {
        System.out.println("== Demo: Division segura ==");
        divisionSegura(10, 2);
        divisionSegura(10, 0);

        System.out.println("== Demo: Conversion segura ==");
        conversionSegura("123");
        conversionSegura("abc");

        System.out.println("== Demo: Lectura de archivo (try-with-resources) ==");
        // Coloca un archivo "test.txt" en la raíz del proyecto o prueba con una ruta válida.
        lecturaArchivo("test.txt");

        System.out.println("== Demo: Edad invalida personalizada ==");
        validarEdad(25);
        validarEdad(-5);
        validarEdad(200);
    }
}
