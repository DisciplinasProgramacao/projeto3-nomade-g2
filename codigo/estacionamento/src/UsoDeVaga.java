import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class UsoDeVaga {

    private static final double FRACAO_USO = 0.25;
    private static final double VALOR_FRACAO = 4.0;
    private static final double VALOR_MAXIMO = 50.0;
    private Vaga vaga;
    private int entrada;
    private int saida;
    private double valorPago;
	private int mes;

    public UsoDeVaga(Vaga vaga, int mes) {
        this.vaga = vaga;
		this.mes = mes;
    }

    public void estacionar(int minutoEntrada) {
        this.entrada = minutoEntrada;
    }

    public double sair(int minutoSaida) {
        this.saida = minutoSaida;
        this.valorPago = valorPago();
        return this.valorPago;
    }

    public double valorPago() {
        long minutosEstacionado = this.saida - this.entrada;
        double fracaoTempo = Math.ceil((double) minutosEstacionado / 15.0);
        double valorPago = fracaoTempo * VALOR_FRACAO;

        if (valorPago > VALOR_MAXIMO) {
            return VALOR_MAXIMO;
        }

        return valorPago;
    }

    public int getEntrada() {
        return entrada;
    }

    public int getSaida() {
        return saida;
    }

	public int getMes() {
        return mes;
    }
}
