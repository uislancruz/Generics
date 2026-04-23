package com.algaworks.crm;

public class PrincipalSorteio {
    static void main(String[] args) {

        String[] nomes = {"João", "José", "Maria"};
        String nomeSorteado = Sorteador.<String>sortear(nomes);
        System.out.println(nomeSorteado);

        Cliente[] clientes = {
                new Cliente("Supermercado Pegue e leve",  5000_000),
                new Cliente("Posto de gasolina", 800_000),
                new Cliente("Javac Consultoria", 58_000_000)

        };

        Cliente clienteSorteado = Sorteador.<Cliente>sortear(clientes);
        System.out.println(clienteSorteado.getRazaoSocial());
    }
}
