package com.algaworks.desafio;

public class GerenciadorEstoque <T extends Estocavel> {

    private int quantidadeTotal;

    public void adicionar(Estocavel estocavel) {
        quantidadeTotal += estocavel.getQuantidadeEstoque();
    }

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public int getQuantidadeEstoque() {
        return 0;
    }
}
