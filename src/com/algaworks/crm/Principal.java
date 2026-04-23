package com.algaworks.crm;

import java.util.ArrayList;

public class Principal {
    static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("Supermercado Pegue e leve", 5000_000));
        clientes.add(new Cliente("Posto de gasolina", 800_000));

        double totalFaturamento = 0d;

        for (Cliente cliente : clientes) {
            totalFaturamento += cliente.getFaturamentoMensal();
        }

        System.out.println(totalFaturamento);
    }
}
