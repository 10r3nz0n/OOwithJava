#include <stdio.h>
#include "funcoes.h"

int main() {
    const double MEDIA_APROVACAO = 6.0;

    double nota1 = 0.0;
    double nota2 = 0.0;
    double nota3 = 0.0;

    int opcao = 0;

    int peso1 = 0;
    int peso2 = 0;
    int peso3 = 0;

    double media = -1.0;

    printf("Calculadora de medias!\n");
    
    printf("Informe a primeira nota: ");
    if (scanf("%lf", &nota1) != 1) {
        printf("Entrada invalida.\n");
        return 0;
    }

    printf("Informe a segunda nota: ");
    if (scanf("%lf", &nota2) != 1) {
        printf("Entrada invalida.\n");
        return 0;
    }

    printf("Informe a terceira nota: ");
    if (scanf("%lf", &nota3) != 1) {
        printf("Entrada invalida.\n");
        return 0;
    }

    opcao = solicitarOpcaoMedia();

    if (opcao == 1) {
        media = calcularMediaAritmetica(nota1, nota2, nota3);
    } else {
        printf("\nInforme o peso da primeira nota (inteiro): ");
        if (scanf("%d", &peso1) != 1) {
            printf("Entrada invalida.\n");
            return 0;
        }

        printf("Informe o peso da segunda nota (inteiro): ");
        if (scanf("%d", &peso2) != 1) {
            printf("Entrada invalida.\n");
            return 0;
        }

        printf("Informe o peso da terceira nota (inteiro): ");
        if (scanf("%d", &peso3) != 1) {
            printf("Entrada invalida.\n");
            return 0;
        }

        media = calcularMediaPonderada(nota1, nota2, nota3, peso1, peso2, peso3);
    }

    exibirResultados(media, MEDIA_APROVACAO);

    printf("Fim de execucao!\n");
    

    return 0;
}