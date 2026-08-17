/**
 * Programa com o objetivo de:
 * - Apresentar operadores aritméticos em Java
 * - Explicar divisão inteira, divisão real e operador módulo (%)
 *
 * Autor: Professor Lorenzon, 2026-1
 */

void main() {

    // divisão inteira e flutuante
    int div;
    int resto;
    int v1, v2 = 0;

    // fazendo uma divisão inteira
    v1 = 10;
    v2 = 3; // v2 não pode ser 0
    div = v1 / v2;
    IO.println("O resultado da divisão inteira de " + v1 + " / " + v2
            + " é " + div);

    // Extraindo o resto com o operador módulo
    v1 = 51;
    v2 = 2; // v2 não pode ser 0
    resto = v1 % v2;
    IO.println("O resto da divisão inteira de " + v1 + " / " + v2
            + " é " + resto);

    // Pegadinha: divisão com int retorna int mesmo se atribuído a double
    double real;
    v1 = 10;
    v2 = 3;
    real = v1 / v2; // Ainda será 3.0 (pois v1 e v2 são int)
    System.out.printf("\nDivisão decimal esperada? %d / %d = %.3f : Ops!", v1, v2, real);

    // Correto: forçar pelo menos um valor a ser double (casting)
    real = (double) v1 / v2;
    System.out.printf("\nAgora sim: divisão decimal de %d / %d = %.3f", v1, v2, real);

    // Contagem e Acumulação: estrutura base de qualquer algoritmo de repetição
    int atributo = 9; // valor inicial
    int contador = 0;
    int acumulador = 0;

    // Acumulador: somando valores de forma explícita e simplificada
    acumulador = acumulador + atributo; // forma tradicional
    acumulador += atributo; // forma compacta

    // Contador: incrementos equivalentes
    contador = contador + 1;
    contador += 1;
    ++contador;
    contador++; // todas resultam no mesmo efeito: +1

    // Observação: os operadores +=, -=, *=, /= funcionam também com outros tipos

    // Operação unária: sinal negativo
    IO.println("Valor original de atributo: " + atributo);
    atributo = -atributo; // torna negativo
    atributo = atributo * -1; // inverte novamente (negativo * -1 = positivo)
    IO.println("Valor final de atributo após inversões: %d\n" + atributo);
}