/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author usuario
 */
public class MainEj8 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Milagros Airalde", "milagroai@mail.com");
        Documento doc = new Documento("Contrato", "Contenido del contrato", "keke99", usuario);

        System.out.println("Documento: " + doc.getTitulo());
        System.out.println("Firmado por: " + doc.getFirma().getUsuario().getNombre());
        System.out.println("Hash: " + doc.getFirma().getCodigoHash());
    }
}
