/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y
su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento
Categoría B: 15% de descuento
Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el
precio final*/
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String categoria = scanner.next().toUpperCase();
        
        double descuento = 0;
        if (categoria.equals("A")) descuento = 0.10;
        else if (categoria.equals("B")) descuento = 0.15;
        else if (categoria.equals("C")) descuento = 0.20;
        
        double descuentoAplicado = precio * descuento;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
        scanner.close();
        
    }
    
}
