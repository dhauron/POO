package contatos;

public class Contato {
	private String nome;
	private Endereco endereco;
	private Telefone[] telefones;
		
	public Contato(String nome, Endereco endereco, Telefone[] telefones) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefones = telefones;
	}

	public String getNome() {
		return nome;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Telefone[] getTelefones() {
		return telefones;
	}
	
	
	public void mostrarTelefones() {
		for(int i = 0; i < telefones.length; i++) {
			System.out.println("Telefone: " + telefones[i].getNumero());
		}
	}
	
	
}

