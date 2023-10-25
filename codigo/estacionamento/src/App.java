public class App {
    public static void main(String[] args) {
        Estacionamento xulambsAvenida = new Estacionamento("Afonso Pena", 5, 3);

        Cliente clienteJoana = new Cliente("Joana", 12345);
        Veiculo jeep = new Veiculo(clienteJoana, "CBA123");
        UsoDeVaga usoJoana = new UsoDeVaga(xulambsAvenida.getVagas().get(0), 1);
        usoJoana.estacionar(0);
        jeep.setVaga(usoJoana);
        clienteJoana.addVeiculo(jeep);
        xulambsAvenida.addCliente(clienteJoana);

        Cliente clienteHoracio = new Cliente("Horacio", 54321);
        Veiculo civic = new Veiculo(clienteHoracio, "XYZ789");
        UsoDeVaga usoHoracio = new UsoDeVaga(xulambsAvenida.getVagas().get(1), 1); 
        usoHoracio.estacionar(0);
        
        int horaSaida = 120;
        usoHoracio.sair(horaSaida);
        
        civic.setVaga(usoHoracio);
        clienteHoracio.addVeiculo(civic);
        xulambsAvenida.addCliente(clienteHoracio);

        System.out.println("Total arrecadado: R$" + xulambsAvenida.totalArrecadado());
        System.out.println("Arrecadação no mês 1: R$" + xulambsAvenida.arrecadacaoNoMes(1));
        System.out.println("Valor médio por uso: R$" + xulambsAvenida.valorMedioPorUso());
        System.out.println("Top 5 clientes no mês 1:");
        System.out.println(xulambsAvenida.top5Clientes(1));
    }
}