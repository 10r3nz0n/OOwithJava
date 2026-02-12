/******************************************************************************
 * Esqueleto Java, Lorenzon - 2026-1.
 * onlinegdb configurado para LTS: 21.
 *******************************************************************************/
public class HelloJava2 {

    public static void voceVersusJava(int idade) {

        // migrar as dependências
        final int ANO_ATUAL = 2026;
        final int ANO_JAVA_PUBLICO = 1995; // apresentacao publica
        final int ANOS_JAVA = ANO_ATUAL - ANO_JAVA_PUBLICO;

        /*
         * Refatorar pra mais limpo, sem aninhamento, happy path, early return
         * if (idade < ANOS_JAVA) {
         * Video.
         * mensagemInfo("Java tem mais tempo de estrada do que voce. Vantagem: comunidade enorme e boas "
         * + "praticas \nconsolidadas. Use isso a seu favor.");
         * } else if (idade > ANOS_JAVA) {
         * Video.
         * mensagemInfo("Voce tem mais tempo de estrada do que Java. Vantagem: paciencia e consistencia "
         * + "para aprender \ncom calma e fazer bem feito.");
         * } else {
         * Video.
         * mensagemInfo("Empate! Voce e Java tem o mesmo tempo de estrada. Bora aprender e construir algo"
         * + "legal.");
         * }
         */

        Video.mensagem("Calculando...");
        Video.barraProgresso(93, 15);

        if (idade < ANOS_JAVA) {
            Video.mensagemInfo("Java tem mais tempo de estrada do que voce. " +
                    "Vantagem: comunidade enorme e boas " +
                    "praticas \nconsolidadas. Use isso a seu favor.");
            return;
        }

        if (idade > ANOS_JAVA) {
            Video.mensagemInfo("Voce tem mais tempo de estrada do que Java. " +
                    "Vantagem: paciencia e consistencia " +
                    "para aprender \ncom calma e fazer bem feito.");
            return;
        }

        Video.mensagemInfo("Empate! Voce e Java tem o mesmo tempo de estrada. " +
                "Bora aprender e construir algo" + "legal.");

    }

    public static void main(String[] args) {

        String nome;
        int idade;

        Video.limparTela();
        Video.cabecalho("Bem vindo ao Java!");

        Video.mensagem("Informe seu nome:");
        nome = Teclado.readString();

        idade = Teclado.readInt("Qual sua idade?");

        voceVersusJava(idade);

        Video.rodape("Fim de execução!");

    }

}

/*
 * Teclado: readInt(), readDouble, readString() e readData().
 * Video: mensagem(), limparTela(), pausa(), confirmar();
 */
