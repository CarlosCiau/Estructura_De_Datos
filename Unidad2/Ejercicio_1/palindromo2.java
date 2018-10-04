
package palindromo;

public class palindromo2 {
  
public boolean espalindromo(String cadena){
    int i=0;
    int j = cadena.length();
   
   if (cadena.charAt(i) == cadena.charAt(j -1)){
       System.out.println("La palabra ingresada SI es un palindromo :)");
       return true;
   }else { 
       System.out.println("La palabra ingresada No es un palindromo :(");
       return false; 
   }
}}
