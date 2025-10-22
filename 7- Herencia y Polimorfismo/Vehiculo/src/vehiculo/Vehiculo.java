/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author usuario
 */
public class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.printf("Vehículo - Marca: %s, Modelo: %s%n", marca, modelo);
    }

    @Override
    public String toString() {
        return String.format("Vehiculo[marca=%s, modelo=%s]", marca, modelo);
    }
}

