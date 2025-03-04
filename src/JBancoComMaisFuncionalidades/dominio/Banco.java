package JBancoComMaisFuncionalidades.dominio;

import java.util.*;

public class Banco {
    private String nome;
    private Set<ContaBancaria> contaBancarias;

    public Banco(String nome) {
        this.nome = nome;
        this.contaBancarias = new HashSet<>();
    }

    public void adicionarConta(ContaBancaria conta) {
        if (!contaBancarias.add(conta)){
            System.out.println("Erro: Já existe uma conta com esse número.");
            return;
        }
        contaBancarias.add(conta);
    }

    public boolean removerConta(String numeroConta) {
        ContaBancaria contaBancariaParaRemover = null;
        if (!contaBancarias.isEmpty()) {
            for (ContaBancaria c : contaBancarias) {
                if (c.getNumeroConta().equals(numeroConta)) {
                    contaBancariaParaRemover = c;
                    break;
                }
            }
        } else {
            System.out.println("Nenhuma Conta Criada!");
            return false;
        }
        if (contaBancariaParaRemover == null){
            System.out.println("Conta Inexistente!");
        }
        contaBancarias.remove(contaBancariaParaRemover);
        return true;
    }

    public ContaBancaria buscarConta(String numeroConta) {
        ContaBancaria contaBancariaPesquisada = null;
        if (!contaBancarias.isEmpty()) {
            for (ContaBancaria c : contaBancarias) {
                if (c.getNumeroConta().equals(numeroConta)) {
                    contaBancariaPesquisada = c;
                    break;
                }
            }
        } else {
            System.out.println("Nenhuma Conta Criada");
            return null;
        }
        if (contaBancariaPesquisada == null){
            System.out.println("Conta não encontrada!");
        }
        return contaBancariaPesquisada;
    }
    public boolean transferirEntreContas(String numeroOrigem, String numeroDestino, double valor, String senha) {
        ContaBancaria origem = buscarConta(numeroOrigem);
        ContaBancaria destino = buscarConta(numeroDestino);

        if (origem == null) {
            System.out.println("Erro: Conta de origem não encontrada.");
            return false;
        }

        if (destino == null) {
            System.out.println("Erro: Conta de destino não encontrada.");
            return false;
        }

        return origem.transferir(destino, valor, senha);
    }


    public void listarContas() {
        System.out.println(contaBancarias);
    }

    public double calcularSaldoTotal() {
        double valorTotal = 0d;
        if (!contaBancarias.isEmpty()) {
            for (ContaBancaria c : contaBancarias) {
                valorTotal += c.getSaldo();
            }
        }
        return valorTotal;
    }

    public Set<ContaBancaria> listarContasNegativas() {
        Set<ContaBancaria> contaBancariaNegativa = new HashSet<>();
        if (!contaBancarias.isEmpty()) {
            for (ContaBancaria c : contaBancarias) {
                if (c.getSaldo() < 0) {
                    contaBancariaNegativa.add(c);
                }
            }
        } else {
            System.out.println("Nenhuma Conta Inserida");
        }
        return contaBancariaNegativa;
    }

    public int quantidadeDeContas() {
        return contaBancarias.size();
    }
}
