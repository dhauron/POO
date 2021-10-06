package aula;

public class Program {

	public static void main(String[] args) {
		Funcionario funcionarios[] = new Funcionario [2];
		funcionarios[0] = new Funcionario();
		funcionarios[0].setNome("Bruno");
		funcionarios[0].setCargo("Assistente");
		funcionarios[0].setSalario(1000.00);
		
		funcionarios[1] = new Funcionario();
		funcionarios[1].setNome("Ana");
		funcionarios[1].setCargo("Gerente");
		funcionarios[1].setSalario(2000.00);
		
		for (int i = 0; i < funcionarios.length; i++) {
			System.out.println("Nome: " + funcionarios[i].getNome() + ", cargo: " + funcionarios[i].getCargo()
			+ ", salário com abono: " + funcionarios[i].abonoSalario(200));
			 
		}

	}

}
