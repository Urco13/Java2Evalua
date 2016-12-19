/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseanimal1;

/**
 *
 * @author dam115
 */
public class Animal {
    
     int edad;
//     String nombre;
    private String nombre;//con private solo se puede ver a nivel clase no a nivel paquete
    
    public  Animal(){}//Constructor clase java
    
    public  Animal(String n){ //Constructor clase java pero con argumentos
        nombre=n;
    }
    public void nace(){
        System.out.println("Hola mundo");
    }
    public String getNombre(){
        //System.out.println(nombre);
        return nombre;
    }
    public void getEdad(){
        System.out.println(edad);
    }
    public void setEdad(int e){
        edad=e;
    }
    public void setNombre(String n){
        nombre=n;
    }
}
