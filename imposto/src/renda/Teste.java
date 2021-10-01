package renda;

public class Teste {

	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("Bruno","de Paula", 1000.00);
		Empregado empregado2 = new Empregado("Pedro","Salerno", 2000.00);
		
		System.out.println("Nome: " + empregado1.getNome());
		System.out.println("Sobrenome: " + empregado1.getSobrenome());
		System.out.println("Sal�rio: " + empregado1.getSalario());
		System.out.println("Sal�rio com desconto: " + empregado1.calculaImpostoDeRenda() + "\n");
		
		System.out.println("Nome: " + empregado2.getNome());
		System.out.println("Sobrenome: " + empregado2.getSobrenome());
		System.out.println("Sal�rio: " + empregado2.getSalario());
		System.out.println("Sal�rio com desconto: " + empregado2.calculaImpostoDeRenda());
	}

}
	

  