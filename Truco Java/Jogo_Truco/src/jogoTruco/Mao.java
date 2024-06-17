package jogoTruco;



public class Mao {
	
	private Carta cartas[];

	   
	//construtor
	public Mao(Carta cartas[]){
	     this.cartas = cartas;
	}
	
	public void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}

	public Carta[] getCartas(){
		return cartas;
	}
     
	public String foiDescartada(int i){
		if(this.cartas[i]==null){
			return "Descartada !";
		}else{
			return "("+this.cartas[i].getNumero()+","+this.cartas[i].getNipe()+")";
		}
	}
	
	public void imprimeMao(){
		System.out.print("Cartas na Mao :: ");
		for(int i=0;i<this.cartas.length;i++){
			if(this.cartas[i]!=null){
				cartas[i].imprimeCarta();	
			}			
		}
		System.out.println();
	}	
	
	//retorna a carta da mão do jogador , dado o indice
  
	public Carta getCarta(int indice){
		return this.cartas[indice];
	}

	public void remove(int indice){
		
	   this.cartas[indice] = null;
	}
	
}
