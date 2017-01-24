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
public class EvaClaseNombre {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Nombre primerNombre = new Nombre("Carlos","Fernandez","Garcia");
        System.out.println(primerNombre.nombreApellido());
        System.out.println(primerNombre.iniciales());
    }
    
}
