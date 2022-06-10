package cursojava.classes;

public class Aluno {
	String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCPF;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	
	//O Java cria esse construtor, mesmo não colocando aqui
	public Aluno(String nomePadrao) {
		this.nome=nomePadrao;
	}
	//Pode se criar mais de um construtor
	public Aluno(String nomePadrao, int idadePadrao) {
		this.nome=nomePadrao;
		this.idade=idadePadrao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCPF() {
		return numeroCPF;
	}
	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	
	
	
	
	
}
