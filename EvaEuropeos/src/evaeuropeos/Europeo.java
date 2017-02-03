/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaeuropeos;

/**
 *
 * @author dam115
 */
public class Europeo {
    private String nombre="Carlos";
    private String fechaNac="28/02/1976";
    
    //constructor
    public Europeo(String nombre, String fechaNac){
        this.nombre=nombre;
        this.fechaNac=fechaNac;
    }
    public String getNombre() {
        return nombre;
    }
    
    public String getFechaNac(){
        return fechaNac;
    }
    
    public  void mostrarDatos(){
        System.out.println(this.getNombre());
        System.out.println(this.getFechaNac());
    }
}//fin class
