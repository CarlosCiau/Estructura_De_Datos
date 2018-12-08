#include <iostream>
#include <stdio.h>
#include <cstring>
#define MAX 500 //define el valor maximo los cuales podrian representar a los nodos y/o vectores
#include <vector> // está pensada para operar con arreglos unidimensionales de datos, los elementos de un vector
                  //pueden ser manipulados de la misma manera en que se hace con las estructuras de arreglos
using namespace std;

vector<int> ady[ MAX ];  //lista de adyacencia
bool visitado[ MAX ];    //para nodos visitados
int V;
int path[ MAX ];         //PATH estar para guardar recorrido que se realizara

//Ver todo el recorrido del grafo de acuerdo al orden ingresado en la lista de adyacencia
bool first; //se declara de tipo boleano ya que puede adoptar valores verdaderos o falsos
    void dfs( int u ){//puntero por eso es de tipo void no devuelve valores

        ( first )? cout << u : cout << " --> "<< u ; //generar el recorrido del nodo raiz hasta pasar todos en forma de cadena
            first = false;//cuando termine la recursion
                visitado[ u ] = true; //el ciclo finaliza al realizar todo el recorrido
        for( int v = 0 ; v < ady[ u ].size(); ++v ){
            if( !visitado[ ady[ u ][ v ] ] ){
                dfs( ady[ u ][ v ] );// metodo recursivo para pasar por los vertices
            }}}

///Ver todos las rutas posibles partiendo de nodo inicial y llegando a uno final, usamos backtracking
//el backtracking es aquel que analiza todos las posibles combinaciones, o en este caso todas las rutas posibles
    int DFS_Todos_los_caminos( int u , int fin , int len ){
        visitado[ u ] = true;
        path[ len ] = u;                    //almaceno en el path el vertice actual
        if( u == fin ){                     //si se llego al final imprimimos ese path
            first = true; //Si se llega al final finaliza
            for( int i = 0 ; i <= len ; ++i ){
                ( first ) ? cout << path[i] : cout << "--> " << path[i] ;
                first = false;
            }
            cout << endl;
            int c;
            cout << "Desea buscar un dato? 1 = si, 0 = no: " ;
            cin >> c;
            if (c == 1){
             int d;
                 cout<<endl<<"Ingrese numero a buscar: ";
                    cin>>d;
               int ban = 0;
              for(int i = 0 ; i <= len ; i++ ){
                if (d == path[i] ){

                 ban=1;
               cout<<endl<<"El numero si se encuentra en el recorrido "<<endl;
                        break; }
                 else{
                    ban=0;
                              }}
                if(ban==0){
                      cout<<endl<<endl<<"El numero no se encuentra en el recorrido"<<endl;
                 }}else{

                 }

            }

       for( int i = 0 ; i < ady[ u ].size(); ++i ){
            int v = ady[ u ][ i ];
            if( !visitado[ v ] ){
                DFS_Todos_los_caminos( v , fin , len + 1 );
                //parte para backtracking, aquellos nodos hoja ya que no poseen adyacentes o ya fueron visitados
               /// visitado[ v ] = false;              //marcamos como no visitado para usarlo posteriormente en otro path
            }}}

int main(){

    int  E , x , y, inicial , final, mayor, mayorr, menor, menorr;
        cout << "Inserte el numero de vertices: ";
            cin >> V;
        cout << "Inserte el numero de aristas: ";
            cin >> E;      //Se definen los numero de vertices y numero de aristas
        cout << "Ingrese origen y destino: " << endl;
            for(int i = 0 ; i < E ; ++i ){
                cin >> x;
                cin >> y;  //en esta parte se definen los Origen y destino
            ady[ x ].push_back( y );
            ady[ y ].push_back( x );
             if (i == 0){//busca el mayor de las x
                    mayor = x;
                        menor = x;
                }else{
                    if (x > mayor ) mayor = x;
                        if (x < menor ) menor = x;
                }
                if (i == 0){//busca el mayor de las y
                    mayorr = y;
                        menorr = y;
                }else{
                    if (y > mayorr ) mayorr = y;
                        if (y < menorr ) menorr = y;
                }
}
    first = true;

    //Veremos todo el recorrido del grafo iniciando en el vertice ingresado
            int op;
            do{
            cout << endl <<"Que desea hacer: " << endl;
            cout << "1. Ver todo el grafo " << endl;
            cout << "2. Ver el mayor " << endl;
            cout << "3. Ver el menor " << endl;
            cout << "4. Hacer un recorrido " << endl;
            cout << "5. Salir " << endl;
            cin >> op;

    switch(op){
        case 1:

        cout << "Grafo representado a partir de dos nodos raiz: " << endl << endl; //se define el nodo inicial por el usuario

             if (mayor > mayorr){
                memset( visitado , 0 ,sizeof( visitado ) );
                    dfs( mayor );
            }else{
                memset( visitado , 0 ,sizeof( visitado ) );
                    dfs( mayorr );}
            cout << "\n";
            if (menor < menorr){
                memset( visitado , 0 ,sizeof( visitado ) );
                    dfs( menor );
            }else{
                memset( visitado , 0 ,sizeof( visitado ) );
                    dfs( menorr );}
            cout << endl;

        break;
        case 2:

            if (mayor > mayorr){
            cout << "El vertice mayor es: " << mayor << endl;
            }else{
                cout << "El vertice mayor es: " << mayorr << endl;}

            break;
        case 3:

            if (menor < menorr){
            cout << "El vertice menor es: " << menor << endl;
            }else{
                cout << "El vertice menor es: " << menorr << endl;}

            break;
        case 4:

            cout << "Recorrido de un punto A a B: ";
            cout << endl << "Ingrese A: "; //se define el nodo inicial por el usuario
            cin >> inicial;
            memset( visitado , 0 , sizeof( visitado ) );        //inicializar a no visitado
            cout << "Ingrese B: ";//se puede definir el final del recorrido del grafo
            cin >> final;
            cout << "El recorrido es: " << endl << endl;
            DFS_Todos_los_caminos( inicial , final , 0 );  ///recorrido final
            break;
        case 5:

            cout << endl <<"Ha salido del programa... ";
            return 0;

            }}while(op <= 5);

            cout << "GRACIAS";
}
