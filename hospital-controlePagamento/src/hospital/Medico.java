package hospital;

public class Medico extends Plano{
	protected String nome;
	private int crm;
	
	
	public Medico(String empresa, String nome, int crm) {
		super(empresa);
		this.nome = nome;
		this.crm = crm;
	}


	public String getNome() {
		return nome;
	}


	public int getCrm() {
		return crm;
	}
	
	@Override
	public double consultaPlano() {
		return this.valorPago = this.valorPago + (this.valorPago * 0.1);
	}
	
	@Override
	public String toString() {
		return "Médico: " + nome + " valor a ser pago: R$" + super.valorPago;
	}


	public double pagamentoAnestesia() {
		return 0;
	}
	
}
