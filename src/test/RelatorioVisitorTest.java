import model.PacienteComum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import visitor.RelatorioVisitor;

public class RelatorioVisitorTest {

    @Test
    public void deveInstanciarRelatorioVisitor() {

        RelatorioVisitor visitor =
                new RelatorioVisitor();

        Assertions.assertNotNull(visitor);
    }

    @Test
    public void deveAplicarVisitorAoPaciente() {

        PacienteComum paciente =
                new PacienteComum(
                        "Carlos",
                        30,
                        80
                );

        RelatorioVisitor visitor =
                new RelatorioVisitor();

        paciente.aceitar(visitor);

        Assertions.assertTrue(true);
    }
}