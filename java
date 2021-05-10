import static java.lang.System.out;

/*
class HelloWorld {  //class - Declaração da Classe, HelloWorld - Nome da Classe
    public static void main(String[] args){ //Método da Classe
        System.out.println("Hello World"); //public static sao modificadores de Acesso do Método
    } //void - tipo de retorno do metodo
} //nome do metodo
*/
// String[] args - parametros\ argumentos do metodo
// system.out....... é o codigo



//Argumentos.... 

/*

class Argumentos{ //Especifica o que o usuario digitar
    public static void main (String[] args){ 
        System.out.println("Você digitou " + args[0]);
    }
}

*/




//Tipos de Erros
// Erros de Sintaxe
// Erros de Semântica
// Erros em Tempo de Execução


//Vantagens Orientada a Objetos
//Reuso de Código
//Reflete o mundo real
//Facilita Manutenção de Código

//Conceitos:
//Classes
//Objetos
//Herança
//Polimorfismo

//Classe:
//Descrição de um grupo de Objetos
//Possui o Nome da classe, conjunto de atributos(descrição), conjunto de métodos(comportamento)
//Herança: Permite reutização da estrutura e do comportamento de uma classe
//Polimorfismo: Habilidade de variáveis terem "mais de um tipo", ou sejam, caracteristica semelhante mas de comportamento diferentes

//Java: pacotes
//instância: é um novo objeto criado dessa classe, com o operador new. Instanciar uma classe é criar um novo objeto do mesmo tipo dessa classe.


/*

public class Variaveis{
    public static void main(String[] args){
        
        int idade=20;
        String nome = "Lincon";
        String nomeDoMeuCachorro = "cachorro";

        idade = 25;
        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);

    }
}



*/


//Tipos Inteiros
//byte 8
//short 16
//int 32
//long 64 


//Ponto Flutuante
//float 32
//double 64

/*

public class VariaveisInteiras{
    public static void main(String[] args){
        byte idade01 = 20;
        short idade02 = 21;
        int idade03 = 22;
        long idade04 = 23;

        System.out.println("Valor Variavel idade01 = " + idade01);
        System.out.println("Valor Variavel idade02 = " + idade02);
        System.out.println("Valor Variavel idade03 = " + idade03);
        System.out.println("Valor Variavel idade04 = " + idade04);


    }
}

*/


/*
public class VariaveisPontoFLutuante{
    public static void main(String[] args){
        double valorPassagem = 2.90;
        float valorTomate = 3.96f;
        System.out.println("valor da Passagem: " + valorPassagem);
        System.out.println("valor do Tomate: " + valorTomate);

    }
}


*/




/*

public class VariaveisChar{

    public static void main(String[] args){
        char o = 'o';
        char i = 'i';
        char interrogacao = 0X00E1;
        System.out.println(""+o+i+interrogacao);
    }
}

*/



public class VariaveisBoolean{

    public static void main(String[] args){
        boolean verdadeiro = true;
        boolean falso = false;
        
        System.out.println("O valor de verdadeiro é: " + verdadeiro);
        System.out.println("O valor de falso é: " + falso);
    }
}
//Forma de organizar suas classes

