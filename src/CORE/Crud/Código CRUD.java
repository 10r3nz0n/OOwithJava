/* CRUD Java - Versão 2026-2: Lorenzon
   Template base.    
   
   Requisitos:  LTS 21 para Compact Source File.
                LTS 25 para IO.
   
   Codeshare: codeshare.io/5Z1QKV
   
*/

/* Não foi usado record para o caso de entender como uma struct, para a didática
   de conteúdo a seguir, é melhor por classe e depois simplificar casos de classes
   por record, se for o caso. */

// Aqui a classe parece uma struct, pode ser entendida como uma agora, mas será muito mais.
// O nome da classe criada deve iniciar por maiúsculo. Java já usa isso como convenção.

class Pessoa{ 
    
    int     id;     
    String  nome;
    int     idade;
    
} //não precisa ; ao final como na struct.


void main(){
    IO.println ("CRUD Java.");
    
    Pessoa arranjo [] = new Pessoa [10];
    
    int opcao;
    
    do {
        
        menu();
        opcao = lerOpcao();
        switch (opcao) {        //switch case com -> , que não precisa break
            
            case 1 -> { listarPessoas (arranjo); }
            case 2 -> { inserirPessoa (arranjo); }
            case 3 -> {  }
            case 4 -> { excluirPessoa (arranjo); }
            case 5 -> {  }
            
            
            case 0 -> { break; }
            
        }
        /*
        switch (opcao){
            
            case 1 : {
                break;
            }
            
            //etc...
        }*/
        
    } while (opcao != 0);
    
}

/****************************************************************************/

// Funçao de apresentacao do menu. Para reduzir tamanho e isolar responsabilidade.

void menu(){
    
    IO.println ("Menu de opções:");
    IO.println();
    IO.println("1-Listar pessoas.");
    IO.println("2-Incluir pessoa.");
    IO.println("3-Localizar pessoa.");
    IO.println("4-Excluir pessoa.");
    IO.println("5-Editar pessoa.");
    IO.println("-");
    IO.println("0-Sair.");
    
}

int lerOpcao(){
    
    return Integer.parseInt (IO.readln ("Escolha a opção: "));
    
}

void pausar(){
    
    IO.readln("Pressione algo para continuar!");
    
}

void inserirPessoa (Pessoa repositorio []){
    
    int posicao = indiceInserir (repositorio);
    
    if (posicao == -1) {
        IO.println ("Não há espaço para inserir, repositorio cheio!");
        pausar();
        return;
    }
    
    //rever sem direto na chamada de funcao
    
    repositorio[posicao] = criarObjeto (
            posicao, //usando uma relacao id == posicao no vetor
            solicitarIdade(),
            solicitarNome()
        );
        
}

// Ideia de a futuro ter sobrecarga de métodos

void inserirObjetoPessoa (Pessoa repositorio [], Pessoa objetoPessoa){
    
    if (objetoPessoa == null) return;
    
    int posicao = indiceInserir (repositorio);
    
    if (posicao == -1) {
        IO.println ("Não há espaço para inserir, repositorio cheio!");
        pausar();
        return;
    }
    
    //rever sem direto na chamada de funcao
    
    repositorio[posicao] = objetoPessoa;
        
}

/* A ideia da funcao é prever a ideia dos construtores. Receber os valores e
   atribuir no objeto, retornando a referencia para o objeto em memoria 
   
   O try catch apresenta uma ideia de como validar execucao de codigo. A futuro
   será aborado pra uso e disparo de excecoes. */

Pessoa criarObjeto (int id, int idade, String nome){
    
    try {
    
        Pessoa pessoa = new Pessoa();
        pessoa.id = id;
        pessoa.idade = idade;
        pessoa.nome = nome;
    
        return pessoa;
    }
    
    catch (Exception e){
        return null;
    }
    
    /*O que o try faz?
    
        Ele executa um código que se houver um erro, instancia um objeto
        de exceção.
    
      O que o catch faz?
      
        Ele captura o objeto de acordo com a classe que o objeto foi
        instanciado. Para pegar "todos" no momento usamos a classe Exception,
        "e" será o objeto instanciado.
        Caso houve então qualquer exceção, apenas se houve alguma, o bloco dentro
        do catch será executado.
        
        - Iremos ver com profundidade as Exceções na disciplina. Aqui é como um
          spoiler e uma prática inicial de uso.*/
}

/* A ideia desta funcao é apresentar a varredura de um arranjo de objetos e
   mostrar o for each como alternativa de varredura. */

void varrerRepositorio (Pessoa repositorio []){
    
    for (Pessoa p : repositorio){ //por for each, se não precisar indexar
        
        imprimirPessoa (p);
        
    }
    
    /*Por for indexado
    
    for (int i = 0; i < repositorio.length; i++){ //por for each
        
        imprimirPessoa (repositorio[i]);
        
    }
    
    */
    
}

int indiceInserir (Pessoa repositorio[]){
    
    for (int i = 0; i < repositorio.length; i++){
        if (repositorio [i] == null) {
            return i;
        }
    }
    
    return -1;
    
}

void excluirPessoa (Pessoa repositorio []){
    
    int id;
    
    id = Integer.parseInt (IO.readln("Informe o id para excluir: "));
    
    int indice = localizarIndicePessoa(repositorio, id);
    
    if (id == -1){
        IO.println ("Pessoa não encontrada!");
        pausar();
    }
    
    repositorio[indice] = null;
    IO.println ("Pessoa excluída com sucesso!");
    pausar();
}

void listarPessoas (Pessoa repositorio []){
    
    var flag = false;
    
    if (repositorio == null) {
        IO.println ("Não há pessoas cadastradas no repositório!!!");
        pausar();
        return;
    }
    
    /* for (var i = 0; i < repositorio.length; i++){
        
        if (repositorio[i] == null) continue;
        
        imprimirPessoa (repositorio[i]);
        
        flag = true;
        
    }*/
    
    for (Pessoa pessoa : repositorio){
        
        if (pessoa == null) continue;
        
        imprimirPessoa (pessoa);
        
        flag = true;
        
    }
    
    if (!flag) {
        IO.println ("Não há pessoas cadastradas no repositório!!!");
        pausar();
    }
    
}

void imprimirPessoa(Pessoa pessoa){
    
    //Como não temos ainda um toString() pra pessoa...
    
    IO.print ("id: [" + pessoa.id + "] \t");
    IO.print ("nome: [" + pessoa.nome + "] ");
    IO.println ("idade: [" + pessoa.idade + "] ");
    
}


int localizarIndicePessoa (Pessoa repositorio [], int id){
    
    for (int i = 0; i < repositorio.length; i++){
        
        if (repositorio[i].id == id) return i;
        
    }
    
    return -1;
    
}

void editarPessoa (Pessoa repositorio []){
    
}



/* A ideia desta funcao e a futuro apresentar metodos get e set validadores */

int solicitarIdade (){
    
    int idade = 0;
    
    do {
        
        idade = Integer.parseInt (IO.readln ("Informe a idade (0-120 anos: "));
        if (idade < 0 || idade > 120){
            IO.println ("Idade inválida!");
            pausar();
        }
        
    } while (idade < 0 || idade > 120); //garantir idade válida
    
    return idade;
}   

// Uma ideia de iso sem a LTS 25, retirando a classe IO.
// Usar Scanner e System.

int solicitarIdadeScanner (){
    
    int idade = 0;
    Scanner input = new Scanner(System.in);
    
    do {
        System.out.println ("Informe a idade (0-120 anos: ");
        idade = input.nextInt();
        if (idade < 0 || idade > 120){
            IO.println ("Idade inválida!");
            pausar();
        }
        
    } while (idade < 0 || idade > 120); //garantir idade válida
    
    input.close();
    
    return idade;
}

String solicitarNome (){
        
    String nome;
    
    do {
        
        nome = IO.readln ("Informe o nome: ");
        if (nome.isEmpty()){
            IO.println ("Nome inválido!");
            pausar();
        }
        
    } while (nome.isEmpty()); //ficar lendo enquanto nome vazio
    
    return nome;
} 

/*Exercício:

Observe a função varrerRepositorio para entender o for each.

- Fazer funcao e incluir no menu: nome da pessoa de maior idade;
- Fazer funcao para mostrar as pessoas cadastradas em ordem alfabética crescente de nome;
- Alterar o CRUD para suportar um novo atributo em Pessoa: salário;
- Fazer função para alterar o salário de uma Pessoa em determinado percentual;
- Fazer função para alterar o salário de todas as Pessoas cadastradas em determinado percentual;
- Fazer a funcao de editar os dados de uma pessoa pelo seu id, idade ou nome, ou ambos;

Entregar share de código via minha uno em atividade.

*/
    
