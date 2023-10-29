/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Windows;

/**
 *
 * @author samue
 */
public class Articulo {
    
    private String articulo;
    private int precio;
    
    private int cantidad;
    private int indice;
    private int indiceIndependiente;
    
    public Articulo(String articulo, int precio, int cantidad, int indice, int indiceIndependiente){
        this.articulo=articulo;
        this.precio=precio;
        this.cantidad=cantidad;
        this.indice=indice;
        this.indiceIndependiente=indiceIndependiente;
    }
    
    public String getArticulo(){
        return articulo;
    }
    
    public void setArticulo(String articulo){
        this.articulo=articulo;
    }
    
    public int getPrecio(){
        return precio;
    }
    
    public void setPrecio(int precio){
        this.precio=precio;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    
    public int getIndice(){
        return indice;
    }
    
    public void setIndice(int indice){
        this.indice=indice;
    }
    
    public int getIndiceIndependiente(){
        return indiceIndependiente;
    }
    
    public void setIndiceIndependiente(int indiceIndependiente){
        this.indiceIndependiente=indiceIndependiente;
    }
}
