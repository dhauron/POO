package hospital;

public class Anestesista extends Medico {
	private String tipoAnestesia;

	public Anestesista(String empresa, String nome, int crm, String tipoAnestesia) {
		super(empresa, nome, crm);
		this.tipoAnestesia = tipoAnestesia;
	}

	public String getTipoAnestesia() {
		return tipoAnestesia;
	}

	public void setTipoAnestesia(String tipoAnestesia) {
		this.tipoAnestesia = tipoAnestesia;
	}
	
	@Override
	public double pagamentoAnestesia() {
		return this.valorPago = super.consultaPlano() + 1000.00;
	}
	
	@Override
	public String toString() {
		return "Tipo de anestesia: " + tipoAnestesia + ", Médico: " + nome + ", valor: R$" + pagamentoAnestesia();
	}
}
