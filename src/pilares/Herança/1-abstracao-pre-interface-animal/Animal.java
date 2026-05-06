//Uma classe de generalização, uma abstração
public abstract class Animal {

    // dando liberdade de acesso aos filhos
    protected String nome;

    // pertence a todos
    public String qualSeuNome() {
        return this.nome;
    }

    // instinto: comer
    public abstract void comer(){
        System.out.println("Comendo...");
    }

    // instinto: beber água
    public abstract void beberAgua(){
        System.out.println("Bebendo água...");
    }

    // criando a necessidade para todos especializarem
    public abstract void falar();

}