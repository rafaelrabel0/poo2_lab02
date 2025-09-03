package org.model;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public double preco;

    public Carro() {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public void exibirDetalhes(){
        System.out.println("Detalhes do Carro: ");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Preco: R$" + this.preco);
    }
}
