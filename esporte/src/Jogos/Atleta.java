package Jogos;

public class Atleta {
	public String nome;
	public Double peso;
	public String modalidade;
	public int totalParticipantes;
	public Pais país;
	
		
	public Atleta(String nome, Double peso, Pais país) {
		this.nome = nome;
		this.peso = peso;
		this.país = país;
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
	
	public Pais getPaís() {
		return país;
	}
	
	
	public void verificarSituacao() {
		if (peso > 90.00) {
		    System.out.println("Modalidade: peso pesado, participará");
		} else if(peso < 90.00 && peso >= 60.00) {
			System.out.println("Modalidade: peso médio, participará");
		} else if (peso < 60.00) {
			System.out.println("Não participará");
		}
		
	}
}
