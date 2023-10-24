public class VagaTest {

    public static void main(String[] args) {
        testEstacionar();
        testSair();
        testIsDisponivel();
        testGetId();
    }

    public static void testEstacionar() {
        Vaga vaga = new Vaga("A", 1);
        if (vaga.estacionar()) {
            System.out.println("Teste de estacionar: PASSOU");
        } else {
            System.out.println("Teste de estacionar: FALHOU");
        }
    }

    public static void testSair() {
        Vaga vaga = new Vaga("A", 1);
        if (!vaga.sair()) {
            System.out.println("Teste de sair: PASSOU");
        } else {
            System.out.println("Teste de sair: FALHOU");
        }
    }

    public static void testIsDisponivel() {
        Vaga vaga = new Vaga("A", 1);
        if (vaga.disponivel()) {
            System.out.println("Teste de isDisponivel: PASSOU");
        } else {
            System.out.println("Teste de isDisponivel: FALHOU");
        }
    }

    public static void testGetId() {
        Vaga vaga = new Vaga("A", 1);
        if ("A01".equals(vaga.getID())) {
            System.out.println("Teste de getId: PASSOU");
        } else {
            System.out.println("Teste de getId: FALHOU");
        }
    }
}
