# 🏦 Sistema Bancário - Banco Alura

## 📄 Descrição

Este projeto implementa um sistema bancário simples em Java, permitindo a criação e gerenciamento de contas, realização de transações financeiras e consulta de extratos. O sistema segue os princípios da programação orientada a objetos (POO), garantindo modularidade e manutenção do código.

---

## 📝 Enunciado da Questão

Desenvolva um sistema bancário que permita:

1. **Gerenciamento de Contas**: Criar, listar e remover contas bancárias.
2. **Transações Financeiras**: Realizar depósitos, saques e transferências entre contas.
3. **Autenticação**: Garantir que apenas usuários autorizados possam realizar operações sensíveis.
4. **Extrato Bancário**: Registrar todas as transações realizadas em uma conta.
5. **Relatórios**: Exibir informações sobre contas e transações registradas.

O sistema deve seguir os princípios de encapsulamento e herança, garantindo a separação das responsabilidades entre as classes.

---

## 🛠️ Funcionalidades

- **Cadastro de Contas**: Criar novas contas bancárias com titular, saldo inicial e senha.
- **Operações Bancárias**: Realizar depósitos, saques e transferências entre contas.
- **Segurança**: Verificação de senha antes de realizar transações sensíveis.
- **Histórico de Transações**: Registro de todas as operações realizadas na conta.
- **Consulta de Extrato**: Exibição do histórico de transações para cada conta.

---

## 🐂 Estrutura do Projeto

O projeto está organizado da seguinte forma:

```
Desafios-OO/
├── src/
│   └── EBancoAlura/
│       ├── dominio/
│       │   ├── ContaBancaria.java
│       │   ├── ContaCorrente.java
│       │   ├── ContaPoupanca.java
│       │   ├── Banco.java
│       │   ├── Transacao.java
│       │   └── ...
│       └── aplicacao/
│           └── Principal.java
└── README.md
```

- `dominio/`: Contém as classes principais que representam os elementos do sistema bancário.
- `aplicacao/`: Contém a classe `Principal.java`, que executa o sistema e demonstra suas funcionalidades.

---

## 🚀 Como Executar

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/fernandosantos01/Desafios-OO.git
   ```

2. **Navegue até o diretório do projeto**:

   ```bash
   cd Desafios-OO/src/EBancoAlura/aplicacao
   ```

3. **Compile os arquivos Java**:

   ```bash
   javac Principal.java
   ```

4. **Execute o programa**:

   ```bash
   java Principal
   ```

---

## 🧪 Testes

O projeto ainda não conta com testes automatizados. Recomenda-se a implementação de testes unitários utilizando JUnit para garantir a estabilidade do sistema.

---

## 🛡️ Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

---

## 👨‍💻 Autor

- **Fernando Santos** - [fernandosantos01](https://github.com/fernandosantos01)

---

## 📝 Notas

Este sistema foi desenvolvido com fins educacionais, visando aprimorar conhecimentos em programação orientada a objetos e gestão bancária.

