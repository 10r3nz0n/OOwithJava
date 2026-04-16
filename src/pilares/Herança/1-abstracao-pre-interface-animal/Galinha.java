//Uma descendencia de animal
public class Galinha extends Animal {
    
    public Galinha (String nome){
        this.nome = nome;
    }

    //resolvendo a abstração imposta pelo animal
    @Override
    public void falar(){
        System.out.println("Cocoricó!");
    }
    
    //criando algo especializado a Galinha
    public void ciscar(){
        System.out.println("Ciscando!");
    }
    
}