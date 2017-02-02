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
public class EvaProyectoAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Animal a=new Animal();
      a.setNombre("Blanco");
      //creamos un objeto tipo perro
      Perro blanco = new Perro();
      
      blanco.setNombre("zar");
      blanco.setRaza("palleiro");
      
      ///Creando otro objeto perro con super
      Perro perro1 = new Perro(2, "Luna");
      
    }
    
}
