
public class Q06 {

	public static void main(String[] args) {
		Arvore minhaArvore = new Arvore();
		
		minhaArvore.setNome("Pessegueiro");
		minhaArvore.setIdade(28);
		minhaArvore.setIdadeMaxima(30);
		minhaArvore.setTamanho(3);
		
		for(int i = 0; i < 4; i ++) {
			System.out.println(minhaArvore.Envelhecer());			
		}
		
	}

}
