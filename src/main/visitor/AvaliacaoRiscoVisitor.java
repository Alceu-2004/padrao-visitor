package visitor;

import model.PacienteAtleta;
import model.PacienteComum;
import model.PacienteIdoso;

public class AvaliacaoRiscoVisitor
        implements Visitor {

    @Override
    public void visitar(
            PacienteComum paciente
    ) {

        System.out.println(
                "Risco moderado para paciente comum"
        );
    }

    @Override
    public void visitar(
            PacienteAtleta paciente
    ) {

        System.out.println(
                "Baixo risco para atleta"
        );
    }

    @Override
    public void visitar(
            PacienteIdoso paciente
    ) {

        System.out.println(
                "Alto risco para idoso"
        );
    }
}