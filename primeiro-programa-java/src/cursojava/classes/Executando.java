package cursojava.classes;

import javax.swing.JOptionPane;

public class Executando {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Qual o Nome:");
		String idade = JOptionPane.showInputDialog("Qual a idade:");
		
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setIdade(Integer.valueOf(idade));
		
		Disciplina disciplinas = new Disciplina();
		
		disciplinas.setDisciplina("Banco de dados");
		disciplinas.setNota(90);
		aluno.getDisciplinas().add(disciplinas);
		
		Disciplina disciplinas2 = new Disciplina();
		
		disciplinas2.setDisciplina("JAVA");
		disciplinas2.setNota(80);
		aluno.getDisciplinas().add(disciplinas2);
		
		Disciplina disciplinas3 = new Disciplina();
		
		disciplinas3.setDisciplina("JWT");
		disciplinas3.setNota(98);
		aluno.getDisciplinas().add(disciplinas3);
		
		JOptionPane.showInternalMessageDialog(null, "Nome : "+aluno.getNome()+" e a idade é "+aluno.getIdade());
		
	}
}
