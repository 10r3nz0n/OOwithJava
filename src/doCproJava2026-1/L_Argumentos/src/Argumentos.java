public class Argumentos {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Nenhum argumento foi informado.");
            System.out.println("Exemplo de uso: java Main Ana 10 --modo=teste");
            return;
        }

        System.out.println("Quantidade de argumentos: " + args.length);
        System.out.println("Argumentos recebidos:");

        // For em modo trivial
        for (int i = 0; i < args.length; i++) {
            System.out.println("- " + args[i]);
        }

        System.out.println("Argumentos recebidos, novamente:");

        // For em modo each
        for (String arg : args) {
            System.out.println("- " + arg);
        }
    }
}
