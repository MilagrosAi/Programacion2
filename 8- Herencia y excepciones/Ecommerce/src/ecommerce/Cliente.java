/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

/**
 * Cliente que implementa Notificable para recibir mensajes.
 */
public class Cliente implements Notificable {
    private String nombre;
    private String email; // opcional para futuras mejoras

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void notificar(String mensaje) {
        // Simple impresión por consola; se podría extender para enviar mail.
        System.out.println("Notificacion para " + nombre + ": " + mensaje);
    }
}
