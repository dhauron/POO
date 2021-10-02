package empresa;

public class Assistente extends Funcionario {
	protected double adicional;

	public Assistente(String nome, double salario, double adicional) {
		super(nome, salario);
		this.adicional = adicional;
	}
	public double adicionalAssistente() {
		return (this.salario += this.salario * 0.1) + adicional;
	}
}
