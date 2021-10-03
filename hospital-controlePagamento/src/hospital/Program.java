package hospital;

public class Program {

	public static void main(String[] args) {
		Clinica clinica1 = new Clinica("Unimed", "Serrana", "29.135.795/0003-99");
		Medico medico1 = new Medico("Unimed", "Thelma Assis", 876495);
		Anestesista anestesista1 = new Anestesista("Unimed", "Tereza Cristina", 972046, "local");
		ControlePagamento controlePagamento1 = new ControlePagamento();
		
		clinica1.consultaPlano();
		medico1.consultaPlano();
		anestesista1.consultaPlano();
		controlePagamento1.TotalPago(clinica1);
		controlePagamento1.TotalPago(medico1);
		controlePagamento1.TotalPago(anestesista1);
		
		System.out.println(clinica1.toString() + "\n");
		System.out.println(medico1.toString() + "\n");
		System.out.println(anestesista1.toString() + "\n");
		System.out.println("Total pago pelo plano de saúde: R$" + controlePagamento1.getTotalPago());
		
	}

}
