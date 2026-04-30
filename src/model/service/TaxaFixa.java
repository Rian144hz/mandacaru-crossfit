package model.service;

public class TaxaFixa implements  ServicoTaxa { // classe taxa fixa, que implementa a função do ServicoTaxa

    //notação @Override para dizer que essa função é uma sobre escrita.
    @Override
    // função implementada dizendo COMO vai ser usada.
    public double taxa(double valor) {
        return valor * 0.20;
    }
}
