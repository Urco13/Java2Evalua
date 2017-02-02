/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evamonederoapi;

/**
 *
 * @author dam115
 */
public class Monedero {
    private double saldo;

    //constructor
    public Monedero() {
    }
    
    //constructor saldo inicial
    public Monedero(double saldoInicial)throws Exception{
        if(saldoInicial>0){
            this.saldo=saldoInicial;
        }else{
            throw new Exception("No puede iniciar con dinero negativo");
        }
    }
    
    //hacer ingreso
    void ingreso (double ingreso) throws Exception{
        if(ingreso>0){
         this.saldo+=ingreso;
    }else{
        throw new Exception("El ingreso no puede ser menor de cero");
}
    }

    //retirar dinero
    public void retirar(double retirar) throws Exception{
        if (retirar>saldo) {
            this.saldo-=retirar;
        }else{
            throw new Exception("No puedes retirar mas del saldo");
        }
        
    }
    
    //obtener saldo
    public double getSaldo() {
        return saldo;
    }
    
    
}//fin class