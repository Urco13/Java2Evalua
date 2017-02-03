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
public class Frances extends Europeo{
    
    private String numeroIR="6434355F";
    
    public Frances(String nombre, String fechaNac, String numeroIR){
        super(nombre, fechaNac);
        this.numeroIR=numeroIR;
    }
    public String getNumeroIR(){
        return numeroIR;
    }
    public void mostrarDatos(){
        System.out.println(this.getNombre());
        System.out.println(this.getFechaNac());
        System.out.println(this.getNumeroIR());
    }
}//fin class
