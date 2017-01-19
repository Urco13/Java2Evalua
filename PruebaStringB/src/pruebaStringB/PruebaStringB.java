/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaStringB;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 *
 * @author urco1
 */
public class PruebaStringB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputStreamReader flujo;
        BufferedReader teclado;
        flujo=new InputStreamReader(System.in);
        teclado=new BufferedReader(flujo);
        System.out.println("Introduce cadena ");
        
        try {
            String cadena=teclado.readLine(); //si que funciona
            StringBuffer delreves=new StringBuffer(cadena);
            System.out.println("Cadena invertida: "+delreves.reverse());
            
            StringBuffer cad=new StringBuffer("Cadena Variable");
            System.out.println("Ejemplo de SstringBuffer: '"+cad+"'");
            cad.delete(0, 7);
            System.out.println("Borrados 6 primeros caracteres: "+cad);
            cad.replace(cad.length()-3, cad.length(), "da");
            System.out.println("Sustituidos ultimos caracteres: "+cad);
            cad.append("cadena");
            System.out.println("Apendizada con 'cadena': "+cad);
            System.out.println("Tiene capacidad de: "+cad.capacity());
            cad.ensureCapacity(32);
            System.out.println("Capacidad sobre 32: "+cad.capacity());
            System.out.println("Cadena invertida: "+cad.reverse());
            System.out.println("Muestra el caracter 6: "+cad.charAt(6));
            
        } catch (Exception ex) {
           
        }
        
    }
    
}
