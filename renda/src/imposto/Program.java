package imposto;

public class Program {

	public static void main(String[] args) {
		PessoaFisica fisica = new PessoaFisica("Bruno", 1500.00, "05783180750", "341421210");
		PessoaJuridica juridica = new PessoaJuridica("Alter Data", 10000.00, "156483183", "8731864");
		
		System.out.println(fisica.getNome());
		System.out.println("Imposto a ser pago: " + fisica.calcularIR());

		System.out.println(juridica.getNome());
		System.out.println("Imposto a ser pago: " + juridica.calcularIR());
	}

}
