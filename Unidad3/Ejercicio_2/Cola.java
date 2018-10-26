/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

/**
 *5
 * @author Carlos Daniel
 */
public class Cola {
    protected Nodo Front;
    protected Nodo End;
    
    public Cola()
    {
        Front = End = null;
    }
    
    public void insertar(String elemento)
    {
        Nodo a;
        a = new Nodo(elemento);
        if (colaVacia()) 
        {
            Front = a;
        } else {
            End.next = a;
        }
            End = a;
    }
    
    public String quitar()
    {
        String aux;
        if (!colaVacia())
        {
            aux = Front.dato;
            Front = Front.next;
        } else {
            return "";
        }
            return aux;
    }
    
    public boolean colaVacia()
    {
        return Front==null;
    }
    
}
