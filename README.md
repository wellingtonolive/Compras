# 💳 Projeto: Controle de Compras com Cartão de Crédito (Java)

## 📌 Descrição

Este projeto é uma aplicação simples em Java que simula o uso de um cartão de crédito. O usuário define um limite inicial e pode realizar compras até que o saldo disponível seja esgotado.

A aplicação roda via terminal (console) e permite:

* Definir o limite do cartão
* Registrar compras com descrição e valor
* Validar se há saldo disponível
* Listar todas as compras realizadas
* Exibir o saldo restante

---

## 🚀 Funcionalidades

* ✅ Definição de limite do cartão
* ✅ Registro de compras
* ✅ Validação de saldo antes da compra
* ✅ Encerramento automático ao atingir limite
* ✅ Listagem das compras realizadas
* ✅ Exibição do saldo final

---

## 🧱 Estrutura do Projeto

O projeto utiliza as seguintes classes:

```
br.com.compras
│
├── Main.java
└── models
    ├── CartaoCredito.java
    └── Compra.java
```

### 📄 Main.java

Classe principal responsável pela interação com o usuário via console.

### 📄 CartaoCredito.java

Responsável por:

* Armazenar limite e saldo
* Gerenciar lista de compras
* Validar e lançar compras

### 📄 Compra.java

Representa uma compra com:

* Descrição
* Valor

---

## 🛠️ Tecnologias Utilizadas

* Java 17
* Programação Orientada a Objetos (POO)
* Scanner (entrada de dados via console)

---

## ▶️ Como Executar

### 1. Clone o projeto

```bash
git clone <url-do-repositorio>
```

### 2. Compile os arquivos

```bash
javac br/com/compras/Main.java
```

### 3. Execute o programa

```bash
java br.com.compras.Main
```

---

## 💻 Exemplo de Uso

```
Digite o limite do cartão:
1000

Digite a descrição da compra:
Mercado

Digite o valor da compra:
200

Compra realizada!
Digite 0 para sair ou 1 para continuar
1

Digite a descrição da compra:
Gasolina

Digite o valor da compra:
900

Saldo insuficiente!
```

Saída final:

```
***********************
COMPRAS REALIZADAS:

Mercado - 200.0

***********************

Saldo do cartão: 800.0
```

---

## 📌 Regras de Negócio

* Não é permitido realizar compras acima do saldo disponível
* O sistema encerra automaticamente ao atingir limite insuficiente
* Apenas compras aprovadas são armazenadas

---

## 📈 Possíveis Melhorias

* Ordenar compras por valor
* Exibir total gasto
* Persistência em banco de dados
* Interface gráfica (GUI)
* API REST com Spring Boot
* Validação de entradas (evitar valores negativos, etc.)

---

## 🤝 Contribuição

Sinta-se à vontade para contribuir com melhorias:

1. Fork do projeto
2. Crie uma branch (`feature/minha-feature`)
3. Commit suas alterações
4. Push para a branch
5. Abra um Pull Request

---

## 📄 Licença

Este projeto é livre para uso educacional e aprendizado.

---

## 👨‍💻 Autor

Desenvolvido para fins de estudo e prática em Java.
