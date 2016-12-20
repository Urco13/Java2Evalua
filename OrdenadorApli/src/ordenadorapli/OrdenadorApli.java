/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenadorapli;

/**
 *
 * @author dam115
 */
public class OrdenadorApli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ordenador miPc = new Ordenador("");//Da error por que el constructor de la clase Ordenador nos pide unos parametros
       miPc.marca = "Racer";//Nos da error porque los atributos de la clase ordenador estan en private
       miPc.procesador="intel";
       miPc.mostrarDatos();
       miPc.setPantalla("Asuu");
    }
    
}
