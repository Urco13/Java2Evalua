/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaestudiantesuper;

/**
 *
 * @author dam115
 */
public class EstudanteBecario extends Estudante{
    private int salario;
    
    //constructor
    public EstudanteBecario(String s, int i){
        super(s);
        salario=i;
    }
    public int leSalario(){
        return salario;
    }
    public void escribeSalario(int cartos){
        salario=cartos;
    }
}
