//Uma implementacao de animal
public class Galinha implements AnimalInterface {
    
    private String nome;
    
    //resolvendo o contrato imposto pela interface
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String qualSeuNome(){
        return this.nome;
    }
    
    public Galinha (String nome){
        setNome(nome);
    }
    
    @Override
    public void falar(){
        System.out.println("Cocoricó!");
    }
    
    //criando algo especializado a Galinha
    public void ciscar(){
        System.out.println("Ciscando!");
    }
    
}