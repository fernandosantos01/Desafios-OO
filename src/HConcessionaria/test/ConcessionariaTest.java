package HConcessionaria.test;

import HConcessionaria.dominio.cliente.Cliente;
import HConcessionaria.dominio.concessionaria.*;
import HConcessionaria.dominio.exceptions.ClienteNaoCadastradoException;
import HConcessionaria.dominio.exceptions.EstoqueInsuficienteException;

public class ConcessionariaTest {
    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria();

        Carro carro1 = new Carro("Toyota", "Corolla", 2022, 120000.0, TipoVeiculo.CARRO, 4);
        Moto moto1 = new Moto("Honda", "CG 160", 2021, 15000.0, TipoVeiculo.MOTO, true);
        Caminhao caminhao1 = new Caminhao("Volvo", "FH", 2020, 300000.0, TipoVeiculo.CAMINHAO, 10000.0);

        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");

        concessionaria.adicionarVeiculo(carro1);
        concessionaria.adicionarVeiculo(moto1);
        concessionaria.adicionarVeiculo(caminhao1);
        concessionaria.adicionarCliente(cliente1);

        try {
            concessionaria.realizarVenda(cliente1, carro1);
            concessionaria.realizarVenda(cliente1, moto1);
        } catch (EstoqueInsuficienteException | ClienteNaoCadastradoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        concessionaria.listarEstoque();
        concessionaria.listarVendas();
        cliente1.listarCompras();
        System.out.println("Total gasto pelo cliente: " + cliente1.calcularTotalGasto());
        System.out.println("Total de vendas da concessionária: " + concessionaria.calcularTotalVendas());
    }
}
