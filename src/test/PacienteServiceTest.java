import model.Paciente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.PacienteService;

public class PacienteServiceTest {

    private PacienteService service;

    @BeforeEach
    public void configurar() {

        service = new PacienteService();
    }

    @Test
    public void deveAdicionarPaciente() {

        Paciente paciente =
                service.criarPacienteComum(
                        "Carlos",
                        29,
                        78
                );

        service.adicionarPaciente(paciente);

        Assertions.assertEquals(
                1,
                service.getPacientes().size()
        );
    }

    @Test
    public void deveCriarPacienteAtleta() {

        Paciente paciente =
                service.criarPacienteAtleta(
                        "Fernanda",
                        24,
                        60
                );

        Assertions.assertEquals(
                "Fernanda",
                paciente.getNome()
        );
    }

    @Test
    public void deveCriarPacienteIdoso() {

        Paciente paciente =
                service.criarPacienteIdoso(
                        "João",
                        71,
                        83
                );

        Assertions.assertEquals(
                71,
                paciente.getIdade()
        );
    }

    @Test
    public void deveInicializarListaVazia() {

        Assertions.assertTrue(
                service.getPacientes().isEmpty()
        );
    }
}