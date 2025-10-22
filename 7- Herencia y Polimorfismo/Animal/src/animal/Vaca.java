/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author usuario
 */
public class Vaca extends Animal {
    public Vaca(String nombre) { super(nombre); }

    @Override
    public void hacerSonido() {
        System.out.println("Muuuu");
    }

    @Override
    public void describirAnimal() {
        System.out.printf("Soy una vaca llamada %s y doy leche.%n", nombre);
    }
}
