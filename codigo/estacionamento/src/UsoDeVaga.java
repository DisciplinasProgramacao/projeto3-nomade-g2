public class UsoDeVaga {

	private static final double FRACAO_USO = 0.25;
	private static final double VALOR_FRACAO = 4.0;
	private static final double VALOR_MAXIMO = 50.0;
	private Vaga vaga;
	private int entrada;
	private int saida;
	private double valorPago;

	public UsoDeVaga(Vaga vaga){
		this.vaga = vaga;
	}
	
	public double sair(int minutoSaida) {
			this.saida = minutoSaida;
			return this.valorPago();
	}

	public double valorPago() {
		if (VALOR_FRACAO * fracaoTempoCobrar() > VALOR_MAXIMO) {
			this.valorPago = VALOR_MAXIMO;
		} else {
			this.valorPago = VALOR_FRACAO * this.fracaoTempoCobrar();
		}
		return this.valorPago;
	}
	
	public Integer tempoEstacionado(){
		// Duration duration = Duration.between(this.entrada, this.saida);
		int tempoEstacionado = this.saida - this.entrada;
		return tempoEstacionado;
	}
	
	public Double fracaoTempoCobrar(){
		return Math.floor(tempoEstacionado().doubleValue() / 15.0);
	}

	public Double getValorPago(){
		return this.valorPago;
	}

	public void estacionar(int minutoEntrada) {
		this.entrada = minutoEntrada;		
	}
}