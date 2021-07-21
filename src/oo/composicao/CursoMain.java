package oo.composicao;

public class CursoMain {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web");
		Curso curso3 = new Curso("React Native");
		
		curso1.adicionarAlunos(aluno1);
		curso1.adicionarAlunos(aluno2);
		curso2.adicionarAlunos(aluno1);
		curso2.adicionarAlunos(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
	
		
		for(Aluno aluno: curso2.alunos) {
			System.out.print("Curso: " + curso2.getNome() + " - ");
			System.out.println("Aluno: " + aluno.getNome());
		}
		
		System.out.println();
		
		System.out.println(aluno3.cursos.get(0).alunos);


		System.out.println();
		
		Curso pesquisarCurso = aluno1.obterCurso("Java Completo");
		
		if(pesquisarCurso != null) {
			System.out.println("Curso: " + pesquisarCurso.getNome());
		}
	}
	
}
