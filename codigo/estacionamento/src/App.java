public class App {
    public static void main(String[] args) throws Exception {
        Vaga vaga1 = new Vaga("A", 10);
        System.out.println("Id da vaga: " + vaga1.getID());
        System.out.println("Confirmar estacionamento: " + vaga1.estacionar());
        UsoDeVaga usodevaga = new UsoDeVaga(vaga1);
        System.out.println("Confirmar saída de veículo: " + usodevaga.sair());
        System.out.println("Confirmar vaga disponível: " + vaga1.disponivel());
    }
}
