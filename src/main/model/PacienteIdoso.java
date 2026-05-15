package model;

import visitor.Visitor;

public class PacienteIdoso
        extends Paciente {

    public PacienteIdoso(
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