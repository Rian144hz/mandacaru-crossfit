package model.entities;

public class Recibo { //classe recibo
    // seus atributoss
    private Double pagamentoBasico;
    private Double taxaManutencao;

    //construtor padrão
    public Recibo() {
    }

    //construtor com argumentos
    public Recibo(Double pagamentoBasico, Double taxaManutencao) {
        this.pagamentoBasico = pagamentoBasico;
        this.taxaManutencao = taxaManutencao;
    }
    //aqui onde ficam todos os getters e setters
    public Double getPagamentoBasico() {
        return pagamentoBasico;
    }



    public Double getTaxaManutencao() {
        return taxaManutencao;
    }




    public Double getTotal() {
        return getPagamentoBasico() + getTaxaManutencao();
    }
}