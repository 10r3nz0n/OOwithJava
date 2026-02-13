
/* 
 Programa inicial de I/O Java
 Objetivo:
 - Fazer uso de entradas e saídas pela classe utilitária `Teclado`.
 - Apresentar estrutura básica de um programa Java.
 - Declarar e utilizar variáveis primitivas.
 - Demonstrar a leitura e saída formatada de dados.

 Conceitos abordados:
 - Organização de pacotes (`package`)
 - Importação de classes (`import`)
 - Método `main` como ponto de entrada
 - Declaração de variáveis primitivas
 - Entrada de dados customizada via classe `Teclado`
 - Saída de dados com `System.out.println` e `System.out.printf`
 
 Autoria: Professor Lorenzon, revisão 2026-1.
*/
import java.util.Scanner;
import utilitarios.Teclado;

public class A_Exemoplo01 { // inicio da classe

  // Método principal: onde a execução começa
  public static void main(String args[]) {

    // Tipos primitivos de dados com camelCase
    int valorInteiro = 0; // padrão de inicialização é 0
    boolean islogicoVerdadeiro = true; // padrão de inicialização é false
    // OBS: Evitar o uso de float, prefira double para maior precisão.
    float valorFlutuante = 3.14f; // ou double sem f
    // ERRO COMUM: tentar usar vírgula como separador decimal sem tratamento.
    double valorDecimal = 1.0; // prefira double e use . para casa demimal
    // char também é um tipo primitivo em C, mas String não é.
    char umaLetra = 'A';
    umaLetra = 'B';
    // Cadeias de caracteres usaremos a classe String, logo mais...

    // float é menos preciso que double. Ao converter de double para float, é
    // necessário "casting":
    // valorFlutuante = (float) Teclado.readDouble();

    // %d = inteiro, %.2f = float com 2 casas, %b = booleano
    // System.out.println: saída simples, vantagem de auto conversão pra String
    // System.out.printf: saída formatada, estilo C, exige especificadores

    System.out.printf("Valores inicializados:\n\nInteiro: %d\nDecimal: %.2f\nBooleano: %b\n", // uso de formatadores
        valorInteiro,
        valorFlutuante,
        islogicoVerdadeiro);

    // leitura dos valores e escrita dos mesmos via usuário

    Scanner objetoScanner = new Scanner(System.in); // Usando Scanner e tendo problemas
    System.out.println("Insira um valor inteiro: ");

    valorInteiro = objetoScanner.nextInt();
    // objetoScanner.close();

    // Desviando Sacnner com Teclado:

    // System.out.println ("\n\nInsira um valor inteiro:");
    valorInteiro = Teclado.solicitarInt("\n\nInsira um valor inteiro:");

    System.out.println("Insira um valor decimal, entrada com \",\" :"); // curiosidade aqui
    valorDecimal = Teclado.solicitarDouble();
    // valorFlutuante = ((float)Teclado.readDouble()); //Casting

    // Na saída abaixo os novos valores, observando os usos de print ln e f
    System.out.println("\n\nOs novos valores ficaram:");

    // Usando agora o println com concatenado e auto conversão d valores pra String
    System.out.println("Novos valores:\n\nInteiro: " + valorInteiro +
        "\nDecimal: " + valorDecimal +
        "\nBooleano: " + islogicoVerdadeiro);
  } // fim de main

} // fim da classe
