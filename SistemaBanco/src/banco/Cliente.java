package banco;

public class Cliente {
    private static int ct = 0;
    private String nome, CPF, telefone;
    private int idade;
    private Conta conta;
    private String usr,sen;
    
    public static int getCt() {
        return ct;
    }
    
    public String getUsr() {
        return usr;
    }
    
    public String getSen() {
        return sen;
    }
    
    public int getNumConta() {
        return conta.getNum();
    }
    
    public Conta getConta() {
        return conta;
    }
    
    public String getDadosConta() {
        String r = "";
        r += conta.getNum()+" ";
        r += nome+" ";
        r += getConta().getSaldo();
        return r;
    }
    
    void cadastraCliente(String n, String cpf, String t, int i, String u, String s, Conta c) {
        nome = n;
        CPF = cpf;
        telefone = t;
        idade = i;
        usr = u;
        sen = s;
        conta = c;
        ct++;
    }
    
    public boolean estaNegativado() {
        return conta.ehNegativo();
    }
    
    public int getIdade() {
        return  idade;
    }
    
}