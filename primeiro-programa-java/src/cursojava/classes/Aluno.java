package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	private double media;
	
	
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	//O Java cria esse construtor, mesmo não colocando aqui
	/*public Aluno(String nomePadrao) {
		this.nome=nomePadrao;
	}*/
	//Pode se criar mais de um construtor
	/*public Aluno(String nomePadrao, int idadePadrao) {
		this.nome=nomePadrao;
		this.idade=idadePadrao;
	}*/
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
	
	
	//Método que retorno a média do aluno
	public double getMediaNota() {
		this.media = 2;//(this.nota1+this.nota2+this.nota3+this.nota4)/4;
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
	
	@Override
	public int hashCode() {
		return Objects.hash(dataMatricula, dataNascimento, idade, media, nome, nomeEscola, nomeMae, nomePai,numeroCPF, registroGeral, seriematriculado);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(dataMatricula, other.dataMatricula)
				&& Objects.equals(dataNascimento, other.dataNascimento) && idade == other.idade
				&& Double.doubleToLongBits(media) == Double.doubleToLongBits(other.media)
				&& Objects.equals(nome, other.nome) && Objects.equals(nomeEscola, other.nomeEscola)
				&& Objects.equals(nomeMae, other.nomeMae) && Objects.equals(nomePai, other.nomePai)
				&& Objects.equals(numeroCPF, other.numeroCPF) && Objects.equals(registroGeral, other.registroGeral)
				&& Objects.equals(seriematriculado, other.seriematriculado);
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", seriematriculado="
				+ seriematriculado + ", media=" + media + "]";
	}
	
	//Equals e hashcode se para difernciar e comparar um objeto do outro
	//Se não faz isso para sobreescrever, o java vai usar a referencia de memória, ou seja, será sempre diferente
	
	
	
	
	
	
	
	
	
	
}
