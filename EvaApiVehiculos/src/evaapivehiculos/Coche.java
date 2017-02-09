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
public class Coche extends Vehiculos{
    private String clave;
    private String nombreConductor;
    private int importancia;
    private static final int CANTIDAD1=30;
    private static final int CANTIDAD2=60;
    public Coche(String clave, String nombreConductor, String matricula, String anoDeCompra, String marca,int importancia) {
        super(matricula, anoDeCompra, marca);
        this.clave = clave;
        this.nombreConductor = nombreConductor;
        importanciaDocumentos(importancia);
    }
    
    private void importanciaDocumentos(int importancia){
        switch (this.importancia) {
            case 0: this.ingreso=CANTIDAD1;break;
            case 1: this.ingreso=CANTIDAD2;break;
            case 2: this.ingreso=120;break;
            
        }
    }
   
}
