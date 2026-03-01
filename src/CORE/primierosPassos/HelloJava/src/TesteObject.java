//tudo que usarmos neste exemplo já está implícito import de java.lang.*

public class TesteObject {

    public static void main(String[] args) {

        Object objetoObject; // tudo parte daqui, a classe mãe de tudo
                             // Object é classe, usamos como tipos
                             // objetoObject é uma variável de classe, uma referência que aponta para um
                             // objeto em memória

        objetoObject = new Object(); // invocando um construtor, o padrão nas classes é a função membro de próprio
                                     // nome da classe
                                     // new invoca o construtor e instancia um objeto

        Video.mensagem(objetoObject.toString()); // Object possui métodos que serão herdados nas classes que criarmos,
                                                 // princípio da herança
                                                 // Exemplo . toString(), converte o objeto pra seu valor String

        // A classe String, o primeiro tipo que foge dos primitivos.

        String nome1 = "Lorenzon"; // atalhos pra certas coisas em Java String é classe
        String nome2 = new String("Lorenzon"); // Tirando o implícito, fazendo entender que uma variável string é então
                                               // um objeto

        Video.mensagem(nome1); // Usando como um primitivo, apesar de não ser

        Video.mensagem(nome2.toString()); // Usando como objeto e a diferença, porque é diferente de
                                          // objetoObject.toString()
                                          // primeiro contato com o polimorfismo de ocultação e sobrescrita
        Video.mensagem("" + nome2.hashCode()); // código de preguiçoso, forçar as coisas

        nome2 = "Junior";
        Video.mensagem(nome2.toString());
        Video.mensagem("" + nome2.hashCode()); // mudou, por que?

        String nome3 = nome2;

        Video.mensagem(nome3.toString());
        Video.mensagem("" + nome3.hashCode()); // mesmo, por que?

    }
}
