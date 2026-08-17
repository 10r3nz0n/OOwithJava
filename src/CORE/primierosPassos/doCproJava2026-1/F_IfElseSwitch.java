/**
 * Programa com o objetivo de:
 * - Apresentar estruturas de controle de fluxo com condição (if, else, switch)
 * - Mostrar boas práticas de uso de blocos e operadores lógicos
 *
 * Autor: Professor Lorenzon, 2026-1
 */

void main() {

  // Variáveis de controle
  boolean resultado = true;
  int a = 0, b = 0;
  int opcao = 0;
  String mensagem = "";

  // Operação relacional
  resultado = (a == b); // true, já que ambos são zero

  // IF simples
  if (resultado) { // boa prática: sempre usar blocos {}
    mensagem = "O resultado foi verdadeiro";
  }
  IO.println(mensagem);

  // IF/ELSE (duplo)
  if (resultado) {
    mensagem = "O resultado foi verdadeiro";
  } else {
    mensagem = "O resultado foi falso";
  }
  IO.println(mensagem);

  // Operador ternário (condição ? valorTrue : valorFalse)
  IO.println(resultado ? "O resultado foi verdadeiro" : "O resultado foi falso");

  // SWITCH/CASE – múltiplas escolhas
  opcao = Integer.parseInt(IO.readln("Escolha uma opção às cegas (1 a 5): "));

  switch (opcao) { // ver alternativa switch menos verboso, mas perde o vários cases
    case 1:
      IO.println("Opção 1 escolhida!");
      break;

    case 2:
      IO.println("Opção 2 escolhida!");
      // break; Omitido proposital, cai no no 2 e no 3

    case 3:
      IO.println("Opção 3 escolhida!");
      break;

    case 4:
      IO.println("Opção 4 escolhida!");
      break;

    case 5:
      IO.println("Opção 5 escolhida!");
      break;

    default:
      System.out.println("Opção escolhida inválida!");
      break;
  }

  // mesmo sem break

  switch (opcao) { // ver alternativa switch menos verboso, mas perde o vários cases
    case 1 -> {
      IO.println("Opção 1 escolhida!");
    }

    case 2 -> {
      IO.println("Opção 2 escolhida!");
      // break; Omitido proposital, cai no no 2 e no 3
    }

    // ... assim por diante, use blocos

    default -> {
      IO.println("Opção escolhida inválida!");
    }

  }

}