package model;

import visitor.Visitor;

public class PacienteComum
        extends Paciente {

    public PacienteComum(
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