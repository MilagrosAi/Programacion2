/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author usuario
 */
public class MainEmpleado {
    public static void main(String[] args) {
        // Crear empleados con distintos constructores
        Empleado e1 = new Empleado(1, "Milagros Airalde", "Analista", 60000);
        Empleado e2 = new Empleado("Marta bocchimuzzi", "Desarrolladora");
        Empleado e3 = new Empleado("Santino Airalde", "Tester");

        // Actualizar salarios
        e1.actualizarSalario(10);      // 10% de aumento
        e2.actualizarSalario(5000);    // aumento fijo

        // Imprimir datos de empleados
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Mostrar total de empleados creados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}


