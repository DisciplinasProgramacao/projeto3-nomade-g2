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

    /**
     * Construtor da classe UsoDeVaga.
     * 
     * @param vaga Vaga utilizada.
     * @param mes Mês de utilização.
     */
    public UsoDeVaga(Vaga vaga, int mes) {
        this.vaga = vaga;
        this.mes = mes;
    }

    /**
     * Registra o momento de entrada do veículo na vaga.
     * 
     * @param minutoEntrada Minuto de entrada.
     */
    public void estacionar(int minutoEntrada) {
        this.entrada = minutoEntrada;
    }

    /**
     * Registra o momento de saída do veículo da vaga e calcula o valor a ser pago.
     * 
     * @param minutoSaida Minuto de saída.
     * @return Valor a ser pago.
     */
    public double sair(int minutoSaida) {
        this.saida = minutoSaida;
        this.valorPago = valorPago();
        return this.valorPago;
    }

    /**
     * Calcula o valor a ser pago com base no tempo de uso da vaga.
     * 
     * @return Valor a ser pago.
     */
    public double valorPago() {
        long minutosEstacionado = this.saida - this.entrada;
        double fracaoTempo = Math.ceil((double) minutosEstacionado / 15.0);
        double valorPago = fracaoTempo * VALOR_FRACAO;
        if (valorPago > VALOR_MAXIMO) {
            return VALOR_MAXIMO;
        }
        return valorPago;
    }

    /**
     * Retorna o minuto de entrada do veículo na vaga.
     * 
     * @return Minuto de entrada.
     */
    public int getEntrada() {
        return entrada;
    }

    /**
     * Retorna o minuto de saída do veículo da vaga.
     * 
     * @return Minuto de saída.
     */
    public int getSaida() {
        return saida;
    }

    /**
     * Retorna o mês de utilização da vaga.
     * 
     * @return Mês de utilização.
     */
    public int getMes() {
        return mes;
    }
}
