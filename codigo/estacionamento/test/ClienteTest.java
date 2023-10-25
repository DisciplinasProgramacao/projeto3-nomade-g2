import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest {

    @Test
    public void testAddVeiculo() {
        Cliente cliente = new Cliente("João", 1);
        Veiculo veiculo = new Veiculo(cliente, "ABC-1234");
        cliente.addVeiculo(veiculo);
        assertEquals(1, cliente.getVeiculos().size());
    }

    @Test
    public void testPossuiVeiculo() {
        Cliente cliente = new Cliente("João", 1);
        Veiculo veiculo = new Veiculo(cliente, "ABC-1234");
        cliente.addVeiculo(veiculo);
        assertTrue(cliente.possuiVeiculo("ABC-1234"));
        assertFalse(cliente.possuiVeiculo("XYZ-7890"));
    }

    @Test
    public void testTotalDeUsos() {
        Cliente cliente = new Cliente("João", 1);
        Veiculo veiculo = new Veiculo(cliente, "ABC-1234");
        cliente.addVeiculo(veiculo);
        Vaga vaga = new Vaga(1, 1);
        UsoDeVaga uso = new UsoDeVaga(vaga, 5);
        uso.estacionar(10);
        uso.sair(30);
        veiculo.setVaga(uso);
        assertEquals(1, cliente.totalDeUsos());
    }

    @Test
    public void testArrecadadoPorVeiculo() {
        Cliente cliente = new Cliente("João", 1);
        Veiculo veiculo = new Veiculo(cliente, "ABC-1234");
        cliente.addVeiculo(veiculo);
        Vaga vaga = new Vaga(1, 1);
        UsoDeVaga uso = new UsoDeVaga(vaga, 5);
        uso.estacionar(10);
        uso.sair(30);
        veiculo.setVaga(uso);
        assertEquals(uso.valorPago(), cliente.arrecadadoPorVeiculo("ABC-1234"), 0.001);
    }

    @Test
    public void testArrecadadoTotal() {
        Cliente cliente = new Cliente("João", 1);
        Veiculo veiculo1 = new Veiculo(cliente, "ABC-1234");
        cliente.addVeiculo(veiculo1);
        Vaga vaga1 = new Vaga(1, 1);
        UsoDeVaga uso1 = new UsoDeVaga(vaga1, 5);
        uso1.estacionar(10);
        uso1.sair(30);
        veiculo1.setVaga(uso1);

        Veiculo veiculo2 = new Veiculo(cliente, "XYZ-7890");
        cliente.addVeiculo(veiculo2);
        Vaga vaga2 = new Vaga(1, 2);
        UsoDeVaga uso2 = new UsoDeVaga(vaga2, 5);
        uso2.estacionar(40);
        uso2.sair(90);
        veiculo2.setVaga(uso2);

        assertEquals(uso1.valorPago() + uso2.valorPago(), cliente.arrecadadoTotal(), 0.001);
    }

    @Test
    public void testListarVeiculosCadastrados() {
        Cliente cliente = new Cliente("João", 1);
        Veiculo veiculo = new Veiculo(cliente, "ABC-1234");
        cliente.addVeiculo(veiculo);
        assertEquals(1, cliente.getVeiculos().size());
        assertEquals("ABC-1234", cliente.getVeiculos().get(0).getPlaca());
    }
}
