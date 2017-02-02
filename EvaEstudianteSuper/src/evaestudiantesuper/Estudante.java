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
public class Estudante {
    private String nome;
    
    public String leNome(){
        return nome;
    }
    public void escribeNome(String nome){
        this.nome=nome;
    }
    //constructor
    public Estudante(String nome){
        this.nome=nome;
    }
    
}
