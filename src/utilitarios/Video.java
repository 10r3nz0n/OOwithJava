package temadogrupo.utilitarios;

/*
 * SOLID S: esta classe centraliza a saida de dados da aplicacao.
 * Java 25: usa java.lang.IO por baixo.
 */
public final class Video {

    private static final int LARGURA_TELA = 100;

    public static final String RESET = "\u001B[0m";
    public static final String NEGRITO = "\u001B[1m";
    public static final String VERMELHO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARELO = "\u001B[33m";
    public static final String CIANO = "\u001B[36m";

    private Video() {
    }

    public static void limparTela() {
        IO.print("\033[H\033[2J");
    }

    public static void cabecalho(String titulo) {
        exibirCabecalho(titulo);
    }

    public static void exibirCabecalho(String titulo) {
        limparTela();

        String tituloMaiusculo = titulo.toUpperCase();
        String linha = "=".repeat(LARGURA_TELA);
        int espacos = calcularEspacosCentralizacao(tituloMaiusculo);
        String espacosEsquerda = " ".repeat(espacos);

        IO.println(NEGRITO + linha + RESET);
        IO.println(espacosEsquerda + tituloMaiusculo);
        IO.println(NEGRITO + linha + RESET);
        IO.println();
    }

    public static void linhaEmBranco() {
        IO.println();
    }

    public static void mensagem(String mensagem) {
        IO.println(mensagem);
    }

    public static void println(String mensagem) {
        IO.println(mensagem);
    }

    public static void print(String mensagem) {
        IO.print(mensagem);
    }

    public static void mensagemOk(String mensagem) {
        IO.println(VERDE + "[OK] " + mensagem + RESET);
    }

    public static void mensagemErro(String mensagem) {
        IO.println(VERMELHO + "[ERRO] " + mensagem + RESET);
    }

    public static void mensagemAlerta(String mensagem) {
        IO.println(AMARELO + "[ALERTA] " + mensagem + RESET);
    }

    public static void mensagemInfo(String mensagem) {
        IO.println(CIANO + "[INFO] " + mensagem + RESET);
    }

    public static void pausarEnterContinuar() {
        Teclado.readLine("Pressione ENTER para continuar...");
    }

    public static void barraProgresso(int total, int delayMs) {
        if (total <= 0) {
            return;
        }

        for (int indice = 0; indice <= total; indice++) {
            String barra = "[" + "#".repeat(indice) + " ".repeat(total - indice) + "]";
            IO.print("\r" + barra + " " + (indice * 100 / total) + "%");
            aguardar(delayMs);
        }

        IO.println();
    }

    private static int calcularEspacosCentralizacao(String texto) {
        int espacos = (LARGURA_TELA - texto.length()) / 2;

        if (espacos < 0) {
            return 0;
        }

        return espacos;
    }

    private static void aguardar(int delayMs) {
        try {
            Thread.sleep(delayMs);
        } catch (InterruptedException excecao) {
            Thread.currentThread().interrupt();
        }
    }
}
