import java.lang.*; //Não necessário

public class App {

    public static void main(String[] args) throws Exception {

        int idade = 55; // Um tipo primitivo

        String nome = "Lorenzon"; // Um tipo não primitivo, mas facilitado

        System.out.printf("Olá, %s, sua idade é: %d.\n", nome, idade); // Uma variação printf

        System.out.println("Olá, " + nome.toUpperCase() +
                ", sua idade é " + idade + "."); // A possibilidade com objetos e LN

    }

}
