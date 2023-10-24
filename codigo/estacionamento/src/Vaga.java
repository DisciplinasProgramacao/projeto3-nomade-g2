public class Vaga {

	private String id;
	private boolean disponivel;

	public Vaga(int i, Integer numero) {
		this.id =i + String.format("%02d", numero);
		this.disponivel = true;
	}

	public Vaga(int i, int numero) {
    }

    nivel(){
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
