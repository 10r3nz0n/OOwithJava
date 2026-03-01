#include <stdio.h>

int main() {
    const double MEDIA_APROVACAO = 6.0;

    double nota1 = 0.0, nota2 = 0.0, nota3 = 0.0;
    int opcao = 0;
    int peso1 = 0, peso2 = 0, peso3 = 0;
    double media = -1.0;

    printf("Calculadora de medias!\n");
    printf("Informe a primeira nota: ");
    scanf("%lf", &nota1);
    printf("Informe a segunda nota: ");
    scanf("%lf", &nota2);
    printf("Informe a terceira nota: ");
    scanf("%lf", &nota3);

    do {
        printf("\nMenu de medias:\n");
        printf("1 - Aritmetica\n");
        printf("2 - Ponderada\n");
        printf("Qual sua opcao? ");
        scanf("%d", &opcao);
    } while (opcao != 1 && opcao != 2);

    if (opcao == 1) {
        if (nota1 < 0.0 || nota2 < 0.0 || nota3 < 0.0 || 
       nota1 > 10.0 || nota2 > 10.0 || nota3 > 10.0) {
            media = -1.0;
        } else {
            media = (nota1 + nota2 + nota3) / 3.0;
        }
    } else {
        printf("\nInforme o peso da primeira nota (inteiro): ");
        scanf("%d", &peso1);
        printf("Informe o peso da segunda nota (inteiro): ");
        scanf("%d", &peso2);
        printf("Informe o peso da terceira nota (inteiro): ");
        scanf("%d", &peso3);
        if ((peso1 + peso2 + peso3) != 10) {
            media = -1.0;
        } else if (nota1 < 0.0 || nota2 < 0.0 || 
                   nota3 < 0.0 || nota1 > 10.0 || 
                   nota2 > 10.0 || nota3 > 10.0) {
            media = -1.0;
        } else {
            media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) 
                     / 10.0;
        }
    }

    printf("\nProcessando: [##########]\n\n");

    if (media == -1.0) {
        printf("Erro: nao foi possivel calcular os resultados!\n");
    } else if (media < MEDIA_APROVACAO) {
        printf("Aluno reprovado com a media: %.2f\n", media);
    } else {
        printf("Aluno aprovado com a media: %.2f\n", media);
    }
    
    printf("Fim de execucao!\n"); 

    return 0;
}
