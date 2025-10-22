/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author usuario
 */
public class EmpleadoPlanta extends Empleado {
    private double salarioBase;
    private double porcentajeAntiguedad; // por ejemplo 0.05 = 5%

    public EmpleadoPlanta(String id, String nombre, double salarioBase, double porcentajeAntiguedad) {
        super(id, nombre);
        this.salarioBase = salarioBase;
        this.porcentajeAntiguedad = porcentajeAntiguedad;
    }

    @Override
    public double calcularSueldo() {
        // sueldo = salario base + bonificación por antigüedad
        return salarioBase + (salarioBase * porcentajeAntiguedad);
    }
}
