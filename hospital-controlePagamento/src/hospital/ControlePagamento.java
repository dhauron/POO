package hospital;

public class ControlePagamento{
	protected double totalPago;


	public double getTotalPago() {
		return totalPago;
	}
	
	public void TotalPago(Plano plano) {
		this.totalPago += plano.getValorPago();
	}
}
