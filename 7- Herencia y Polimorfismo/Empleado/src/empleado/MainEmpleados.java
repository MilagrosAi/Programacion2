/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleado;

/**
 *
 * @author usuario
 */
import java.util.ArrayList;
import java.util.List;

public class MainEmpleados {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("E001", "Milagros", 80000, 0.10)); // 10% antigüedad
        empleados.add(new EmpleadoTemporal("E002", "Luna", 80, 1200)); // 80 horas x 1200
        empleados.add(new EmpleadoPlanta("E003", "Sofia", 95000, 0.05));
        empleados.add(new EmpleadoTemporal("E004", "Gabriel", 40, 1500));

        // Invocar calcularSueldo polimórficamente y mostrar info
        for (Empleado e : empleados) {
            e.mostrarInfo();
        }

        System.out.println("\nClasificacion por tipo usando instanceof:");
        for (Empleado e : empleados) {
            if (e instanceof EmpleadoPlanta) {
                EmpleadoPlanta ep = (EmpleadoPlanta) e; // downcasting seguro
                System.out.printf("%s es Empleado de Planta (salario base aproximado: %.2f)%n",
                        ep.getNombre(), ep.calcularSueldo());
            } else if (e instanceof EmpleadoTemporal) {
                EmpleadoTemporal et = (EmpleadoTemporal) e;
                System.out.printf("%s es Empleado Temporal (sueldo: %.2f)%n",
                        et.getNombre(), et.calcularSueldo());
            }
        }
    }
}
