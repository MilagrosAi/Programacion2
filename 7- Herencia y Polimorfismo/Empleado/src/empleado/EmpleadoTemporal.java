/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author usuario
 */
public class EmpleadoTemporal extends Empleado {
    private double horasTrabajadas;
    private double valorHora;

    public EmpleadoTemporal(String id, String nombre, double horasTrabajadas, double valorHora) {
        super(id, nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }
}
