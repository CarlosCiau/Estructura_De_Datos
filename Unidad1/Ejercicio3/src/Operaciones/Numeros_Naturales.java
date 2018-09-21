/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Daniel
 */
public class Numeros_Naturales {
//ATRIBUTOS DEL LA CLASE
    int numero;
    int numero2;
    int suc;
    int ant;
    int s;
    int m;
    int r;
    

//METODOS QUE OFRESERA LA CLASE
    

//INGRESO DE DATOS     
 public void Ingresar(){
   numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));//iNGRESAMOS ESTE CODIGO PARA QUE PUEDE INFRESAR LOS DATOS
   numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
 }
 
 //OPERACION QUE DETERMINA AL SUCESOR
 public void Sucesor(){
 suc=numero+1; 
 }
 //OPERACION QUE DERTERMINA AL ANTECESOR
 public void Antecesor(){
 ant=numero-1;    
 }
 //OPERACION QUE DETERMINA LA IGUALDAD A "0"
 public void Escero(){
     if (numero<=0){
        System.out.println("El numero es cero");                  
    } else{
    System.out.println ("El numero no es cero");
     }
 }
 //OPERACION SUMA DE NUMEROS
 public void Suma(){
     s=numero+numero2;    
 }
 //OPERACION RESTA PARA DETERMNINAR LA DIFERENCIA
 public void Resta(){
     r=numero-numero2;
 }
 //OPERACION QUE DETERMINA LA IGUALDAD DE NUMEROS
 public void Igual(){
     if (numero == numero2){
         System.out.println("Los numero son iguales");
     }     
 }
 //OPERACION NUMERO MENOR
 public void Menor(){
     if (numero <= numero2){
      System.out.println("El numero menor es: "+numero);}else{
      System.out.println("El numero menor es: "+numero2);
 
 }}

 
//IMPRECION DE LOS RESULTADOS         
 public void MostrarResultado(){   
     System.out.println("El sucesor del primer numero es: "+suc);
     System.out.println("El antecesor del primer numero es: "+ant);
     System.out.println("La suma es: "+s);
     System.out.println("La diferencia es: "+r);
 }
         
    
}
