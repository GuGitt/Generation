package fam;

public abstract class Animal {
	
	private String nome;
	private String movimentar;
	private String emitirSom;
	
	public void emitirSom() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMovimentar() {
		return movimentar;
	}

	public void setMovimentar(String movimentar) {
		this.movimentar = movimentar;
	}

	public String getEmitirSom() {
		return emitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}
}
