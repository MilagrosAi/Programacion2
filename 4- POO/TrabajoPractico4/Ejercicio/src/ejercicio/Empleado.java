/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

/**
 *
 * @author usuario
 */
public class Empleado {
   
    // Atributos privados (encapsulamiento)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático para contar empleados
    private static int totalEmpleados = 0;
    private static int ultimoId = 0;

    // Constructor completo
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        if (id > ultimoId) {
            ultimoId = id;
        }
    }

    // Constructor sobrecargado (id automático y salario por defecto)
    public Empleado(String nombre, String puesto) {
        this.id = ++ultimoId;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000; // salario por defecto
        totalEmpleados++;
    }

    // Métodos sobrecargados actualizarSalario
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
    }

    // toString para mostrar datos legibles
    @Override
    public String toString() {
        return "Empleado [ID=" + id +
               ", Nombre=" + nombre +
               ", Puesto=" + puesto +
               ", Salario=" + salario + "]";
    }

    // Método estático para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Getters y Setters (encapsulamiento)
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public double getSalario() { return salario; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public void setSalario(double salario) { this.salario = salario; }
}

 

