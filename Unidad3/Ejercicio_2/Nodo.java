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
public class Nodo {
    String dato;
    Nodo next; //Puntero enlace
 
    public Nodo(String x)
    {
        dato = x;
        next = null;
    }
}
