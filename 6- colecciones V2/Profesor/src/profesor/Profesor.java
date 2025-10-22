/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package profesor;

/**
 *
 * @author usuario
 */
import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private final List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public List<Curso> getCursos() { return cursos; }

    public void agregarCurso(Curso c) {
        if (c == null) return;
        if (!cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this); // sincroniza el lado Curso
            }
        }
    }

    public void eliminarCurso(Curso c) {
        if (c == null) return;
        if (cursos.remove(c)) {
            if (c.getProfesor() == this) {
                c.setProfesor(null); // rompe la relación en el Curso
            }
        }
    }

    public void listarCursos() {
        System.out.printf("Profesor %s - Cursos: %d%n", nombre, cursos.size());
        for (Curso c : cursos) {
            System.out.printf("  %s - %s%n", c.getCodigo(), c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.printf("Profesor[id=%s, nombre=%s, especialidad=%s, cursos=%d]%n",
                id, nombre, especialidad, cursos.size());
    }

    @Override
    public String toString() {
        return String.format("Profesor[id=%s, nombre=%s, especialidad=%s]", id, nombre, especialidad);
    }
}
