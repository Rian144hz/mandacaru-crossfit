package br.com.mandacaru.interfaces;



public interface Pagavel {
    default void gerarRecibo(String nome, double valor){
        System.out.println("--------------------------------");
        System.out.println("RECIBO MANDACARU CROSSFIT");
        System.out.println("Membro: " + nome);
        System.out.println("Valor processado: R$ " + valor);
        System.out.println("--------------------------------");
    }
     void processarPagamento(double valor);
}
