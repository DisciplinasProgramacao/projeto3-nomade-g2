public class Vaga {
    private String id;
    private boolean disponivel;

    /**
     * Construtor da classe Vaga.
     * 
     * @param fila Número da fila onde a vaga está localizada.
     * @param numero Número da vaga na fila.
     */
    public Vaga(int fila, int numero) {
        this.id = "Fila " + fila + ", Vaga " + numero;
        this.disponivel = true;
    }

    /**
     * Tenta estacionar um veículo na vaga.
     * 
     * @return Verdadeiro se o veículo foi estacionado com sucesso, falso caso contrário.
     */
    public boolean estacionar() {
        if (disponivel) {
            disponivel = false;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Registra a saída de um veículo da vaga.
     * 
     * @return Verdadeiro se o veículo saiu com sucesso, falso caso contrário.
     */
    public boolean sair() {
        if (!disponivel) {
            disponivel = true;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Verifica se a vaga está disponível.
     * 
     * @return Verdadeiro se a vaga está disponível, falso caso contrário.
     */
    public boolean isDisponivel() {
        return disponivel;
    }
}