/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaprueba1string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author dam115
 */
public class EvaPrueba1String {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        String cad =new String("Cadena fija");
        System.out.println("Ejemplo de String '"+cad+"'");
        System.out.println("Su longitud es "+cad.length());
        System.out.println("Su tercer caracter es "+cad.charAt(2));
        System.out.println("Su subcadena del 3 al 6 es: "+cad.substring(2));
        
        char[] vectorcad=cad.toCharArray();
        
        System.out.println("creado un vector de elemento 3: ");
        System.out.println(vectorcad[2]);
        
        String subcad=new String("ena");
        
        System.out.println("La subcadena '"+subcad+"'");
        System.out.println("Aparece en la posicion: ");
        System.out.println(cad.indexOf(subcad));
        
        String cadcomp=new String("CADENA fija");
        
        System.out.println("La cadena '"+cadcomp+"'");
        if (cad.compareTo(cadcomp)==0) {
            System.out.println(" ES igual 'Sensitive'");
        }else{
            System.out.println(" NO es igual 'Sensitive'");
        }
        System.out.println("La cadena '"+cadcomp+"'");
        
        if (cad.equalsIgnoreCase(cadcomp)) {
            System.out.println(" ES igual 'Insensitive'");
        }else{
            System.out.println(" NO = 'Insensitive'");
        }
        System.out.println("Cadena derivada en minusculas: ");
        System.out.println(cadcomp.toLowerCase());
        System.out.println("\n***"+cad);
        //*** clase StringBuffer :cadena modificable
        StringBuffer cadenabu=new StringBuffer(cad);
        cadenabu.append(" hola");
        System.out.println("\n***"+cadenabu);
        cad=cad.concat(" hola");
        System.out.println("\n***"+cad);
    }//fin main
    
   
}//fin class
