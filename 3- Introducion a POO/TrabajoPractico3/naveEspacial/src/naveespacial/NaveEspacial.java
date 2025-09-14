/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package naveespacial;

/**
 *
 * @author usuario
 */
public class NaveEspacial {
    
    String nombre; 
    int combustible;
    final int MAX_COMBUSTIBLE = 100 ;
    
    public NaveEspacial ( String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible; 
    }
    
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + "despego, combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para despegar ");
        }
    } 
    
    public void avanzar (int distancia) {
        int consumo = distancia * 2;
        
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + "avanzo" + distancia + "km. combustible: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para avanzar. ");
        }
    }
    
    public void recargarCombustible (int cantidad) {
        if (combustible + cantidad  <= MAX_COMBUSTIBLE) {
            combustible += cantidad;
            System.out.println("Recargado, combustible: " + combustible);
        } else {
            combustible = MAX_COMBUSTIBLE;
            System.out.println("Tanque lleno, combustible: " + combustible);
        }
    }
    
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | combustible " + combustible);
        
    }  
}
