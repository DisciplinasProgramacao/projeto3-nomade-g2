import java.time.Duration;
import java.time.LocalDateTime;

public class UsoDeVaga {

	private static final double FRACAO_USO = 0.25;
	private static final double VALOR_FRACAO = 4.0;
	private static final double VALOR_MAXIMO = 50.0;
	private Vaga vaga;
	private LocalDateTime entrada;
	private LocalDateTime saida;
	private double valorPago;

	public UsoDeVaga(Vaga vaga) {
		this.vaga = vaga;
	}

	public double sair() {
		if(this.vaga.sair()){
			this.entrada = LocalDateTime.parse("2023-09-20T10:00:00");
			this.saida = LocalDateTime.parse("2023-09-20T15:50:00");
			return this.valorPago();
		}
		return 0.0;
	}

	public double valorPago() {
		if(this.VALOR_FRACAO* fracaoTempoCobrar() > this.VALOR_MAXIMO){
				this.valorPago = this.VALOR_MAXIMO;
			}
			else{
				this.valorPago = this.VALOR_FRACAO * this.fracaoTempoCobrar();
			}
			return this.valorPago;
		}
		
	
	private Integer tempoEstacionado(){
		Duration duration = Duration.between(this.entrada, this.saida);
		return (int) duration.toMinutes();
	}
	
	private Double fracaoTempoCobrar(){
		return Math.floor(tempoEstacionado().doubleValue() / 15.0);
	}
}