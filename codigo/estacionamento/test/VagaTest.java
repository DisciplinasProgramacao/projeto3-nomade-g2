import org.junit.Test;
import static org.junit.Assert.*;

public class VagaTest {

    @Test
    public void testEstacionar() {
        Vaga vaga = new Vaga(1, 1);
        assertTrue(vaga.estacionar());
        assertFalse(vaga.isDisponivel());
    }

    @Test
    public void testSair() {
        Vaga vaga = new Vaga(1, 1);
        vaga.estacionar();
        assertTrue(vaga.sair());
        assertTrue(vaga.isDisponivel());
    }

    @Test
    public void testEstacionarVagaOcupada() {
        Vaga vaga = new Vaga(1, 1);
        vaga.estacionar();
        assertFalse(vaga.estacionar());
    }

    @Test
    public void testSairVagaVazia() {
        Vaga vaga = new Vaga(1, 1);
        assertFalse(vaga.sair());
    }

    @Test
    public void testIsDisponivel() {
        Vaga vaga = new Vaga(1, 1);
        assertTrue(vaga.isDisponivel());
        vaga.estacionar();
        assertFalse(vaga.isDisponivel());
    }
}
