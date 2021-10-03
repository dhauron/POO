package hospital;

public class Plano {
	protected String empresa;
	protected double valorPago = 80;
	protected double valorIss = 5;
	
	
	public Plano(String empresa) {
		this.empresa = empresa;
	}


	public double getValorPago() {
		return valorPago;
	}
	
	public double consultaPlano() {
		return this.valorPago = this.valorPago - (this.valorPago * this.valorIss/100);
	}
	
	@Override
	public String toString() {
		return "Plano: " + empresa + ", valor a ser pago: R$" + valorPago;
	}
}
