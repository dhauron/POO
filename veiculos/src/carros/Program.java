package carros;

import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		Map<String, String> carros = new HashMap<String, String>();
		carros.put("Ford", "Focus");
		carros.put("Jeep", "Renegate");
		carros.put("Volkswagen", "Polo");
		carros.put("Fiat", "Uno");
		
		for (String marcas : carros.keySet()) {
			System.out.println(marcas);
		}
		
		System.out.println("\n");
		
		for (Map.Entry<String, String> modelos : carros.entrySet()) {
			System.out.println(modelos);
		}
	}
	

}
