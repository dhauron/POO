package Jogos;

public class TestaAtleta {

	public static void main(String[] args) {
	Pais pais1 = new Pais("Brasil");
	Pais pais2 = new Pais("Argentina");
	
	Atleta atleta1 = new Atleta("Acelino de Freitas", 91.00 , pais1);
	Atleta atleta2 = new Atleta("Victor Galindez", 76.00 , pais2);
	Atleta atleta3 = new Atleta("Eduardo Pará", 59.00 , pais1);
	
	
	System.out.println("País: " + pais1.getPaís() + ", nome do atleta: " + atleta1.getNome());
	atleta1.verificarSituacao();
	System.out.println("\nPaís: " + pais2.getPaís() + ", nome do atleta: " + atleta2.getNome());
	atleta2.verificarSituacao();
	System.out.println("\nPaís: " + pais1.getPaís() + ", nome do atleta: " + atleta3.getNome());
	atleta3.verificarSituacao();
	
	}

}
