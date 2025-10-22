/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author usuario
 */
public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo); // inicializa la parte Vehiculo
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        // sobrescribimos para dar información completa del auto
        System.out.printf("Auto - Marca: %s, Modelo: %s, Puertas: %d%n",
                marca, modelo, cantidadPuertas);
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
}
