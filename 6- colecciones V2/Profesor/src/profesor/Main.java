/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package profesor;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
        ejecutarUniversidad();
    }

    private static void ejecutarUniversidad() {
        System.out.println("EJERCICIO UNIVERSIDAD");
        Universidad u = new Universidad("Universidad Nacional");

        // Crear profesores
        Profesor p1 = new Profesor("PR001", "Milagros Airalde", "Matematicas");
        Profesor p2 = new Profesor("PR002", "Carlos Gomez", "Programacion");
        Profesor p3 = new Profesor("PR003", "Maria Lopez", "Fisica");

        // Crear cursos
        Curso c1 = new Curso("C001", "Algebra I");
        Curso c2 = new Curso("C002", "Programacion II");
        Curso c3 = new Curso("C003", "Fisica I");
        Curso c4 = new Curso("C004", "Estructuras de Datos");
        Curso c5 = new Curso("C005", "Sistemas Operativos");

        // Agregar a universidad
        u.agregarProfesor(p1); u.agregarProfesor(p2); u.agregarProfesor(p3);
        u.agregarCurso(c1); u.agregarCurso(c2); u.agregarCurso(c3); u.agregarCurso(c4); u.agregarCurso(c5);

        // Asignar profesores a cursos
        u.asignarProfesorACurso("C001", "PR001");
        u.asignarProfesorACurso("C002", "PR002");
        u.asignarProfesorACurso("C004", "PR002");
        u.asignarProfesorACurso("C003", "PR003");

        // Listar
        u.listarCursos();
        u.listarProfesores();

        // Cambiar profesor de un curso y comprobar sincronía
        System.out.println("\nCambiar profesor de C004 a PR003:");
        u.asignarProfesorACurso("C004", "PR003");
        u.listarCursos();
        u.listarProfesores();

        // Remover un curso y verificar que desaparece de la lista del profesor
        System.out.println("\nEliminar curso C003:");
        u.eliminarCurso("C003");
        u.listarCursos();
        u.listarProfesores();

        // Remover un profesor (deja null en cursos)
        System.out.println("\nEliminar profesor PR002:");
        u.eliminarProfesor("PR002");
        u.listarProfesores();
        u.listarCursos();

        // Reporte cantidad de cursos por profesor
        u.reporteCantidadCursosPorProfesor();
    }
}

