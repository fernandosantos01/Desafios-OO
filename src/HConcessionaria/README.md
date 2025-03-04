# 🏢 Sistema de Gerenciamento de Concessionária

## 📄 Descrição

Este projeto implementa um sistema de gerenciamento de concessionária em Java, permitindo o cadastro, consulta e gerenciamento de veículos, clientes e vendas. O sistema aplica conceitos de Orientação a Objetos (OO) para modelar o funcionamento de uma concessionária de automóveis.

---

## 📝 Enunciado da Questão

Desenvolva um sistema para uma concessionária de veículos, onde seja possível gerenciar o estoque de automóveis, cadastrar clientes e registrar vendas. O sistema deve permitir:

1. **Gerenciamento de Veículos**: Cadastro, atualização e listagem de veículos disponíveis para venda.
2. **Gerenciamento de Clientes**: Cadastro e consulta de informações dos clientes.
3. **Registro de Vendas**: Realizar e armazenar vendas de veículos, associando clientes e veículos vendidos.
4. **Relatórios**: Geração de relatórios sobre veículos vendidos e estoque disponível.

O sistema deve seguir os princípios da programação orientada a objetos, utilizando classes para representar os veículos, clientes e vendas. A implementação deve ser modular e permitir futuras expansões.

---

## 🛠️ Funcionalidades

- **Gerenciamento de Veículos**: Cadastro, atualização e listagem de veículos disponíveis para venda.
- **Gerenciamento de Clientes**: Cadastro e consulta de informações dos clientes.
- **Registro de Vendas**: Realiza e armazena vendas de veículos, associando clientes e veículos vendidos.
- **Relatórios**: Gera relatórios sobre veículos vendidos e estoque disponível.

---

## 🐂 Estrutura do Projeto

O projeto está organizado da seguinte forma:

```
Desafios-OO/
├── src/
│   └── HConcessionaria/
│       ├── dominio/
│       │   ├── Veiculo.java
│       │   ├── Cliente.java
│       │   ├── Venda.java
│       │   └── ...
│       └── aplicacao/
│           └── Principal.java
└── README.md
```

- `dominio/`: Contém as classes principais que representam os elementos do sistema (Veiculo, Cliente, Venda).
- `aplicacao/`: Contém a classe `Principal.java`, que executa o sistema e demonstra suas funcionalidades.

---

## 🚀 Como Executar

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/fernandosantos01/Desafios-OO.git
   ```

2. **Navegue até o diretório do projeto**:

   ```bash
   cd Desafios-OO/src/HConcessionaria/aplicacao
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

Este sistema foi desenvolvido com fins educacionais, visando aprimorar conhecimentos em programação orientada a objetos e gestão de uma concessionária.

