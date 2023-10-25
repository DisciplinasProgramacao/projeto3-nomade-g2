import org.junit.Test;
import static org.junit.Assert.*;

public class EstacionamentoTest {

    @Test
    public void testAddCliente() {
        Estacionamento estacionamento = new Estacionamento("Central", 2, 5);
        Cliente cliente = new Cliente("Maria", 1);
        estacionamento.addCliente(cliente);
        assertTrue(estacionamento.getVagas().size() == 10); 
    }

    @Test
    public void testTotalArrecadado() {
        Estacionamento estacionamento = new Estacionamento("Central", 2, 5);
        Cliente cliente = new Cliente("Maria", 2);
        estacionamento.addCliente(cliente);
        Veiculo veiculo = new Veiculo(cliente, "XYZ-7890");
        cliente.addVeiculo(veiculo);
        Vaga vaga = new Vaga(1, 2);
        UsoDeVaga uso = new UsoDeVaga(vaga, 5);
        uso.estacionar(10);
        uso.sair(50);
        veiculo.setVaga(uso);
        assertEquals(uso.valorPago(), estacionamento.totalArrecadado(), 0.001);
    }

    @Test
    public void testArrecadacaoNoMes() {
        Estacionamento estacionamento = new Estacionamento("Central", 2, 5);
        Cliente cliente = new Cliente("Maria", 2);
        estacionamento.addCliente(cliente);
        Veiculo veiculo = new Veiculo(cliente, "XYZ-7890");
        cliente.addVeiculo(veiculo);
        Vaga vaga = new Vaga(1, 2);
        UsoDeVaga uso = new UsoDeVaga(vaga, 5);
        uso.estacionar(10);
        uso.sair(50);
        veiculo.setVaga(uso);
        assertEquals(uso.valorPago(), estacionamento.arrecadacaoNoMes(5), 0.001);
        assertEquals(0, estacionamento.arrecadacaoNoMes(6), 0.001);
    }

    @Test
    public void testValorMedioPorUso() {
        Estacionamento estacionamento = new Estacionamento("Central", 2, 5);
        Cliente cliente1 = new Cliente("Maria", 2);
        estacionamento.addCliente(cliente1);
        Veiculo veiculo1 = new Veiculo(cliente1, "XYZ-7890");
        cliente1.addVeiculo(veiculo1);
        Vaga vaga1 = new Vaga(1, 2);
        UsoDeVaga uso1 = new UsoDeVaga(vaga1, 5);
        uso1.estacionar(10);
        uso1.sair(50);
        veiculo1.setVaga(uso1);

        Cliente cliente2 = new Cliente("João", 3);
        estacionamento.addCliente(cliente2);
        Veiculo veiculo2 = new Veiculo(cliente2, "ABC-1234");
        cliente2.addVeiculo(veiculo2);
        Vaga vaga2 = new Vaga(2, 3);
        UsoDeVaga uso2 = new UsoDeVaga(vaga2, 5);
        uso2.estacionar(10);
        uso2.sair(30);
        veiculo2.setVaga(uso2);

        double media = (uso1.valorPago() + uso2.valorPago()) / 2;
        assertEquals(media, estacionamento.valorMedioPorUso(), 0.001);
    }

}
