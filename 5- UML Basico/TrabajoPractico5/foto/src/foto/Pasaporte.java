/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foto;

/**
 *
 * @author usuario
 */
// Pasaporte.java
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;         // composición: creada internamente
    private Titular titular;   // asociación bidireccional

    // Constructor: recibe datos de la foto y del titular (si aplica)
    public Pasaporte(String numero, String fechaEmision, Titular titular, String imagenFoto, String formatoFoto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagenFoto, formatoFoto); // composición -> creación interna
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this); // sincroniza la relación bidireccional
        }
    }

    public String getNumero() { return numero; }
    public String getFechaEmision() { return fechaEmision; }
    public Foto getFoto() { return foto; }
    public Titular getTitular() { return titular; }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public void mostrar() {
        System.out.println("Pasaporte: " + numero + " - Fecha: " + fechaEmision);
        if (foto != null) {
            System.out.println("Foto: " + foto.getImagen() + " (" + foto.getFormato() + ")");
        }
        if (titular != null) {
            System.out.println("Titular: " + titular.getNombre() + " - DNI: " + titular.getDni());
        }
    }

    @Override
    public String toString() {
        return "Pasaporte{numero=" + numero + ", fechaEmision=" + fechaEmision + "}";
    }
}

