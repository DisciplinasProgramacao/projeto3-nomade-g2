public class Vaga {
    private String id;
    private boolean disponivel;

    public Vaga(int fila, int numero) {
        this.id = "Fila " + fila + ", Vaga " + numero;
        this.disponivel = true;
    }

    public boolean estacionar() {
        if (disponivel) {
            disponivel = false;
            return true;
        } else {
            return false;
        }
    }

    public boolean sair() {
        if (!disponivel) {
            disponivel = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
