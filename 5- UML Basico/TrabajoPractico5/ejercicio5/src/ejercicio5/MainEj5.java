/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author usuario
 */
public class MainEj5 {
    public static void main(String[] args) {
        
        Propietario propietario = new Propietario("Milagros Airalde", "911118888");
        Computadora computadora = new Computadora("Dell", "SN12345", "ASUS ", "Intel Z690", propietario);

        System.out.println("Propietario: " + propietario.getNombre());
        System.out.println("Computadora: " + computadora.getMarca());
        System.out.println("Placa Madre: " + computadora.getPlacaMadre().getModelo());
    }
}

