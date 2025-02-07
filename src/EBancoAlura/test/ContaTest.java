package EBancoAlura.test;

import EBancoAlura.dominio.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class ContaTest {
    private static final Scanner in = new Scanner(System.in);
    private static final ArrayList<ContaPoupanca> contasPoupancas = new ArrayList<>();
    private static final ArrayList<ContaCorrente> contasCorrentes = new ArrayList<>();
    private static final ArrayList<ContaCorrenteVip> contasCorrentesVips = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("========BEM VINDO A ZARIO'S BANK========");
        int opc;
        do {
            menu();
            opc = in.nextInt();
            switch (opc) {
                case 1:
                    criaConta();
                    break;
                case 2:
                    deposita();
                    break;
                case 3:
                    saca();
                    break;
                case 4:
                    transferir();
                    break;
                case 5:
                    verHistorico();
                    break;
                default:
                    System.out.println("PROGRAMA ENCERRADO!!!");
                    break;
            }
        } while (opc != 0);
    }

    public static void menu() {
        System.out.println("1.Criar Conta\n2.Depositar\n3.Sacar\n4.Transferir\n5.Ver Historico\n0.Sair");
    }

    public static void criaConta() {
        System.out.println("ESCOLHA O TIPO DE CONTA:\n1 - CONTA CORRENTE\n2 - CONTA POUPANÇA\n3 - CONTA CORRENTE VIP");
        int opc = in.nextInt();
        System.out.println("DIGITE SEU NOME: ");
        String nome = in.next();
        LocalDateTime dataDeAbertura = LocalDateTime.now();
        if (opc == 1) {
            ContaCorrente contaCorrente = new ContaCorrente(nome, dataDeAbertura);
            System.out.println(contaCorrente);
            contasCorrentes.add(contaCorrente);
        } else if (opc == 2) {
            ContaPoupanca contaPoupanca = new ContaPoupanca(nome, dataDeAbertura);
            System.out.println(contaPoupanca);
            contasPoupancas.add(contaPoupanca);
        } else if (opc == 3) {
            ContaCorrenteVip contaCorrenteVip = new ContaCorrenteVip(nome, dataDeAbertura);
            System.out.println(contaCorrenteVip);
            contasCorrentesVips.add(contaCorrenteVip);
        } else {
            System.out.println("OPÇÃO INVALIDA TENTE NOVAMENTE!!!");
        }
    }

    public static void deposita() {
        System.out.println("QUER DEPOSITAR EM QUAL CONTA:\n1 - CONTA CORRENTE\n2 - CONTA POUPANÇA\n3 - CONTA CORRENTE VIP");
        int opc = in.nextInt();

        Conta contaDestino = null;
        System.out.println("QUAL O NÚMERO DA CONTA?");
        int numeroConta = in.nextInt();

        if (opc == 1) {
            for (ContaCorrente conta : contasCorrentes) {
                if (conta.getNumero() == numeroConta) {
                    contaDestino = conta;
                    break;
                }
            }
        } else if (opc == 2) {
            for (ContaPoupanca conta : contasPoupancas) {
                if (conta.getNumero() == numeroConta) {
                    contaDestino = conta;
                    break;
                }
            }
        } else if (opc == 3) {
            for (ContaCorrenteVip conta : contasCorrentesVips) {
                if (conta.getNumero() == numeroConta) {
                    contaDestino = conta;
                    break;
                }
            }
        }

        if (contaDestino == null) {
            System.out.println("CONTA NÃO ENCONTRADA!");
            return;
        }

        System.out.println("QUANTO VOCÊ DESEJA DEPOSITAR?");
        double valor = in.nextDouble();
        contaDestino.deposita(valor);  // Chama o método deposita da conta encontrada
    }


    public static void saca() {
        System.out.println("QUER SACAR DE QUAL CONTA:\n1 - CONTA CORRENTE\n2 - CONTA POUPANÇA\n3 - CONTA CORRENTE VIP");
        int opc = in.nextInt();

        Conta contaOrigem = null;
        System.out.println("QUAL O NÚMERO DA CONTA?");
        int numeroConta = in.nextInt();

        // Verifica se a conta existe em alguma das listas
        if (opc == 1) {
            for (ContaCorrente conta : contasCorrentes) {
                if (conta.getNumero() == numeroConta) {
                    contaOrigem = conta;
                    break;
                }
            }
        } else if (opc == 2) {
            for (ContaPoupanca conta : contasPoupancas) {
                if (conta.getNumero() == numeroConta) {
                    contaOrigem = conta;
                    break;
                }
            }
        } else if (opc == 3) {
            for (ContaCorrenteVip conta : contasCorrentesVips) {
                if (conta.getNumero() == numeroConta) {
                    contaOrigem = conta;
                    break;
                }
            }
        }

        // Se a conta não for encontrada, exibe uma mensagem de erro
        if (contaOrigem == null) {
            System.out.println("CONTA NÃO ENCONTRADA!");
            return;
        }

        System.out.println("QUANTO VOCÊ DESEJA SACAR?");
        double valor = in.nextDouble();
        contaOrigem.saca(valor);  // Chama o método saca da conta encontrada
    }


    public static void transferir() {
        System.out.println("QUAL TIPO DE CONTA DE ORIGEM?\n1 - CONTA CORRENTE\n2 - CONTA POUPANÇA\n3 - CONTA CORRENTE VIP");
        int opcOrigem = in.nextInt();
        System.out.println("QUAL O NÚMERO DA CONTA DE ORIGEM? ");
        int numeroContaOrigem = in.nextInt();
        System.out.println("QUAL O TIPO DE CONTA DE DESTINO?\n1 - CONTA CORRENTE\n2 - CONTA POUPANÇA\n3 - CONTA CORRENTE VIP");
        int opcDestino = in.nextInt();
        System.out.println("QUAL O NÚMERO DA CONTA DE DESTINO? ");
        int numeroContaDestino = in.nextInt();
        System.out.println("QUANTO VOCÊ DESEJA TRANSFERIR? ");
        double valor = in.nextDouble();

        if (valor > 0) {
            Conta contaOrigem = null;
            Conta contaDestino = null;

            if (opcOrigem == 1) {
                for (ContaCorrente conta : contasCorrentes) {
                    if (conta.getNumero() == numeroContaOrigem) {
                        contaOrigem = conta;
                        break;
                    }
                }
            } else if (opcOrigem == 2) {
                for (ContaPoupanca conta : contasPoupancas) {
                    if (conta.getNumero() == numeroContaOrigem) {
                        contaOrigem = conta;
                        break;
                    }
                }
            } else if (opcOrigem == 3) {
                for (ContaCorrenteVip conta : contasCorrentesVips) {
                    if (conta.getNumero() == numeroContaOrigem) {
                        contaOrigem = conta;
                        break;
                    }
                }
            }

            if (opcDestino == 1) {
                for (ContaCorrente conta : contasCorrentes) {
                    if (conta.getNumero() == numeroContaDestino) {
                        contaDestino = conta;
                        break;
                    }
                }
            } else if (opcDestino == 2) {
                for (ContaPoupanca conta : contasPoupancas) {
                    if (conta.getNumero() == numeroContaDestino) {
                        contaDestino = conta;
                        break;
                    }
                }
            } else if (opcDestino == 3) {
                for (ContaCorrenteVip conta : contasCorrentesVips) {
                    if (conta.getNumero() == numeroContaDestino) {
                        contaDestino = conta;
                        break;
                    }
                }
            }

            if (contaOrigem != null && contaDestino != null) {
                contaOrigem.transferencia(contaDestino, valor);
            } else {
                System.out.println("CONTA NÃO ENCONTRADA!");
            }
        } else {
            System.out.println("VALOR INVÁLIDO!");
        }
    }

    public static void verHistorico() {
        System.out.println("QUER VER O HISTÓRICO DE QUAL CONTA?\n1 - CONTA CORRENTE\n2 - CONTA POUPANÇA\n3 - CONTA CORRENTE VIP");
        int opc = in.nextInt();

        Conta conta = null;
        System.out.println("QUAL O NÚMERO DA CONTA?");
        int numeroConta = in.nextInt();

        // Encontra a conta com o número informado
        if (opc == 1) {
            for (ContaCorrente contaCorrente : contasCorrentes) {
                if (contaCorrente.getNumero() == numeroConta) {
                    conta = contaCorrente;
                    break;
                }
            }
        } else if (opc == 2) {
            for (ContaPoupanca contaPoupanca : contasPoupancas) {
                if (contaPoupanca.getNumero() == numeroConta) {
                    conta = contaPoupanca;
                    break;
                }
            }
        } else if (opc == 3) {
            for (ContaCorrenteVip contaVip : contasCorrentesVips) {
                if (contaVip.getNumero() == numeroConta) {
                    conta = contaVip;
                    break;
                }
            }
        }

        // Se a conta não for encontrada, exibe uma mensagem de erro
        if (conta == null) {
            System.out.println("CONTA NÃO ENCONTRADA!");
            return;
        }

        // Exibe o histórico da conta
        System.out.println("HISTÓRICO DA CONTA " + conta.getNumero());
        conta.exibirHistorico();  // Exibe todas as transações no histórico

        // Exibe informações adicionais dependendo do tipo de conta
        if (conta instanceof ContaPoupanca) {
            System.out.println("Saldo atual: R$ " + conta.getSaldo());
            System.out.println("Total de rendimentos: R$ " + ((ContaPoupanca) conta).getQuantRendimentos());
        } else if (conta instanceof ContaCorrente) {
            System.out.println("Saldo atual: R$ " + conta.getSaldo());
            System.out.println("Taxa de manutenção paga: R$ " + ((ContaCorrente) conta).getValPagoEmTaxaManu());
        } else if (conta instanceof ContaCorrenteVip) {
            System.out.println("Saldo atual: R$ " + conta.getSaldo());
            System.out.println("Taxa de manutenção paga: R$ " + ((ContaCorrenteVip) conta).getValPagoEmTaxaManu());
            System.out.println("Limite disponível: R$ " + ((ContaCorrenteVip) conta).getLimite());
        }
    }

}
