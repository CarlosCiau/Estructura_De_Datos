/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author Carlos Daniel
 */
public class Ejercicio_2 {
     public static void main(String[] args) {
     
        Decimal_a_Binario X = new Decimal_a_Binario();
        
        Scanner sc = new Scanner(System.in);
        int n;
       
            System.out.print("Introduzca un numero decimal para su conversion: ");
            n = sc.nextInt();
        
        System.out.println();
        System.out.print("Binario: ");
        Decimal_a_Binario.decBin(n);
        System.out.println();
        
    }
}
