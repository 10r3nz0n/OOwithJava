
/**
 * Programa com o objetivo:
 * - Apresentar a classe Math e uso de Math.random()
 * - Demonstrar manipulação de objetos String
 * - Utilizar casting explícito de double para int
 * 
 * Observação:
 * - Math e String pertencem ao pacote java.lang, importado automaticamente
 * 
 * Autor: Professor Lorenzon, 2026-1
 */
import utilitarios.Teclado;
import utilitarios.Video;

public class K_App1 {

    public static void main(String[] args) {

        char continuar;
        int numero, numeroUsuario;

        Video.limparTela();

        do {

            Video.exibirCabecalho("Jogo da adivinhação do número!!!");
            Video.exibirMensagem("Tente acertar o número que eu vou pensar !!!");

            // Procure a documentação de random
            numero = (int) (Math.random() * 100); // Casting de um double para int
            numeroUsuario = Teclado.solicitarInt("Informe o número que você acredita ser: ");

            Video.exibirMensagem("O número que eu pensei foi " + numero);
            if (numero == numeroUsuario) {
                Video.exibirMensagemOk("Portanto, você acertou!!!");
            } else {
                Video.exibirMensagemAlerta("Portanto, você não acertou!!!");
            }
            Video.exibirMensagem("Vamos tentar mais uma vez? S/N?");
            // Cascateando mensagens aos objetos.
            // Com a String retornada, transformando em Uppercase e deste retorno,
            continuar = (Teclado.solicitarString()
                    .toUpperCase()
                    .charAt(0)); // pegando o primeiro char

            // OU continuar = Video.pedirConfirmarSn("Vamos tentar mais uma vez? S/N?"null);

            Video.limparTela();

        } while (continuar == 'S');

        Video.exibirRodape("Fim de execução!");
    }

}
