package br.com.mandacaru.model;


import br.com.mandacaru.interfaces.Pagavel;

public class MembroElite extends Membro implements Pagavel {

    public MembroElite() {
    }

    public MembroElite(String nome, int id) {
        super(nome, id);
    }

    @Override
    public void processarPagamento(double valor) {
        double valorComDesconto = valor * 0.8;
        System.out.println("Aplicando desconto membro elite para: "+"["+getNome()+"]");

        gerarRecibo(getNome(), valorComDesconto);
    }
}
