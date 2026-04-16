//Uma descendencia de animal
public class Cachorro extends Animal {
    
    public Cachorro (String nome){
        //acessa o atributo do pai pelo protected
        this.nome = nome;
    }

    //resolvendo a abstração imposta pelo animal
    @Override
    public void falar(){
        System.out.println("Au au!");
    }
    
    //criando algo especializado ao Cachorro
    public void abanarRabo(){
        System.out.println("Abanando rabo!");
    }
    
}