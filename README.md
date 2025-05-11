# Desafio Lógico em Java 🚀

Este repositório contém a resolução de cinco desafios lógicos propostos em Java, com foco em boas práticas, modularização, uso de arquivos JSON e leitura de dados do console. O projeto é interativo e executado via terminal.

---

## 📋 Questões resolvidas

### ✅ Questão 1 — Soma de números
Calcula a soma dos números de 1 até 13 utilizando estrutura de repetição.

### ✅ Questão 2 — Fibonacci
Verifica se um número informado pertence à sequência de Fibonacci.

### ✅ Questão 3 — Análise de Faturamento (JSON)
Lê um arquivo `dados.json` na pasta `resources`, que contém o faturamento diário de uma distribuidora. Calcula:
- O menor valor de faturamento diário.
- O maior valor de faturamento diário.
- Quantos dias o faturamento foi superior à média mensal (desconsiderando dias com faturamento 0).

### ✅ Questão 4 — Percentual de Faturamento por Estado
Exibe os percentuais de faturamento de cada estado com base em um dataset fictício definido no código.

### ✅ Questão 5 — Inversão de String
Inverte uma string digitada pelo usuário sem utilizar métodos prontos como `StringBuilder.reverse()`.

---

## ▶️ Como executar

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   cd nome-do-repositorio
   ```
2. Abra o projeto em sua IDE Java favorita (IntelliJ, Eclipse, VS Code...).

3. Marque a pasta resources como Resource Folder, se necessário.

4. Execute a classe Main.java para interagir com o menu de desafios.

## 🛠 Tecnologias

- Java 17+ (ou compatível)
- GSON (para leitura de arquivos JSON)
- Maven ou gerenciamento manual de bibliotecas
- IDE recomendada: IntelliJ IDEA ou VS Code

---

## 📦 Dependência (se estiver usando Maven)

Adicione ao seu `pom.xml`:

```xml
<dependency>
  <groupId>com.google.code.gson</groupId>
  <artifactId>gson</artifactId>
  <version>2.10.1</version>
</dependency>
```
