/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autor;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
        ejecutarBiblioteca();
    }

    private static void ejecutarBiblioteca() {
        System.out.println("EJERCICIO BIBLIOTECA");
        Biblioteca b = new Biblioteca("Biblioteca Central");

        // Crear autores
        Autor a1 = new Autor("A001", "Airalde Milagros Abril", "Argentina");
        Autor a2 = new Autor("A002", "J.K. Rowling", "Reino Unido");
        Autor a3 = new Autor("A003", "Isabel Allende", "Chile");

        // Agregar 5 libros
        b.agregarLibro("ISBN001", "Cien años de soledad", 1967, a1);
        b.agregarLibro("ISBN002", "Harry Potter y la piedra filosofal", 1997, a2);
        b.agregarLibro("ISBN003", "La casa de los espíritus", 1982, a3);
        b.agregarLibro("ISBN004", "El coronel no tiene quien le escriba", 1961, a1);
        b.agregarLibro("ISBN005", "Harry Potter y la cámara secreta", 1998, a2);

        // Listar
        b.listarLibros();

        // Buscar por ISBN
        System.out.println("\nBuscar ISBN003:");
        Libro busc = b.buscarLibroPorIsbn("ISBN003");
        if (busc != null) busc.mostrarInfo();

        // Filtrar por año
        System.out.println("\nFiltrar por año 1997:");
        for (Libro l : b.filtrarLibrosPorAnio(1997)) l.mostrarInfo();

        // Eliminar un libro
        System.out.println("\nEliminar ISBN004:");
        b.eliminarLibro("ISBN004");
        b.listarLibros();

        // Cantidad total de libros
        System.out.println("\nCantidad total de libros: " + b.obtenerCantidadLibros());

        // Listar autores
        b.mostrarAutoresDisponibles();
    }
}

