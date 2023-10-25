public class App {
    public static void main(String[] args) throws Exception {

        Estacionamento xulambsAvenida = new Estacionamento("Afonso Pena", 15);
        
        Vaga vagaY8 = new Vaga(4,1);
        
        xulambsAvenida.addVaga(vagaY8);
        
        Cliente clienteA = new Cliente("Joana", 12345);
        
        xulambsAvenida.addCliente(clienteA);
        Veiculo honda = new Veiculo(clienteA, "CBA123");
        clienteA.addVeiculo(honda);
        
        

        UsoDeVaga uso = new UsoDeVaga(vagaY8);        

        uso.estacionar(0);
        System.out.println("Valor a pagar: R$" + uso.sair(60));

        System.out.println("A placa informada pertence ao cliente? " + clienteA.possuiVeiculo("ABC123"));
        clienteA.listarVeiculosCadastrados();
    }
}