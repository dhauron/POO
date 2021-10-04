package mercado;

public class Program {

	public static void main(String[] args) {
		Bebida bebida1 = new Bebida("Cerveja", 12.00, "4%");
		Bebida bebida2 = new Bebida("Vinho", 150.00, "6%");
		Eletrodomestico  eletrodomestico1 = new Eletrodomestico("Tv", 2000.00, "bivolt");
		Eletrodomestico  eletrodomestico2 = new Eletrodomestico("Geladeira", 2352.64, "bivolt");
		Eletrodomestico  eletrodomestico3 = new Eletrodomestico("Rádio", 837.59, "220v");
		
		System.out.println(bebida1.toString() + ", total: R$" + bebida1.vender(5) + "\n");
		System.out.println(bebida2.toString() + ", total: R$" + bebida2.vender(3) + "\n");
		System.out.println(eletrodomestico1.toString() + ", total: R$" +eletrodomestico1.vender(9) + "\n");
		System.out.println(eletrodomestico2.toString() + ", total: R$" +eletrodomestico2.vender(3) + "\n");
		System.out.println(eletrodomestico3.toString() + ", total: R$" +eletrodomestico3.vender(1));
	}

}
