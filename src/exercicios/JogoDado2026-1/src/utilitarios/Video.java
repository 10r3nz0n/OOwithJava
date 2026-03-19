package utilitarios;

public class Video {

    private static final int WIDTH_TELA = 100;

    // Códigos ANSI para cores e estilos
    public static final String RESET = "\u001B[0m";
    public static final String NEGRITO = "\u001B[1m";
    public static final String VERMELHO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARELO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String CIANO = "\u001B[36m";

    public static void limparTela() {
        // limpar terminal antes de começar
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    public static void exibirCabecalho(String titulo) {
        limparTela();
        final int larguraTotal = WIDTH_TELA;
        String tituloMaiusculo = titulo.toUpperCase();
        int espacos = (larguraTotal - tituloMaiusculo.length()) / 2;

        String linha = "=".repeat(larguraTotal);
        String espacosEsquerda = " ".repeat(espacos);

        System.out.println(NEGRITO + linha + RESET);
        System.out.println(espacosEsquerda + tituloMaiusculo);
        System.out.println(NEGRITO + linha + "\n" + RESET);
    }

    public static void exibirRodape(String texto) {
        final int larguraTotal = WIDTH_TELA;
        int espacos = (larguraTotal - texto.length()) / 2;

        String linha = "=".repeat(larguraTotal);
        String espacosEsquerda = " ".repeat(espacos);

        System.out.println("\n" + NEGRITO + linha + RESET);
        System.out.println(espacosEsquerda + texto);
        System.out.println(NEGRITO + linha + RESET);
    }

    public static void exibirSeparador(int largura) {
        if (largura > 0) {
            String linha = "-".repeat(largura);
            System.out.println(linha);
        }
    }

    public static void exibirSeparador() {
        exibirSeparador(WIDTH_TELA);
    }

    public static void pausarEnterContinuar() {
        try {
            System.out.println("\nPressione <ENTER> para continuar...");
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void escreverEfeitoLento(String texto, int delayMs) {
        for (char c : texto.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delayMs);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    public static void exibirBarraProgresso(int total, int delayMs) {
        for (int i = 0; i <= total; i++) {
            String barra = "[" + "#".repeat(i) + " ".repeat(total - i) + "]";
            System.out.print("\r" + barra + " " + (i * 100 / total) + "%");
            try {
                Thread.sleep(delayMs);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    public static void exibirMensagem(String msg) {
        System.out.println(msg);
    }

    public static void exibirMensagemOk(String msg) {
        System.out.println(VERDE + "[OK] " + msg + RESET);
    }

    public static void exibirMensagemErro(String msg) {
        System.out.println(VERMELHO + "[ERRO] " + msg + RESET);
    }

    public static void exibirMensagemAlerta(String msg) {
        System.out.println(AMARELO + "[ALERTA] " + msg + RESET);
    }

    public static void exibirMensagemInformativa(String msg) {
        System.out.println(CIANO + "[INFO] " + msg + RESET);
    }

    public static boolean pedirConfirmarSn(String pergunta) {
        String resposta = Teclado.solicitarString(pergunta + " (s/n): ").trim().toLowerCase();
        return resposta.equals("s") || resposta.equals("sim");
    }

    public static void println(String msg) {
        exibirMensagem(msg);
    }

    public static void sair() {
        System.exit(0);
    }

}
