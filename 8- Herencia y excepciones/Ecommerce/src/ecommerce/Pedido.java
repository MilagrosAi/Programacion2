/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

import java.util.ArrayList;
import java.util.List;

/**
 * Pedido que contiene productos, conoce al cliente y puede notificarle
 * cuando cambia de estado. Implementa Pagable sumando los productos.
 */
public class Pedido implements Pagable {
    private String id;
    private Cliente cliente;
    private List<Producto> productos;
    private String estado;

    public Pedido(String id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = "CREADO";
    }

    public String getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public String getEstado() {
        return estado;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        // Notificamos al cliente con concatenación simple (no String.format).
        cliente.notificar("Pedido " + id + " cambio a estado: " + nuevoEstado);
    }

    @Override
    public String toString() {
        return "Pedido " + id + " - Cliente: " + cliente.getNombre() + " - Estado: " + estado;
    }
}
