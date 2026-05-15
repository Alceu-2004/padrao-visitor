package app;

import model.Paciente;
import model.PacienteAtleta;
import model.PacienteComum;
import model.PacienteIdoso;
import visitor.AvaliacaoRiscoVisitor;
import visitor.RelatorioVisitor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Paciente> pacientes =
                new ArrayList<>();

        pacientes.add(
                new PacienteComum(
                        "Carlos",
                        28,
                        75
                )
        );

        pacientes.add(
                new PacienteAtleta(
                        "Fernanda",
                        24,
                        62
                )
        );

        pacientes.add(
                new PacienteIdoso(
                        "João",
                        72,
                        80
                )
        );

        RelatorioVisitor relatorio =
                new RelatorioVisitor();

        AvaliacaoRiscoVisitor avaliacao =
                new AvaliacaoRiscoVisitor();

        for (Paciente paciente : pacientes) {

            paciente.aceitar(relatorio);

            paciente.aceitar(avaliacao);
        }
    }
}