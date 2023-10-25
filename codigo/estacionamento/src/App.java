public class App {
    public static void main(String[] args) throws Exception {

        Estacionamento xulambsAvenida = new Estacionamento("Afonso Pena", 8, 2);
        xulambsAvenida.addVagas(8,2);
        
        Cliente clienteA = new Cliente("Joana", 12345);
        Veiculo honda = new Veiculo(clienteA, "CBA123");
        clienteA.addVeiculo(honda);

        Vaga vagaY8 = new Vaga(4,1);
        UsoDeVaga uso = new UsoDeVaga(vagaY8);        

        uso.estacionar(15);
        System.out.println("Valor a pagar: " + uso.sair(45));

        System.out.println("A placa informada pertence ao cliente? " + clienteA.possuiVeiculo("ABC123"));
        clienteA.listarVeiculosCadastrados();
    }
}