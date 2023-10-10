import java.util.ArrayList;

public class Veiculo {

	private String placa;
	private ArrayList<UsoDeVaga> usos;
	private Double totalArrecadado;
	private Double arrecadadoMes;

	public Veiculo(String placa) {
		this.placa = placa;
		this.usos = new ArrayList<>();
		this.totalArrecadado = 0.0;
		this.arrecadadoMes = 0.0;
	}

	public boolean estacionar(Vaga vaga) {
		if (!vaga.estacionar()) {
			return false;
		}
		return vaga.estacionar();
	}

	public double sair() {
		double valorPago = usos.get(usos.size() - 1).sair();
		this.totalArrecadado += valorPago;
		return valorPago;

	}

	public double totalArrecadado() {
		return this.totalArrecadado();
	}

	public double arrecadadoNoMes(int mes) {
		this.arrecadadoMes = 0.0;
		for(UsoDeVaga uso: usos){
			if(uso.saida.getMonth().equals(mes)){
				this.arrecadadoMes += uso.valorPago();
			}
		}
		return this.arrecadadoMes;
	}

	public int totalDeUsos() {
		return this.usos.size();
	}

	public void setVaga(UsoDeVaga usodevaga){
		usos.add(usodevaga);
	}
}
