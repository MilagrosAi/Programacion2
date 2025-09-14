/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package naveespacial;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial("Apolo", 50);

nave.despegar();
nave.avanzar(20); // tal vez no alcanza
nave.recargarCombustible(40);
nave.avanzar(20);
nave.mostrarEstado();

    }
    
}
