//Uma implementacao de animal
public class Cachorro implements AnimalInterface {
    
    private String nome;
    
    //resolvendo o contrato imposto pela interface
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String qualSeuNome(){
        return this.nome;
    }
    
    public Cachorro (String nome){
        setNome(nome);
    }
    
    @Override
    public void falar(){
        System.out.println("Au au!");
    }
    
    //especializando
    public void abanarRabo(){
        System.out.println("Abanando rabo!");
    }
    
}