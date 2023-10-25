import org.junit.Test;
import static org.junit.Assert.*;

public class VeiculoTest {

    @Test
    public void testSetVaga() {
        Cliente cliente = new Cliente("Maria", 2);
        Veiculo veiculo = new Veiculo(cliente, "XYZ-7890");
        Vaga vaga = new Vaga(1, 2);
        UsoDeVaga uso = new UsoDeVaga(vaga, 6);
        veiculo.setVaga(uso);
        assertEquals(1, veiculo.getUsos().size());
    }

    @Test
    public void testSair() {
        Cliente cliente = new Cliente("Maria", 2);
        Veiculo veiculo = new Veiculo(cliente, "XYZ-7890");
        Vaga vaga = new Vaga(1, 2);
        UsoDeVaga uso = new UsoDeVaga(vaga, 6);
        uso.estacionar(10);
        veiculo.setVaga(uso);
        double valorPago = veiculo.sair();
        assertTrue(valorPago > 0);
    }

    @Test
    public void testTotalArrecadado() {
        Cliente cliente = new Cliente("Maria", 2);
        Veiculo veiculo = new Veiculo(cliente, "XYZ-7890");
        Vaga vaga = new Vaga(1, 2);
        UsoDeVaga uso1 = new UsoDeVaga(vaga, 6);
        uso1.estacionar(10);
        uso1.sair(30);
        veiculo.setVaga(uso1);
        UsoDeVaga uso2 = new UsoDeVaga(vaga, 6);
        uso2.estacionar(40);
        uso2.sair(90);
        veiculo.setVaga(uso2);
        assertEquals(uso1.valorPago() + uso2.valorPago(), veiculo.totalArrecadado(), 0.001);
    }

    @Test
    public void testArrecadadoPorVeiculo() {
        Cliente cliente = new Cliente("Maria", 2);
        Veiculo veiculo = new Veiculo(cliente, "XYZ-7890");
        Vaga vaga = new Vaga(1, 2);
        UsoDeVaga uso1 = new UsoDeVaga(vaga, 6);
        uso1.estacionar(10);
        uso1.sair(30);
        veiculo.setVaga(uso1);
        UsoDeVaga uso2 = new UsoDeVaga(vaga, 6);
        uso2.estacionar(40);
        uso2.sair(90);
        veiculo.setVaga(uso2);
        assertEquals(uso1.valorPago() + uso2.valorPago(), veiculo.arrecadadoPorVeiculo(), 0.001);
    }

    @Test
    public void testGetPlaca() {
        Cliente cliente = new Cliente("Maria", 2);
        Veiculo veiculo = new Veiculo(cliente, "XYZ-7890");
        assertEquals("XYZ-7890", veiculo.getPlaca());
    }
}
