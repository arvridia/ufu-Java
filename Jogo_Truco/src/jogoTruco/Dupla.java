package jogoTruco;

public class Dupla {
	
	    private Jogador jogadores[]; 
		private int jogada; // 2 jogadas é igual a uma Mao.
		private int mao; // 11 maos é igual a 1 partida .
		private int partida;
		
		//construtor 
		
		public Dupla(Jogador jogadores[]){

		   	this.jogadores = jogadores;		
		   	this.jogada = 0;
		   	this.mao = 0;
		   	this.partida = 0;
		}
		
		public void imprimeDupla(){
			System.out.println("Dupla :: "+this.jogadores[0].getNome()+" & "+this.jogadores[1].getNome());
			for(int i=0;i<2;i++){
				this.jogadores[i].imprimeJogador();
			}
		}
		
		public void imprimeScore(){
			System.out.println("("+this.jogadores[0].getNome()+" & "+this.jogadores[1].getNome()+")");
			System.out.println("jogada = "+this.jogada);
			System.out.println("mao = "+this.mao);
			System.out.println("partida = "+this.partida+"\n\n");	
			
		}
		
		
		public Jogador[] getJogadores() {
			return jogadores;
		}

		public int getJogada(){
			return jogada;
		}
		public int getMao(){
			return mao;
		}
		public int getPartida(){
			return partida;
		}
		
		public void incrementaJogada(){
			this.jogada +=1;
			if(this.jogada==2){
				this.jogada = 0; // zerar as jogadas de quem ganhou,,, como zerar as jogadas do adversário ...
				this.incrementaMao(3);
			}
			
		}
		public void zeraJogada(){
			this.jogada = 0;
		}
		public void zeraMao(){
			this.mao = 0;
		}
		//quando o adversario recusa o truco, incrementa apenas 1.
		//quando o adversario aceita e perde o truco, incrementa 3 pontos;
		public void incrementaMao(int pontos){
			this.mao += pontos;
		}
		public void incrementaPartida(){
			this.partida +=1;
		}
		
		
		
		
}
