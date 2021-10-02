package empresa;

public class Gerente extends Funcionario{
	protected String nivel;

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}
	
	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public double adicional() {
		return (this.salario += this.salario * 0.1) + 200.00;
	}
	
}
