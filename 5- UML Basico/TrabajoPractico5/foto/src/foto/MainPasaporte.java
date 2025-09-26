/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foto;

/**
 *
 * @author usuario
 */
// MainPasaporte.java (clase de prueba)
public class MainPasaporte {
    public static void main(String[] args) {
        Titular titular = new Titular("Milagros Airalde", "749387438");
        Pasaporte pas = new Pasaporte("m949494", "2025-09-01", titular, "foto.jpg", "jpg");

        pas.mostrar();

        // Verificación bidireccional
        System.out.println("Desde titular, su pasaporte: " + titular.getPasaporte().getNumero());
    }
}
