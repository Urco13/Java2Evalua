/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circulo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author dam115
 */
public class Utilidades {
    static BufferedReader leerTeclado = new BufferedReader(new InputStreamReader(System.in));
    
    public Utilidades(){};
    
    public static String leerString(){
           String cadena = null;
           System.out.println("Introduce una cadena de caracteres");
        try {
            cadena = leerTeclado.readLine();
        } catch (NumberFormatException ex) {
            System.out.println("No se admiten");
        } catch (Exception ex) {
            System.out.println("Error vuelve a intentarlo");
        }
        return cadena;
    }
    static
    
}
