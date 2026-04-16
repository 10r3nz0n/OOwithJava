//Uma descendencia de animal
public class Gato extends Animal {
    
    public Gato (String nome){
        this.nome = nome;
    }

    //resolvendo a abstração imposta pelo animal
    @Override
    public void falar(){
        System.out.println("Miau!");
    }
    
    //criando algo especializado ao Gato
    public void ronronar(){
        System.out.println("Ronronando!");
    }
    
}