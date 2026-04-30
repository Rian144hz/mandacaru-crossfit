package model.entities;

import java.time.LocalDateTime;

public class CheckIn {  //classe CheckIn
     //todos os seus atributos
    private LocalDateTime entrada;
    private LocalDateTime saida;
    // objeto atleta do tipo Atleta instanciado
    Atleta atleta = new Atleta();
    // objeto recibo do tipo Recibo instanciado para poder usar seus getters e setters
    Recibo recibo;

    public CheckIn() { // construtor padrão
    }
   //construtor com argumentos
    public CheckIn(LocalDateTime entrada, LocalDateTime saida, Atleta atleta) {
        this.entrada = entrada;
        this.saida = saida;
        this.atleta = atleta;
    }


    //aqui onde ficam todos os getters e setters
    public LocalDateTime getEntrada() {
        return entrada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }


    public Recibo getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibo recibo) {
        this.recibo = recibo;
    }
}
