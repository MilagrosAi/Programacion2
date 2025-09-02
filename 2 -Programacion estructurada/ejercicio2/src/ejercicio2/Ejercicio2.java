/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Determinar el Mayor de Tres Números.
Escribe un programa en Java que pida al usuario tres números enteros y
determine cuál es el mayor. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int num3 = scanner.nextInt();
        
        int mayor = num1;
        if (num2 > mayor) mayor = num2; 
        if (num3 > mayor) mayor = num3; 
        
        System.out.println("El mayor es: " + mayor);
        scanner.close();
    }
    
}
