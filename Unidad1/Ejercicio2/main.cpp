#include <iostream>
#include <cstdlib>
#include <Palabras.h>

using namespace std;



int main ()
{
    Palabras A;

            char opcion;
                cout << "Hola este es el ahorcado ¿Deseas jugar?\n";
                cout << "n=si       s=no\n";
                    cin >> opcion;
                cout << "\nHasta la proxima";

                while (opcion == 'S'|| opcion == 's'){
            string original, Linea;
            char letra;
            int oportunidades = 6;

            bool acertado = false;
                Linea= A.cadena_de_Lineas(original);
                while(oportunidades>0 && !acertado)
                {
            system("cls");
            cout << endl << "Comenzamos con el juego del ahorcado, cada letra puede costarte la vida";
            cout << endl << "                               ¡DIVIERTETE!";
                cout << endl << "Te quedan " << oportunidades << " oportunidades";
                cout << endl << "Palabra a adivinar: " << Linea;
                cout << endl << "Introduce la letra: ";
                cin >> letra;
                oportunidades--;
                acertado= A.palabra_acertada(original,Linea,letra);
                }
            if (acertado){
                cout << endl << " FELICIDADES :), tu palabra es: " <<original<< endl;
            }else{
                cout << endl << " SUERTE PARA LA PROXIMA :(  la palabra CORRECTA es: " <<original<< endl;
                }

                cout << "¿Desea participar de nuevo?\n";
                 cout << "s=si       n=no\n";
                cin >> opcion;

                cout << "\nHasta la proxima :)\n";
                }
                return 0;
}

