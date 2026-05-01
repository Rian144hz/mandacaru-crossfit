package br.com.mandacaru.model;

import br.com.mandacaru.interfaces.Ordenacao;

public class Membro implements Ordenacao {
    private String nome;
    private int id;

    public Membro() {
    }

    public Membro(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Membro outro) {
        return this.nome.compareTo(outro.nome);
    }
    @Override
    public String toString() {
        return "Membro: " + nome + "\n" + "Id: " + id;
    }
}
