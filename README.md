# Mandacaru Crossfit 🌵

Sistema de gestão de cobrança para atletas de crossfit desenvolvido para praticar conceitos avançados de **Programação Orientada a Objetos** em Java.

## 🚀 O que este projeto demonstra?
Este repositório foi criado para consolidar o entendimento sobre o desacoplamento de código. Os principais conceitos aplicados foram:

*   **Interfaces**: Uso do contrato `ServicoTaxa` para definir o comportamento de cobrança sem amarrar a uma implementação fixa.
*   **Polimorfismo & Injeção de Dependência**: O sistema escolhe dinamicamente entre `TaxaFixa` (20%) ou `TaxaVip` (15%) com base no perfil do atleta.
*   **Composição de Objetos**: Associação entre as entidades `Atleta`, `CheckIn` e `Recibo`.

## 🛠️ Tecnologias e Ferramentas
*   **Linguagem**: Java
*   **Ambiente**: Linux (Ubuntu)
*   **Versionamento**: Git & GitHub

## 📋 Como funciona a lógica?
1.  O sistema recebe os dados do atleta e o período de treino.
2.  A duração é calculada e as horas são arredondadas para cima utilizando `Math.ceil`.
3.  Dependendo da escolha do usuário (S/N para VIP), o `ServicoCobranca` recebe a implementação correta da taxa via construtor.
4.  O recibo é gerado com o pagamento básico, o valor da taxa e o total.

---
**Autor:** Matheus Rian
*Estudante de Ciência da Computação - IFBA Campus Paulo Afonso.*
