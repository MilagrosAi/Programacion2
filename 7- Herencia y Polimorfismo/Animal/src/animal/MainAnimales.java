/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal;

/**
 *
 * @author usuario
 */
import java.util.ArrayList;
import java.util.List;

public class MainAnimales {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Chimuelo"));
        animales.add(new Gato("Carru"));
        animales.add(new Vaca("Muu"));

        // Mostrar sonidos y descripción usando polimorfismo
        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println();
        }
    }
}

