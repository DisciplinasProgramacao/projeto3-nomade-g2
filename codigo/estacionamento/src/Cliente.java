import java.util.ArrayList;
import java.util.List;

public class Cliente {
	public static Cliente nome;
    private String cliente;
	private int id;
	private List<Veiculo> veiculosCadastrados;

	public Cliente(String nome, int id) {
		this.cliente = nome;
		this.id = id;
		this.veiculosCadastrados = new ArrayList<>();
	}

	public void addVeiculo(Veiculo veiculo) {
		veiculosCadastrados.add(veiculo);
	}

	public boolean possuiVeiculo(String placa) {
		for (Veiculo veiculo : veiculosCadastrados) {
			if (veiculo.getPlaca().equals(placa)) {
				return true;
			}
		}
		return false;
	}

    public int totalDeUsos() {

        return 0;
    }

    public double arrecadadoPorVeiculo(String placa) {
        
        return 0.0;
    }

    public double arrecadadoTotal() {
        
        return 0.0;
    }

    public double arrecadadoNoMes(int mes) {
        
        return 0.0;
    }

	public void listarVeiculosCadastrados() {
		if (veiculosCadastrados.isEmpty()) {
			System.out.println("Nenhum veículo cadastrado para este cliente.");
		} else {
			System.out.println("Veículos cadastrados para o cliente " + cliente + ":");
			for (Veiculo veiculo : veiculosCadastrados) {
				System.out.println("Placa: " + veiculo.getPlaca());
			}
		}
	}
}

/*
 * TODO#implementar:
 * + incrementaTotalDeUsos()
 * + historicoDeUso()
 * 
 * + calculaArrecadacaoNoMes(Veiculo arrecadacaoTotal): double
 * // a ideia é receber o valor retornado pelo método
 * "calculaTotalArrecadadoPorVeiculo()"
 * // e somar esse valor em um total;
 * historicoPagamento += arrecadacaoTotal;
 * return historicoPagamento;
 */
