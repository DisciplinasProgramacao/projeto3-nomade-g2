import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ClienteTest {

    private Cliente cliente;

    @Before
    public void setUp() {
        cliente = new Cliente("João", "123");
    }

    @Test
    public void testAddVeiculo() {
        Veiculo veiculo = new Veiculo("ABC123");
        cliente.addVeiculo(veiculo);
        assertEquals(veiculo, cliente.possuiVeiculo("ABC123"));
    }

    @Test
    public void testPossuiVeiculo() {
        Veiculo veiculo = new Veiculo("DEF456");
        cliente.addVeiculo(veiculo);
        assertEquals(veiculo, cliente.possuiVeiculo("DEF456"));
        assertNull(cliente.possuiVeiculo("GHI789"));
    }

    @Test
    public void testTotalDeUsos() {
        assertEquals(0, cliente.totalDeUsos());
        // Adicione lógica para simular usos e testar novamente
    }

    @Test
    public void testArrecadadoPorVeiculo() {
        // Adicione lógica para simular histórico e testar arrecadação por veículo
    }

    @Test
    public void testArrecadadoTotal() {
        // Adicione lógica para simular histórico e testar arrecadação total
    }

    @Test
    public void testArrecadadoNoMes() {
        // Adicione lógica para simular histórico e testar arrecadação por mês
    }
}
/*Os testes testTotalDeUsos, testArrecadadoPorVeiculo, testArrecadadoTotal e testArrecadadoNoMes precisarão de uma implementação mais detalhada, simulando históricos e cálculos */