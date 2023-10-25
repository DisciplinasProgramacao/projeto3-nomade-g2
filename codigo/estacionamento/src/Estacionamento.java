import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private String nome;
    private Vaga[][] vagas;
    private int quantFileiras;
    private int vagaDaFileira;

    public Estacionamento(String nome, int quantFileiras, int vagasPorFileira) {
        this.nome = nome;
        this.quantFileiras = quantFileiras;
        this.vagaDaFileira = vagasPorFileira;
    }

    public void addVagas(int quantFileiras, int vagasNaFileira) {
        vagas = new Vaga[quantFileiras][vagasNaFileira];

        for (int i = 0; i < quantFileiras; i++) {
            for (int j = 0; j < vagasNaFileira; j++) {
                Vaga novaVaga = new Vaga(i,j);
                vagas[i][j] = novaVaga;
            }
        }
    }

    public double totalArrecadado() {
        // receber o valor retornado pelo método sair()
        // OU
        // dar um jeito de colocar esse valor em um arraylist e calcular o total
        // arrecadado
        // definir o mês
        return 0.0;
    }

    public double arrecadacaoNoMes(int mes) {

        return 0.0;
    }

    public double valorMedioPorUso() {

        return 0.0;
    }

    public String top5Clientes(int mes) {

        return "";
    }
}
