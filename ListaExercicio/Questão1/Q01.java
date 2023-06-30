import java.util.Scanner;
import java.util.Random;

public class Q01 {
	
	public static void main(String[] args) {
		 Scanner recebe = new Scanner(System.in);
		 Random random = new Random();
		 
		 int valor = 0;
		 int menorValor = 0;
		 int quantidadePares = 0;
		 int numRandom = random.nextInt(11);
		 
		 for(int i = 0; i < 3; i++) {
			 System.out.println("Digite um n�mero: ");
			 valor = recebe.nextInt();
			 
			 if(i == 0) {
				 menorValor = valor;
			 } else if(valor < menorValor) {
				 menorValor = valor;
			 }
			 
			 if(valor % 2 == 0 ) {
				 quantidadePares ++;
			 }
		 }
		 
		 recebe.close();

		 System.out.println("O menor valor dentre os n�meros digitados foi " + menorValor);
		 System.out.println("Dentre os n�meros que voc� digitou haviam " + quantidadePares + " n�meros pares");
		 
		 if(menorValor % numRandom == 0) {
			 System.out.println("O menor dentre os n�meros que foram digitados � divis�vel pelo n�mero aleatorio");
		 } else {
			 System.out.println("O menor dentre os n�meros que foram digitados n�o � divis�vel pelo n�mero aleatorio");
		 }
		  
	}

}
