/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Ejemplos de lectura de archivo:
 * - lecturaSegura: maneja excepciones internamente (incluye try-with-resources)
 * - leerYPropagar: declara throws IOException para que el llamador maneje
 */
public class LecturaArchivo {

    /**
     * Lee y muestra el contenido de un archivo usando try-with-resources.
     * Maneja IOException internamente.
     */
    public static void lecturaSegura(String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            System.out.println("Leyendo archivo: " + ruta);
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException ex) {
            System.out.println("No se pudo leer el archivo '" + ruta + "'. Detalle: " + ex.getMessage());
        } finally {
            System.out.println("Fin intento lectura de archivo.\n");
        }
    }

    /**
     * Lee archivo y propaga IOException al llamador para que decida qué hacer.
     */
    public static void leerYPropagar(String ruta) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        }
    }
}
