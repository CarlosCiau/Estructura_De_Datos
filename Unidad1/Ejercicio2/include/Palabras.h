#ifndef PALABRAS_H
#define PALABRAS_H
#include <iostream>
#include <cstdlib>
#include <vector>
#include <ctime>



using namespace std;


class Palabras
{
    public:
        Palabras() {}

            string cadena_de_Lineas(string &cadena)
                    {
                    string Aster;
                    int i;
                    cadena = Palabra_alea();
                    Aster.clear();
                    for(i=0;i<cadena.size();i++)
                    Aster+= '*' ;
                    system("cls");
                    return Aster;
                    }

            bool palabra_acertada(string original, string &cad_averiguar, char letra)
                    {
                    int i;
                    for(i=0;i<original.size();i++)
                    if(original[i]==letra)
                    cad_averiguar[i]=letra;
                    return (original==cad_averiguar);
                    }

            string Palabra_alea(){
                    vector<string>Palabn;
                    Palabn.push_back("perro");
                    Palabn.push_back("tigre");
                    Palabn.push_back("leon");
                    Palabn.push_back("rinoceronte");
                    Palabn.push_back("cocodrilo");
                    Palabn.push_back("coyote");
                    Palabn.push_back("calamar");
                    Palabn.push_back("ballena");
                    Palabn.push_back("tiburon");
                    Palabn.push_back("hormiga");
                    Palabn.push_back("zopilote");
                    Palabn.push_back("tlacuache");

                    return Palabn[NumeroPala()];
                    }

            int NumeroPala(){
                int numero;
                srand (time(NULL));
                numero = rand() % 12;
                return numero;
            }

    protected:

    private:
};

#endif // PALABRAS_H
