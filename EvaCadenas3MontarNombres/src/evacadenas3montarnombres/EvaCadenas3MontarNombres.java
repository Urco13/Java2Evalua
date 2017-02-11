/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evacadenas3montarnombres;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author urco1
 */
public class EvaCadenas3MontarNombres {

    /**
     * @param args the command line arguments
     */
    static BufferedReader bufer=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        String nombre, ape1, ape2;
        String miNombre=new String();//Creamos el objeto mi nombre
        do{
        nombre=leerTeclado("Dime tu nombre");
        }while(!comprobacion(nombre));
        do {
             ape1=leerTeclado("Dime tu primer apellido");
        } while (!comprobacion(ape1));
        do {
            ape2=leerTeclado("Dime tu segundo apellido");
        } while (!comprobacion(ape2));
        
        miNombre=nombre+" "+ape1+" "+ape2;//juntamos las 3 cadenas y la metemos en la cadena miNombre
        System.out.println(miNombre);
//        for (int i = 0; i < miNombre.length(); i++) {//recorremos la cadena
//            if(!Character.isLetter(miNombre.charAt(i))){//buscamos si hay algun caracter que no sea del nombre
//                System.out.println("Esto no es una letra "+miNombre.charAt(i));
//            }
//            
//        }
//        if(miNombre.isEmpty()){//el metodo isEmpty comprueba si hay campos vacios
//            System.out.println("No se permite campos vacios");
//        }
        
        
        
    }//fin main
    
    public static String leerTeclado(String texto){
        String cadena = null;
        System.out.println(texto);
        try {
            cadena=bufer.readLine();
        } catch (NumberFormatException ex) {
            System.out.println("Error");
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return cadena;
    }//fin leerTeclado
    
    public static boolean comprobacion(String cadena){
        boolean correcto = true;
        for (int i = 0; i < cadena.length(); i++) {
            if(!((cadena.charAt(i)>='a'&&cadena.charAt(i)<='z')||(cadena.charAt(i)>='A'&&cadena.charAt(i)<='Z')||cadena.charAt(i)==' ')){
                correcto=false;
                System.out.println("Este caracter "+cadena.charAt(i)+" no es correcto intentalo otra vez");
                break;  
            }
        }
            if (cadena.isEmpty()) {
            System.out.println("Tu nombre no es correcto vuelve a intentarlo");
            correcto=false;
        }

        return correcto;
    }//fin comprobacion
}//fin class