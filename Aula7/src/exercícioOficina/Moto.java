package exerc�cioOficina;

import java.time.LocalDate;

public class Moto extends Veiculo{
	private int cilindradas;

	public Moto(String modelo, LocalDate dataConcerto, Proprietario propriet�rio, int cilindradas) {
		super(modelo, dataConcerto, propriet�rio);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	@Override
	public double lavarVeiculo() {
		return TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public double trocarOleo() {
		return TipoServico.OLEO.getValorPorServico();
	}

	@Override
	public double revisao() {
		return TipoServico.REVISAO.getValorPorServico();
	}
	
	
	
}
