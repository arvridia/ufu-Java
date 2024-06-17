package banco;

public class Conta {    
    private static int ct = 0;
    private String tipo;
    private float saldo;
    private int num;
    
    public int getNum() {
        return num;
    }
    
    void cadastraConta(String t, float s) {
        tipo = t;
        if (s >= 100)
            saldo = s;
        else
            saldo = 100;
        num = ct;
        ct++;
    }
    
    String mostraSaldo() {
        return "O saldo da conta num "+num+", do tipo ("+tipo+") eh "+saldo+" reais.";
    }
    
    public float getSaldo() {
        return saldo;
    }
    
    boolean sacar(float valor) {
        //if (valor <= (saldo+100)) {
            saldo -= valor;
            return true;
        //}else
        //    return false;
    }
    
    boolean depositar(float valor) {
        saldo += valor;
        return true;
    }
    
    boolean ehNegativo() {
        return (saldo < 0);
    }
    
    void transferir(float valor, Conta c) {
        if (sacar(valor)) {
            c.depositar(valor);
            System.out.println("Transferencia concluida.");
        } else
            System.out.println("Erro na operacao. Transferencia cancelada.");
    }

}