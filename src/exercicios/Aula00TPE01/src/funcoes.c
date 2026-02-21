#include <stdio.h>
#include "funcoes.h"

static void limparBufferEntrada(void) {
    int c = 0;
    do {
        c = getchar();
    } while (c != '\n' && c != EOF);
}

int solicitarOpcaoMedia(void) {
    int opcao = 0;
    int ok = 0;

    do {
        printf("\nMenu de medias:\n");
        printf("1 - Aritmetica\n");
        printf("2 - Ponderada\n");
        printf("Qual sua opcao? ");

        ok = scanf("%d", &opcao);
        if (ok != 1) {
            printf("Entrada invalida. Informe 1 ou 2.\n");
            limparBufferEntrada();
            opcao = 0;
        } else {
            limparBufferEntrada();
        }
    } while (opcao != 1 && opcao != 2);

    return opcao;
}

int validarNotas(double nota1, double nota2, double nota3) {
    if (nota1 < 0.0 || nota1 > 10.0) {
        return 0;
    }
    if (nota2 < 0.0 || nota2 > 10.0) {
        return 0;
    }
    if (nota3 < 0.0 || nota3 > 10.0) {
        return 0;
    }
    return 1;
}

double calcularMediaAritmetica(double nota1, double nota2, double nota3) {
    if (!validarNotas(nota1, nota2, nota3)) {
        return -1.0;
    }
    return (nota1 + nota2 + nota3) / 3.0;
}

double calcularMediaPonderada(double nota1, double nota2, double nota3, int peso1, int peso2, int peso3) {
    int somaPesos = peso1 + peso2 + peso3;

    if (somaPesos != 10) {
        return -1.0;
    }
    if (!validarNotas(nota1, nota2, nota3)) {
        return -1.0;
    }

    return ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / 10.0;
}

void exibirResultados(double media, double mediaAprovacao) {
    printf("\nProcessando: [##########]\n\n");

    if (media < 0.0) {
        printf("Erro: nao foi possivel calcular os resultados!\n");
        return;
    }

    if (media < mediaAprovacao) {
        printf("Aluno reprovado com a media: %.2f\n", media);
        return;
    }

    printf("Aluno aprovado com a media: %.2f\n", media);
}