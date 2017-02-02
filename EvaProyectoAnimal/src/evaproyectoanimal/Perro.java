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
public class Perro extends Animal{
    String raza;

    public Perro() {//si queremos haceder a variables privadas aunque se herede no se puede acceder
        this(0,"sin dato");
        this.setNombre("2-Perro sin nombre "+this.getNombre());
    }
    public Perro(int edad, String nombre){
        super(edad,nombre);//con super llamamos a un constructor de la clase superior superclase
        System.out.println("Creando perro "+this.getEdad());
//        this.setEdad(edad);
//        this.setNombre(nombre);
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
}
