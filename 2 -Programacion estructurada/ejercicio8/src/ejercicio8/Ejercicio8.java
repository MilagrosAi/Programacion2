/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio8 {
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
        return precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new  Scanner(System.in);
        
        System.out.println("Ingrese el precio base del producto: ");
        double precioBase =  scanner.nextDouble();
        System.out.println("Ingrese el impuesto en porcentaje (ejemplo: 10 para 10%): ");
        double impuesto = scanner.nextDouble();
        System.out.println("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = scanner.nextDouble();
        
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("El precio final del producto es : " + precioFinal);
        
        scanner.close();
        
    }
    
}
