import java.util.ArrayList;
import java.util.List;

public class Veiculo {
    private Cliente nomeCliente;
    private String placa;
    private List<UsoDeVaga> usos;
    private double totalArrecadado;

    /**
     * Construtor da classe Veiculo.
     * 
     * @param nomeCliente Cliente proprietário do veículo.
     * @param placa Placa do veículo.
     */
    public Veiculo(Cliente nomeCliente, String placa) {
        this.nomeCliente = nomeCliente;
        this.placa = placa;
        this.usos = new ArrayList<>();
    }

    /**
     * Adiciona um uso de vaga à lista de usos do veículo.
     * 
     * @param usoDeVaga Uso de vaga a ser adicionado.
     */
    public void setVaga(UsoDeVaga usoDeVaga) {
        usos.add(usoDeVaga);
    }

    /**
     * Registra a saída do veículo de uma vaga e calcula o valor a ser pago.
     * 
     * @return Valor a ser pago.
     */
    public double sair() {
        UsoDeVaga uso = usos.get(usos.size() - 1);
        double valorPago = uso.sair(uso.getSaida());
        this.totalArrecadado += valorPago;
        return valorPago;
    }

    /**
     * Calcula o valor total arrecadado pelo veículo.
     * 
     * @return Valor total arrecadado.
     */
    public double totalArrecadado() {
        return this.totalArrecadado;
    }

    /**
     * Calcula o valor total arrecadado pelo veículo.
     * 
     * @return Valor arrecadado.
     */
    public double arrecadadoPorVeiculo() {
        double arrecadacao = 0.0;
        for (UsoDeVaga uso : usos) {
            arrecadacao += uso.valorPago();
        }
        return arrecadacao;
    }

    /**
     * Retorna a placa do veículo.
     * 
     * @return Placa do veículo.
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Retorna a lista de usos de vaga do veículo.
     * 
     * @return Lista de usos de vaga.
     */
    public List<UsoDeVaga> getUsos() {
        return usos;
    }
}