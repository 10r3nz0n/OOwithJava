//Uma descendencia de animal
public class Gato extends Animal {
    
    public Gato (String nome){
        //acessa o atributo do pai pelo set
        setNome(nome);
    }

    //resolvendo a abstração imposta pela interface e repassada pela abstract
    @Override
    public void falar(){
        System.out.println("Miau!");
    }
    
    //criando algo especializado ao Gato
    public void ronronar(){
        System.out.println("Ronronando!");
    }
    
}