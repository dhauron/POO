package mercado;

public class Eletrodomestico extends Produto{
	private String tensao;

	public Eletrodomestico(String nome, double valor, String tensao) {
		super(nome, valor);
		this.tensao = tensao;
	}

	public String getTensao() {
		return tensao;
	}

	public void setTensao(String tensao) {
		this.tensao = tensao;
	}

	@Override
	public String toString() {
		return "Eletrodomestico: " + nome + ", de tensão: " + getTensao();
	}
	 
	@Override
	public double vender(int quatidadeDeItens) {
		return this.getValor() * quatidadeDeItens;
	}
	
}
