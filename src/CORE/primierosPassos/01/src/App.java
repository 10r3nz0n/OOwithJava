public class App {

    void main() {

        // Declaração com tipo inferido.
        // O compilador infere int a partir do literal inteiro 55.
        // var só pode ser usado em variáveis locais com inicializador.
        // A inferência acontece a partir da expressão de inicialização.
        var idade = 55;

        // Declaração com tipo explícito.
        // double representa números reais com maior precisão que float.
        // float também existe, mas exige o sufixo f em literais decimais.
        double valor = 10.50;

        // boolean representa um valor lógico: true ou false.
        boolean logico = true;

        // char representa um único caractere e usa aspas simples.
        // String representa uma cadeia de caracteres e usa aspas duplas.
        char caractere = 'A';

        // String não é tipo primitivo.
        // String é uma classe de java.lang, seus objetos são imutáveis.
        // String também não é um array, embora permita acessar posições com charAt(indice).
        // Por convenção, nomes de classes em Java começam com letra maiúscula.
        String nome = "Lorenzon";

        // IO.println escreve uma linha no console.
        // Aqui ocorre concatenação de Strings com valores de outros tipos.
        IO.println("Olá, " + nome + ", sua idade é " + idade + ".");

        // IO não possui printf no Java 25.
        // Para formatação estilo printf, use System.out.printf.
        System.out.printf("Olá, %s, sua idade é: %d.%n", nome, idade);

        // Variáveis declaradas apenas para demonstração.
        // IO.println() adiciona automaticamente uma quebra de linha ao final.
        // Na concatenação com String, valores primitivos são convertidos para texto.
        IO.println("Valor: " + valor);
        IO.println("Caractere: " + caractere);
        IO.println("Lógico: " + logico);
        IO.println("Olá, " + nome + ", sua idade é: " + idade);

        // Sobre um objeto String, podemos chamar métodos usando a notação de ponto.
        IO.println("Nome em maiúsculo: " + nome.toUpperCase());
        IO.println("Nome original: " + nome);
        IO.println("Primeira letra de nome: " + nome.charAt(0));

        // Tópicos para aprofundar depois:
        // Conhecer a classe String.
        // Conhecer o pool de Strings de Java.
        // Entender nome == null antes de chamar nome.isBlank() ou nome.isEmpty().
        // isEmpty()	o tamanho da String é zero
        // isBlank()	a String está vazia ou contém apenas espaços em branco
    }
}


public class App {

    void main() {

        // Tipo inferido a partir do literal inteiro.
        var idade = 55;

        // Tipos explícitos.
        double valor = 10.50;
        boolean logico = true;
        char caractere = 'A';

        // Literais numéricos e inferência de tipo.
        var quantidade = 10;          // int
        var populacao = 8000000000L;  // long
        var taxa = 2.5f;              // float

        // Constante local.
        final double PI = 3.14159;

        // String é classe, não tipo primitivo.
        String nome = "Lorenzon";

        IO.println("Olá, " + nome + ", sua idade é " + idade + ".");
        IO.println("Valor: " + valor);
        IO.println("Caractere: " + caractere);
        IO.println("Lógico: " + logico);
        IO.println("Quantidade: " + quantidade);
        IO.println("População: " + populacao);
        IO.println("Taxa: " + taxa);
        IO.println("PI: " + PI);

        System.out.printf("Nome: %s | Idade: %d | Valor: %.2f%n", nome, idade, valor);

        IO.println("Nome em maiúsculo: " + nome.toUpperCase());
        IO.println("Quantidade de letras: " + nome.length());
        IO.println("Primeira letra: " + nome.charAt(0));
        IO.println("Está vazio? " + nome.isEmpty());
        IO.println("Está em branco? " + nome.isBlank());

        // Atenção: não chame métodos em uma referência null.
        // String texto = null;
        // IO.println(texto.isBlank()); // causaria NullPointerException
    }
}