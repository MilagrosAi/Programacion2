/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package profesor;

/**
 *
 * @author usuario
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // puede ser null

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor p) {
        if (this.profesor == p) return; // sin cambios

        // quitar de profesor previo (si existe)
        if (this.profesor != null) {
            Profesor anterior = this.profesor;
            this.profesor = null;
            anterior.eliminarCurso(this);
        }

        // asignar nuevo profesor y asegurar sincronía
        this.profesor = p;
        if (p != null && !p.getCursos().contains(this)) {
            p.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        System.out.printf("Curso[codigo=%s, nombre=%s, profesor=%s]%n",
                codigo, nombre, (profesor == null ? "Sin asignar" : profesor.getNombre()));
    }

    @Override
    public String toString() {
        return String.format("Curso[codigo=%s, nombre=%s, profesor=%s]",
                codigo, nombre, profesor == null ? "null" : profesor.getNombre());
    }
}
