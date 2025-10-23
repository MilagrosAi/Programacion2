/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecommerce;

/**
 * Clase main para demostrar todo el flujo:
 * - Creación de cliente, productos y pedido
 * - Cambio de estado y notificación al cliente
 * - Cálculo de total y procesamiento de pagos (Tarjeta / PayPal)
 * - Ejemplos de manejo de excepciones
 */
public class MainEcommerce {

    public static void main(String[] args) {
        // --- Creación de cliente y productos ---
        Cliente cliente = new Cliente("Airalde Milagros", "MilagrosPaypal@example.com");
        Producto p1 = new Producto("Camiseta", 1500.0);
        Producto p2 = new Producto("Auriculares", 8900.0);

        // --- Pedido ---
        Pedido pedido = new Pedido("P-001", cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        System.out.println("Creado: " + pedido);
        System.out.println("Productos del pedido:");
        for (Producto p : pedido.getProductos()) {
            System.out.println("- " + p);
        }

        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        // --- Cambio de estado y notificación ---
        pedido.cambiarEstado("EN_PREPARACION"); // notificará al cliente
        pedido.cambiarEstado("EN_CAMINO");

        // --- Intento de pago con TarjetaCredito (tiene descuento disponible) ---
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456", cliente.getNombre());
        try {
            double total = pedido.calcularTotal();
            // Aplicamos un descuento del 10% usando el default method de PagoConDescuento
            double conDescuento = tarjeta.aplicarDescuento(10, total);
            System.out.println("Total con descuento (10%): $" + conDescuento);

            boolean pagoOk = tarjeta.procesarPago(conDescuento);
            if (pagoOk) {
                pedido.cambiarEstado("PAGADO");
            }
        } catch (PagoException ex) {
            System.out.println("Error procesando pago con tarjeta: " + ex.getMessage());
        }

        // --- Intento de pago con PayPal (ejemplo alternativo) ---
        Paypal paypal = new Paypal("cuenta@paypal.com");
        try {
            boolean pagoOk = paypal.procesarPago(pedido.calcularTotal());
            if (pagoOk) {
                pedido.cambiarEstado("PAGADO_CON_PAYPAL");
            }
        } catch (PagoException ex) {
            System.out.println("Error procesando pago con PayPal: " + ex.getMessage());
        }

        // --- Ejecutar ejemplos de excepciones ---
        ExcepcionesEjemplos.demoAll();

        System.out.println("Fin del demo.");
    }
}

