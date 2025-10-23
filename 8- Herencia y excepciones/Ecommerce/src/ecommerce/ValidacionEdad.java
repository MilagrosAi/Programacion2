/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

/**
 * Clase con métodos para validar edad y demostrar lanzamiento/captura de excepción personalizada.
 */
public class ValidacionEdad {

    /**
     * Método que valida la edad y lanza la excepción personalizada si está fuera de rango.
     */
    public static void validarEdadConThrows(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad invalida: " + edad);
        }
        System.out.println("Edad valida: " + edad);
    }

    /**
     * Método que maneja internamente la excepción personalizada.
     */
    public static void validarEdadYSolicitar(int edad) {
        try {
            validarEdadConThrows(edad);
        } catch (EdadInvalidaException ex) {
            System.out.println("Error de validacion de edad: " + ex.getMessage());
        } finally {
            System.out.println("Proceso de validacion de edad finalizado.\n");
        }
    }
}

