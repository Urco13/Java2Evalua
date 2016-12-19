/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseanimal1;

/**
 *
 * @author dam115
 */
public class ClaseAnimal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear y manipular un objeto animal;
        Animal migato=new Animal();
        Animal miperro=new Animal("Thor");
        migato.nace();
            
//        migato.nombre="Batman";
        migato.edad=1;
        migato.setEdad(13);
        
        migato.getNombre();
        migato.getEdad();
        
        Pajaro unpajaro=new Pajaro();
        unpajaro.setNombre("pio");
        unpajaro.color="rojo";
        unpajaro.peso=2;
        //obtenemos los nombres del pajaro
        System.out.println(unpajaro.getNombre());
        System.out.println(unpajaro.color);
        System.out.println(unpajaro.peso);
    }
    
}

