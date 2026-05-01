# Mandacaru Crossfit - Backend Management

Sistema de gestão de faturamento e membros desenvolvido em Java 21. O projeto simula o fluxo de cobrança de uma box de Crossfit, aplicando regras de negócio através de Programação Orientada a Objetos (POO) e Programação Funcional.

## Objetivo do Projeto
Este sistema consolidou o entendimento sobre acoplamento fraco (loose coupling) e o uso de interfaces funcionais para resolver desafios de cálculo de taxas dinâmicas e processamento de pagamentos.

## Stack Técnica
* Linguagem: Java 21 (LTS)
* Paradigma: Orientação a Objetos e Funcional (Lambdas e Collections)
* Ambiente de Desenvolvimento: Ubuntu Linux via IntelliJ IDEA
* Versionamento: Git (Workflow de Rebase e Resolução de Conflitos)

## Conceitos de Engenharia de Software Aplicados
* Interfaces e Contratos: Uso de Pagavel e Ordenacao para definir regras de negócio estritas.
* Lambdas & Collections: Implementação de ordenação personalizada para organizar o ranking de atletas.
* Polimorfismo: Utilização de herança com MembroElite para sobrescrever comportamentos de cálculo de taxa.

## Estrutura de Pacotes
A organização segue os padrões de mercado para aplicações Java:

br.com.mandacaru
├── interfaces   # Contratos de serviço (Pagavel, Ordenacao)
├── model        # Entidades de negócio (Membro, MembroElite)
└── main         # Entry point e orquestração do sistema

## Como Executar
1. Certifique-se de ter o JDK 21 instalado no seu ambiente Linux.
2. Clone o repositório:
   git clone https://github.com/Rian144hz/mandacaru-crossfit.git
3. Compile e execute a classe principal:
   javac br/com/mandacaru/main/MandacaruCross.java
   java br.com.mandacaru.main.MandacaruCross

## Autor
Matheus Rian
Estudante de Ciência da Computação - IFBA Campus Paulo Afonso.
Foco em Backend (Spring Boot), Docker e Cloud (AWS).
