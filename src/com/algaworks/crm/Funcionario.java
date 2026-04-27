package com.algaworks.crm;

public class Funcionario implements Nomeavel {

    private String nome;
    private int idade;

    public Funcionario(String nome, int idade) {
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "idade='" + idade + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
