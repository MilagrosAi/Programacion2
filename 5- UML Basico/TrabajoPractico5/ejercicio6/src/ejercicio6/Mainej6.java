/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author usuario
 */
public class MainEj6 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Milagros Airalde", "9999333999");
        Mesa mesa = new Mesa(12, 4);
        Reserva reserva = new Reserva("2025-09-25", "23:00", cliente, mesa);

        System.out.println("Reserva de: " + reserva.getCliente().getNombre());
        System.out.println("Mesa Numero: " + reserva.getMesa().getNumero());
    }
}

