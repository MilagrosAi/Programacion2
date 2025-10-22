/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author usuario
 */
public class Gato extends Animal {
    public Gato(String nombre) { super(nombre); }

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }

    @Override
    public void describirAnimal() {
        System.out.printf("Soy un gato llamado %s y me gusta dormir.%n", nombre);
    }
}

