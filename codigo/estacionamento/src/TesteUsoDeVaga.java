public class TesteUsoDeVaga {
    public static void main(String[] args) {
        // Criar uma instância da classe Vaga (substitua "Vaga" pelo nome da sua classe Vaga)
        Vaga vaga = new Vaga("A", 1);

        // Criar uma instância da classe UsoDeVaga
        UsoDeVaga usoDeVaga = new UsoDeVaga(vaga);

        // Chamar o método sair() para simular a saída do veículo
        double valorPago = usoDeVaga.sair();

        // Exibir o valor pago
        System.out.println("Valor pago: " + valorPago);
    }
}
