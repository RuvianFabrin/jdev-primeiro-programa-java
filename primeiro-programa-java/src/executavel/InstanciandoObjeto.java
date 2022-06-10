package executavel;

import cursojava.classes.Aluno;

public class InstanciandoObjeto {

	public static void main(String[] args) {
		//Objeto ainda não existe na memória
		//Aluno aluno1;

		//Agora temos um objeto instanciado na memória
		Aluno aluno2 = new Aluno("João");
		aluno2.setIdade(22);
		
		//caso você coloque aluno3 = null | dara o erro null pointer excepetion que é muito comum
		//Ainda mais quando tem um objeto dentro do outro
		Aluno aluno3 = new Aluno("José",23);
		aluno3.setNomeMae("Maria");
		aluno3.setNota1(20.1);
		aluno3.setNota2(80.6);
		aluno3.setNota3(50.9);
		aluno3.setNota4(70.3);
		System.out.println("Sua media é: "+aluno3.getMediaNota()+" e você está "+aluno3.getResultado());
		
		//new Aluno() é uma instância de objeto
		
		//aluno2 é uma variável que faz referência ao objeto Aluno
		
		//no console mostra a linha que deu o erro
		//E aí faça o debug
		
		
	}

}
