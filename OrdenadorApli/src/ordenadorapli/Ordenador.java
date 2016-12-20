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
public class Ordenador {
    private String marca;
    private String procesador;
    private String pantalla;
    private boolean estado= true;
    
    public Ordenador(String marcaO, String procesadorO){
        marca = marcaO;
        procesador = procesadorO;
        estado = false;
    }
    public void setPantalla(String p){
        pantalla = p;
    }
    public void encenderOrdenador(){
            if(estado){
                System.out.println("Estaba encendido");
            }
            else{
            estado = true;
            }
    }
    public void  apagarOrdenador(){
        if(!estado){
            System.out.println("Ya estaba apagado");
        }
        else{
        estado = false;
        }
    }
    public void mostrarEstado(){
        if(estado == true){
            System.out.println("Encendido");
        }
        else{
            System.out.println("Apagado"); 
        }
    }
    public void mostrarDatos(){
        System.out.println("Marca Ordenador "+marca);
        System.out.println("Procesador Ordenador "+procesador);
        System.out.println("Pantalla Ordenador "+pantalla);
    }
}
