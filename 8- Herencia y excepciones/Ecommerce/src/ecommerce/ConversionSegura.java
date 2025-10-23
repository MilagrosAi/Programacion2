/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

/**
 * Ejemplos de conversión de String a int con manejo de NumberFormatException.
 */
public class ConversionSegura {

    /**
     * Maneja la excepción internamente.
     */
    public static void convertirYSolicitar(String texto) {
        try {
            int valor = Integer.parseInt(texto);
            System.out.println("Conversion correcta: " + valor);
        } catch (NumberFormatException ex) {
            System.out.println("Error: el texto no es un numero valido. Texto recibido: '" + texto + "'.");
        } finally {
            System.out.println("Finalizo intento de conversion.\n");
        }
    }

    /**
     * Lanza NumberFormatException al llamador si el texto no es válido.
     */
    public static int convertirConThrows(String texto) throws NumberFormatException {
        return Integer.parseInt(texto);
    }
}
