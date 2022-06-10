package cursojava.classes;

public class Aluno {
	//Atributos do Aluno
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCPF;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String seriematriculado;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	private double media;
	
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
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getSeriematriculado() {
		return seriematriculado;
	}
	public void setSeriematriculado(String seriematriculado) {
		this.seriematriculado = seriematriculado;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	//Método que retorno a média do aluno
	public double getMediaNota() {
		this.media = (this.nota1+this.nota2+this.nota3+this.nota4)/4;
		return this.media;
	} 
	
	public String getResultado() {
		String resultado = "";
		if(this.media>=50) {
			resultado=(this.media>=70)?"Aprovado. ":"Em Recuperação. ";
		}else {
			resultado="Reprovado. ";
		}
		return resultado;
	}
	
	
	
	
	
}
