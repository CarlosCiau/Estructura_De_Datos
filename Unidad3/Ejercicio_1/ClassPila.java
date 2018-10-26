/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

/**
 *
 * @author Carlos Daniel
 */

public class ClassPila
{
    char Pila[];
    int top;
    
    
//constructor de pila
public ClassPila (int tamano)
    {
     Pila=new char [tamano];
     top=0;
    }


    //Metodo Para agregar datos a la pila
public void insertar(char letra){
     Pila[top]=letra;
     top++;
    }


public void despilar(){
     while (top>0)
        {
            top --;
System.out.println(Pila[top]);
        }
    }
}
