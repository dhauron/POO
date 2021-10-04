package Jogos;

public class Atleta {
	public String nome;
	public Double peso;
	public String modalidade;
	public int totalParticipantes;
	public Pais pa�s;
	
		
	public Atleta(String nome, Double peso, Pais pa�s) {
		this.nome = nome;
		this.peso = peso;
		this.pa�s = pa�s;
	}
	
	public String getModalidade() {
		return modalidade;
	}
	
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Double getPeso() {
		return peso;
	}
	
	public Integer getTotalParticipantes() {
		return totalParticipantes;
	}
	
	public Pais getPa�s() {
		return pa�s;
	}
	
	
	public void verificarSituacao() {
		if (peso > 90.00) {
		    System.out.println("Modalidade: peso pesado, participar�");
		} else if(peso < 90.00 && peso >= 60.00) {
			System.out.println("Modalidade: peso m�dio, participar�");
		} else if (peso < 60.00) {
			System.out.println("N�o participar�");
		}
		
	}
}
