
//Uma classe de generalização, uma abstração
public abstract class Animal implements AnimalInterface{
    
    //privando de acesso direto aos filhos
    private String nome;
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    //pertence a todos
    public String qualSeuNome(){
        return this.nome;
    }
 
 
}

/*

   //a necessidade transportou-se pra interface
   //a classe abstrata não desenvolvou, repassou pro filho, por isso continua
   //abstract
   public abstract void falar();

*/