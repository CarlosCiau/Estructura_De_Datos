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
import java.util.Scanner; 
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    
   public static void main(String[] args) 
   {
       
   Scanner teclado = new Scanner(System.in);
            System.out.print("Ingresa palabra o frase: ");
   String cadena = teclado.nextLine();
   ClassPila p= new ClassPila(cadena.length());
        for (int i=0;i<cadena.length();i++)
        
    {
        p.insertar(cadena.charAt(i));
    }
        
            System.out.println("\nEl orden inverso de sus datos es : ");
            System.out.println("");
                    p.despilar();

            System.out.println("\nSus Datos fueron impresos de forma correcta :)");
}
    }
