

public class Vaga {

	private String id;
	private boolean disponivel;

	public Vaga(String id, Integer numero) {
		this.id =id + String.format("%02d", numero);
		this.disponivel = true;
	}

	public boolean estacionar(){
		if(this.disponivel()){
			this.disponivel = false;
			return false;
		} else {
			return true;
		}
	}

	public boolean sair() {
		if(!this.disponivel()){
		this.disponivel = true;
		return true;
		} else {
			return false;
		}
	}

	public boolean disponivel() {
		return this.disponivel;
	}
	public String getID(){
		return this.id;
	}

}
