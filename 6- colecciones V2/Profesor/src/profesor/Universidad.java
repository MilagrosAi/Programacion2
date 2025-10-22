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

public class Universidad {
    private String nombre;
    private final List<Profesor> profesores = new ArrayList<>();
    private final List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) if (p.getId().equalsIgnoreCase(id)) return p;
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) if (c.getCodigo().equalsIgnoreCase(codigo)) return c;
        return null;
    }

    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c == null || p == null) return false;
        c.setProfesor(p); // setProfesor maneja la sincronización bidireccional
        return true;
    }

    public void listarProfesores() {
        System.out.println("=== PROFESORES ===");
        for (Profesor p : profesores) p.mostrarInfo();
    }

    public void listarCursos() {
        System.out.println("=== CURSOS ===");
        for (Curso c : cursos) c.mostrarInfo();
    }

    public boolean eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            if (c.getProfesor() != null) c.setProfesor(null); // rompe relación
            return cursos.remove(c);
        }
        return false;
    }

    public boolean eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            // romper relaciones con sus cursos
            List<Curso> copiaCursos = new ArrayList<>(p.getCursos());
            for (Curso c : copiaCursos) c.setProfesor(null);
            return profesores.remove(p);
        }
        return false;
    }

    public void reporteCantidadCursosPorProfesor() {
        System.out.println("=== REPORTE: cantidad de cursos por profesor ===");
        for (Profesor p : profesores) {
            System.out.printf("%s - %d cursos%n", p.getNombre(), p.getCursos().size());
        }
    }
}
