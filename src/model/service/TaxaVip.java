package model.service;

public class TaxaVip implements ServicoTaxa { // classe taxa vip, que implementa a função do ServicoTaxa

    //notação @Override para dizer que essa função é uma sobre escrita.
    @Override
    // função implementada dizendo COMO vai ser usada.
    public double taxa(double valor) {
        return valor * 0.15;
    }
}
