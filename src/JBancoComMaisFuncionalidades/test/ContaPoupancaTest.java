package JBancoComMaisFuncionalidades.test;

import JBancoComMaisFuncionalidades.dominio.ContaPoupanca;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContaPoupancaTest {

    private ContaPoupanca contaPoupanca;

    @Before
    public void setUp() {
        contaPoupanca = new ContaPoupanca("1234", "Jose", "1234");
    }

    @Test
    public void testDepositar() {
        assertTrue(contaPoupanca.depositar(100));
        assertEquals(100.5, contaPoupanca.getSaldo(), 0.0);
    }

    @Test
    public void testSacar() {
        contaPoupanca.depositar(200);
        assertTrue(contaPoupanca.sacar(50, "1234"));
        assertEquals(151.0, contaPoupanca.getSaldo(), 0.0);
    }

    @Test
    public void testSacarSaldoInsuficiente() {
        contaPoupanca.depositar(50);
        assertFalse(contaPoupanca.sacar(100, "1234"));
        assertEquals(50.25, contaPoupanca.getSaldo(), 0.0);
    }

    @Test
    public void testTransferir() {
        ContaPoupanca contaDestino = new ContaPoupanca("5678", "Maria", "5678");
        contaPoupanca.depositar(200);
        assertTrue(contaPoupanca.transferir(contaDestino, 100, "1234"));
        assertEquals(101.0, contaPoupanca.getSaldo(), 0.0);
        assertEquals(100.0, contaDestino.getSaldo(), 0.0);
    }

    @Test
    public void testTransferirSaldoInsuficiente() {
        ContaPoupanca contaDestino = new ContaPoupanca("5678", "Maria", "5678");
        contaPoupanca.depositar(50);
        assertFalse(contaPoupanca.transferir(contaDestino, 100, "1234"));
        assertEquals(50.25, contaPoupanca.getSaldo(), 0.0);
        assertEquals(0.0, contaDestino.getSaldo(), 0.0);
    }

    @Test
    public void testExibirExtrato() {
        contaPoupanca.depositar(100);
        contaPoupanca.sacar(50, "1234");
        contaPoupanca.exibirExtrato(); // Apenas verifica se o método executa sem erros
    }
}