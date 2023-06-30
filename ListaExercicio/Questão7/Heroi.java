
public class Heroi {
	private int vidaAtual, vidaMaxima, magiaAtual, magiaMaxima;
	private String nome;
	
	public int getVidaAtual() {
		return vidaAtual;
	}
	public void setVidaAtual(int vidaAtual) {
		this.vidaAtual = vidaAtual;
	}
	public int getVidaMaxima() {
		return vidaMaxima;
	}
	public void setVidaMaxima(int vidaMaxima) {
		this.vidaMaxima = vidaMaxima;
	}
	public int getMagiaAtual() {
		return magiaAtual;
	}
	public void setMagiaAtual(int magiaAtual) {
		this.magiaAtual = magiaAtual;
	}
	public int getMagiaMaxima() {
		return magiaMaxima;
	}
	public void setMagiaMaxima(int magiaMaxima) {
		this.magiaMaxima = magiaMaxima;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String receberDano(int dano) {
		if(this.vidaAtual == 0) {
			return this.nome + " não pode receber mais dano, ele já esta morto!";
		} else {
			this.vidaAtual -= dano;			
		}
		
		if(this.vidaAtual <= 0) {
			this.vidaAtual = 0;
			return this.nome + " morreu!";
		} else if(this.vidaAtual <= 5) {
			return "CUIDADO! " + this.nome + " esta a beira da morte";
		} else {
			return this.nome + " perdeu vida e agora esta com " + this.vidaAtual + " pontos de vida";
		}
	}
	
	public String usarMagia(int quantidade) {
		this.magiaAtual -= quantidade;
		
		if(this.magiaAtual <= 0) {
			this.magiaAtual = 0;
			return "Mana insuficiente!";
		} else if(this.magiaAtual <= 5) {
			return "CUIDADO! " + this.nome + " esta quase sem mana";
		} else {
			return this.nome + " utilizou " + quantidade + " pontos de mana";
		}
	}
	
	public String recuperarVida(int quantidade) {
		this.vidaAtual += quantidade;
		
		if(this.vidaAtual >= this.vidaMaxima) {
			this.vidaAtual = this.vidaMaxima;
			return this.nome + " esta totalmente recuperado!";
		} else {
			return this.nome + " recuperou " + quantidade + " pontos de vida";
		}
	}
	
	public String recuperarMagia(int quantidade) {
		if(this.magiaAtual == this.magiaMaxima) {
			return "Impossivel recuperar mana " + this.nome + " já esta com a mana cheia";
		} else {
			this.magiaAtual += quantidade;			
		}
		
		if(this.magiaAtual >= this.magiaMaxima) {
			this.magiaAtual = this.magiaMaxima;
			return this.nome + " recuperou sua mana completamente!";
		} else {
			return this.nome + " recuperou " + quantidade + " pontos de mana";
		}
	}

}
