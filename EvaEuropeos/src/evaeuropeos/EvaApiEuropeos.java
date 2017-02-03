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
public class EvaApiEuropeos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Europeo persona = new Europeo();
       persona.mostrarDatos();
       
       Español persona1 =new Español();
       persona1.mostrarDatos();
       
       Frances persona2=new Frances();
       persona2.mostrarDatos();
    }//fin main
    
}//fin class
