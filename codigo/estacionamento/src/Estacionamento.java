import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private String nome;
    private List<Cliente> clientes;
    private List<Vaga> vagas;
    private int quantFileiras;
    private int vagasPorFileira;
    
    public Estacionamento(String nome, int quantFileiras, int vagasPorFileira) {
        this.nome = nome;
        this.quantFileiras = quantFileiras;
        this.vagasPorFileira = vagasPorFileira;
        this.clientes = new ArrayList<>();
        this.vagas = new ArrayList<>();
        addVagas();
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void addVagas() {
        for (int fila = 1; fila <= quantFileiras; fila++) {
            for (int numero = 1; numero <= vagasPorFileira; numero++) {
                Vaga novaVaga = new Vaga(fila, numero);
                vagas.add(novaVaga);
            }
        }
    }

    public List<Vaga> getVagas() {
        return vagas;
    }

    public double totalArrecadado() {
        double totalArrecadado = 0.0;
    
        if (clientes != null) {
            for (Cliente cliente : clientes) {
                if (cliente.getVeiculos() != null) {
                    for (Veiculo veiculo : cliente.getVeiculos()) {
                        if (veiculo.getUsos() != null) {
                            for (UsoDeVaga uso : veiculo.getUsos()) {
                                totalArrecadado += uso.valorPago();
                            }
                        }
                    }
                }
            }
        }
    
        return totalArrecadado;
    }
    
    
    public double arrecadacaoNoMes(int mes) {
        double arrecadacaoMensal = 0.0;
    
        if (clientes != null) {
            for (Cliente cliente : clientes) {
                if (cliente.getVeiculos() != null) {
                    for (Veiculo veiculo : cliente.getVeiculos()) {
                        if (veiculo.getUsos() != null) {
                            for (UsoDeVaga uso : veiculo.getUsos()) {
                                if (uso.getMes() == mes) {
                                    arrecadacaoMensal += uso.valorPago();
                                }
                            }
                        }
                    }
                }
            }
        }
    
        return arrecadacaoMensal;
    }
    

    public double valorMedioPorUso() {
        double totalValorPago = 0.0;
        int totalUsos = 0;

        for (Cliente cliente : clientes) {
            for (Veiculo veiculo : cliente.getVeiculos()) {
                for (UsoDeVaga uso : veiculo.getUsos()) {
                    totalValorPago += uso.valorPago();
                    totalUsos++;
                }
            }
        }

        if (clientes.isEmpty() || totalUsos == 0) {
            return 0;
        }

        return totalValorPago / totalUsos;
    }

    public String top5Clientes(int mes) {
        List<Cliente> topClientes = new ArrayList<>(clientes);

        topClientes.sort((cliente1, cliente2) -> Double.compare(getArrecadacaoCliente(cliente2, mes), getArrecadacaoCliente(cliente1, mes)));

        int topCount = Math.min(5, topClientes.size());

        StringBuilder top5 = new StringBuilder();

        for (int i = 0; i < topCount; i++) {
            Cliente cliente = topClientes.get(i);
            double arrecadacao = getArrecadacaoCliente(cliente, mes);
            top5.append((i + 1) + ". " + cliente.getNome() + " - R$" + arrecadacao);
            top5.append(System.lineSeparator());
        }

        return top5.toString();
    }

    public double getArrecadacaoCliente(Cliente cliente, int mes) {
        double arrecadacao = 0.0;
    
        for (Veiculo veiculo : cliente.getVeiculos()) {
            for (UsoDeVaga uso : veiculo.getUsos()) {
                if (uso.getMes() == mes) { 
                    arrecadacao += uso.valorPago();
                }
            }
        }
    
        return arrecadacao;
    }
    
}
