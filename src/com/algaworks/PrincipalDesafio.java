package com.algaworks;

import com.algaworks.desafio.Carro;
import com.algaworks.desafio.GerenciadorEstoque;
import com.algaworks.desafio.Roupa;

public class PrincipalDesafio {
    static void main(String[] args) {
        GerenciadorEstoque<Roupa> estoqueRoupas = new GerenciadorEstoque();
        estoqueRoupas.adicionar(new Carro("BMW X1", 4));
        estoqueRoupas.adicionar(new Roupa("Camiseta básica branca", 2));
        estoqueRoupas.adicionar(new Roupa("Camiseta básica preta", 2));

        imprimirEstoque(estoqueRoupas);

        GerenciadorEstoque<Carro> estoqueCarro = new GerenciadorEstoque();
        estoqueCarro.adicionar(new Carro("BMW X1", 4));
        estoqueCarro.adicionar(new Carro("Honda HR-V", 8));
        imprimirEstoque(estoqueCarro);

    }

    public static void imprimirEstoque(GerenciadorEstoque gerenciadorEstoque) {
        System.out.println("Estoque: " + gerenciadorEstoque.getQuantidadeTotal());
    }
}
