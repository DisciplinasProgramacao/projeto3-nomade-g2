public class Vaga {

	private String id;
	private boolean disponivel;
	private UsoDeVaga uso;

	public Vaga(int fileira, int posicao) {
		this.id ="Fila: " + fileira + ", Vaga: " + posicao;
		this.disponivel = false;
	}

	public boolean sair() {
		if(!this.disponivel()){
		this.disponivel = true;
		return true;
		}
		return false;
	}

	public boolean disponivel() {
		return this.disponivel;
	}

	public String getID(){
		return this.id;
	}

	public String estacionar(Veiculo veiculo, Vaga vaga) {
		return "Veículo estacionado!";
	}

}
