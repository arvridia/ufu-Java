/*
Atividade 08 Engenharia de Software
Arthur Resende Santos
Felipe Roza Bonetti
 */

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public boolean depositar(double valor) {
        if (valor < 0) {
            return false;
        }

        saldo += valor;
        if (saldo > 1000) {
            saldo *= 1.05; // Rendimento de 5% para conta ouro
        }

        return true;
    }

    public boolean sacar(double valor) {
        if (saldo < 0 || saldo - valor < 0) {
            return false;
        }

        if (saldo >= 1000) {
            saldo -= valor;
        } else {
            saldo -= valor * 1.01; // Taxa de 1% para conta prata
        }

        return true;
    }

    public String obterEstado() {
        if (saldo >= 1000) {
            return "Ouro";
        } else if (saldo >= 0) {
            return "Prata";
        } else {
            return "Vermelho";
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
