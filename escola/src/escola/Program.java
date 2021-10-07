package escola;


import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Ana", 0.,0.);
		Aluno aluno2 = new Aluno("João", 0.,0.);
		Aluno aluno3 = new Aluno("Maria", 0.,0.);
		Classe classe1 = new Classe();
		Integer contador1 = 0;
		Integer contador2 = 0;
		Integer contador3 = 0;
					
		
		Scanner ler = new Scanner(System.in);
		classe1.cadastraAluno(aluno1,ler,contador1);
		classe1.adicionaAlunoNaClasse(aluno1);
		Scanner ler2 = new Scanner(System.in);
		classe1.cadastraAluno(aluno2,ler2,contador2);
		classe1.adicionaAlunoNaClasse(aluno2);
		Scanner ler3 = new Scanner(System.in);
		classe1.cadastraAluno(aluno3,ler3,contador3);
		classe1.adicionaAlunoNaClasse(aluno3);
		
		classe1.mostraClasse();
}
}	
