import java.util.ArrayList;

public class VeiculoTeste {

    public static void main(String[] args) {
        TesteVeiculo();
        TesteEstacionar();
        TesteSair();
        TesteTotalArrecadado();
        TesteArrecadadoMes();
        TesteTotaldeUso();
    }

    public static void TesteVeiculo() {
        Veiculo veiculo = new Veiculo("ABC-1234");
		System.out.println(veiculo);
	}


    public static void TesteEstacionar() {
        Veiculo veiculo = new Veiculo("ABC-1234");
        Vaga vaga = new Vaga("A",1);
        System.out.println(veiculo.estacionar(vaga));
    }

    public static void TesteSair() {
        Veiculo veiculo = new Veiculo("ABC-1234");
        double valorEsperado = 0.0; // Substitua pelo valor que você espera
        System.out.println(valorEsperado + ", "+ veiculo.sair());
    }

    public static void TesteTotalArrecadado() {
        Veiculo veiculo = new Veiculo("ABC-1234");
        double valorEsperado = 0.0; // Substitua pelo valor que você espera
        System.out.println(valorEsperado + ", "+ veiculo.totalArrecadado());
    }

    public static void TesteArrecadadoNoMes() {
        Veiculo veiculo = new Veiculo("ABC-1234");
        int mes = 1; // Substitua pelo mês que você quer testar
        double valorEsperado = 0.0; // Substitua pelo valor que você espera
        System.out.println(valorEsperado + ", "+ veiculo.arrecadadoNoMes(mes));
    }

    public static void TesteArrecadadoMes() {
        Veiculo veiculo = new Veiculo("ABC-1234");
        int valorEsperado = 0; // Substitua pelo valor que você espera
        System.out.println(valorEsperado + ", "+ veiculo.totalDeUsos());
    }

    public static void TesteTotaldeUso() {
        Veiculo veiculo = new Veiculo("ABC-1234");
        Vaga vaga = new Vaga("A", 1);
        UsoDeVaga usoDeVaga = new UsoDeVaga(vaga);
        veiculo.setVaga(usoDeVaga);
        System.out.println("Processo terminado");
        
    }
}
