# 🏦 Sistema Bancário em Java

Este é um projeto simples de sistema bancário, desenvolvido em **Java 24**. Ele permite criar contas (corrente e poupança), gerenciar usuários, realizar transações (saque e depósito), gerar extratos e listar contas. O foco é prático e voltado para aprendizado de conceitos básicos de orientação a objetos e regras bancárias elementares.

---

## ⚡ Funcionalidades

- Cadastro de **Usuários** do banco
- Criação de **contas correntes** e **contas poupança**
- **Depósito** e **saque** em contas bancárias, respeitando saldo e limite
- Impressão de **extrato** das transações da conta (saques, depósitos)
- Listagem e busca de contas cadastradas
- Pagamento de anuidades e rendimento de juros (poupança)
- Definição de limite de saque

---

## 🗂️ Estrutura do Projeto

- `Usuario` — representa o cliente do banco.
- `Conta` — classe abstrata para contas bancárias, implementando operações comuns.
- `ContaCorrente` e `ContaPoupanca` — implementações concretas de conta, com regras de negócio específicas.
- `Banco` — gerencia as contas do banco e oferece métodos para criação, listagem e busca de contas.
- `Transacao` — registra movimentações financeiras (depósitos, saques).
- `Extrato` — gera e imprime o extrato da conta com as transações.
- `tests/SistemaBancariotest01` — ponto de execução com exemplos de uso.

---

## 🚀 Como Executar

1. Clone este repositório:
    ```sh
    git clone https://github.com/seu-usuario/seu-repositorio.git
    ```
2. Abra o projeto no IntelliJ IDEA (ou outra IDE que suporte Java 24)
3. Compile o projeto
4. Execute a classe `SistemaBancariotest01` para ver exemplos de uso e testar as principais funcionalidades.

---

## 🛠️ Principais Métodos e Comandos

### Usuário e Conta

- `Usuario(nome, cpf)` — Cria um novo usuário.
- `Banco.criarConta(usuario, tipo)` — Cria uma conta ("cc" para corrente, "cp" para poupança) para um usuário.
- `Conta.depositar(valor)` — Depósito em conta.
- `Conta.sacar(valor)` — Saque, respeitando saldo/limite do tipo de conta.
- `Conta.definirLimite(valor)` — Define novo limite de saque.
- `Conta.pagarAnualidade()` — Paga a anuidade do tipo de conta.
- `Conta.renderJuros()` — Aplica rendimento de juros (só poupança).
- `Banco.listarContas()` — Lista todas as contas do banco.
- `Banco.procurarPorNumConta(numero)` — Busca conta pelo número.

### Extrato e Transações

- `Conta.imprimirExtrato()` — Imprime o extrato de todas as transações de uma conta.

---

## 💻 Exemplo Simplificado de Uso

---

- java Banco meuBanco = new Banco();
- Usuario usuario = new Usuario("Maria", "000.000.000-00"); 
- Conta minhaConta = meuBanco.criarConta(usuario, "cp");
- minhaConta.depositar(500); minhaConta.sacar(100);
- minhaConta.imprimirExtrato();

---

## 💡 Observações críticas e limitações

- **Persiste apenas em memória** — Ao encerrar o programa perde-se todas as contas e transações.
- **Sem interface gráfica** ou menus — Interação somente via código, precisa adaptar para uso “real”.
- **Baixa cobertura de testes automatizados** — Há um teste no formato de main apenas com execuções básicas.
- **Validações e exceções básicas** — Sem tratamento robusto de exceções e pouco feedback para erros de negócio.
- **Registros e relatórios são impressos diretamente na saída padrão** (console).

---

## 🌱 Possíveis implementações futuras

- Persistência com banco de dados ou arquivos locais (não implementado)
- Cadastro de múltiplos tipos de usuário e autenticação
- Relatórios avançados, filtros para extrato e transações
- API para integração externa

---

Este projeto é **apenas** para estudos e serve como base inicial para sistemas bancários mais completos.
O desenvolvi com o intuito de aprender sendo bem grosseiro no código.
Contribuições são bem-vindas para aprimorar a estrutura e funcionalidades! 🚀