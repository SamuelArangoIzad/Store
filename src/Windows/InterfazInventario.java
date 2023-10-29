/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Windows;

/**
 *
 * @author samue
 */
interface InterfazInventario {
    void agregar(Articulo articulo);
    void agregar(Articulo[] articulos);
    void eliminar(int indice);
    Articulo retornar(int indice);
    Articulo buscar(String nombreArticulo);
    Articulo buscar(int indice);
    int cantidadElementos();
    
}
