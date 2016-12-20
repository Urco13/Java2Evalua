/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librosapli;

/**
 *
 * @author dam115
 */
public class Libros {
    String titulo;
    String autor;
    int anoPublicacion;
    String editorial;
    float   precio;
//    public Libros(){};
    public Libros(String titulo, String autor, String editorial){
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }
    public Libros(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    /////metodos get/////////
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAnoPublicacion(){
        return anoPublicacion;
    }
    public String getEditorial(){
        return editorial;
    }
    public float getPrecio(){
        return precio;
    }
    ////metodos set/////////////
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public void setAnoPublicacion(int anoPublicacion){
        this.anoPublicacion=anoPublicacion;
    }
    public void setEditorial(String editorial){
        this.editorial=editorial;
    }
    public void setPrecio(float precio){
        this.precio=precio;
    }
}
