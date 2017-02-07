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
public class Furgoneta extends Vehiculos{
    private double cantidadDeDinero=0;
    private int numeroVigilantes=0;
    public Furgoneta(String matricula,String anoDeCompra,String marca, double cantidadDeDinero, int numeroVigilantes){
        super(matricula,anoDeCompra,marca);
        cantidadDeDinero=this.cantidadDeDinero;
        numeroVigilantes=this.numeroVigilantes;
        if (cantidadDeDinero<6000) {
           super.setIngresos(60);
        }else{
           
        }
    }
}
