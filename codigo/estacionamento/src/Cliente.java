import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Cliente {

	private String nome;
	private String id;
	private Veiculo[] veiculos;
    private List<Historico> historicos;

    public Cliente(String nome, String id) {
        this.nome = nome;
        this.id = id;
        this.veiculos = new Veiculo[10];  // Considerando um máximo de 10 veículos
        this.historicos = new ArrayList<>();
    }


    public void addVeiculo(Veiculo veiculo) {
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] == null) {
                veiculos[i] = veiculo;
                return;
            }
        }
        System.out.println("Limite de veículos atingido para este cliente.");
    }

    public Veiculo possuiVeiculo(String placa) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo != null && veiculo.getPlaca().equals(placa)) {
                return veiculo;
            }
        }
        return null;
    }

    public int totalDeUsos() {
        return historicos.size();
    }

    public double arrecadadoPorVeiculo(String placa) {
        double totalArrecadado = 0;
        for (Historico historico : historicos) {
            if (historico.getVeiculo().getPlaca().equals(placa)) {
                totalArrecadado += historico.getValor();
            }
        }
        return totalArrecadado;
    }

    public double arrecadadoTotal() {
        double totalArrecadado = 0;
        for (Historico historico : historicos) {
            totalArrecadado += historico.getValor();
        }
        return totalArrecadado;
    }

    public double arrecadadoNoMes(int mes) {
        double totalArrecadado = 0;
        for (Historico historico : historicos) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(historico.getDataInicio());
            int historicoMes = calendar.get(Calendar.MONTH) + 1;  // Calendar.MONTH é base 0
            if (historicoMes == mes) {
                totalArrecadado += historico.getValor();
            }
        }
        return totalArrecadado;
    }
}