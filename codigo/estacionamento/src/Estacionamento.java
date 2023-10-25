import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private String nome;
    private List<Cliente> clientes;
    private List<Vaga> vagas;
    
    public Estacionamento(String nome, int qtdVagas) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
        this.vagas = new ArrayList<>();
    }

    public void addCliente(Cliente nome){
        clientes.add(nome);
    }

    public void addVaga(Vaga vaga){
    vagas.add(vaga);
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
