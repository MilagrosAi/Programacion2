/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

/**
 * Interfaz para procesadores de pago.
 * Declara que procesarPago puede lanzar una excepción de pago (checked).
 */
public interface Pago {
    boolean procesarPago(double monto) throws PagoException;
}
