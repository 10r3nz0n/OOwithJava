/* CRUD Java - Versão 2026-2: Lorenzon
   Template base. 
   Esqueleto de funções!
   
   Requisitos:  LTS 21 para Compact Source File.
                LTS 25 para IO.
*/



// TODO 01: Criar uma estrutura pra Pessoa, com id, nome e idade.


void main(){
    IO.println ("CRUD Java.");
    
    //TODO 02: Criar o repositório para a estrutura de Pessoa, em arranjo.
    
    int opcao;
    
    do {
        
        menu();
        opcao = lerOpcao();
        switch (opcao) {        //switch case com -> , que não precisa break
            
            case 1 -> { }
            case 2 -> { }
            case 3 -> { }
            case 4 -> { }
            case 5 -> { }
            
            
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

// TODO 03: Apresentar uma pessoa em particular.

void imprimirPessoa(Pessoa pessoa){
    
    //Como não temos ainda um toString() pra pessoa...
    
    IO.print ("id: [" + pessoa.id + "] \t");
    IO.print ("nome: [" + pessoa.nome + "] ");
    IO.println ("idade: [" + pessoa.idade + "] ");
    
}

// TODO 04: Varrer e apresenta todas as pessoas se repositório não vazio.

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

// TODO 05: Localizar um índice para inserir no repositório ou -1 para cheio.

int indiceInserir (Pessoa repositorio[]){
    
    for (int i = 0; i < repositorio.length; i++){
        if (repositorio [i] == null) {
            return i;
        }
    }
    
    return -1;
    
}


// TODO 06: Solicitar uma idade válida para pessoa.

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

// TODO 07: Solicitar um nome válido para pessoa.

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

// TODO 08: Criar um objeto pessoa a partir de dados passados e o retornar.

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


// TODO 09: Inserir um objeto pessoa no repositório.

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


// TODO 10: Controller de inserir Pessoa em repositório.

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


//TODO 11: Localizar uma pessoa por id


int localizarIndicePessoa (Pessoa repositorio [], int id){
    
    for (int i = 0; i < repositorio.length; i++){
        
        if (repositorio[i].id == id) return i;
        
    }
    
    return -1;
    
}



// TODO 12: Controller de excluir uma Pessoa do repositório


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


//TODO 13: Controller de Editar uma pessoa

void editarPessoa (Pessoa repositorio []){
    
}


/*Exercício:

Observe a função varrerRepositorio para entender o for each.

- Fazer funcao e incluir no menu: nome da pessoa de maior idade;
- Fazer funcao para mostrar as pessoas cadastradas em ordem alfabética crescente de nome;
- Alterar o CRUD para suportar um novo atributo em Pessoa: salário;
- Fazer função para alterar o salário de uma Pessoa em determinado percentual;
- Fazer função para alterar o salário de todas as Pessoas cadastradas em determinado percentual;
- Fazer a funcao de editar os dados de uma pessoa pelo seu id, idade, nome, salario ou ambos;

Entregar código via em PDF no minha uno em trabalho TPE 2.

*/
    
