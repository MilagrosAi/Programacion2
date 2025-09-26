/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foto;

/**
 *
 * @author usuario
 */
// Titular.java
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // referencia bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }

    public Pasaporte getPasaporte() { return pasaporte; }

    // setter sincronizado para mantener la relación consistente
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }

    @Override
    public String toString() {
        return "Titular{name=" + nombre + ", dni=" + dni + "}";
    }
}
