/*

1. Faça um programa que receba notas de um aluno, considerando 3 notas de entrada. 
A seguir, dê a possibilidade de cálculo de média aritmética e ponderada para o usuário 
calcular a média do aluno. 
No caso de média ponderada, solicite o peso de cada nota. 
Apresente ao final a média do aluno e indique se ele está aprovado ou
não, dependendo da média mínima estipulada para o caso

*/

import utilitarios.Teclado;
import utilitarios.Video;

public class App {

    private final static double _MEDIA_APROVACAO = 6.0; // Novidade!

    public static void main(String[] args) {

        double nota1 = 0, nota2 = 0, nota3 = 0;
        double peso1, peso2, peso3, media = 0;

        Video.exibirCabecalho("Calculadora de médias!");

        nota1 = Teclado.solicitarDouble("Informe a primeira nota:");
        nota2 = Teclado.solicitarDouble("Informe a segunda nota:");
        nota3 = Teclado.solicitarDouble("Informe a terceira nota:");

        switch (exibirMenuOpcaoMedia()) {

            case 1 -> {
                // Video.exibirBarraProgresso(10, 50);
                media = calcularMediaAritmetica(nota1, nota2, nota3);
            }

            case 2 -> {
                peso1 = Teclado.solicitarDouble("Informe o peso da primeira nota:");
                peso2 = Teclado.solicitarDouble("Informe o peso da segunda nota:");
                peso3 = Teclado.solicitarDouble("Informe o peso da terceira nota:");
                // Video.exibirBarraProgresso(10, 50);
                media = calcularMediaPonderada(nota1, nota2, nota3, peso1, peso2, peso3);
            }

        }

        Video.exibirBarraProgresso(10, 50);
        exibirResultados(media);

        Video.exibirRodape("Fim de execução!");

    }

    // Funções Membro

    static int exibirMenuOpcaoMedia() {

        int opcaoMedia;
        boolean flag;

        Video.exibirMensagem("\nMenu de médias:");
        Video.exibirMensagem("1 - Aritmética.");
        Video.exibirMensagem("2 - Ponderada.\n");
        Video.exibirSeparador();
        flag = true;
        do {
            opcaoMedia = Teclado.solicitarInt("Qual sua opção?");
            flag = (opcaoMedia != 1 && opcaoMedia != 2);
        } while (flag);

        return opcaoMedia;
    }

    static boolean estaAprovado(double notaIndividual, final double mediaAprovacao) {

        if (notaIndividual >= mediaAprovacao) {
            return true;
        }

        return false;
    }

    static void exibirResultados(double mediaCalculada) {

        // Guardian clause
        if (mediaCalculada == -1) {
            Video.exibirMensagemErro("Não foi possível calcular os resultados!");
            // Early return
            return;
        }

        // Fail first
        if (!estaAprovado(media, _MEDIA_APROVACAO)) {
            Video.exibirMensagemAlerta("Aluno reprovado com a média: " + mediaCalculada);
            return;
        }

        // happy path
        Video.exibirMensagemInformativa("Aluno aprovado com a média: " + mediaCalculada);

    }

    static double calcularMediaAritmetica(double nota1, double nota2, double nota3) {

        if (!validarNotas(nota1, nota2, nota3)) {
            return -1;
        }

        return (nota1 + nota2 + nota3) / 3;
    }

    static double calcularMediaPonderada(double nota1, double nota2, double nota3,
            double peso1, double peso2, double peso3) {

        if ((peso1 + peso2 + peso3) != 10) {
            return -1;
        }

        if ((peso1 <= 0) || (peso2 <= 0) || (peso3 <= 0)) {
            return -1;
        }

        if (!validarNotas(nota1, nota2, nota3)) {
            return -1;
        }

        return (((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / 10);
    }

    static boolean validarNotas(double nota1, double nota2, double nota3) {

        // Refatorar, juntar em um teste de faixa
        if (nota1 < 0 || nota2 < 0 || nota3 < 0) {
            return false;
        }

        if (nota1 > 10 || nota2 > 10 || nota3 > 10) {
            return false;
        }

        return true;
    }

}
