/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figura;

/**
 *
 * @author usuario
 */
public class MainFiguras {
    public static void main(String[] args) {
        // Crear un array de figuras (polimorfismo: todas son "Figura")
        Figura[] figuras = new Figura[] {
                new Circulo(2.5),
                new Rectangulo(3.0, 4.0),
                new Circulo(1.0),
                new Rectangulo(5.5, 2.0)
        };

        // Mostrar el área de cada una usando polimorfismo
        for (Figura f : figuras) {
            f.mostrarArea();
        }
    }
}
