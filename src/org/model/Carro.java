package org.model;

public class Carro {
    public String marca;
    protected String modelo;
    int ano;
    private double preco;

    public Carro() {
        this.marca = "";
        this.modelo = "";
        this.ano = 0;
        this.preco = 0.0;
    }

    public Carro(String marca, String modelo, int ano, double preco) {
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
