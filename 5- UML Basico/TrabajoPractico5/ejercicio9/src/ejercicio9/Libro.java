/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author usuario
 */
public class Libro {
    private String titulo;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        autor.agregarLibro(this);
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }
}
