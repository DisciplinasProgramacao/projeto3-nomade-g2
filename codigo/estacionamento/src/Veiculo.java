import java.util.ArrayList;

public class Veiculo {

	private String placa;
	private ArrayList<UsoDeVaga> usos;
	private Double totalArrecadado;
	private Double arrecadadoMes;

	public Veiculo(String placa) {
		this.placa = placa;
		this.totalArrecadado = 0.0;
	}

	public boolean estacionar(Vaga vaga) {
		if(!vaga.estacionar()){
			return false;
		}
		return true;
	}

	public double sair() {
		return usos.get(usos.size()-1).sair();

	}

	public double totalArrecadado() {
		for(UsoDeVaga uso: usos){
			this.totalArrecadado+= uso.valorPago();
		}
		return this.totalArrecadado();
	}

	public double arrecadadoNoMes(int mes) {
		for(int i = 0; i<usos.size(); i++){
		if(usos.get(i).saida.getMonth().equals(mes)){
			this.arrecadadoMes += usos.get(i).valorPago();
		}
	}
	return this.arrecadadoMes;
	}

	public int totalDeUsos() {
		return this.usos.size() -1;
	}

	public void setVaga(UsoDeVaga usodevaga){
		usos.add(usodevaga);
	}
}
