/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculo;

/**
 *
 * @author usuario
 */
public class MainVehiculo {
    public static void main(String[] args) {
        
        Auto miAuto = new Auto("Toyota", "Corolla", 4);
        miAuto.mostrarInfo();

        // Ejemplo de upcasting: tratar el auto como Vehiculo
        Vehiculo v = miAuto; 
        v.mostrarInfo(); // se llama al método sobrescrito (polimorfismo)
    }
}

