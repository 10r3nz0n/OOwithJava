/*

    Resumo de conceitos aplicados em aula - Lorenzon, 2026-2.

*/


// Uma abstração através de uma classe

class Aluno {
    
    String matricula;
    String nome;
}


void main(){
    
    Aluno a1; // Uma referência, ponteiro, para apontar para um objeto Aluno
              // Neste instante a1 é null.    
    
    a1 = new Aluno(); // A criação, instanciação, do objeto pela invocação de new
                      // ao construtor padrão da classe e retorno do endereço
                      // do objeto para a referência apontar
                    
    a1.matricula = "123456";
    a1.nome = "Nome Aluno"; // Acessando os atributos do objeto instanciado
                            // Usando a notação "."
                            
    funcaoRecebeObjeto(a1);                       
    
    Aluno a2 = funcaoRetornaObjeto();
    
}

void funcaoRecebeObjeto (Aluno refAluno){
    
    // Aqui você está recebendo por cópia uma referência
    // Se você mudar a referência, a referência passada continuará intacta,
    // porém, se você alterar algo no objeto, incidirá no objeto apontado.
    // tanto a1 em main, quanto refAluno na função apontam para o mesmo objeto.
    // A passagem por cópia se refere a referência, não ao objeto.
    
    // Caso você aponte refAluno para outro objeto, a1 permanecerá apontando para
    // o objeto original passado.
    
}

Aluno funcaoRetornaObjeto (){
    
    Aluno aux = new Aluno();
    
    return aux;
    
    // Aqui você retorna um objeto criado localmente. O objeto será criado e,
    // Seu endereço será retornado para que seja armazenado em alguma referência
    // no escopo chamador da função.
    
}
