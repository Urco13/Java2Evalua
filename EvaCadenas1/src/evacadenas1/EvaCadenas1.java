/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evacadenas1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Character.isDigit;
;

/**
 *
 * @author dam115
 */
public class EvaCadenas1 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String cad;
        cad = leerCadena();
        System.out.println(cad);
        System.out.println("La cadena es de longitud "+cad.length());
        for (int i = 0; i < cad.length(); i++) {
            
            if(Character.isDigit(cad.charAt(i))){
                System.out.println("Es un digito "+cad.charAt(i));
                
            }else if(Character.isLetter(cad.charAt(i))){
                System.out.println("Es un caracter "+cad.charAt(i));
                if(Character.isUpperCase(cad.charAt(i))){
                    System.out.println("Es mayuscula");
                }else{
                    System.out.println("Es minuscula");
                }
                if(cad.charAt(i)=='A'||cad.charAt(i)=='E'||cad.charAt(i)=='I'||cad.charAt(i)=='O'||cad.charAt(i)=='U'||cad.charAt(i)=='a'||cad.charAt(i)=='e'||
                        cad.charAt(i)=='i'||cad.charAt(i)=='o'||cad.charAt(i)=='u'){
                    System.out.println("Es vocal");
                }else{
                    System.out.println("Es consonante ");
                }
            }
            
        }//fin for
        
        
        
    }//fin main
    
     public static String leerCadena() throws IOException{
        String cad;
        cad = bufer.readLine();
        return cad;
    }
}//fin class
