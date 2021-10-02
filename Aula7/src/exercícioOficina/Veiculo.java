package exercícioOficina;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina{
	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConcerto;
	protected Proprietario proprietário;
	
	public Veiculo(String modelo, LocalDate dataConcerto, Proprietario proprietário) {
	
		this.modelo = modelo;
		this.dataConcerto = dataConcerto;
		this.proprietário = proprietário;
	}

	public double getValorCobrado() {
		return valorCobrado;
	}

	@Override
	public String toString() {
		return " modelo " + modelo + ", valor cobrado = R$ " + valorCobrado; 
	}
}
