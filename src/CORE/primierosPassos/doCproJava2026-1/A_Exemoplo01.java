/* 
 Programa inicial de IO Java. LTS 25
 
 Objetivo:
 - Apresentar estrutura básica de um programa Java Compact Source Code.
 - Declarar e utilizar variáveis primitivas.
 - Demonstrar a leitura e saída formatada de dados usando IO +
   classes wrapper e String.

 Conceitos abordados:
 - Método `main` como ponto de entrada
 - Declaração de variáveis primitivas
 - Saída de dados `System.out.printf` e `IO.println`
 
 Autoria: Professor Lorenzon, revisão 2026-2.
*/

void main() {

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
  IO.println("Insira um valor inteiro: ");
  String aux = IO.readln();
  valorInteiro = Integer.parseInt(aux);

  aux = IO.readln("Insira um valor flutuante: ");
  valorDecimal = Double.parseDouble(aux);
  // valorFlutuante = (float)valorDecimal; //Casting para float

  // Na saída abaixo os novos valores, observando os usos de println
  IO.println("\n\nOs novos valores ficaram:");

  // Usando agora o println com concatenado e auto conversão de valores pra String
  IO.println("Novos valores:Inteiro: " + valorInteiro +
      " Decimal: " + valorDecimal +
      " Booleano: " + islogicoVerdadeiro);
}
