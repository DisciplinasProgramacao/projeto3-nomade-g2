import java.util.ArrayList;

public class Veiculo {

	private Cliente nomeCliente;
	private String placa;
	private ArrayList<UsoDeVaga> usos;
	private Double totalArrecadado;
	private Double arrecadadoMes;
	private double valorPago;
	public boolean vagaOcupada;

	public Veiculo(Cliente nomeCliente, String placa) {
		this.nomeCliente = nomeCliente;
		this.placa = placa;
		this.usos = new ArrayList<>();
		this.totalArrecadado = 0.0;
		this.arrecadadoMes = 0.0;
	}

	public double sair() {
		double valorPago = usos.get(usos.size() - 1).sair();
		this.totalArrecadado += valorPago;
		return valorPago;
	}

	public double totalArrecadado() {
		return this.totalArrecadado();
	}

	public double arrecadadoPorVeiculo(Veiculo placa) {
		/*
		 * LÓGICA:
		 * arrecadacao = VALOR_FRACAO * tempoGasto ----> usar biblioteca Time neste
		 * caso;
		 */
		return valorPago;
	}
	
	public void setVaga(UsoDeVaga usodevaga) {
		usos.add(usodevaga);
	}

	public String getPlaca() {
		return placa;
	}
}

/*
 * TODO#mudancas:
 * 
 * + método "calculaArrecadacaoDoVeiculoPorUso(Veiculo placa)" foi para a classe
 * veículo;
 * calculaArrecadacaoPorVeiculo(placa: String){
 * valorPago = VALOR_FRACAO * (saida - entrada)
 * return valorPago;
 * }
 * 
 * calculaTotalArrecadadoPorVeiculo(): double
 * // esse método recebe o valorPago do veículo, individualmente, e calcula o
 * total.
 * total += valorPago;
 * return arrecadacaoTotal;
 */