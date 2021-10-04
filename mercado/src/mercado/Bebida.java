package mercado;

public class Bebida extends Produto{
	private String teorAlcolico;

	public Bebida(String nome, double valor, String teorAlcolico) {
		super(nome, valor);
		this.teorAlcolico = teorAlcolico;
	}

	public String getTeorAlcolico() {
		return teorAlcolico;
	}

	public void setTeorAlcolico(String teorAlcolico) {
		this.teorAlcolico = teorAlcolico;
	}

	@Override
	public String toString() {
		return "Bebida: " + nome + ", de teor alcolico: " + getTeorAlcolico();
	}

	@Override
	public double vender(int quatidadeDeItens) {
		return this.getValor() * quatidadeDeItens;
	}
	
}
