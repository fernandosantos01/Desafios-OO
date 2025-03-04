# 📚 Sistema de Gerenciamento de Biblioteca

## 📄 Descrição

Este projeto implementa um sistema de gerenciamento de biblioteca em Java, permitindo o cadastro, consulta e gerenciamento de livros, usuários e empréstimos. O sistema aplica conceitos de Orientação a Objetos (OO) para modelar o funcionamento de uma biblioteca digital.

---

## 📝 Enunciado da Questão

Desenvolva um sistema para uma biblioteca, onde seja possível gerenciar o acervo de livros, cadastrar usuários e controlar empréstimos. O sistema deve permitir:

1. **Gerenciamento de Livros**: Cadastro, atualização e listagem de livros disponíveis no acervo.
2. **Gerenciamento de Usuários**: Cadastro e consulta de informações dos usuários da biblioteca.
3. **Registro de Empréstimos**: Controle de empréstimos e devoluções de livros.
4. **Relatórios**: Geração de relatórios sobre livros emprestados, usuários ativos e histórico de empréstimos.

O sistema deve seguir os princípios da programação orientada a objetos, utilizando classes para representar os livros, usuários e empréstimos. A implementação deve ser modular e permitir futuras expansões.

---

## 🛠️ Funcionalidades

- **Gerenciamento de Livros**: Cadastro, atualização e listagem de livros.
- **Gerenciamento de Usuários**: Cadastro e consulta de usuários.
- **Registro de Empréstimos**: Controle de empréstimos e devoluções.
- **Relatórios**: Gera relatórios sobre livros emprestados e histórico de transações.

---

## 📂 Estrutura do Projeto

O projeto está organizado da seguinte forma:

```
Desafios-OO/
├── src/
│   └── GGerenciamentoBiblioteca/
│       ├── dominio/
│       │   ├── Livro.java
│       │   ├── Usuario.java
│       │   ├── Emprestimo.java
│       │   └── ...
│       └── aplicacao/
│           └── Principal.java
└── README.md
```

- `dominio/`: Contém as classes principais que representam os elementos do sistema (Livro, Usuario, Emprestimo).
- `aplicacao/`: Contém a classe `Principal.java`, que executa o sistema e demonstra suas funcionalidades.

---

## 🚀 Como Executar

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/fernandosantos01/Desafios-OO.git
   ```

2. **Navegue até o diretório do projeto**:

   ```bash
   cd Desafios-OO/src/GGerenciamentoBiblioteca/aplicacao
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

Este sistema foi desenvolvido com fins educacionais, visando aprimorar conhecimentos em programação orientada a objetos e gestão de uma biblioteca digital.

