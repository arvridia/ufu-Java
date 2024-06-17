package jogoTruco;

import javax.swing.JOptionPane;


public class Carta {
	
	private String nipe;
	private int numero;
	private int valor;
	

	public Carta (int  numero, String nipe, int valor){
		   this.nipe = nipe;
		   this.numero=numero;
		   this.valor =valor;
	}
	public Carta(){
		this.numero = 4;
		this.nipe = "Paus";
		this.valor = 0;
	}
	
	public String getNipe(){
		return this.nipe;
	}
	public int getNumero(){
		return numero;
	}
	
	
	public int getValor(){
		return valor;
	}
	
	public void imprimeCarta(){
		System.out.print("("+this.numero+","+this.nipe+","+this.valor+")");
	}
	
	public int  compara(Carta carta2){
		return (this.getValor() < carta2.getValor ()) ? 1 : ((this.getValor() == carta2.getValor ()) ? 0 : -1); 
	}
	
}



