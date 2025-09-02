/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author usuario
 */
public class Ejercicio13 {
    public static void mostrarPrecios(double[] precios, int indice) {
        if (indice >= precios.length) {
            return;
        }
        System.out.println("Precio: $" + precios[indice]);
        mostrarPrecios(precios, indice + 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:");
        mostrarPrecios(precios, 0);
        
        // Modificar el precio en la posición 2 (índice 2)
        precios[2] = 129.99;
        
        System.out.println("\nPrecios modificados:");
        mostrarPrecios(precios, 0);
    }
    
}
