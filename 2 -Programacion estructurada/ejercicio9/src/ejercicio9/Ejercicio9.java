/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio9 {
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        }
        return 0;
    }
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        System.out.println("Ingrese el peso del paquete: ");
        double peso =  scanner.nextDouble();
        System.out.println("Ingrese la zona del envio (nacional/internacional: ");
        String zona = scanner.next();
        
        double costoEnvio = calcularCostoEnvio(peso , zona);
        double total = calcularTotalCompra ( precioProducto , costoEnvio);
        
        System.out.println("El costo del envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
        
        scanner.close();
    }
    
}
