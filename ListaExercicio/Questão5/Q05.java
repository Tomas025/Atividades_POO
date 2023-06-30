import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		Scanner recebe = new Scanner(System.in);
		
		int quantidadeDegraus = 0;
		int printEspacos = 0;
		String asterisco = "*";
		
		System.out.println("Digite a Quantidade de degraus que você deseja: ");
		quantidadeDegraus = recebe.nextInt();
		
		recebe.close();
		printEspacos = quantidadeDegraus - 1;
		
		for(int i = 0; i < quantidadeDegraus; i ++) {
			for(int j = printEspacos; j > i; j --) {
				System.out.print(" ");
			}
			System.out.println(asterisco);
			asterisco += "*";
		}
	}

}
