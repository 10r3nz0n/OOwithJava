/******************************************************************************
Video game e jogo como injeção de composicao
*******************************************************************************/

import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
	    //Programação pra implementação - chama o que tem interface
	    
	    
	    VideoGame atari = new VideoGame ();
	    //Usa referencia pela interface
	    ArrayList<JogoInterface> jogos = new ArrayList<>();
	    
	    //instancia pela especializacao - concreto
	    jogos.add (new PacMan());
	    jogos.add (new RiverRaid());
	    jogos.add (new SpaceInvaders());
	    jogos.add (new DonkeyKong());
	    jogos.add (new DonkeyKongJunior());
	    
	    System.out.println ("Jogos disponíveis");
	    for (JogoInterface jogo : jogos){
	        
	        jogo.apresentacao();
	        
	    }
	    
	    atari.iniciarJogo();
	    
	    //Injetando a dependencia
	    atari.injetarJogo(jogos.get(2)); //pegando o jogo pelo índice
	    atari.iniciarJogo();
	    
	    
	}
	
}
		