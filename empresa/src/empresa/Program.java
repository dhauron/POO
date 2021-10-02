package empresa;

public class Program {

	public static void main(String[] args) {
		Gerente gerente1 = new Gerente("Ana", 5000.00);
		Assistente assistente1 = new Assistente("Maria", 1000.00, 50.00);
		
		gerente1.toString();
		assistente1.toString();
		
		System.out.println(gerente1.toString() + ", salario com adicional: R$ " + gerente1.adicional());
		System.out.println(assistente1.toString() + ", salario com adicional: R$ " + assistente1.adicionalAssistente());

	}

}
