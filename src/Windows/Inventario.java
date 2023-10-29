/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Windows;

import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class Inventario implements InterfazInventario{
    
    private Articulo [] articulos;
    private int contador;
    
    public Inventario(){
        contador=0;
        this.articulos=new Articulo[10];
    }
    
    public Inventario (Articulo [] articulos){
        if(articulos==null){
            contador=0;
            this.articulos=new Articulo[10];
        }else{
            contador=0;
            this.articulos=new Articulo[articulos.length+10];
            for(int ii=0;ii<articulos.length;ii++){
                if(articulos[ii]!=null){
                    this.articulos[contador]=articulos[ii];
                    agregar(articulos[ii]);
                }
            }
        }
    }
    
    public Articulo [] retornar(){
        Articulo [] resultado=new Articulo[contador];
        for(int ii=0;ii<contador;ii++){
            resultado[ii]=articulos[ii];
        }
        return resultado;
    }
    
    public void eliminar(){
        contador=0;
    }

    @Override
    public void agregar(Articulo articulo) {
        garantizarCapacidadArray();
        this.articulos[contador]=articulo;
        contador++;
    }
    
    private void garantizarCapacidadArray(){
        if(contador==articulos.length){
            int tamaño=(articulos.length*2);
            Articulo [] nuevoArray=new Articulo[tamaño];
            for(int ii=0;ii<contador;ii++){
                nuevoArray[ii]=articulos[ii];
            }
            articulos=nuevoArray;
        }
    }

    @Override
    public void agregar(Articulo[] articulos) {
        for(Articulo articulo:articulos){
            agregar(articulo);
        }
    }

    @Override
    public void eliminar(int indice) {
        if(indice>=0 && indice<contador){
            for(int ii=indice;ii<contador -1;ii++){
                articulos[ii] = articulos [ii+1];
            }
            articulos[contador -1]=null;
            contador--;
        }else{
            //FUERA DEL RANGO
        }
    }

    @Override
    public Articulo retornar(int indice) {
        if(indice>=0 && indice<contador){
            return articulos[indice];
        }
        return null;
    }

    @Override
    public Articulo buscar(String nombreArticulo) {
        for(int ii=0; ii<contador;ii++){
            if(articulos[ii].getArticulo().equals(nombreArticulo)){
                return articulos[ii];
            }
        }
        return null;
    }

    @Override
    public Articulo buscar(int indice) {
        if(indice>=0 && indice<contador){
            return articulos[indice];
        }
        return null;
    }

    @Override
    public int cantidadElementos() {
        return contador;
    }
    
    public Articulo buscarPorIndiceIndependiente(int indiceIndependiente){
        for(Articulo articulo: articulos){
            if(articulo != null && articulo.getIndiceIndependiente()==indiceIndependiente){
                return articulo;
            }
        }
        return null;
    }
    
    public void mostrarInventario(){
        
        StringBuilder mensaje=new StringBuilder();
        
        for(int ii=0; ii<contador;ii++){
                mensaje.append("Indice(En el array): ").append(ii)
                .append(", Indice Digitado: ").append(articulos[ii].getIndice())
                .append(", Articulo: ").append(articulos[ii].getArticulo())
                .append(", Precio: ").append(articulos[ii].getPrecio())
                .append(", Cantidad Del Producto: ").append(articulos[ii].getCantidad())
                .append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString(), "Inventario", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
