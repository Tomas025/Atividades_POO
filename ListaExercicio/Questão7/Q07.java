
public class Q07 {
	
	public static void main(String[] args) {
		Heroi meuHeroi = new Heroi();
		
		meuHeroi.setNome("Kayden");
		meuHeroi.setMagiaMaxima(100);
		meuHeroi.setMagiaAtual(100);
		meuHeroi.setVidaMaxima(100);
		meuHeroi.setVidaAtual(100);
		
		System.out.println(meuHeroi.receberDano(10));
		System.out.println(meuHeroi.receberDano(85));
		System.out.println(meuHeroi.receberDano(10));
	}

}
