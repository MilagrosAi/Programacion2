/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author usuario
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; // composición

    public Documento(String titulo, String contenido, String codigoHash, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, java.time.LocalDate.now(), usuario);
    }

    public String getTitulo() {
        return titulo;
    }

    public FirmaDigital getFirma() {
        return firma;
    }
}

