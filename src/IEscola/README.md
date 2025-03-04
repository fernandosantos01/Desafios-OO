# 🏫 Sistema de Gestão Escolar

## 📄 Descrição

Este projeto implementa um sistema de gestão escolar em Java, permitindo o gerenciamento de alunos, professores e disciplinas. O objetivo é aplicar conceitos de Orientação a Objetos (OO) para modelar uma estrutura acadêmica funcional.

---

## 🛠️ Funcionalidades

- **Gerenciamento de Alunos**: Cadastro, atualização e consulta de informações dos alunos.
- **Gerenciamento de Professores**: Cadastro, atualização e consulta de informações dos professores.
- **Gerenciamento de Disciplinas**: Criação e atribuição de disciplinas a alunos e professores.
- **Relatórios**: Geração de relatórios sobre o desempenho dos alunos e alocação de disciplinas.

---

## 🐂 Estrutura do Projeto

O projeto está organizado da seguinte forma:

```
Desafios-OO/
├── src/
│   └── IEscola/
│       ├── dominio/
│       │   ├── Aluno.java
│       │   ├── Professor.java
│       │   ├── Disciplina.java
│       │   └── ...
│       └── aplicacao/
│           └── Principal.java
└── README.md
```

- `dominio/`: Contém as classes principais que representam os elementos do sistema (Aluno, Professor, Disciplina).
- `aplicacao/`: Contém a classe `Principal.java`, que executa o sistema e demonstra suas funcionalidades.

---

## 🚀 Como Executar

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/fernandosantos01/Desafios-OO.git
   ```

2. **Navegue até o diretório do projeto**:

   ```bash
   cd Desafios-OO/src/IEscola/aplicacao
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

Atualmente, o projeto não possui um conjunto de testes automatizados. Recomenda-se a implementação de testes unitários utilizando frameworks como JUnit para garantir a integridade do sistema.

---

## 🛡️ Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

---

## 👨‍💻 Autor

- **Fernando Santos** - [fernandosantos01](https://github.com/fernandosantos01)

---

## 📝 Notas

Este projeto foi desenvolvido com fins educacionais, visando aprimorar habilidades em programação orientada a objetos e gestão de sistemas acadêmicos.

