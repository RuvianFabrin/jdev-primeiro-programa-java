package cursojava.classes;

import javax.swing.JOptionPane;

public class Executando {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Qual o Nome:");
		String idade = JOptionPane.showInputDialog("Qual a idade:");
		
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setIdade(Integer.valueOf(idade));
		
		JOptionPane.showInternalMessageDialog(null, "Nome : "+aluno.getNome()+" e a idade é "+aluno.getIdade());
		
	}
}
