/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evanombreordenador;

/**
 *
 * @author dam115
 */
public class NombreOrdenador {
    private String codigo;
    
    public NombreOrdenador(String codigo){
        String trozoCadena1="PC";
        String [] vector={"05","16","18","25","20","21"};
        String trozoCadena2;
        String trozoCadena3;
        boolean resultado=true;
        int numero;
        
        if(codigo.length()==6){   
        
        if(trozoCadena1.compareTo(codigo.substring(0, 2))==0){  
        }else{
            resultado=false;
        }
        trozoCadena2=codigo.substring(2, 4);
         for (int i = 0; i < vector.length; i++) {
                if(vector[i].compareTo(codigo.substring(2, 4))==0){
                    break;
                }else{
                    resultado=false;
                }
          }
          trozoCadena3=codigo.substring(4, 6);
          for (int i = 0; i < trozoCadena3.length(); i++) {
              if(Character.isDigit(trozoCadena3.charAt(i))){
              }else{
                  resultado=false;
              }
          }
          numero=Integer.parseInt(trozoCadena3);
          if(numero>0 && numero<31){
          }else{
              resultado=false;
          }
          if(resultado){
              System.out.println("Codigo Correcto");
              this.codigo=trozoCadena1+vector+trozoCadena3;
          }else
              System.out.println("Codigo Erroneo");
         }else{
            System.out.println("La longitud del codigo es incorrecta");
        }
       
    }//fin nombreOrdenador

    public String getCodigo() {
        return codigo;
    }
    
}//fin class
