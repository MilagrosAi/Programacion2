/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

/**
 * Implementación simple de PayPal (sin descuento).
 */
public class Paypal implements Pago {
    private String cuenta;

    public Paypal(String cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public boolean procesarPago(double monto) throws PagoException {
        if (monto <= 0) {
            throw new PagoException("Monto invalido para PayPal: " + monto);
        }
        // simulamos verificación de cuenta
        if (cuenta == null || cuenta.isEmpty()) {
            throw new PagoException("Cuenta de PayPal invalida.");
        }
        System.out.println("Pago con PayPal aprobado para cuenta " + cuenta + ". Monto: $" + monto);
        return true;
    }
}
