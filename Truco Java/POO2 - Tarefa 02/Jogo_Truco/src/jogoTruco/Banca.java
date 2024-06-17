package jogoTruco;

public class Banca {

	private Baralho baralho;
	private Dupla duplas[]; 
	
	
	//construto da banca
	public Banca(Baralho baralho, Dupla duplas[]){
		
	    this.baralho = baralho;
	    this.duplas = duplas;
	}	
	
	public Baralho getBaralho() {
		return baralho;
	}
	
	public Dupla[] getDuplas() {
		return duplas;
	}

	
	public void imprimeBanca(){
		System.out.println("\n\t\tBanca :: \n\n");
		System.out.print("\t ( "+this.duplas[0].getJogadores()[0].getNome()+" & "+this.duplas[0].getJogadores()[1].getNome()+" ) " + "VS");
		System.out.println(" ( "+this.duplas[1].getJogadores()[0].getNome()+" & "+this.duplas[1].getJogadores()[1].getNome()+" ) " );
		
		for(int i=0;i<2;i++){
			this.duplas[i].getJogadores()[0].imprimeJogador();
			this.duplas[i].getJogadores()[1].imprimeJogador();
		}
		
	}

	

	
	
	
	
}
