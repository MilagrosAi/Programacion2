/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("BT-5000", 5000);
        Usuario usuario = new Usuario("Milagros", "12345678");
        Celular celular = new Celular("IMEI123", "Iphone", "13promax", bateria, usuario);

        System.out.println("Usuario: " + usuario.getCelular().getUsuario());
        System.out.println("Modelo Celular: " + celular.getModelo());
        System.out.println("Bateria: " + celular.getBateria().getModelo() + " - " + celular.getBateria().getCapacidad() + "mAh");
    }
}
