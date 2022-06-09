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
		
		JOptionPane.showMessageDialog(null, "Divisão por pessoa: "+divisao);
		JOptionPane.showMessageDialog(null, "Sobrou: "+resto);

	}

}
