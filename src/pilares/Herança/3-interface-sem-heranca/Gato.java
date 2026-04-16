//Uma implementacao de animal
public class Gato implements AnimalInterface {
    
    private String nome;
    
    //resolvendo o contrato imposto pela interface
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String qualSeuNome(){
        return this.nome;
    }
    
    public Gato (String nome){
        setNome(nome);
    }
    
    @Override
    public void falar(){
        System.out.println("Mi-au!");
    }
    
    //criando algo especializado ao Gato
    public void ronronar(){
        System.out.println("Ronronando!");
    }
    
}