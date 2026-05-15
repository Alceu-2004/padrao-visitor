import model.PacienteAtleta;
import model.PacienteComum;
import model.PacienteIdoso;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PacienteTest {

    @Test
    public void deveCriarPacienteComum() {

        PacienteComum paciente =
                new PacienteComum(
                        "Carlos",
                        28,
                        75
                );

        Assertions.assertEquals(
                "Carlos",
                paciente.getNome()
        );
    }

    @Test
    public void deveCriarPacienteAtleta() {

        PacienteAtleta paciente =
                new PacienteAtleta(
                        "Fernanda",
                        24,
                        62
                );

        Assertions.assertEquals(
                24,
                paciente.getIdade()
        );
    }

    @Test
    public void deveCriarPacienteIdoso() {

        PacienteIdoso paciente =
                new PacienteIdoso(
                        "João",
                        72,
                        80
                );

        Assertions.assertEquals(
                80,
                paciente.getPeso()
        );
    }
}