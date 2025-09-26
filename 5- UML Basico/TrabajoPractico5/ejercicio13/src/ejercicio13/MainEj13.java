/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author usuario
 */
public class MainEj13 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Milagros Airalde", "airalde@example.com");
        GeneradorQR generador = new GeneradorQR();

        generador.generar("ABC123XYZ", usuario);
    }
}
