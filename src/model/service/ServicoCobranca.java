package model.service;

import model.entities.CheckIn;
import model.entities.Recibo;

import java.time.Duration;

public class ServicoCobranca {
    private Double valorPorHora; // atributo da classe ServicoCobranca
    private ServicoTaxa servicoTaxa;  // interface servicoTaxa para injeção de dependência via construtor

    //construtor passando a interface ServicoTaxa servicoTaxa como parametric
    public ServicoCobranca(Double valorPorHora, ServicoTaxa servicoTaxa) {
        this.valorPorHora = valorPorHora;
        this.servicoTaxa = servicoTaxa;

    }
    // único método publico que o serviço cobrança faz
    public void processarRecibo(CheckIn checkIn){
        //lógica do tempo de duração
        long minutos = Duration.between(checkIn.getEntrada(), checkIn.getSaida()).toMinutes();
        double horas = (double) minutos /60.0;
        // 2. Lógica de pagamento (arredondando) pois, o Math.ceil(horas) faz isso
        double pagamentoBasico = valorPorHora * Math.ceil(horas);

        /*aqui eu faço a injeção de dependência,
        pois o ServicoCobranca não sabe qual taxa ele esta cobrando, eu apenas passo a função da intercafe 'taxa'
        que o java automaticamente olha e calcula com base no que ela entender que é para ser feito
         */
        double taxa = servicoTaxa.taxa(pagamentoBasico);
        // aqui eu instancio um novo objeto do tipo recibo para receber o pagamento e a taxa feitos pelo processar recibo.
        checkIn.setRecibo(new Recibo(pagamentoBasico, taxa));
    }
}
