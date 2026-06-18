💳 Sistema Bancário em Java

Projeto desenvolvido em Java com o objetivo de praticar Programação Orientada a Objetos (POO), organização de código, tratamento de exceções e arquitetura MVC em aplicações de console.

🚀 Funcionalidades

O sistema permite:

Cadastro de contas bancárias
Geração automática de ID para cada conta
Busca de contas por ID
Listagem de contas cadastradas
Remoção de contas
Depósito de valores
Saque de valores
Transferência entre contas
Rendimento de juros em conta poupança (5%)

🧠 Conceitos aplicados

Durante o desenvolvimento deste projeto foram praticados os seguintes conceitos:

Programação Orientada a Objetos (POO)
Encapsulamento
Herança
Polimorfismo
Exceções personalizadas
Collections (ArrayList)
Streams API
Arquitetura MVC
Organização e separação de responsabilidades
Regras de negócio

🏗️ Estrutura do Projeto

Model

Responsável pelas entidades e regras de negócio.

Conta
ContaPoupanca
Banco

Controller

Responsável por intermediar as ações da View e do Model.

Contas

View

Responsável pela interação com o usuário via console.

Menu
ContaBancariaConsole

Exceptions

Exceções personalizadas para validação das operações.

SaldoInsuficienteException
ValorInvalidoException

🔧 Tecnologias Utilizadas
Java
Java Collections Framework
Stream API

💡 Objetivo do Projeto

Este projeto foi desenvolvido inicialmente como um exercício de Programação Orientada a Objetos e posteriormente refatorado para aplicar novos conceitos aprendidos durante os estudos, como arquitetura MVC, tratamento de exceções e melhor organização do código.

O objetivo principal foi consolidar fundamentos importantes do desenvolvimento backend utilizando Java.

📚 Aprendizados

Durante o desenvolvimento deste projeto foram praticados:

Modelagem de classes

Organização em camadas
Tratamento de erros com exceções
Manipulação de coleções
Refatoração de código
Aplicação de regras de negócio

🚀 Próximos Passos

Implementar testes unitários com JUnit 5
Melhorar as validações do sistema
Persistência de dados em arquivos ou banco de dados
Criar uma interface gráfica utilizando Java Swing
Evoluir para uma versão utilizando Spring Boot

