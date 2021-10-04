package contatos;

public class Program {

	public static void main(String[] args) {
		Estado estado1 = new Estado("Rio de Janeiro", "RJ");
		
		Cidades cidade1 = new Cidades("Nova Friburgo", estado1);
		
		Endereco endereco1 = new Endereco("Rua Arnaldo Bittencourt, n°65", "Centro", "28625-460", cidade1);
		
		Telefone telefone1 = new Telefone("22981217137");
		Telefone telefone2 = new Telefone("22999567322");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone1;
		telefones[1] = telefone2;
		
		Contato contato1 = new Contato("Bruno", endereco1, telefones);
		
		System.out.println("Nome: " + contato1.getNome());
		System.out.println("Endereço: " + contato1.getEndereco().obterEnderecoCompleto());
		contato1.mostrarTelefones();
		
		
		
	}

}
