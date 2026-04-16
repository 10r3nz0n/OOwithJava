/******************************************************************************
Mundo animal, exemplo de herança com abstração e programar para a abstração!
Com a criação de interfaces e programar para a implementação.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		//Programando para a implementacao
		ArrayList<AnimalInterface> mundoAnimal = new ArrayList<>();
		
		//Referência via interface, instanciação concreta
		AnimalInterface juju = new Cachorro ("Juju");
		
		//cada animal é um objeto especializado no mundo animal de "Animals"
		mundoAnimal.add (juju);
		mundoAnimal.add (new Cachorro ("Totó"));
		mundoAnimal.add (new Gato ("Mimi"));
		mundoAnimal.add (new Galinha ("Marilu"));
		
		for (AnimalInterface animal : mundoAnimal){
		    //programando para a abstração, animal sabe responder ao abstrato
		    System.out.println ("Eu sou " + animal.qualSeuNome() + "!");
		}
		
		for (AnimalInterface animal : mundoAnimal){
		    //programando para a especialização, precisa saber que objeto é animal
		    
		    if (animal instanceof Cachorro) {
		        ((Cachorro)animal).abanarRabo();
		        continue;
		    }
		    
		    if (animal instanceof Gato) {
		        ((Gato)animal).ronronar();
		        continue;
		    }
		    
		    if (animal instanceof Galinha) {
		        ((Galinha)animal).ciscar();
		        continue;
		    }
		}
		
	}
}
