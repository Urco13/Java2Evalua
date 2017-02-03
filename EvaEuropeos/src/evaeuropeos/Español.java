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
public class Español extends Europeo{
    private int numeroSS=124;
    private String nif="2323233C";
    
    //constructor
    public Español(String nombre, String fechaNac, String nif){
        super(nombre,fechaNac);
        this.nif=nif;
    }
    public int getNumeroSS(){
        return numeroSS;
    }
    
    public String getNif(){
        return nif;
    }
    
    public void verNif(){
        System.out.println(this.getNif());
    }
    public void vernumeroSS(){
        System.out.println(this.getNumeroSS());
    }
    public void mostrarDatos(){
        System.out.println(this.getNombre());
        System.out.println(this.getFechaNac());
        System.out.println(this.getNif());
        System.out.println(this.getNumeroSS());
    }
}//fin class
