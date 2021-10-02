package exerc�cioOficina;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina{
	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConcerto;
	protected Proprietario propriet�rio;
	
	public Veiculo(String modelo, LocalDate dataConcerto, Proprietario propriet�rio) {
	
		this.modelo = modelo;
		this.dataConcerto = dataConcerto;
		this.propriet�rio = propriet�rio;
	}

	public double getValorCobrado() {
		return valorCobrado;
	}

	@Override
	public String toString() {
		return " modelo " + modelo + ", valor cobrado = R$ " + valorCobrado; 
	}
}
