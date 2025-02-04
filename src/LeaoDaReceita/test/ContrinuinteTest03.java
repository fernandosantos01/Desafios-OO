package LeaoDaReceita.test;

import LeaoDaReceita.dominio.Contribuinte;
import LeaoDaReceita.dominio.PessoaFisica;
import LeaoDaReceita.dominio.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ContrinuinteTest03 {
    private static final ArrayList<PessoaFisica> pessoasFisicas = new ArrayList<>();
    private static final ArrayList<PessoaJuridica> pessoasJuridicas = new ArrayList<>();
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            menu();
            opcao = in.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("ATÉ LOGO... E OBRIGADO POR USAR A ZARIO'S BANK!!!");
                    break;
                case 1:
                    criarConta();
                case 2:
                    imprimirContasComImposto();

            }
        } while (opcao != 0);
        System.out.println("PROGRAMA ENCERRADO!!!");
    }

    public static void menu() {
        System.out.println("DESEJA CRIAR UMA CONTA BANCÁRIA? (1 - SIM | 0 - NÃO)");
        System.out.println("2. IMPRESSÃO DA LISTA DA CONTAS BANCÁRIAS COM IMPOSTO APLICADO");
    }

    public static void criarConta() {
        System.out.println("QUAL TIPO DE CONTA VOCÊ DESEJA CRIAR? (1 - Pessoa Fisica | 2 - Pessoa Juridica)");
        int opcao = in.nextInt();
        if (opcao == 1) {
            criarPessoaFisica();
        } else if (opcao == 2) {
            criarPessoaJuridica();
        }
    }

    public static void criarPessoaFisica() {
        boolean continuar = true;
        while (continuar) {
            PessoaFisica pessoaFisica = new PessoaFisica();
            System.out.println("INICIANDO A CRIAÇÃO DE UMA CONTA PESSOA FISICA");
            System.out.print("DIGITE O SEU NOME: ");
            pessoaFisica.setNome(in.next());
            System.out.print("DIGITE O SEU CPF: ");
            pessoaFisica.setNome(in.next());
            System.out.print("DIGITE A SUA RENDA BRUTA: ");
            pessoaFisica.setRendaBruta(in.nextFloat());

            pessoasFisicas.add(pessoaFisica);
            System.out.println("AINDA DESEJA CRIAR ALGUMA CONTA PESSOA FISICA? (1 - SIM | 0 - NÃO)");
            continuar = in.nextInt() == 1;
        }
    } public static void criarPessoaJuridica(){
        boolean continuar = true;
        while (continuar){
            PessoaJuridica pessoaJuridica = new PessoaJuridica();
            System.out.println("INICIANDO A CRIAÇÃO DE UMA CONTA PESSOA FISICA");
            System.out.println("DIGITE SEU NOME: ");
            pessoaJuridica.setNome(in.next());
            System.out.println("DIGITE O SEU CNPJ: ");
            pessoaJuridica.setCnpj(in.next());
            System.out.println("DIGITE SUA RENDA BRUTA: ");
            pessoaJuridica.setRendaBruta(in.nextFloat());
            pessoasJuridicas.add(pessoaJuridica);

            System.out.println("AINDA DESEJA CRIAR ALGUMA CONTA PESSOA FISICA? (1 - SIM | 0 - NÃO)");
            continuar = in.nextInt()==1;
        }
    }
    private static void imprimirContasComImposto() {
        imprimirContas(pessoasFisicas);
        imprimirContas(pessoasJuridicas);
    }
    private static <T extends Contribuinte> void imprimirContas(List<T> contribuintes) {
        if (contribuintes.isEmpty()) {
            System.out.println("NÃO HÁ CLIENTES CADASTRADOS.");
            return;
        }
        for (T contribuinte : contribuintes) {
            System.out.println(contribuinte);
            contribuinte.calcularImposto();
        }
    }
}
