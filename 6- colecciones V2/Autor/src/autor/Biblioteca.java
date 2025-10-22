/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autor;

/**
 *
 * @author usuario
 */
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private final List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }

    public void listarLibros() {
        System.out.println("=== LIBROS EN LA BIBLIOTECA ===");
        for (Libro l : libros) l.mostrarInfo();
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) if (l.getIsbn().equalsIgnoreCase(isbn)) return l;
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        Libro l = buscarLibroPorIsbn(isbn);
        if (l != null) {
            libros.remove(l);
            return true;
        }
        return false;
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> res = new ArrayList<>();
        for (Libro l : libros) if (l.getAnioPublicacion() == anio) res.add(l);
        return res;
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("=== AUTORES EN LOS LIBROS ===");
        List<String> vistos = new ArrayList<>();
        for (Libro l : libros) {
            String nombre = l.getAutor().getNombre();
            if (!vistos.contains(nombre)) {
                System.out.println(l.getAutor());
                vistos.add(nombre);
            }
        }
    }
}
