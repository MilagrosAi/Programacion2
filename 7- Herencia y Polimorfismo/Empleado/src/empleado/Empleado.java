/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author usuario
 */
public abstract class Empleado {
    protected String id;
    protected String nombre;

    public Empleado(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // método abstracto: cada tipo de empleado calcula su sueldo diferente
    public abstract double calcularSueldo();

    public String getNombre() { return nombre; }
    public String getId() { return id; }

    public void mostrarInfo() {
        System.out.printf("Empleado[id=%s, nombre=%s, sueldo=%.2f]%n", id, nombre, calcularSueldo());
    }
}
