/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gallina;

/**
 *
 * @author usuario
 */
public class Gallina {
    
    int idGallina;
    int edad;
    int huevosPuestos;
    
    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    public void envejecer() {
        edad ++;
        System.out.println("Gallina" + idGallina + "puso un huevo. total: " + huevosPuestos);
    }
    
    public void mostrarEstado() {
        System.out.println("Gallina" + idGallina + " | edad: " + edad + " | huevos: " + huevosPuestos);
    }

    
}
