/**
 * Programa com o objetivo:
 * - Apresentar estruturas de repetição: while, do-while
 * - Usar break e continue
 * - Aplicar contadores e sinalizadores (flags)
 *
 * Autor: Professor Lorenzon, 2026-1
 */

void main() {

    int cont = 0;
    boolean flag = false;

    // Estrutura WHILE clássica
    cont = 0; // inicialização
    while (cont < 5) { // condição satisfeita (verdadeira) para entrar
        // processamento
        cont++; // satisfação da nova condição
    } // fim do bloco de repetição

    cont = 0; // inicialização
    while (true) {// forçando o laço, estilo repeat-until
        cont++;
        flag = true;
        if (cont == 5) { // aqui a condição que poderia estar no while (aqui)
            break;
        }
    } // fim do bloco de repetição

    IO.println("Executei " + cont + "iterações do laço com contador");
    IO.println("Executei alguma vez o laço? " + flag);

    cont = 0;
    do {
        cont++;
    } while (cont < 5); // O while true como um repeat - until, bem vindo!

    // nenhuma execução do laço
    String executei = "não";
    boolean condicao = false;

    while (condicao) {
        executei = "sim";
    }
    IO.println("Executei o while? " + executei + "\n\n");

    // break e continue
    int numero;
    int c = 0;
    int a = 0;

    // processar apenas números positivos, 5 números
    while (true) {
        numero = Integer.parseInt(IO.readln("Informe um valor:"));
        if (numero < 0)
            continue;
        a += numero;
        c++;
        if (c == 5)
            break;
    }
}
