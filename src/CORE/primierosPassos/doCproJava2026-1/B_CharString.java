void main() {

      // Tipos primitivos de dados com camelCase
      char umaLetra = 'A';

      // Objetos de classe String
      String linha = ""; // Cadeia de caracteres inicialmente vazia

      // Entrada de dados do usuário
      IO.println("\nInsira alguma informação de caracteres:");
      // readln retorna sempre String, de tudo o que for digitado
      linha = IO.readln();
      IO.println("\n\nA cadeia completa de caracteres informada foi " + linha);

      // vamos pegar a primeira letra do objeto
      umaLetra = linha.charAt(0);

      IO.println("O primeiro caractere digitado foi: " + umaLetra);
      // Acionando um método do objeto da classe String
      IO.println("O tamanho da cadeia de caracteres é de : " + linha.length());

      // Manipulação de strings
      // Aponta para o mesmo conteúdo de 'linha' (não faz cópia profunda)
      String aux = linha;
      // Redefine o conteúdo de 'linha'; 'aux' mantém o valor antigo
      linha = "Valor";

      // Comparação de strings
      boolean iguais = aux.equals(linha);
      IO.println("As strings 'aux' e 'linha' são iguais? " + iguais);

      // Imutabilidade: métodos que alteram strings retornam novas instâncias
      String maiuscula = aux.toUpperCase(); // Não altera aux, apenas retorna novo valor

      // Demonstração de alguns métodos úteis da classe String
      IO.println("\nDemonstrando manipulações com a string original:");
      IO.println("Maiúsculas: " + aux.toUpperCase());
      IO.println("Minúsculas: " + aux.toLowerCase());
      IO.println("Contém a letra 'a'? " + aux.contains("a"));
      IO.println("Substituindo 'a' por '@': " + aux.replace("a", "@"));
      IO.println("Sem espaços nas bordas: [" + aux.trim() + "]");
      if (aux.length() >= 2) {
            IO.println("Primeiros 2 caracteres: " + aux.substring(0, 2));
      }

      /*
       * RESUMO – Métodos úteis da classe String:
       * ----------------------------------------
       * .length() → Tamanho da string
       * .charAt(i) → Caractere na posição i
       * .equals(str) → Compara conteúdos
       * .equalsIgnoreCase(str)→ Compara ignorando maiúsculas/minúsculas
       * .toUpperCase() → Retorna versão maiúscula
       * .toLowerCase() → Retorna versão minúscula
       * .substring(i, j) → Recorte da string (do índice i até j-1)
       * .contains(str) → Verifica se contém substring
       * .replace(a, b) → Substitui caracteres/texto
       * .trim() → Remove espaços das bordas
       */
}