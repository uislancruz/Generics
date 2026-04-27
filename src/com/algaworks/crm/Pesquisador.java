package com.algaworks.crm;

public class Pesquisador {

    public static <T extends Nomeavel> T obterPorNome(T[] funcionarios, String nome) {
        for (T funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                return funcionario;
            }
        }

        throw new RuntimeException("Funcionário não encontrado por nome");

    }

}
