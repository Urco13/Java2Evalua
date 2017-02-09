/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaapivehiculos;

/**
 *
 * @author dam115
 */
public class EvaApiVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Furgoneta furgoneta1=new Furgoneta("2028dpg","1978","fiat", 2000, 5);
        Furgoneta furgoneta2=new Furgoneta("343434f", "1999", "Ferrari", 8000, 6);
        Coche cocheBlindado=new Coche("1234", "Carlitos", "343433c", "2000", "Fiat", 2);
        Coche cocheSemiBlindado=new Coche("4321", "Cristina", "3432432t", "2004", "Jeep", 1);
        System.out.println(Vehiculos.getTotalVehiculos());
//        System.out.println(Vehiculos.getIngreso());
        System.out.println("Ingreso furgoneta 1 "+furgoneta1.verIngresos());
        System.out.println("Ingreso furgoneta 2 "+furgoneta2.verIngresos());
    }//fin main
    
}//fin class
