import utilitarios.*;

public class App {

    public static void main(String[] args) throws Exception {

        int idade;
        String nome;

        Video.exibirMensagem("Informe seu nome: ");
        nome = Teclado.solicitarString();
        idade = Teclado.solicitarInt("Informe sua idade: "); //2 em 1

        Video.exibirMensagemInformativa("Olá, " + nome.toUpperCase() +
                ", sua idade é " +
                idade + "."); // A possibilidade com objetos e LN

    }
}
