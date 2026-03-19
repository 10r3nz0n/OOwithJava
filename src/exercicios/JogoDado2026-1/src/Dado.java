class Dado {
    int lados;

    Dado(int lados) {
        if (lados < 2 || lados > 16) { // corrigido, era &&
            lados = 6;
        }
        this.lados = lados;
    }

    int rolar() {
        return (int) (Math.random() * lados) + 1;
    }
}
