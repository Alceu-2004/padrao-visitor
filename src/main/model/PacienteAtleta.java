package model;

import visitor.Visitor;

public class PacienteAtleta
        extends Paciente {

    public PacienteAtleta(
            String nome,
            int idade,
            double peso
    ) {

        super(nome, idade, peso);
    }

    @Override
    public void aceitar(
            Visitor visitor
    ) {

        visitor.visitar(this);
    }
}