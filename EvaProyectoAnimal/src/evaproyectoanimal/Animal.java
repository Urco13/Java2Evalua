/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaproyectoanimal;

/**
 *
 * @author dam115
 */
public class Animal {
    private int edad; //protected
    private String nombre="sin nombre ";

    public Animal(int edad, String nombre) {
        this.nace();
        System.out.println("1- Creando "+ nombre);
        this.edad = edad;
        this.nombre=nombre;
    }

    
    public Animal() {
        this.nace();
        System.out.println("1-Creando un animal "+nombre);
    }
    public void nace(){
        System.out.println("Hola mundo");
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
    
}
