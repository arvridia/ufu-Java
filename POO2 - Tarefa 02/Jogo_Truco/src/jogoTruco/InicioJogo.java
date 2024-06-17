package jogoTruco;

import javax.swing.JOptionPane;




public class InicioJogo {
	
	/*private int comecou; // quem comecou a mao
	private int ganhouRodada; // quem ganhou
*/	private int proximo;
	
	public InicioJogo(int proximo){
		this.proximo = proximo;
		
	}
		

	public int getProximo(){
		return proximo;
	}
	public void setProximo(){   // se quem comecar jogando for o jogador 3, o proximo a jogar eh o jogador 0
		 if(this.proximo==3){              
			 this.proximo = 0;
		 }else{
			 this.proximo++;	 
		 }
	}
	
	public void setProximo(int ganhouRodada){   // se quem comecar jogando for o jogador 3, o proximo a jogar eh o jogador 0
		 if(this.proximo==3){              
			 this.proximo = 0;
		 }else{
			 this.proximo = ganhouRodada;	 
		 }
	}
	public void quemComeca(Dupla dupla){
		
		
		//String indiceCartaJogador0 = JOptionPane.showInputDialog(null, "0 - "+"("+todosJogadores[inicio.proximo].getMao().getCartas()[0].getNumero()+","+todosJogadores[inicio.proximo].getMao().getCartas()[0].getNipe()+")"+"\n1 - "+"("+todosJogadores[inicio.proximo].getMao().getCartas()[1].getNumero()+","+todosJogadores[inicio.proximo].getMao().getCartas()[1].getNipe()+")"+"\n2 - "+"("+todosJogadores[inicio.proximo].getMao().getCartas()[2].getNumero()+","+todosJogadores[inicio.proximo].getMao().getCartas()[2].getNipe()+")",todosJogadores[inicio.proximo].getNome()+" Escolha sua Carta : ",JOptionPane.INFORMATION_MESSAGE);
		
		
	}
	
	public static void main(String[] args) {
		//new InicioJogo().iniciar();
	
		System.out.println("\t\tJogo de Truco\n\n");
                String[] opcoes = {"Manilhas Tradicionais", "Manilhas com 10"};
        
                int escolha = JOptionPane.showOptionDialog(
                null,
                "Escolha o tipo de manilhas:",
                "Escolha de Manilhas",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );

        if (escolha == 0) {
            JOptionPane.showMessageDialog(null, "Você escolheu Manilhas Tradicionais.");
        } else if (escolha == 1) {
            JOptionPane.showMessageDialog(null, "Você escolheu Manilhas com 10.");
        }
		Baralho baralho = new Baralho(escolha); //criando o baralho
		baralho.embaralhar();   //embaralhando
	
		Jogador jogadores[] = null;
		Jogador jogadores2[] = null;
		Jogador todosJogadores[]= null;
		Dupla duplas[] = null;
		jogadores = new Jogador[2];
		jogadores2 = new Jogador[2];
		todosJogadores = new Jogador[4];
		
		duplas = new Dupla[2];
		int w = 0; //contador do numero de cada jogador
                

                
		for(int j=0;j<2;j++){
			    
				Mao mao = new Mao(baralho.distribuir3Cartas());
				jogadores[j] = new Jogador(JOptionPane.showInputDialog("Nome do jogador : "+w),w,mao);	
				w++;
		}
			
	    duplas[0] = new Dupla(jogadores);
	    
	    
	    for(int j=0;j<2;j++){
	    	
	    	Mao mao2 = new Mao(baralho.distribuir3Cartas());
	    	jogadores2[j] =  new Jogador(JOptionPane.showInputDialog("Nome do jogador : "+w),w,mao2);
	    	w++;
	    	
	    }
	    
	    duplas[1] = new Dupla(jogadores2);
	    Banca banca = new Banca(baralho,duplas); //banca criada
	    banca.imprimeBanca();  // imprimindo banca
	    
	    
	    todosJogadores[0] = jogadores[0];
	    todosJogadores[1] = jogadores[1];
	    todosJogadores[2] = jogadores2[0];
	    todosJogadores[3] = jogadores2[1];
	    
	   	    
	   	// come�ar a rodada ->> quem come�a a jogar !
	    
	    String comeca = JOptionPane.showInputDialog(null, "0 - "+banca.getDuplas()[0].getJogadores()[0].getNome()+"\n1 - "+banca.getDuplas()[0].getJogadores()[1].getNome()+"\n2 - "+banca.getDuplas()[1].getJogadores()[0].getNome()+"\n3 - "+banca.getDuplas()[1].getJogadores()[1].getNome(), "Quem come�a a jogar ? ",JOptionPane.INFORMATION_MESSAGE);
	    
	    InicioJogo inicio = new InicioJogo(Integer.parseInt(comeca));
    
		

		
		
		// entrada de dados referente 'a ecolhas de cartasS
		
	    for(int i=0;i<3;i++){
			
                        System.out.println("proximo = "+inicio.proximo);



                        String indiceCartaJogador0 = JOptionPane.showInputDialog(null, "0 - "+todosJogadores[inicio.proximo].getMao().foiDescartada(0)+"\n1 - "+todosJogadores[inicio.proximo].getMao().foiDescartada(1)+"\n2 - "+todosJogadores[inicio.proximo].getMao().foiDescartada(2),todosJogadores[inicio.proximo].getNome()+ " Escolha sua Carta : ",JOptionPane.INFORMATION_MESSAGE);



                        Carta c0 = new Carta(todosJogadores[inicio.proximo].getMao().getCartas()[Integer.parseInt(indiceCartaJogador0)].getNumero(),todosJogadores[inicio.proximo].getMao().getCartas()[Integer.parseInt(indiceCartaJogador0)].getNipe(),todosJogadores[inicio.proximo].getMao().getCartas()[Integer.parseInt(indiceCartaJogador0)].getValor());

                        todosJogadores[inicio.proximo].getMao().remove(Integer.parseInt(indiceCartaJogador0)); // remover carta da mao do jogador.

                        System.out.print(todosJogadores[inicio.proximo].getNome()+ " escolheu a carta :: ");c0.imprimeCarta();System.out.println();
                        inicio.setProximo();

                        System.out.println("proximo = "+inicio.proximo);


                        String indiceCartaJogador1 = JOptionPane.showInputDialog(null, "0 - "+todosJogadores[inicio.proximo].getMao().foiDescartada(0)+"\n1 - "+todosJogadores[inicio.proximo].getMao().foiDescartada(1)+"\n2 - "+todosJogadores[inicio.proximo].getMao().foiDescartada(2),todosJogadores[inicio.proximo].getNome()+ " Escolha sua Carta : ",JOptionPane.INFORMATION_MESSAGE);
		        Carta c1 = new Carta(todosJogadores[inicio.proximo].getMao().getCartas()[Integer.parseInt(indiceCartaJogador1)].getNumero(),todosJogadores[inicio.proximo].getMao().getCartas()[Integer.parseInt(indiceCartaJogador1)].getNipe(),todosJogadores[inicio.proximo].getMao().getCartas()[Integer.parseInt(indiceCartaJogador1)].getValor());

			todosJogadores[inicio.proximo].getMao().remove(Integer.parseInt(indiceCartaJogador1)); // remover carta da mao do jogador.
				
		        System.out.print(todosJogadores[inicio.proximo].getNome()+ " escolheu a carta :: ");c1.imprimeCarta();System.out.println();
		        inicio.setProximo();
		        
		       
		        System.out.println("proximo = "+inicio.proximo);
		        
		        
		        String indiceCartaJogador2 = JOptionPane.showInputDialog(null, "0 - "+todosJogadores[inicio.proximo].getMao().foiDescartada(0)+"\n1 - "+todosJogadores[inicio.proximo].getMao().foiDescartada(1)+"\n2 - "+todosJogadores[inicio.proximo].getMao().foiDescartada(2),todosJogadores[inicio.proximo].getNome()+ " Escolha sua Carta : ",JOptionPane.INFORMATION_MESSAGE);
		        Carta c2 = new Carta(todosJogadores[inicio.proximo].getMao().getCartas()[Integer.parseInt(indiceCartaJogador2)].getNumero(),todosJogadores[inicio.proximo].getMao().getCartas()[Integer.parseInt(indiceCartaJogador0)].getNipe(),todosJogadores[inicio.proximo].getMao().getCartas()[Integer.parseInt(indiceCartaJogador2)].getValor());
		        
			todosJogadores[inicio.proximo].getMao().remove(Integer.parseInt(indiceCartaJogador2)); // remover carta da mao do jogador.
		        
		        System.out.print(todosJogadores[inicio.proximo].getNome()+ " escolheu a carta :: ");c2.imprimeCarta();System.out.println();
		        inicio.setProximo();
		      
		        
		        System.out.println("proximo = "+inicio.proximo);
		        
		        
		        String indiceCartaJogador3 = JOptionPane.showInputDialog(null, "0 - "+todosJogadores[inicio.proximo].getMao().foiDescartada(0)+"\n1 - "+todosJogadores[inicio.proximo].getMao().foiDescartada(1)+"\n2 - "+todosJogadores[inicio.proximo].getMao().foiDescartada(2),todosJogadores[inicio.proximo].getNome()+ " Escolha sua Carta : ",JOptionPane.INFORMATION_MESSAGE);
		        Carta c3 = new Carta(todosJogadores[inicio.proximo].getMao().getCartas()[Integer.parseInt(indiceCartaJogador3)].getNumero(),todosJogadores[inicio.proximo].getMao().getCartas()[Integer.parseInt(indiceCartaJogador3)].getNipe(),todosJogadores[inicio.proximo].getMao().getCartas()[Integer.parseInt(indiceCartaJogador3)].getValor());
		        
			todosJogadores[inicio.proximo].getMao().remove(Integer.parseInt(indiceCartaJogador3)); // remover carta da mao do jogador.
				
		        System.out.print(todosJogadores[inicio.proximo].getNome()+ " escolheu a carta :: ");c3.imprimeCarta();System.out.println();
		        
		        inicio.setProximo();
		        
		        //compara��o das 4 cartas,
		        
				int primeiraComp = c0.compara(c2);
				int segundaComp = c1.compara(c3);
				

				
				System.out.println("primeiraComp = "+primeiraComp);
				System.out.println("segundaComp = "+segundaComp);
				
				if(primeiraComp==0&&segundaComp==0){
					System.out.println("Empate");
				}else if(primeiraComp==0&&segundaComp==1){
					System.out.println("Ponto Para primeira Dupla");
					banca.getDuplas()[0].incrementaJogada();		      
					
				}else if(primeiraComp==0&&segundaComp==-1){
					System.out.println("Ponto Para segunda Dupla");
					banca.getDuplas()[1].incrementaJogada();
				}
				
				else if(primeiraComp==1&&segundaComp==0){
					System.out.println("Ponto Para primeira Dupla");
					banca.getDuplas()[0].incrementaJogada();
				}else if(primeiraComp==1&&segundaComp==1){
					System.out.println("Ponto Para primeira Dupla");
					banca.getDuplas()[0].incrementaJogada();
				}else if(primeiraComp==1&&segundaComp==-1){
					//compara novamente
					if(c0.compara(c3)==0){
						System.out.println("Empate");
					}else if(c0.compara(c3)==1){
						System.out.println("ponto para primeira Dupla");
						banca.getDuplas()[0].incrementaJogada();
					}else if(c0.compara(c3)==-1){
						System.out.println("ponto para segunda Dupla");		
						banca.getDuplas()[1].incrementaJogada();
					}
				}
				
				else if(primeiraComp==-1&&segundaComp==0){
					System.out.println("Ponto Para segunda Dupla");
					banca.getDuplas()[1].incrementaJogada();
				}else if(primeiraComp==-1&&segundaComp==1){
					//compara novamente
					if(c2.compara(c1)==0){
						System.out.println("Empate");
					}else if(c2.compara(c1)==1){
						System.out.println("ponto para segunda Dupla");
						banca.getDuplas()[1].incrementaJogada();
					}else{
						System.out.println("ponto para primeira Dupla");
						banca.getDuplas()[0].incrementaJogada();
					}
					
				}else{        // -1 && -1
					System.out.println("ponto para segunda Dupla");
					banca.getDuplas()[1].incrementaJogada();
				}
				
				
				// listas pontua��o das duplas ;
				
				System.out.println("\n\n\tPontua��o das Duplas\n\n");
				banca.getDuplas()[0].imprimeScore();
				banca.getDuplas()[1].imprimeScore();
		}		
		
		//  todosJogadores[0].getMao().setCartas(baralho.distribuir3Cartas());
         
        
	}
}
	

