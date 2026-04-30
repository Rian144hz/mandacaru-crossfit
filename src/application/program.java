package application;

import model.entities.Atleta;
import model.entities.CheckIn;
import model.service.ServicoCobranca;
import model.service.ServicoTaxa;
import model.service.TaxaFixa;
import model.service.TaxaVip;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner padrão
        //DateTimeFormatter para formatar a data em (dd/MM/yyyy HH:mm)
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        //inico do programa
        System.out.println("----Mandacaru Crossfit----");
        System.out.print("Nome do Atleta: "); // peço o nome do atleta
        String nome = sc.nextLine(); // leio esse nome aqui.

        System.out.print("Entrada(dd/MM/yyyy HH:mm): "); // peço a entrada aqui
        LocalDateTime entrada = LocalDateTime.parse(sc.nextLine(),fmt); // aqui leio a entrada aqui

        System.out.print("Saída(dd/MM/yyyy HH:mm): "); // peço a entrada aqui
        LocalDateTime saida = LocalDateTime.parse(sc.nextLine(),fmt); // aqui leio a entrada aqui

        // aqui instancio um objeto checkIn do tipo CheckIn passando como parâmetro (entrada,saida,new Atleta(nome)
        CheckIn checkIn = new CheckIn(entrada,saida,new Atleta(nome));
        // peço o valor da hora
        System.out.print("Valor por hora: "); // peço o valor da hora
        double valorHora = sc.nextDouble();  // leio o valor da hora

        System.out.print("O atleta é VIP (s/n): "); // aqui pergunto se o atleta é VIP s/n
        char letra = sc.next().charAt(0); // leio aqui a informação

        ServicoTaxa taxaEscolhida; // crio uma variável do tipo ServicoTaxa que é a interface

        //condição para ver se o atleta é vip
        if (letra == 's'){// caso seja, taxaEscolhida recebe new TaxaVip() sendo cobrado so 15%
            taxaEscolhida = new TaxaVip();
        }
        else{// caso NÃO seja, taxaEscolhida recebe new TaxaFixa() sendo cobrado so 20%
            taxaEscolhida = new TaxaFixa();
        }
        /*aqui instancio o objeto servicoCobranca que é responsável pela cobrança
        passando os parâmetros (valorHora,taxaEscolhida)*/
        ServicoCobranca servicoCobranca = new ServicoCobranca(valorHora,taxaEscolhida);

        /*aqui chamo o objeto servicoCobranca passando a função processarRecibo
         para ele fazer o cálculo de acordo com o checkIn passar*/
        servicoCobranca.processarRecibo(checkIn);

        //aqui onde printo tudo de acordo com a suas respectivas funções
        System.out.println("----RECIBO----");
        System.out.println("Pagamento Básico: "+String.format("%.2f",checkIn.getRecibo().getPagamentoBasico()));
        System.out.println("Taxa: "+String.format("%.2f",checkIn.getRecibo().getTaxaManutencao()));
        System.out.println("Total: "+String.format("%.2f",checkIn.getRecibo().getTotal()));

    }
}
