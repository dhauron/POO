package exerc�cioOficina;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		Proprietario proprietario1 = new Proprietario("Bruno");
		Carro carro1 = new Carro("Utilit�rio", LocalDate.of(2021, 8, 07), proprietario1, "Kombi branca");
		
		carro1.trocarOleo();
		carro1.revisao();
		
		System.out.println("Propriet�rio: " + proprietario1.getNome());
		System.out.println("Ve�culo: " + carro1.getCategoria() + carro1.toString());
		

	}

}
