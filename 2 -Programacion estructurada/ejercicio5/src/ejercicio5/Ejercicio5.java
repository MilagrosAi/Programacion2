/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* Suma de Números Pares (while).
Escribe un programa que solicite números al usuario y sume solo los
números pares. El ciclo debe continuar hasta que el usuario ingrese el número
0, momento en el que se debe mostrar la suma total de los pares ingresados.
*/
       Scanner scanner = new Scanner(System.in);
       int sumaPares = 0;
       
       while (true) {
           System.out.println("Ingrese un numero (0 para dejar de sumar)");
           int numero = scanner.nextInt();
           
           if ( numero == 0 ) {
               break;
           }
           if (numero % 2 == 0){
               sumaPares += numero;
           }
       }
        System.out.println("La suma de los numeros pares es: " + sumaPares);
        scanner.close();
    }
    
}
