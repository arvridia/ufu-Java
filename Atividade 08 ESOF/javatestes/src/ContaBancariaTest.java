import static org.junit.Assert.*;
import org.junit.Test;

public class ContaBancariaTest {

    @Test
    public void testDepositar() {
        ContaBancaria conta = new ContaBancaria(500);
        assertTrue(conta.depositar(100)); // Estado Prata
        assertEquals(600, conta.getSaldo(), 0.001);

        assertTrue(conta.depositar(600)); // Estado Ouro
        assertEquals(1260, conta.getSaldo(), 0.001);
    }

    @Test
    public void testSacar() {
        ContaBancaria conta = new ContaBancaria(1500);
        assertTrue(conta.sacar(200)); // Estado Ouro
        assertEquals(1300, conta.getSaldo(), 0.001);

        assertFalse(conta.sacar(2000)); // Saldo é insuficiente
        assertEquals(1300, conta.getSaldo(), 0.001); // Verifica se o saldo não mudou

        assertTrue(conta.sacar(50)); // Estado Prata
        assertEquals(1250, conta.getSaldo(), 0.001);

        assertFalse(conta.sacar(1300)); // Estado Vermelho
        assertEquals(1250, conta.getSaldo(), 0.001);
    }

    @Test
    public void testObterEstado() {
        ContaBancaria conta1 = new ContaBancaria(500);
        assertEquals("Prata", conta1.obterEstado());

        ContaBancaria conta2 = new ContaBancaria(1500);
        assertEquals("Ouro", conta2.obterEstado());

        ContaBancaria conta3 = new ContaBancaria(-100);
        assertEquals("Vermelho", conta3.obterEstado());
    }
}
