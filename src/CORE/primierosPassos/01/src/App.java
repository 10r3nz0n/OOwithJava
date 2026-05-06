import java.lang.*; //Não necessário, pacote implicito

public class App {

    void main() {

        //Declaração sem tipo, por default int, um tipo primitivo
        //Somente possível para variáveis locais de métodos
        var idade = 55; 

        double valor; //ou float, menor precisão
        char caractere = 'A'; //Não é uma cadeia
        boolean logico = true; //ou false

        // Uma declaração de String, um tipo especial de Java
        String nome = "Lorenzon"; //Não é um arranjo, arranjos são Arrays. É um objeto

        //A partir de uma classe IO. uma chamada de função membro estilo printf
        IO.printf("Olá, %s, sua idade é: %d.\n", nome, idade); x

        //A partir de uma classe IO. uma chamada de função membro com \n e conversão e concatenção de strings
        //String é um tipo especial, sua referência é um objeto, logo podemos acionar mensagens()
        IO.println("Olá, " + nome.toUpperCase() + ", sua idade é " + idade + ".");

        //Conhecer a classe String, na documentação e usar para manipular String
        //Conhecer o pool de String do Java
        //Todo tipo ou objeto de Java tem uma forma em String:  toString() para objetos

    }

}
