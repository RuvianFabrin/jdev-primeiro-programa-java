package executavel;

import javax.swing.JOptionPane;

public class CalcularMedia {

	public static void main(String[] args) {
		String nota1 = JOptionPane.showInputDialog("Informe a nota 1:");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2:");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3:");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4:");
		
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		
		double media = (dNota1+dNota2+dNota3+dNota4)/4;
		//Menor que 50 está reprovado
		//Entre 50 e 69 está em recuperação
		//Maior ou igual a 70 está aprovado
		String resultado = "";
		if(media>=50) {
			resultado=(media>=70)?"Aprovado. ":"Em Recuperação. ";
		}else {
			resultado="Reprovado. ";
		}
		
		JOptionPane.showInternalMessageDialog(null, resultado+"A média é: "+media);

	}

}
