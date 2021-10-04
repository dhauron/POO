package contatos;

public class Cidades {
	private String nome;
	private Estado estado;
	
	public Cidades(String nome, Estado estado) {
		super();
		this.nome = nome;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public Estado getEstado() {
		return estado;
	}
}
