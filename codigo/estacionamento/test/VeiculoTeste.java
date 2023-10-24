
import java.util.ArrayList;

public class VeiculoTeste {


	private ArrayList<UsoDeVaga> usos;
    static Veiculo veiculo = new Veiculo("ABC-1234");
    
    
    public static boolean testEstacionar() {
        Vaga vaga = new Vaga(20, 1234); // Supondo que você tenha uma classe Vaga
        return veiculo.estacionar(vaga);
    }

    
    public static String testSair() {
        Veiculo veiculo = new Veiculo("ABC-1234");
        UsoDeVaga uso = new UsoDeVaga(null); // Supondo que você tenha uma classe UsoDeVaga
        veiculo.setVaga(uso);
        return (uso.sair()+","+ veiculo.sair());
    }

    
    public static double testTotalArrecadado() {
        Veiculo veiculo = new Veiculo("ABC-1234");
        return( veiculo.totalArrecadado());
    }

    
    public static double testArrecadadoNoMes() {
        Veiculo veiculo = new Veiculo("ABC-1234");
        return(veiculo.arrecadadoNoMes(10));
    }

    
    public static int testTotalDeUsos() {
        Veiculo veiculo = new Veiculo("ABC-1234");
        return (veiculo.totalDeUsos());
    }
}