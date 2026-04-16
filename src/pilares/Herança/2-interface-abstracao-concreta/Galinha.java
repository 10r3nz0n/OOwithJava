//Uma descendencia de animal
public class Galinha extends Animal {
    
    public Galinha (String nome){
        //acessa o atributo do pai pelo set
        setNome(nome);
    }

    //resolvendo a abstração imposta pela interface e repassada pela abstract
    @Override
    public void falar(){
        System.out.println("Cocoricó!");
    }
    
    //criando algo especializado a Galinha
    public void ciscar(){
        System.out.println("Ciscando!");
    }
    
}