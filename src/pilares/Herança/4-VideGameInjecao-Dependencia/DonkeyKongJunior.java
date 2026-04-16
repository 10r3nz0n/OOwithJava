
//Praticando herança no conjunto da injeção SOLID OCP

public class DonkeyKongJunior extends DonkeyKong {
    
    
    @Override
    public void apresentacao(){
        System.out.println("Este é o jogo Donkey Kong Junior.");
    }
    
    
    @Override
    public void iniciar(){
        System.out.println("Jogando Donkey Kong Junior!");
    }
    
}