package BLeaoDaReceita.test;

import BLeaoDaReceita.dominio.Contribuinte;
import BLeaoDaReceita.dominio.PessoaFisica;
import BLeaoDaReceita.dominio.PessoaJuridica;

import java.util.Scanner;

public class ContribuinteTest02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PessoaFisica[] pessoaFisicas = new PessoaFisica[100];
        PessoaJuridica[] pessoaJuridicas = new PessoaJuridica[100];
        Contribuinte[] contribuintes = new Contribuinte[200];
        int opcao;

        do {
            System.out.println("DESEJA CRIAR UM CONTA BANCÁRIA? (1 - SIM | 0 - NÃO)");
            System.out.println("2.IMPRESSÃO DA LISTA DA CONTAS BANCARIAS COM IMPOSTO APLICADO");
            opcao = in.nextInt();
            boolean aux = true;
            switch (opcao) {

                case 0:
                    System.out.println("ATÉ LOGO... E OBRIGADO POR USAR A ZARIO'S BANK!!!");
                    break;
                case 1:
                    System.out.println("QUAL TIPO DE CONTA VOCÊ DESEJA CRIAR? (1 - Pessoa Fisica | 2 - Pessoa Juridica)");
                    opcao = in.nextInt();
                    do {
                        if (opcao == 1) {
                            for (int i = 0; aux == true; i++) {
                                pessoaFisicas[i] = new PessoaFisica();
                                System.out.println("INICIANDO A CRIAÇÃO DE UMA CONTA PESSOA FISICA");
                                System.out.println("DIGITE O SEU NOME: ");
                                String nome = in.next();
                                pessoaFisicas[i].setNome(nome);
                                System.out.println("DIGITE O SEU CPF: ");
                                String cpf = in.next();
                                pessoaFisicas[i].setCpf(cpf);
                                System.out.println("DIGITE A SUA RENDA BRUTA: ");
                                float rendaBruta = in.nextFloat();
                                pessoaFisicas[i].setRendaBruta(rendaBruta);
                                if (aux == true) {
                                    System.out.println("AINDA DESEJA CRIAR ALGUMA CONTA PESSOA FISICA? (1 - SIM | 0 - NÃO)");
                                    int resposta = in.nextInt();
                                    if (resposta == 0) {
                                        aux = false;
                                        break;
                                    }
                                }
                            }
                            break;
                        } else if (opcao == 2) {
                            for (int i = 0; aux == true; i++) {
                                pessoaJuridicas[i] = new PessoaJuridica();
                                System.out.println("INICIANDO A CRIAÇÃO DE UMA CONTA PESSOA JURIDICA");
                                System.out.println("DIGITE O SEU NOME: ");
                                String nome = in.next();
                                pessoaJuridicas[i].setNome(nome);
                                System.out.println("DIGITE O SEU CNPJ: ");
                                String cnpj = in.next();
                                pessoaJuridicas[i].setCnpj(cnpj);
                                System.out.println("DIGITE A SUA RENDA BRUTA: ");
                                float rendaBruta = in.nextFloat();
                                pessoaJuridicas[i].setRendaBruta(rendaBruta);
                                if (aux == true) {
                                    System.out.println("AINDA DESEJA CRIAR ALGUMA CONTA PESSOA JURIDICA? (1 - SIM | 0 - NÃO)");
                                    int resposta = in.nextInt();
                                    if (resposta == 0) {
                                        aux = false;
                                        break;
                                    }
                                }
                            }
                        }
                        break;

                    } while (opcao != 0);
                    break;
                case 2:
                    for (Contribuinte contribuinteFisico : pessoaFisicas) {
                        boolean hasClientesFisicos = false;
                        if (contribuinteFisico == null) {
                            for (Contribuinte contribuinteFisicos : pessoaFisicas) {
                                if (contribuinteFisicos != null) {
                                    hasClientesFisicos = true;
                                    System.out.println(contribuinteFisicos);
                                    contribuinteFisicos.calcularImposto();
                                }
                            }
                            if (!hasClientesFisicos) {
                                System.out.println("AINDA NÃO HÁ CLIENTES JURIDICOS");
                            }
                            break;
                        }
                    }
                    for (Contribuinte contribuinteJuridico : pessoaJuridicas) {
                        boolean hasClientesJuridicos = false;
                        if (contribuinteJuridico == null) {
                            for (Contribuinte contribuinteJuridicos : pessoaJuridicas) {
                                if (contribuinteJuridicos != null) {
                                    hasClientesJuridicos = true;
                                    System.out.println(contribuinteJuridicos);
                                    contribuinteJuridicos.calcularImposto();
                                }
                            }
                            if (!hasClientesJuridicos) {
                                System.out.println("AINDA NÃO HÁ CLIENTES JURIDICOS");
                            }
                            break;
                        }
                    }
                    break;

                default:
                    System.out.println("Opção Invalida!!");
            }
        } while (opcao != 0);
        System.out.println("PROGRAMA ENCERRADO!!");
    }
}
