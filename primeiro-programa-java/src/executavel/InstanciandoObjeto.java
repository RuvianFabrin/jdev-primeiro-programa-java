package executavel;

import cursojava.classes.Aluno;

public class InstanciandoObjeto {

	public static void main(String[] args) {
		//Objeto ainda n�o existe na mem�ria
		//Aluno aluno1;

		//Agora temos um objeto instanciado na mem�ria
		Aluno aluno2 = new Aluno("Jo�o");
		aluno2.setIdade(22);
		
		Aluno aluno3 = new Aluno("Jos�",23);
		aluno3.setNomeMae("Maria");
	}

}
