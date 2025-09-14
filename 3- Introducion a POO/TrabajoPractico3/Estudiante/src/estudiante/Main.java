/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiante;

/**
 *
 * @author usuario
 */

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Mili", "Airalde", "Programación 2", 7.5);

        e1.mostrarInfo();
        e1.subirCalificacion(1.5);
        e1.bajarCalificacion(2.0);
        e1.mostrarInfo();
    }
}
