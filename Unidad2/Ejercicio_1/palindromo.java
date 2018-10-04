/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;
import java.util.*;

/**
 *
 * @author Carlos Daniel
 */
public class palindromo {
    
   public static void main(String[] args) {
       String cadena;
       
       
       palindromo2 p = new palindromo2(); 
               
       Scanner teclado= new Scanner(System.in);
       System.out.println("Ingresa la frase o palabra para verificar");
       cadena = teclado.nextLine();
       p.espalindromo(cadena);
       

}

}