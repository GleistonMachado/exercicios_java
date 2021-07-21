package oo.composicao;

import java.util.ArrayList;

public class Aluno {
	
	private final String nome;
	final ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	Curso obterCurso(String nome) {
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		
		return null;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	public String toString() {
		return getNome();
	}

	public String getNome() {
		return nome;
	}
	
}
