package executavel;

import cursojava.classes.Aluno;

public class InstanciandoObjeto {

	public static void main(String[] args) {
		//Objeto ainda não existe na memória
		//Aluno aluno1;

		//Agora temos um objeto instanciado na memória
		Aluno aluno2 = new Aluno("João");
		aluno2.setIdade(22);
		
		Aluno aluno3 = new Aluno("José",23);
		aluno3.setNomeMae("Maria");
	}

}
