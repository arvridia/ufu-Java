// [(4,Paus),(7,Copas),(1,Espada),(7,Ouro),(3,Paus),(3,Espada),(3,Copas),(3,Ouro),(2,Paus),(2,Espada),(2,Copas),(2,Ouro),(1,Paus),(1,Copas),(1,Ouro),(13,Paus),(13,Espada),(13,Copas),(13,Ouro),(11,Paus),(11,Espada),(11,Copas),(11,Ouro),(12,Paus),(12,Espada),(12,Copas),(12,Ouro)]import java.util.Collections;

package jogoTruco;



public class Baralho {

    private Carta baralhocheio[];
    private int proximaCarta = 0;
    private int escolhaJogo;
   
    /*Construtor Baralho*/
    public Baralho(int escolhaJogo){
    	int numeros [] = {3,2,11,12,13};
        String nipes [] = {"Paus","Espada","Copas","Ouro"}; 
        if(escolhaJogo == 0){
    	baralhocheio = new Carta[27];
    	
    	baralhocheio[0] = new Carta(4,"Paus",0);
    	baralhocheio[1] = new Carta(7,"Copas",1);
    	baralhocheio[2] = new Carta(1,"Espada",2);
    	baralhocheio[3] = new Carta(7,"Ouro",3);
    	
    	baralhocheio[12] = new Carta(1,"Paus",12);
    	baralhocheio[13] = new Carta(1,"Copas",13);
    	baralhocheio[14] = new Carta(1,"Ouro",14);
    	
    	int w=0; //controla numeros
    	int valor = 4; //controla valor de cada carta
    	
    	for(int i=4,j=0;i<=11;i++){
    		baralhocheio[i] = new Carta(numeros[w],nipes[j],valor);
    		j++;
    		valor++;
    		if(j==4){
    			w++;
    			j=0;
    		}
    	}
    	valor = 15;
    	for(int i=15,  j = 0;i<27;i++){
    		baralhocheio[i] = new Carta(numeros[w],nipes[j],valor);
    		j++;
    		valor++;
    		if(j==4){
    			w++;
    			j=0;
    		}
            }
    	}
        else{
    	baralhocheio = new Carta[27];
    	baralhocheio[0] = new Carta(10,"Paus",0);
    	baralhocheio[1] = new Carta(10,"Copas",1);
    	baralhocheio[2] = new Carta(10,"Espada",2);
    	baralhocheio[3] = new Carta(10,"Ouro",3);     
    	
    	baralhocheio[12] = new Carta(1,"Paus",12);
    	baralhocheio[13] = new Carta(1,"Copas",13);
    	baralhocheio[14] = new Carta(1,"Ouro",14);
    	
    	int w=0; //controla numeros
    	int valor = 4; //controla valor de cada carta
    	
    	for(int i=4,j=0;i<=11;i++){
    		baralhocheio[i] = new Carta(numeros[w],nipes[j],valor);
    		j++;
    		valor++;
    		if(j==4){
    			w++;
    			j=0;
    		}
    	}
    	valor = 15;
    	for(int i=15,  j = 0;i<27;i++){
    		baralhocheio[i] = new Carta(numeros[w],nipes[j],valor);
    		j++;
    		valor++;
    		if(j==4){
    			w++;
    			j=0;
    		}
            }
        }    
    }  
 
    
    public void mostraBaralho(){
    	int i=0;
    	 System.out.println("\n\n\t\t Baralho\n\n");
    	for(i=0;i<baralhocheio.length;i++){
    		this.baralhocheio[i].imprimeCarta();
    	}
    }
   
	private int sorteia (){
		return (int) (Math.random() *27+0);
	}
    public void embaralhar(){
    	int x,i,y;
    	Carta cartaAuxiliar = new Carta();
    	for(i=0;i<30;i++){
    		x = sorteia();
        	y = sorteia();
        	cartaAuxiliar = baralhocheio[x];
    		baralhocheio[x] = baralhocheio[y];
    		baralhocheio[y] = cartaAuxiliar;
    	}
    }
    
    public Carta[] distribuir3Cartas(){
    	int i;
    	Carta[] cartasJogadores = new Carta[3];
    	for(i=0;i<3;i++){    		   
	    		cartasJogadores[i] = this.baralhocheio[proximaCarta];
	    		proximaCarta++;
	    }
    	return cartasJogadores;
    }
    
}
	
