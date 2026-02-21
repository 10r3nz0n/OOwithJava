import utilitarios.Teclado;
import utilitarios.Video;

public class App {

    public static void main(String[] args) {

        final double MEDIA_APROVACAO = 6.0;

        double nota1;
        double nota2;
        double nota3;

        int opcaoMedia;

        int peso1;
        int peso2;
        int peso3;

        double media = -1.0;

        Video.exibirCabecalho("Calculadora de medias!");

        nota1 = Teclado.solicitarDouble("Informe a primeira nota:");
        nota2 = Teclado.solicitarDouble("Informe a segunda nota:");
        nota3 = Teclado.solicitarDouble("Informe a terceira nota:");

        Video.exibirMensagem("\nMenu de medias:");
        Video.exibirMensagem("1 - Aritmetica.");
        Video.exibirMensagem("2 - Ponderada.\n");
        Video.exibirSeparador();

        do {
            opcaoMedia = Teclado.solicitarInt("Qual sua opcao?");
        } while (opcaoMedia != 1 && opcaoMedia != 2);

        if (opcaoMedia == 1) {

            if (nota1 < 0 || nota2 < 0 || nota3 < 0 || nota1 > 10 || nota2 > 10 || nota3 > 10) {
                media = -1.0;
            } else {
                media = (nota1 + nota2 + nota3) / 3.0;
            }

        } else {

            peso1 = Teclado.solicitarInt("Informe o peso da primeira nota:");
            peso2 = Teclado.solicitarInt("Informe o peso da segunda nota:");
            peso3 = Teclado.solicitarInt("Informe o peso da terceira nota:");

            if ((peso1 + peso2 + peso3) != 10) {
                media = -1.0;
            } else if (nota1 < 0 || nota2 < 0 || nota3 < 0 || nota1 > 10
                    || nota2 > 10 || nota3 > 10) {
                media = -1.0;
            } else {
                media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3))
                        / 10.0;
            }
        }

        Video.exibirBarraProgresso(10, 50);

        if (media == -1.0) {
            Video.exibirMensagemErro("Nao foi possivel calcular os resultados!");
        } else if (media < MEDIA_APROVACAO) {
            Video.exibirMensagemAlerta("Aluno reprovado com a media: " + media);
        } else {
            Video.exibirMensagemInformativa("Aluno aprovado com a media: " + media);
        }

        Video.exibirRodape("Fim de execucao!");
    }
}