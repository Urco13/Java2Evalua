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
    
    /**
     * Constructor
     * @param matricula
     * @param anoDeCompra
     * @param marca
     * @param cantidadDeDinero
     * @param numeroVigilantes 
     */
    public Furgoneta(String matricula,String anoDeCompra,String marca, double cantidadDeDinero, int numeroVigilantes){
        super(matricula,anoDeCompra,marca);
        this.cantidadDeDinero=cantidadDeDinero;
        this.numeroVigilantes=numeroVigilantes;
        this.calculoDineroGanado();
        super.calcularIngresoTotal(cantidadDeDinero);
    }
    
    private  void setIngresos(double ingresos){
        this.ingreso=ingresos;
    }
    
   
    
    private void calculoDineroGanado(){
        if (this.cantidadDeDinero<6000) {
            System.out.println("1");
           this.setIngresos(60);
        }else if(cantidadDeDinero>6000){
            System.out.println("2");
           this.setIngresos(120);
        }
    }
}//fin class
