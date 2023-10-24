public class Vaga {

	private String id;
	private boolean disponivel;

	public Vaga(String fila, Integer numero) {
		this.id =fila + String.format("%02d", numero);
		this.disponivel = true;
	}

	public boolean estacionar() {
		if(this.disponivel()){
		this.disponivel = false;
		return true;
	}
		return false;
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

}
