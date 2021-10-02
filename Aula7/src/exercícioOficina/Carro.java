package exercícioOficina;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo{
	private String categoria;

	public Carro(String modelo, LocalDate dataConcerto, Proprietario proprietário, String categoria) {
		super(modelo, dataConcerto, proprietário);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public double lavarVeiculo() {
		return valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public double trocarOleo() {
		double valorOleo = TipoServico.OLEO.getValorPorServico();
		if(dataConcerto.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
		valorCobrado -= 50;
		}return valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico();
	}

	@Override
	public double revisao() {
		double valorRevisao = TipoServico.REVISAO.getValorPorServico();
		if(dataConcerto.getMonth().equals(Month.AUGUST)) {
			valorCobrado -= valorRevisao * 0.1;
		}return valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico();
	}
	
	
}
