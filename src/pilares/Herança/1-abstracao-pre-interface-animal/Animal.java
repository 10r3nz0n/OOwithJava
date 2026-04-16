
//Uma classe de generalização, uma abstração
public abstract class Animal {
    
    //dando liberdade de acesso aos filhos
    protected String nome;
    
    //pertence a todos
    public String qualSeuNome(){
        return this.nome;
    }
 
    //criando a necessidade   
    public abstract void falar();
}