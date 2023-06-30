import java.util.Random;

public class Arvore {
	Random random = new Random();
	
	private int idade, idadeMaxima;
	private String nome;
	private double tamanho;
	private double aumentaTamanho;
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdadeMaxima() {
		return idadeMaxima;
	}
	public void setIdadeMaxima(int idadeMaxima) {
		this.idadeMaxima = idadeMaxima;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	public String Envelhecer() {
		if(this.idade < this.idadeMaxima) {
			this.idade ++;
			this.aumentaTamanho = random.nextDouble();
			this.tamanho += aumentaTamanho;
			return "Sua árvore envelheceu 1 ano e cresceu " + aumentaTamanho + " metros";
		} else {
			return "Sua árvore morreu ela não pode mais crescer";
		}
	}
}
