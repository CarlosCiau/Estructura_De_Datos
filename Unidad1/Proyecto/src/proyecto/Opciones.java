package proyecto;


public class Opciones {
    private String vector[];
     public Opciones (String vector [] ){
        this.vector = vector;
     }
     public void ordenar(){
       for ( int i =0; i<vector.length;i++){
           for (int j=0;j<vector.length && i !=j; j++){
               if (vector[i].compareToIgnoreCase(vector[j]) < 0){
                   String aux = vector [i];
                   vector [i] = vector [j];
                   vector [j] = aux;
          }
               
       }
     }
       for (String a: vector){
             System.out.println(a);
         }
     }


     public void BuscarNombre(String nombre){
         int cont=0;
     for (int i=0; i<vector.length; i++)
    {
        if(vector[i].equals(nombre)){
            cont++;
        }
    }
     if(cont>0)
         System.out.println("El nombre: "+nombre+" si se encuentra en la lista");
     else
        System.out.println("El nombre: "+nombre+" no se encuentra en la lista");

     cont=0;    
     }
}