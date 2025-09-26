/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author usuario
 */
public class MainEj10 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Milagros Airalde");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Remera", 12));
        pedido.agregarProducto(new Producto("Jeans", 42));

        System.out.println("Cliente: " + pedido.getCliente().getNombre());
        System.out.println("Total del pedido: $" + pedido.calcularTotal());
    }
}
