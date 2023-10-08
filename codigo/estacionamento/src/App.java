public class App {
    public static void main(String[] args) throws Exception {
        Vaga vaga1 = new Vaga("A", 10);
        System.out.println(vaga1.getID());
        System.out.println(vaga1.estacionar());
        UsoDeVaga usodevaga = new UsoDeVaga(vaga1);
        System.out.println(usodevaga.sair());
        System.out.println(vaga1.disponivel());
    }
}
