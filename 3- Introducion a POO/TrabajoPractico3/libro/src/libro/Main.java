/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("Programacion 2 ", "Milagros Airalde ", 1999);
        System.out.println("Anio: " + l1.getAnioPublicacion());
        l1.setAnioPublicacion(-100); 
        l1.setAnioPublicacion(2020);
        System.out.println("Anio Final" + l1.getAnioPublicacion());
        
    }
    
}
