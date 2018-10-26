/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;
import java.util.Scanner;

/**
 *
 * @author Carlos Daniel
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner Teclado = new Scanner (System.in);
        Pila p = new Pila();
        Cola c = new Cola();
        System.out.print ("Introduce el número de elementos a ingresar: ");
        int n = Teclado.nextInt();
        System.out.println ("\nIntroduce los elementos que contendra la pila: ");
        String e;
        for (int i=1; i<=n; i++)
        {
            System.out.print ("Pocision "+i+": ");
            e=Teclado.next();
            p.insertar(e);
        }
 
        System.out.println ("\nLos datos han sido introducidos de forma correcta :)");
        System.out.println("*******************************************************");
        System.out.println("*******************************************************");
        System.out.println ("Salida impresa de los Datos de la cola");        
        for (int i=1; i<=n; i++)
        {
            c.insertar(p.quitar());
            System.out.println ("Lugar "+i+": "+c.quitar());
        }
    }
    
}
