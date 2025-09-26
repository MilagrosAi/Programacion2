/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author usuario
 */
public class MainEj4 {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Nacion", "30-5656565-9");
        Cliente cliente = new Cliente("Milagros Airalde", "12345678");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "12/30", cliente, banco);

        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Tarjeta: " + tarjeta.getNumero());
        System.out.println("Banco: " + tarjeta.getBanco().getNombre());
    }
}
