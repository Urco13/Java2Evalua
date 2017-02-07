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

    public Coche(String clave, String nombreConductor, String matricula, String anoDeCompra, String marca) {
        super(matricula, anoDeCompra, marca);
        this.clave = clave;
        this.nombreConductor = nombreConductor;
    }
    
   
}
