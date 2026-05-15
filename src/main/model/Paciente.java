package model;

import visitor.Visitor;

public abstract class Paciente {

    protected String nome;
    protected int idade;
    protected double peso;

    public Paciente(
            String nome,
            int idade,
            double peso
    ) {

        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public abstract void aceitar(
            Visitor visitor
    );
}