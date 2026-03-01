import utilitarios.*;
import utilitarios.menus.MenuPrincipal;

public class App {

    private static void iniciar(String razaoDoPrograma) {
        Video.exibirCabecalho(razaoDoPrograma);
    }

    private static void finalizar() {
        Video.exibirRodape("Fim de execução!");
    }

    public static void main(String[] args) {

        final int OPCAO_SAIR = 3;

        iniciar("Função do programa!");
        try {
            int opcaoPrincipal;
            do {
                opcaoPrincipal = MenuPrincipal.exibir("Escolha sua opção:");
                switch (opcaoPrincipal) {
                    case 1 -> {

                        String nome = Teclado.solicitar(String.class);
                        Video.exibirMensagem("Olá " + nome + "!");
                        Video.pausarEnterContinuar();

                    }
                    // sem break
                }
            } while (opcaoPrincipal != OPCAO_SAIR);

            Video.exibirMensagemInformativa("Saindo do sistema...");

        } catch (Exception e) {

            Video.exibirMensagemErro("Erro não previsto registrado no log: " + e.getMessage());

        } finally {

            // Ao finalizar o sistema
            finalizar();

        }
    }
}