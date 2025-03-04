# ⚡ Sistema Bancário em Java

## ✨ Descrição
Este projeto consiste em um sistema bancário desenvolvido em **Java**, que permite gerenciar contas bancárias, realizar operações financeiras e gerar relatórios. O sistema segue os princípios da **orientação a objetos (POO)** e é modular.

---

## 🛠️ Funcionalidades do Sistema

### ✅ **Classes de Contas Bancárias**

#### **ContaBancaria (Classe Base)**
- `numeroConta (String)`: Número da conta.
- `titular (String)`: Nome do titular da conta.
- `saldo (double)`: Saldo da conta.
- `senha (String)`: Senha da conta (para autenticação).
- `extrato (List<String>)`: Lista para armazenar o histórico de transações.

#### **Métodos da ContaBancaria**
- `depositar(double valor)`: Adiciona o valor ao saldo e registra a transação no extrato.
- `sacar(double valor, String senha)`: Subtrai o valor do saldo, se houver saldo suficiente e a senha estiver correta. Registra no extrato.
- `transferir(ContaBancaria destino, double valor, String senha)`: Transfere dinheiro para outra conta, se houver saldo suficiente e senha correta.
- `exibirSaldo()`: Exibe o saldo atual.
- `exibirExtrato()`: Mostra o histórico de transações.
- `autenticar(String senha)`: Verifica se a senha está correta.

### 📆 **Tipos de Conta**

#### **ContaCorrente**
- `limiteChequeEspecial (double)`: Limite do cheque especial (exemplo: R$ 1000,00).
- `sacar(double valor, String senha)`: Permite saques até o limite do cheque especial.
- `aplicarTaxaMensal()`: Cobra taxa de manutenção mensal e registra no extrato.

#### **ContaPoupanca**
- `taxaRendimento (double)`: Taxa de rendimento mensal (exemplo: 0,5% ao mês).
- `aplicarRendimentoMensal()`: Aplica o rendimento mensal ao saldo e registra no extrato.

### 🏦 **Classe Banco**

#### **Atributos**
- `nome (String)`: Nome do banco.
- `contas (List<ContaBancaria>)`: Lista de contas bancárias.

#### **Métodos**
- `adicionarConta(ContaBancaria conta)`: Adiciona uma nova conta ao banco.
- `removerConta(String numeroConta)`: Remove uma conta pelo número.
- `buscarConta(String numeroConta)`: Retorna a conta correspondente ao número.
- `listarContas()`: Exibe todas as contas do banco.
- `calcularSaldoTotal()`: Calcula e exibe o saldo total das contas.
- `listarContasNegativas()`: Exibe contas correntes com saldo negativo (incluindo cheque especial).

---

## 🔒 Funcionalidades Adicionais

### 🔐 **Autenticação**
- Todas as operações sensíveis (saque, transferência) verificam a senha.

### 💳 **Extrato**
- Todas as transações (depósitos, saques, transferências, taxas, rendimentos) são registradas no extrato.

### 📊 **Relatórios**
- O banco gera relatórios como saldo total, contas ativas e contas negativas.

---

## 💡 Requisitos Técnicos
- Utiliza **encapsulamento** (atributos privados e métodos públicos).
- Usa **herança** para ContaCorrente e ContaPoupanca.
- Aplica **polimorfismo** para tratar contas diferentes de forma genérica.
- Emprega **coleções (List)** para armazenar contas e transações.
- Faz **tratamento de exceções** para erros como saldo insuficiente e senha incorreta.

---

## 📝 Exemplo de Uso

1. Criar um banco e adicionar contas correntes e poupanças.
2. Realizar operações de depósito, saque e transferência.
3. Aplicar taxas mensais e rendimentos.
4. Exibir extratos e relatórios do banco.
5. Testar autenticação e remoção de contas.

---

## 🎯 Desafios Opcionais
- Implementar um **sistema de empréstimos** para contas correntes.
- Criar uma **classe ContaInvestimento** para aplicações financeiras.
- Adicionar **persistência de dados** (salvar e carregar contas em JSON ou CSV).

---

## ✅ Entrega
- Criar um **repositório no GitHub** com o código completo.
- Incluir um **README.md** explicando funcionalidades e execução.
- Adicionar **exemplos de uso e testes** para validação do sistema.

💪 **Boa sorte e bom desenvolvimento!** 🚀

