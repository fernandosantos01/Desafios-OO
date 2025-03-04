# 🏢 Sistema de Gerenciamento de Empresa

## 📄 Descrição

Este projeto implementa um sistema de gerenciamento de uma empresa em Java, permitindo o cadastro e gerenciamento de funcionários, setores e cargos. O sistema segue os princípios da programação orientada a objetos (POO) para organizar e estruturar os dados de maneira eficiente.

---

## 📝 Enunciado da Questão

Desenvolva um sistema para gerenciar uma empresa, onde seja possível:

1. **Gerenciamento de Funcionários**: Cadastro, edição e exclusão de funcionários.
2. **Gerenciamento de Setores**: Cadastro e organização dos setores da empresa.
3. **Gestão de Cargos**: Definição de cargos e associação a funcionários.
4. **Relatórios**: Geração de relatórios com informações dos funcionários por setor e cargo.

O sistema deve ser modular, organizado em classes representando funcionários, setores e cargos. A implementação deve permitir expansões futuras.

---

## 🛠️ Funcionalidades

- **Cadastro e gerenciamento de funcionários**.
- **Definição de setores e cargos**.
- **Relatórios organizacionais da empresa**.
- **Estrutura modular e expansível**.

---

## 🏗️ Estrutura do Projeto

O projeto está estruturado da seguinte forma:

```
Desafios-OO/
├── src/
│   └── DEmpresa/
│       ├── dominio/
│       │   ├── Funcionario.java
│       │   ├── Setor.java
│       │   ├── Cargo.java
│       │   └── ...
│       └── aplicacao/
│           └── Principal.java
└── README.md
```

- `dominio/`: Contém as classes principais que representam os elementos do sistema (Funcionário, Setor, Cargo).
- `aplicacao/`: Contém a classe `Principal.java`, responsável pela execução do sistema.

---

## 🚀 Como Executar

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/fernandosantos01/Desafios-OO.git
   ```

2. **Navegue até o diretório do projeto**:

   ```bash
   cd Desafios-OO/src/DEmpresa/aplicacao
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

O projeto ainda não possui testes automatizados, mas recomenda-se o uso de JUnit para validar as funcionalidades principais.

---

## 🛡️ Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

---

## 👨‍💻 Autor

- **Fernando Santos** - [fernandosantos01](https://github.com/fernandosantos01)

---

## 📝 Notas

Este sistema foi desenvolvido com fins educacionais para aprimorar conhecimentos sobre POO e gestão empresarial.

