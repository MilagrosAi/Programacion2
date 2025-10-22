/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author usuario
 */
public class Perro extends Animal {
    public Perro(String nombre) { super(nombre); }

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau!");
    }

    @Override
    public void describirAnimal() {
        System.out.printf("Soy un perro llamado %s y me encanta jugar.%n", nombre);
    }
}
