/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author usuario
 */
public class MainEj9 {
    public static void main(String[] args) {
        Autor autor = new Autor("Milagros Abril Airalde");
        Editorial editorial = new Editorial("Argentina");
        Libro libro = new Libro("Programacion2", autor, editorial);

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());
    }
}

