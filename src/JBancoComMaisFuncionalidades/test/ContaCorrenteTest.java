package JBancoComMaisFuncionalidades.test;

import JBancoComMaisFuncionalidades.dominio.ContaCorrente;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContaCorrenteTest {

    private ContaCorrente contaCorrente;

    @Before
    public void setUp() {
        contaCorrente = new ContaCorrente("1234", "Jose", "1234");
    }

    @Test
    public void testDepositar() {
        assertTrue(contaCorrente.depositar(100));
        assertEquals(100.0, contaCorrente.getSaldo(), 0.0);
    }

    @Test
    public void testSacar() {
        contaCorrente.depositar(200);
        assertTrue(contaCorrente.sacar(50, "1234"));
        assertEquals(149.7, contaCorrente.getSaldo(), 0.0);
    }

    @Test
    public void testSacarSaldoInsuficiente() {
        contaCorrente.depositar(50);
        assertFalse(contaCorrente.sacar(10000, "1234"));
        assertEquals(50.0, contaCorrente.getSaldo(), 0.0);
    }

    @Test
    public void testTransferir() {
        ContaCorrente contaDestino = new ContaCorrente("5678", "Maria", "5678");
        contaCorrente.depositar(200);
        assertTrue(contaCorrente.transferir(contaDestino, 100, "1234"));
        assertEquals(100.0, contaCorrente.getSaldo(), 0.0);
        assertEquals(100.0, contaDestino.getSaldo(), 0.0);
    }

    @Test
    public void testTransferirSaldoInsuficiente() {
        ContaCorrente contaDestino = new ContaCorrente("5678", "Maria", "5678");
        contaCorrente.depositar(50);
        assertFalse(contaCorrente.transferir(contaDestino, 100, "1234"));
        assertEquals(50.0, contaCorrente.getSaldo(), 0.0);
        assertEquals(0.0, contaDestino.getSaldo(), 0.0);
    }

    @Test
    public void testExibirExtrato() {
        contaCorrente.depositar(100);
        contaCorrente.sacar(50, "1234");
        contaCorrente.exibirExtrato(); // Apenas verifica se o método executa sem erros
    }
}