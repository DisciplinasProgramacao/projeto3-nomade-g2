import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private int id;
    private List<Veiculo> veiculosCadastrados;

    /**
     * Construtor da classe Cliente.
     * 
     * @param nome Nome do cliente.
     * @param id Identificação do cliente.
     */
    
    public Cliente(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.veiculosCadastrados = new ArrayList<>();
    }

    /**
     * Retorna o nome do cliente.
     * 
     * @return Nome do cliente.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Adiciona um veículo à lista de veículos cadastrados do cliente.
     * 
     * @param veiculo Veículo a ser adicionado.
     */
    public void addVeiculo(Veiculo veiculo) {
        veiculosCadastrados.add(veiculo);
    }

    /**
     * Verifica se o cliente possui um veículo com a placa fornecida.
     * 
     * @param placa Placa do veículo.
     * @return Verdadeiro se o cliente possui o veículo, falso caso contrário.
     */
    public boolean possuiVeiculo(String placa) {
        for (Veiculo veiculo : veiculosCadastrados) {
            if (veiculo.getPlaca().equals(placa)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Calcula o total de usos de vaga de todos os veículos do cliente.
     * 
     * @return Total de usos.
     */
    public int totalDeUsos() {
        int totalUsos = 0;
        for (Veiculo veiculo : veiculosCadastrados) {
            totalUsos += veiculo.getUsos().size();
        }
        return totalUsos;
    }

    /**
     * Calcula o valor arrecadado por um veículo específico do cliente.
     * 
     * @param placa Placa do veículo.
     * @return Valor arrecadado.
     */
    public double arrecadadoPorVeiculo(String placa) {
        double arrecadacao = 0.0;
        for (Veiculo veiculo : veiculosCadastrados) {
            if (veiculo.getPlaca().equals(placa)) {
                for (UsoDeVaga uso : veiculo.getUsos()) {
                    arrecadacao += uso.valorPago();
                }
            }
        }
        return arrecadacao;
    }

    /**
     * Calcula o valor total arrecadado por todos os veículos do cliente.
     * 
     * @return Valor total arrecadado.
     */
    public double arrecadadoTotal() {
        double arrecadacaoTotal = 0.0;
        for (Veiculo veiculo : veiculosCadastrados) {
            for (UsoDeVaga uso : veiculo.getUsos()) {
                arrecadacaoTotal += uso.valorPago();
            }
        }
        return arrecadacaoTotal;
    }

    /**
     * Calcula o valor total arrecadado por todos os veículos do cliente em um mês específico.
     * 
     * @param mes Mês desejado.
     * @return Valor arrecadado no mês.
     */
    public double arrecadadoNoMes(int mes) {
        double arrecadacaoMensal = 0.0;
        for (Veiculo veiculo : veiculosCadastrados) {
            for (UsoDeVaga uso : veiculo.getUsos()) {
                if (uso.getMes() == mes) {
                    arrecadacaoMensal += uso.valorPago();
                }
            }
        }
        return arrecadacaoMensal;
    }

    /**
     * Lista todos os veículos cadastrados para o cliente.
     */
    public void listarVeiculosCadastrados() {
        if (veiculosCadastrados.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado para este cliente.");
        } else {
            System.out.println("Veículos cadastrados para o cliente " + nome + ":");
            for (Veiculo veiculo : veiculosCadastrados) {
                System.out.println("Placa: " + veiculo.getPlaca());
            }
        }
    }

    /**
     * Retorna a lista de veículos cadastrados do cliente.
     * 
     * @return Lista de veículos.
     */
    public List<Veiculo> getVeiculos() {
        return veiculosCadastrados;
    }

    /**
     * Retorna a identificação do cliente.
     * 
     * @return ID do cliente.
     */
    public int getId() {
        return id;
    }
}