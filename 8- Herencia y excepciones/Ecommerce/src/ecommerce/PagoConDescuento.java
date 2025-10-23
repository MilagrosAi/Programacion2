/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

/**
 * Interfaz que extiende Pago y añade la posibilidad de aplicar descuentos.
 * Aquí demostramos herencia entre interfaces y un default method.
 */
public interface PagoConDescuento extends Pago {
    // Default method aplicado desde la interfaz (permitido en Java 8+)
    default double aplicarDescuento(double porcentaje, double monto) {
        // porcentaje: 10 -> 10%
        return monto * (1 - porcentaje / 100.0);
    }
}
