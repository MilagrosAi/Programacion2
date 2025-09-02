/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciocio10;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejerciocio10 {
    public static int actualizarStock (int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida ;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el stock actuak del producto: ");
        int stockActual = scanner.nextInt();
        System.out.println("Ingrese la cantidad vendida: ");
        int cantidadVendida = scanner.nextInt();
        System.out.println("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scanner.nextInt();
        
        int nuevoStock = actualizarStock (stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock  del producto es: " + nuevoStock);
        
        scanner.close();
        
    }
    
}
