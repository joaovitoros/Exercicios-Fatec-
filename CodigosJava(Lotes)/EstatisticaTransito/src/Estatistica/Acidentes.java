//Sistema de estatíticas de acidentes de 2017;
//Autor: André Luís Mendes;
//Data 26/10/2017;
package Estatistica;

//Classe construtora
class Acidentes {

    int codigo;
    String NCidade;
    int quantidade;
    int tipo;

    //Método construtor
    Acidentes() {

        //Formatando método de I/O
        this(0, "", 0, 0);

    }

    //Trabalhando as variáveis sem alterar os valores originais    
    Acidentes(int cod, String NCid, int qtd, int tp) {

        cod = codigo;
        NCid = NCidade;
        qtd = quantidade;
        tp = tipo;

    }

}
