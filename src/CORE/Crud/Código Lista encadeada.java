/*

    Esboço aprsentado em aula de listas encadeadas por classes e objetos Java
    As funções não foram testadas
    Apenas exemplo final extra de criação de classe e instanciação de objetos
    
    Uma struct vira uma classe.
    O new é como um malloc, chamando o construtor padr~]ao da classe.
    O ponteiro é representado pelas referências a objetos do tipo Lista e Nodo.
    
    Código Autoral, rápido, Lorenzon 2026-2.

*/

class Nodo {
    
    int     info;
    Nodo    proximo;
    
}

class Lista {
    
    Nodo inicio;
    Nodo fim;
    
}

//----------------------------------------------- Para uso e testes
void main(){
    
    
}
//-----------------------------------------------


Lista criarLista(){
    
    Lista lista = new Lista();
    lista.inicio = lista.fim = null;
    return lista;
    
}

Nodo criarNodo (int info, Nodo proximo){
    
    Nodo nodo = new Nodo();
    nodo.info = info;
    nodo.proximo = proximo;
    
    return nodo;
    
}

void varrerLista(Lista lista){
    
    if (lista == null) {
        IO.println ("Lista vazia!!!");
    }
    
    Nodo aux = lista.inicio;
    
    while (aux != null) {
        
        IO.println (aux.info);
        aux = aux.proximo;
        
    }

}

boolean listavazia (Lista lista) {
    
    return (lista == null || lista.inicio == null);
    
}

boolean insereNodoInicio (Lista lista, Nodo nodo){
    
    if (lista == null) return false;
    
    if (lista.inicio == null) {
    
        lista.inicio = nodo;
        lista.fim = nodo;
        
    } else {
        
        nodo.proximo = lista.inicio;
        lista.inicio = nodo;
        return true;
        
    }  
    
    return true;
    
}

boolean insereNodoFim (Lista lista, Nodo nodo){
    
    if (lista == null) return false;
    
    if (lista.inicio == null) {
    
        lista.inicio = nodo;
        lista.fim = nodo;
        return true;
        
    }    
    
    //segue para inserir no fim
    lista.fim.proximo = nodo;
    return true;
    
}

//insercao no meio, com euristica de insercao
//excluir nodo, ver se inicio, meio ou fim
//fazer a lista ser de ordem crescente de info - inteiros.
//fazer a lista nao incluir duplicatas


