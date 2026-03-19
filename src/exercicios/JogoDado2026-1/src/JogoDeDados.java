import utilitarios.*;

class JogoDeDados {

    Jogador jogador1;
    Jogador jogador2;
    Dado dado;

    JogoDeDados(Jogador j1, Jogador j2, Dado d) {
        jogador1 = j1;
        jogador2 = j2;
        dado = d;
    }

    void iniciar() {
        Video.println("\nIniciando jogo...");
        Video.println("O jogador que obtiver o maior lance ganhará ou haverá empate, " +
                "tendo mais lances até encontrar vencedor!");

        do { // laço controlado por break/continue e sem elses internos
             // poderia ser usar elses e flags.

            Video.println("\nQue role o dado de " + dado.lados + " lados!!!");
            Video.exibirBarraProgresso(10, 20);

            jogador1.jogarDado(dado);
            jogador2.jogarDado(dado);

            if (jogador1.ultimaJogada == jogador2.ultimaJogada) { // empatou : Fail!
                exibirPlacar(jogador1, jogador2);
                continue;
            }

            if (jogador1.ultimaJogada > jogador2.ultimaJogada) { // vencedor 1
                exibirVencedor(jogador1, jogador2);
                break;
            }

            exibirVencedor(jogador2, jogador1); // vencedor 2
            break;

        } while (true);

        System.out.println("\nFim de jogo!");
    }

    void exibirVencedor(Jogador jogadorVencedor, Jogador jogadorPerdedor) {
        Video.exibirMensagemInformativa(jogadorVencedor.toString() + " venceu! Placar: " + // toString
                jogadorVencedor.ultimaJogada + " x " + jogadorPerdedor.ultimaJogada);
    }

    void exibirPlacar(Jogador jogadorVencedor, Jogador jogadorPerdedor) {
        Video.println("\n" + jogador1.toString() + " tirou " + jogador1.ultimaJogada); // toString
        Video.println(jogador2.nome + " tirou " + jogador2.ultimaJogada); // direto o nome
    }

}
