public class Peixe extends Animal {

    public Peixe(String nome) {

        this.nome = nome;

    }

    // só pode ser concreto, ter objetos, se resolver falar();
    // começa aparecer os problemas da herança

    public void nadar() {
        System.out.println("Nadando...");
    }

}
