/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura;

/**
 *
 * @author usuario
 */
public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // método abstracto que obliga a las subclases a implementar el cálculo de área
    public abstract double calcularArea();

    public void mostrarArea() {
        System.out.printf("%s -> area: %.4f%n", nombre, calcularArea());
    }
}
