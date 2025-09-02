/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Validación de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
hasta que ingrese un valor válido.*/
        
        Scanner scanner = new Scanner(System.in);
        int nota = scanner.nextInt();
        
        do {
            System.out.println("Ingrese una nota (0-10: ");
            nota = scanner.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("ERROR. Nota invalida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota <0 || nota > 10);
        System.out.println("Nota guardada correctamente. ");
        
        scanner.close();

    }
    
}
