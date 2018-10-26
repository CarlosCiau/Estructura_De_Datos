/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

/**
 *
 * @author Carlos Daniel
 */
public class Pila {
    private Nodo cima;
 
    public Pila()
    {
        cima = null;
    }
    
    public void insertar(String elemento)
    {
        Nodo nuevo;
        nuevo = new Nodo(elemento);
        nuevo.next = cima;
        cima = nuevo;
    }
       
    public String quitar()
    {                 
        String aux = cima.dato;
        cima = cima.next;
        return aux;
    }
}
