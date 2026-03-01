package utilitarios.menus;

import java.util.ArrayList;
import utilitarios.Menu;

public class MenuPessoaExemplo {

    public static int exibir() {
        ArrayList<String> opcoes = new ArrayList<>();
        opcoes.add("Listar");
        opcoes.add("Localizar");
        opcoes.add("Cadastrar");
        opcoes.add("Atualizar");
        opcoes.add("Remover");
        opcoes.add("Voltar");
        Menu menu = new Menu("CRUD Pessoa!", opcoes);
        return menu.exibir();
    }

    public static int exibirCadastrarPessoa() {
        ArrayList<String> opcoes = new ArrayList<>();
        opcoes.add("Cliente");
        opcoes.add("Falecido");
        opcoes.add("Voltar");
        Menu menu = new Menu("Cadatrar pessoa!", opcoes);
        return menu.exibir();
    }

    public static int exibirListarPessoa() {
        ArrayList<String> opcoes = new ArrayList<>();
        opcoes.add("Clientes");
        opcoes.add("Falecidos");
        opcoes.add("Voltar");
        Menu menu = new Menu("Listar pessoas!", opcoes);
        return menu.exibir();
    }
}
