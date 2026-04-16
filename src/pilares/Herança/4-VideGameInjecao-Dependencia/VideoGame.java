public class VideoGame{
    
        private JogoInterface jogo; //o que será injetado, referencia interface
        
        //voce programa para a interface, assim funcionará a injeção da dependencia
        //cuja dependencia atende ao contrato
        
        public VideoGame(){
            
        }
        
        public VideoGame (JogoInterface jogoInjetado){
            
            //Fazendo a injeção de dependência, uma composição
            injetarJogo(jogo);
            
        }
        
        public void injetarJogo (JogoInterface novoJogoInjetado){
            
            this.jogo = novoJogoInjetado;
            
        }
        
        //porgramando para o contrato, acionando o que há no contrato
        public void iniciarJogo(){
            
            if (jogo == null) {
                System.out.println("Injete o jogo!");
                return;
            }
            
            jogo.apresentacao();
            jogo.iniciar();
            
        }
    
}