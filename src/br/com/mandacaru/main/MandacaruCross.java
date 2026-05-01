package br.com.mandacaru.main;

import br.com.mandacaru.model.MembroElite;

import java.util.ArrayList;

public class MandacaruCross {
    public static void main(String[] args) {
        ArrayList<MembroElite> membroElite = new ArrayList<>();
        membroElite.add(new MembroElite("Ana",001));
        membroElite.add(new MembroElite("Beatriz",002));

      membroElite.sort((o1, o2) -> o1.compareTo(o2));


        System.out.println("----- RANKING DOS ATLETAS ELITE (ORDENADOS) -----");
        for (MembroElite m: membroElite){
            System.out.println(m);
            m.processarPagamento(200.00);
        }
    }


}
