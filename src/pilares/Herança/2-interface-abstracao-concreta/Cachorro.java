//Uma descendencia de animal
public class Cachorro extends Animal {
    
    public Cachorro (String nome){
        //acessa o atributo do pai pelo set
        setNome(nome);
    }

    //resolvendo a abstração imposta pela interface e repassada pela abstract
    @Override
    public void falar(){
        System.out.println("Au au!");
    }
    
    //criando algo especializado ao Cachorro
    public void abanarRabo(){
        System.out.println("Abanando rabo!");
    }
    
}