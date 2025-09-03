package org.principal;

import org.model.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Mitsubish";
        carro1.modelo = "Eclipse";
        carro1.ano = 2003;
        carro1.preco = 32000;
        carro1.exibirDetalhes();
    }
}
