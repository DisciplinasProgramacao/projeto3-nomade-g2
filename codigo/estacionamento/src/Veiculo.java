import java.util.ArrayList;
import java.util.List;

public class Veiculo {

    private Cliente nomeCliente;
    private String placa;
    private List<UsoDeVaga> usos;
    private double totalArrecadado;

    public Veiculo(Cliente nomeCliente, String placa) {
        this.nomeCliente = nomeCliente;
        this.placa = placa;
        this.usos = new ArrayList<>();
    }

    public void setVaga(UsoDeVaga usoDeVaga) {
        usos.add(usoDeVaga);
    }

    public double sair() {
        UsoDeVaga uso = usos.get(usos.size() - 1);
        double valorPago = uso.sair(uso.getSaida());
        this.totalArrecadado += valorPago;
        return valorPago;
    }

    public double totalArrecadado() {
        return this.totalArrecadado;
    }

    public double arrecadadoPorVeiculo() {
        double arrecadacao = 0.0;
        for (UsoDeVaga uso : usos) {
            arrecadacao += uso.valorPago();
        }
        return arrecadacao;
    }

    public String getPlaca() {
        return placa;
    }

    public List<UsoDeVaga> getUsos() {
        return usos;
    }
}
