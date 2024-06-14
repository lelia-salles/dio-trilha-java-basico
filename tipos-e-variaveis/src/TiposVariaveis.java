public class TiposVariaveis{
/**
 * Constantes são escritas em Upper Case (Caixa Alta) e precisam
 * ter a palavra reservada final antes do tipo de dado
 * Constants must be written in UpperCase and have to have the 
 * reserved word final before the data type
 */
   public static void main(String[] args) throws Exception{

    final String NAME = "Lelia Salles";
    /*em portugues seria escrito double salarioMinimo = 2,500 
    a representaçao para mil é double salarioMinimo = 2500; 
     */ 
    double salarioMinimo = 2.500;
    // float precisa terminar com F para não confundir com double
    float pi = 3.14F;
    // não é recomendado usar int começando com um valor que seja zero
    int cep = 70000000
    //long precisa ser diferenciado com L no fim
    long cpf = 6256783940292737L;
    /* não se pode atribuir um valor com tipo de dado    
     diferente da variável, deve-se converter o valor da atribuição
     ao tipo de dado da variável. Não é praxe fazer da forma abaixo
     servindo apenas como exemplo     
     */ 
    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    short numeroCurto2 = (short) numeroNormal;

    System.out.println("Hello, world! My name is :" + NAME + 'my zip code is: ' + cep + "and the value of PI is: " pi)

   }



}
