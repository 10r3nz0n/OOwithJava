public class Argumentos {
    public static void main(String[] java) {

        if (vetorArgumentos.length == 0) {
            System.out.println("Nenhum argumento foi informado.");
            System.out.println("Exemplo de uso: java Main Ana 10 --modo=teste");
            return;
        }

        System.out.println("Quantidade de argumentos: " + vetorArgumentos.length);
        System.out.println("Argumentos recebidos:");

        // For em modo trivial
        for (int i = 0; i < vetorArgumentos.length; i++) {
            System.out.println("- " + vetorArgumentos[i]);
        }

        System.out.println("Argumentos recebidos, novamente:");

        // For em modo each: para cada item da coleção, iterado automaticamente pois
        // implementa Interface Iterator
        for (String argumeto : vetorArgumentos) {
            System.out.println("- " + argumeto);
        }
    }
}
