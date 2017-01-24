/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaclasenombre;

/**
 *
 * @author dam115
 */
public class Nombre {
    private String nombre;
    private String ape1;
    private String ape2;

    
    public Nombre(String nombre, String ape1, String ape2) {
         
       if(!this.comprobacion(nombre)||!this.comprobacion(ape1)||!this.comprobacion(ape2)){
           System.out.println("Error");
       }else{
            this.nombre = nombre;
            this.ape1 = ape1;
            this.ape2 = ape2;
       }
       
        
        
       
    }

    public String getNombre() {
        return nombre;
    }
    
    //metodo comprobacion
    private boolean comprobacion(String nombre){
        boolean cad = true;
        for (int i = 0; i < nombre.length(); i++) {//recorremos la cadena
            if(!Character.isLetter(nombre.charAt(i))){//buscamos si hay algun caracter que no sea del nombre
                cad=false;
            }
           
        }
         if(nombre.isEmpty()){
                cad=false;
            }
        return cad;
    }
    
    //metodo Nombre Apellido
    public String nombreApellido(){
        String nombreApellido;
        nombreApellido=this.nombre+" "+this.ape1+" "+this.ape2;
        return nombreApellido;
    }
    
    //metodo iniciales nombre
    public String iniciales(){
        String iniciales;
        iniciales=nombre.charAt(0)+"."+ape1.charAt(0)+"."+ape2.charAt(0);
        iniciales.toUpperCase();
        return iniciales; 
    }

}//fin class
