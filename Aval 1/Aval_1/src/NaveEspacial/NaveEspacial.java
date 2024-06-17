package NaveEspacial;

import java.util.Random;

public class NaveEspacial {
    
    private String nome;
    private int velocidade;
    private static int ct = 0;
    private int tipo;
    private int distancia;
    private int suprimentos;
    private int armasEdefesas;
    
    
    public NaveEspacial(String s) {
        if (ct >= 3) {
            System.out.println("Superpopulação de naves!");
            setNome("Nave com Defeito");
            setVelocidade(0);
        }else {
            setNome(s);
            Random r = new Random();
            setVelocidade(r.nextInt(5)+5);          
        }
        ct++;
    }
    
    public static int getCt() {
        return ct;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        nome = n;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int v) {
        velocidade = v;
    }
    
    public void setTipo(int t){
        tipo = t;
    }
    
    public int getTipo(){
        return tipo;
    }
    
    //DA = Defesa e ataque
    public void setDA(int DA){
        armasEdefesas = DA;
    }
    
    public int getDA(){
        return armasEdefesas;
    }
    
    public void setSup(int sup){
        suprimentos = sup;
    }
    
    public int getSup(){
        return suprimentos;
    }
    
    public void setDis(int dis){
        distancia = dis;
    }
    
    public int getDis(){
        return distancia;
    }
    
    public void mostrarNave() {
        System.out.print(getNome()+", ");
        if (getVelocidade() == 0)
            System.out.println("nave inoperante.");
        else
            System.out.println("com velocidade "+getVelocidade()+".");
    }
    
    public boolean naveMaisRapida(NaveEspacial n) {
        if (n.getVelocidade() > getVelocidade())
            return true;
        else
            return false;
    }
    
    public void tipoNave(int t){
        setTipo(t);
    }
    
    public void defesaAtaque(int DA){
        setDA(DA);
    }
    
    public void passageirosSuprimentos(int sup){
        setSup(sup);
    }
    
    public void distancia(int dis){
        setDis(dis);
    }
    
    public void consegueChegar(){
        int type = getTipo();
        int dis = getDis();
        int DA = getDA();
        int sup = getSup();
        int soma = 0;
        switch(type){
            case 1:
                soma += 5000;
                break;
            case 2:
                soma += 2500;
                break;
            case 3:
                soma += 1500;
                break;
        }
        soma += sup;
        soma += DA;
        soma -= dis;
        if(soma >= 0){
            System.out.println("A nave consegue atingir seu destino com sucesso! Restara "+soma+"de pontuacao de condicao.");
        }
        else
            System.out.println("A nave nao conseguira atingir seu objetivo, reconfigure-a ou diminua a distancia para que isso seja possivel.");
    }
    
}
