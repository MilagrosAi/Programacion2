/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gallina;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
        
        Gallina g1 = new Gallina(1,2);
        Gallina g2 = new Gallina (2,1);
        
         
        g2.envejecer();
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
    
}
