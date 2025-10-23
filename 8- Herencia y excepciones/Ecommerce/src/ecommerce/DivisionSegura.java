/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

/**
 * Métodos para realizar divisiones de forma segura.
 */
public class DivisionSegura {

    /**
     * Realiza la división manejando la excepción internamente.
     */
    public static void dividirYSolicitar(int a, int b) {
        try {
            int resultado = a / b;
            System.out.println(a + " dividido " + b + " = " + resultado);
        } catch (ArithmeticException ex) {
            System.out.println("Error: division por cero. Detalle: " + ex.getMessage());
        } finally {
            System.out.println("Finalizo intento de division.\n");
        }
    }

    /**
     * Método que delega la excepción al llamador (checked/un-checked en este caso es unchecked).
     * Se usa cuando queremos que la capa superior decida qué hacer.
     */
    public static int dividirConThrows(int a, int b) throws ArithmeticException {
        return a / b; // si b == 0 lanzará ArithmeticException
    }
}
