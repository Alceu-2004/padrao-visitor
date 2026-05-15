package visitor;

import model.PacienteAtleta;
import model.PacienteComum;
import model.PacienteIdoso;

public class RelatorioVisitor
        implements Visitor {

    @Override
    public void visitar(
            PacienteComum paciente
    ) {

        System.out.println(
                "Relatório paciente comum: " +
                        paciente.getNome()
        );
    }

    @Override
    public void visitar(
            PacienteAtleta paciente
    ) {

        System.out.println(
                "Relatório atleta: " +
                        paciente.getNome()
        );
    }

    @Override
    public void visitar(
            PacienteIdoso paciente
    ) {

        System.out.println(
                "Relatório idoso: " +
                        paciente.getNome()
        );
    }
}