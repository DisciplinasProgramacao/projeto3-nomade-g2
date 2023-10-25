import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private int id;
    private List<Veiculo> veiculosCadastrados;

    public Cliente(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.veiculosCadastrados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
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
		int totalUsos = 0;
	
		for (Veiculo veiculo : veiculosCadastrados) {
			totalUsos += veiculo.getUsos().size();
		}
	
		return totalUsos;
	}
	
	public double arrecadadoPorVeiculo(String placa) {
		double arrecadacao = 0.0;
	
		for (Veiculo veiculo : veiculosCadastrados) {
			if (veiculo.getPlaca().equals(placa)) {
				for (UsoDeVaga uso : veiculo.getUsos()) {
					arrecadacao += uso.valorPago();
				}
			}
		}
	
		return arrecadacao;
	}
	
	public double arrecadadoTotal() {
		double arrecadacaoTotal = 0.0;
	
		for (Veiculo veiculo : veiculosCadastrados) {
			for (UsoDeVaga uso : veiculo.getUsos()) {
				arrecadacaoTotal += uso.valorPago();
			}
		}
	
		return arrecadacaoTotal;
	}
	
	public double arrecadadoNoMes(int mes) {
		double arrecadacaoMensal = 0.0;
	
		for (Veiculo veiculo : veiculosCadastrados) {
			for (UsoDeVaga uso : veiculo.getUsos()) {
				if (uso.getMes() == mes) {
					arrecadacaoMensal += uso.valorPago();
				}
			}
		}
	
		return arrecadacaoMensal;
	}
	
    public void listarVeiculosCadastrados() {
        if (veiculosCadastrados.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado para este cliente.");
        } else {
            System.out.println("Veículos cadastrados para o cliente " + nome + ":");
            for (Veiculo veiculo : veiculosCadastrados) {
                System.out.println("Placa: " + veiculo.getPlaca());
            }
        }
    }

    public List<Veiculo> getVeiculos() {
        return veiculosCadastrados;
    }

    public int getId() {
        return id;
    }
}
