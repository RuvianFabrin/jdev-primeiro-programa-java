package executavel;

public class VariavelLocalEGlobal {

	static int maiorIdadeGlobal = 30;//Acess�vel a todos, coloque o static
	public static void main(String[] args) {
		int maiordeIdade = 18;//Vari�vel local
		
		System.out.println("Local : "+maiordeIdade);
		metodo2();
		maiorIdadeGlobal = 20;//alterado a variavel global
		metodo2();

	}
	
	public static void metodo2() {
		System.out.println("Global: "+(maiorIdadeGlobal+5));
	}

}
