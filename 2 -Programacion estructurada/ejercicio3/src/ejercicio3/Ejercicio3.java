/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Clasificación de Edad.
Escribe un programa en Java que solicite al usuario su edad y clasifique su
etapa de vida según la siguiente tabla:*/
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        if (edad < 12 ) {
            System.out.println("Eres un niño.");
        } else if ( edad <= 17) {
            System.out.println("Eres un adolescente.");
        } else if ( edad <= 59) {
            System.out.println("Eres un adulto.");
        } else {
            System.out.println("Eres un adulto mayor. ");
        }
        scanner.close();
    }
    
}
