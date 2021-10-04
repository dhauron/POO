package contatos;

public class Endereco {
	private String rua;
	private String bairro;
	private String cep;
	private Cidades cidade;
	
	public Endereco(String rua, String bairro, String cep, Cidades cidade) {
		this.rua = rua;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCep() {
		return cep;
	}

	public Cidades getCidade() {
		return cidade;
	}
	
	public String obterEnderecoCompleto() {
		
		return String.format("%s - %s - %s, ", 
		this.getRua(), this.getBairro(), this.getCep());
	}
	
}


