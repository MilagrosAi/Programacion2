/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

/**
 * Implementación de PagoConDescuento (tarjeta con posibilidad de descuento).
 * Ejemplo sencillo: si monto < 0 -> PagoException; si monto > 10000 -> fallo por limite.
 */
public class TarjetaCredito implements PagoConDescuento {
    private String numero;
    private String titular;

    public TarjetaCredito(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    @Override
    public boolean procesarPago(double monto) throws PagoException {
        if (monto <= 0) {
            throw new PagoException("Monto invalido para procesar el pago: " + monto);
        }
        if (monto > 10000) {
            // simulamos un rechazo por límite
            throw new PagoException("Pago rechazado: excede el limite de la tarjeta.");
        }
        // Simular éxito
        System.out.println("Pago con Tarjeta aprobado para " + titular + ". Monto: $" + monto);
        return true;
    }
}
