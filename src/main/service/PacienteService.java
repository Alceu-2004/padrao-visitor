package service;

import model.Paciente;
import model.PacienteAtleta;
import model.PacienteComum;
import model.PacienteIdoso;

import java.util.ArrayList;
import java.util.List;

public class PacienteService {

    private List<Paciente> pacientes;

    public PacienteService() {

        pacientes = new ArrayList<>();
    }

    public void adicionarPaciente(
            Paciente paciente
    ) {

        pacientes.add(paciente);
    }

    public PacienteComum criarPacienteComum(
            String nome,
            int idade,
            double peso
    ) {

        return new PacienteComum(
                nome,
                idade,
                peso
        );
    }

    public PacienteAtleta criarPacienteAtleta(
            String nome,
            int idade,
            double peso
    ) {

        return new PacienteAtleta(
                nome,
                idade,
                peso
        );
    }

    public PacienteIdoso criarPacienteIdoso(
            String nome,
            int idade,
            double peso
    ) {

        return new PacienteIdoso(
                nome,
                idade,
                peso
        );
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }
}