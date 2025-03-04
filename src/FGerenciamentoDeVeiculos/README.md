# 🚗 Sistema de Gerenciamento de Veículos

## 📄 Descrição

Este projeto implementa um sistema para gerenciamento de veículos, permitindo cadastro, consulta e controle de informações sobre diferentes tipos de automóveis. O sistema utiliza os princípios da programação orientada a objetos para estruturar as classes e funcionalidades.

---

## 📝 Enunciado da Questão

Desenvolva um sistema para gerenciar veículos, possibilitando:

1. **Cadastro de Veículos**: Armazenar informações como modelo, marca, ano, preço e status (disponível ou vendido).
2. **Consulta de Veículos**: Listar todos os veículos cadastrados e permitir a busca por critérios específicos.
3. **Atualização de Informações**: Modificar detalhes dos veículos cadastrados.
4. **Remoção de Veículos**: Excluir veículos do sistema.
5. **Relatórios**: Gerar relatórios de veículos cadastrados e vendidos.

A solução deve ser modular e flexível para futuras expansões.

---

## 🛠️ Funcionalidades

- **Cadastro de Veículos**: Registra informações essenciais sobre cada veículo.
- **Consulta e Listagem**: Permite visualizar os veículos cadastrados.
- **Atualização e Remoção**: Modifica ou exclui veículos da base de dados.
- **Geração de Relatórios**: Exibe dados estatísticos sobre os veículos no sistema.

---

## 🏗️ Estrutura do Projeto

O projeto está organizado da seguinte forma:

```
Desafios-OO/
├── src/
│   └── FGerenciamentoDeVeiculos/
│       ├── dominio/
│       │   ├── Veiculo.java
│       │   ├── Carro.java
│       │   ├── Moto.java
│       │   ├── Caminhao.java
│       │   └── ...
│       └── aplicacao/
│           └── Principal.java
└── README.md
```

- `dominio/`: Contém as classes principais que representam os veículos e suas características.
- `aplicacao/`: Contém a classe `Principal.java`, que executa o sistema e suas funcionalidades.

---

## 🚀 Como Executar

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/fernandosantos01/Desafios-OO.git
   ```

2. **Navegue até o diretório do projeto**:

   ```bash
   cd Desafios-OO/src/FGerenciamentoDeVeiculos/aplicacao
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

Este sistema foi desenvolvido com fins educacionais, visando aprimorar conhecimentos em programação orientada a objetos e gerenciamento de veículos.

