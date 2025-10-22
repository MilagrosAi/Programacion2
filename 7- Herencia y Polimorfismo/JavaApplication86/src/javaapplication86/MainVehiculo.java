/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication86;

/**
 *
 * @author usuario
 */
public class MainVehiculo {
    public static void main(String[] args) {
        // Instanciar un auto y mostrar su información
        Auto miAuto = new Auto("Toyota", "Corolla", 4);
        miAuto.mostrarInfo();

        // Ejemplo de upcasting: tratar el auto como Vehiculo
        Vehiculo v = miAuto; // upcasting implícito
        v.mostrarInfo(); // se llama al método sobrescrito (polimorfismo)
    }
}

