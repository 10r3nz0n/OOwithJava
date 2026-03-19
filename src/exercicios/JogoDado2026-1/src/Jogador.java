class Jogador {
    String nome;
    int ultimaJogada;

    Jogador(String nome) {
        this.nome = nome;
    }

    void jogarDado(Dado dado) {
        ultimaJogada = dado.rolar();
    }

    @Override
    public String toString() { // public aqui é essencial pelo @Override e ocultação de toString() em Object.
        return this.nome;
    }

}
