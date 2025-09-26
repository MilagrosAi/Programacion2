/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author usuario
 */
public class MainEj7 {
    public static void main(String[] args) {
        Motor motor = new Motor("V8", "MTR12345");
        Conductor conductor = new Conductor("Milagros Airalde", "LICencia4444");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Ford Mustang", motor, conductor);

        System.out.println("Vehiculo: " + " - Patente: " + vehiculo.getPatente());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo());
        System.out.println("Conductor: " + vehiculo.getConductor().getNombre());
    }
}

