package executavel;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		
		//Vamos usar o swing desktop
		String quantidadeDeCarros = JOptionPane.showInputDialog("Informe a quantidade de carros:");
		String quantidadeDePessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas:");
		
		double numeroDeCarros = Double.parseDouble(quantidadeDeCarros);
		double numeroDePessoas = Double.parseDouble(quantidadeDePessoas);
		
		int divisao = (int)(numeroDeCarros / numeroDePessoas);
		double resto = numeroDeCarros % numeroDePessoas;
		
		/*System.out.println(quantidadeDeCarros+" carros.");
		System.out.println(quantidadeDePessoas+" pessoas.");
		System.out.println("Divisão por pessoa: "+divisao);
		System.out.println("Sobrou: "+resto);*/
		
		int respostaDivisao = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		//Sim e ok:0, Não:1, Cancel:2, closed: -1
		if(respostaDivisao==0) {
			JOptionPane.showMessageDialog(null, "Divisão por pessoa: "+divisao);
		}
		
		int respostaResto = JOptionPane.showConfirmDialog(null, "Deseja ver quanto sobrou?");
		if(respostaResto==0) {
			JOptionPane.showMessageDialog(null, "Sobrou: "+resto);
		}
		

	}

}
