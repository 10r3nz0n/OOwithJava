import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        int idade;
        String nome;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();

        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();

        System.out.println("Olá, " + nome.toUpperCase() +
                ", sua idade é " +
                idade + "."); // A possibilidade com objetos e LN
    }
}