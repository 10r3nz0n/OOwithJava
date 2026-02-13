package utilitarios.menus;
import java.util.ArrayList;

import utilitarios.Menu;

public class MenuPrincipal {

    public static int exibir(String nome) {
        ArrayList<String> opcoes = new ArrayList<>();
        opcoes.add("Opção 1");
        opcoes.add("Opção 2");        
        opcoes.add("Sair");
        Menu menu = new Menu(nome, opcoes);
        return menu.exibir();
    }
}
