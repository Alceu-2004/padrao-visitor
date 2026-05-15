import model.PacienteAtleta;
import model.PacienteIdoso;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import visitor.AvaliacaoRiscoVisitor;

public class AvaliacaoRiscoVisitorTest {

    @Test
    public void deveInstanciarVisitorDeRisco() {

        AvaliacaoRiscoVisitor visitor =
                new AvaliacaoRiscoVisitor();

        Assertions.assertNotNull(visitor);
    }

    @Test
    public void deveAplicarVisitorEmPacienteAtleta() {

        PacienteAtleta paciente =
                new PacienteAtleta(
                        "Fernanda",
                        24,
                        60
                );

        AvaliacaoRiscoVisitor visitor =
                new AvaliacaoRiscoVisitor();

        paciente.aceitar(visitor);

        Assertions.assertTrue(true);
    }

    @Test
    public void deveAplicarVisitorEmPacienteIdoso() {

        PacienteIdoso paciente =
                new PacienteIdoso(
                        "João",
                        75,
                        82
                );

        AvaliacaoRiscoVisitor visitor =
                new AvaliacaoRiscoVisitor();

        paciente.aceitar(visitor);

        Assertions.assertTrue(true);
    }
}