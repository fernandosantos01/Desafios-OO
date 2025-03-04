package JBancoComMaisFuncionalidades.test;

import JBancoComMaisFuncionalidades.dominio.Banco;
import JBancoComMaisFuncionalidades.dominio.ContaCorrente;
import JBancoComMaisFuncionalidades.dominio.ContaPoupanca;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BancoTest1 {

    private Banco banco;
    private ContaCorrente contaCorrente1;
    private ContaPoupanca contaPoupanca1;

    @Before
    public void setUp() {
        banco = new Banco("Meu Banco");
        contaCorrente1 = new ContaCorrente("1234", "Jose", "1234");
        contaPoupanca1 = new ContaPoupanca("5678", "Maria", "5678");
        banco.adicionarConta(contaCorrente1);
        banco.adicionarConta(contaPoupanca1);
    }

    @Test
    public void testAdicionarConta() {
        assertEquals(2, banco.quantidadeDeContas());
    }

    @Test
    public void testRemoverConta() {
        assertTrue(banco.removerConta("1234"));
        assertEquals(1, banco.quantidadeDeContas());
    }

    @Test
    public void testBuscarConta() {
        assertEquals(contaCorrente1, banco.buscarConta("1234"));
        assertNull(banco.buscarConta("9999"));
    }

    @Test
    public void testTransferirEntreContas() {
        contaCorrente1.depositar(100);
        assertTrue(banco.transferirEntreContas("1234", "5678", 50, "1234"));
        assertEquals(50.0, contaCorrente1.getSaldo(), 0.0);
        assertEquals(50.0, contaPoupanca1.getSaldo(), 0.0);
    }

    @Test
    public void testCalcularSaldoTotal() {
        contaCorrente1.depositar(100);
        contaPoupanca1.depositar(50);
        assertEquals(150.25, banco.calcularSaldoTotal(), 0.0);
    }

    @Test
    public void testListarContasNegativas() {
        contaCorrente1.sacar(200, "1234");
        assertEquals(1, banco.listarContasNegativas().size());
    }
}