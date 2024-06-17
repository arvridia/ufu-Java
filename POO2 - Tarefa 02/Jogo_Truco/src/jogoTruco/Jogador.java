package jogoTruco;

import javax.swing.JOptionPane;


public class Jogador {
	
	private String nome;
	private int numero;
	private Mao mao;
	
	//construtor de jogador
	
	public Jogador(String nome, int numero, Mao mao){
		
		this.nome = nome;
		this.numero = numero;
		this.mao = mao;
		
	}
	
	
	public String getNome(){
		return nome;
	}
	public int getNumero(){
		return numero;
	}	
	public Mao getMao(){
		return mao;
	}
	
	public void imprimeNome(){
		System.out.println(this.nome);
	}

	public void imprimeJogador(){
		int i;
		System.out.println("\nJogador :: "+this.nome);
		System.out.println("Numero  = " + this.numero);
		this.mao.imprimeMao();
		System.out.println();
		
	}
	

	
	

	
}
