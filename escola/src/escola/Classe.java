package escola;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Classe {
	private List<Aluno> alunos;
	private Double alteranota1 = 0.;
	private Double alteranota2 = 0.;
	
	
	
	public  void cadastraAluno(Aluno aluno, Scanner ler, Integer contador) {
		
								
		System.out.println("Insira a primeira nota do(a) aluno(a) " + aluno.getNome() + " : ");
		alteranota1 = ler.nextDouble();			
		aluno.setNota1(alteranota1);
		
		System.out.println("Insira a segunda nota do(a) aluno(a) "+ aluno.getNome() + " : ");
		alteranota2 = ler.nextDouble();
		aluno.setNota2(alteranota2);
		
		do {
			try {
				
					aluno.mediaNota();
					System.out.println("A média de " + aluno.getNome() + " é: " + aluno.mediaNota());
					contador+=1;
				
			}catch(AlunoException erro) {
				
				System.out.println(erro.getMessage()); 
				
				System.out.println("Insira uma nota válida (entre 0 e 1): ");
				alteranota1 = ler.nextDouble();			
				aluno.setNota1(alteranota1);
				
				System.out.println("Insira uma nota válida (entre 0 e 1): ");
				alteranota2 = ler.nextDouble();
				aluno.setNota2(alteranota2);
							
				
			}		
			
		}while(alteranota1>10.0 || alteranota1<0.0 || alteranota2>10.0 || alteranota2<0.0 || contador == 0);

		
		
	}
	
	public void adicionaAlunoNaClasse(Aluno alunos) {
		this.alunos.add(alunos);
	}
	
	public void mostraClasse() {
		System.out.println("Alunos da classe: \n "+ this.alunos);
		
	}
	

	public Classe() {
		super();
		this.alunos = new ArrayList<Aluno>();
				
	}
				
}	
