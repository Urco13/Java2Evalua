/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evacadenas2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dam115
 */
public class EvaCadenas2 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    static int contador=0;
    static int contadorSpacios=0;
    public static void main(String[] args) throws IOException {
        String cadena;
        
        cadena=leerString();
        for (int i = 0; i < cadena.length(); i++) {
            if((cadena.charAt(i)>='a'&&cadena.charAt(i)<='z')||(cadena.charAt(i)>='A'&&cadena.charAt(i)<='Z')){
                System.out.println(cadena.charAt(i)+" Es una letra");
            }else{
                System.out.println(cadena.charAt(i)+" No es una letra");
            }
            if(Character.isDigit(cadena.charAt(i))){
                contador++;
            }
            if(cadena.charAt(i)==' '){
                contadorSpacios++;
            }
            
           
        }
         System.out.println("Contador "+contador+" ContadorSpacios "+contadorSpacios);
       //prueba
               cadena = Character.toString(cadena.charAt(0));
                System.out.println("Esto es la nueva cadena "+cadena.charAt(0));
            
         
    }//fin main
 
    public static String leerString() throws IOException{
        String cadena;
        cadena = bufer.readLine();
        return cadena;
    }
    
}
