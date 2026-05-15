package visitor;

import model.PacienteAtleta;
import model.PacienteComum;
import model.PacienteIdoso;

public interface Visitor {

    void visitar(
            PacienteComum paciente
    );

    void visitar(
            PacienteAtleta paciente
    );

    void visitar(
            PacienteIdoso paciente
    );
}