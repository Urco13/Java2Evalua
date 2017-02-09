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
public abstract class Vehiculos {
    protected double ingreso;
    private String matricula;
    private String anoDeCompra;
    private String marca;
    private static int totalVehiculos=0;
    private static double totalIngresos=0;
    
    public Vehiculos(String matricula, String anoDeCompra, String marca){
        matricula=this.matricula;
        anoDeCompra=this.anoDeCompra;
        marca=this.marca;
        totalVehiculos++;
    }
    
    //metodos get
    public String getMatricula(){
        return matricula;  
    }
    public String getAñoDeCompra(){
        return anoDeCompra;
    }
    public String getMarca(){
        return marca;
    }
    public static int getTotalVehiculos(){
        return totalVehiculos;
    }
    
     public  double verIngresos(){
        return this.ingreso;
    }
     
    public  void calcularIngresoTotal(double cantidadDeDinero){
        totalIngresos+=cantidadDeDinero;
    }
    public double verIngresoTotal(){
        return this.totalIngresos;
    }
    //metodos set
//    public void setMatricula(String matricula){
//        matricula=this.matricula;
//    }
//    public void setAnoDeCompra(String anoDeCompra){
//        anoDeCompra=this.anoDeCompra;
//    }
//    public void setMarca(String marca){
//        marca=this.marca;
//    }
}//fin class
