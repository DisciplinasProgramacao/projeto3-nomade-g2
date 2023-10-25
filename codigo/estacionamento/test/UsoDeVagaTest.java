import org.junit.Test;
import static org.junit.Assert.*;

public class UsoDeVagaTest {

    @Test
    public void testEstacionar() {
        Vaga vaga = new Vaga(1, 1);
        UsoDeVaga uso = new UsoDeVaga(vaga, 6);
        uso.estacionar(10);
        assertEquals(10, uso.getEntrada());
    }

    @Test
    public void testSair() {
        Vaga vaga = new Vaga(1, 1);
        UsoDeVaga uso = new UsoDeVaga(vaga, 6);
        uso.estacionar(10);
        double valorPago = uso.sair(50);
        assertEquals(50, uso.getSaida());
        assertTrue(valorPago > 0);
    }

    @Test
    public void testValorPago() {
        Vaga vaga = new Vaga(1, 1);
        UsoDeVaga uso = new UsoDeVaga(vaga, 6);
        uso.estacionar(10);
        uso.sair(50);
        double valorPago = uso.valorPago();
        double esperado = 16.0;
        assertEquals(esperado, valorPago, 0.001);
    }

    @Test
    public void testValorMaximoPago() {
        Vaga vaga = new Vaga(1, 1);
        UsoDeVaga uso = new UsoDeVaga(vaga, 6);
        uso.estacionar(10);
        uso.sair(650); 
        double valorPago = uso.valorPago();
        assertEquals(50.0, valorPago, 0.001);
    }

    @Test
    public void testGetMes() {
        Vaga vaga = new Vaga(1, 1);
        UsoDeVaga uso = new UsoDeVaga(vaga, 6);
        assertEquals(6, uso.getMes());
    }
}
