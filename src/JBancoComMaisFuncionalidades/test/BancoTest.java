package JBancoComMaisFuncionalidades.test;

import JBancoComMaisFuncionalidades.dominio.Banco;
import JBancoComMaisFuncionalidades.dominio.ContaCorrente;

public class BancoTest {
    public static void main(String[] args) {
        Banco banco = new Banco("Nubank");
        ContaCorrente contaCorrente = new ContaCorrente("1234", "Jose", "1234");
        ContaCorrente contaCorrente2 = new ContaCorrente("1234", "Maria", "1234");
        ContaCorrente contaCorrente3 = new ContaCorrente("4321", "Eduarda", "1234");
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaCorrente2);
        banco.adicionarConta(contaCorrente3);
        banco.listarContas();
        contaCorrente.depositar(14);
        contaCorrente3.depositar(15);
        System.out.println("Valor Total Em Todos os Bancos: "+banco.calcularSaldoTotal());
        banco.listarContas();
        banco.transferirEntreContas("1234", "4321", 5, "1234");
        System.out.println("==============================Extrato=============================\n");
        contaCorrente.exibirExtrato();
        banco.listarContas();
        System.out.println("---------------------------------");
        System.out.println(banco.buscarConta("43210"));
        System.out.println(banco.buscarConta("4321"));
        contaCorrente.sacar(2, "1234");
        System.out.println(banco.buscarConta("1234"));
        System.out.println("---------------------");
        contaCorrente.exibirExtrato();
        banco.removerConta("12345");
        System.out.println(banco.buscarConta("1234"));

    }
}
