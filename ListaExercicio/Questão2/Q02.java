import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner recebe = new Scanner(System.in);
		
		int idade = 0;
		
		System.out.println("Digite a idade de um jogador: ");
		idade = recebe.nextInt();
		
		recebe.close();
		
		if(idade == 14 || idade == 15) {
			System.out.println("seu jogador esta classificado na categoria infantil");
		} else if(idade == 16 || idade == 17) {
			System.out.println("seu jogador esta classificado na categoria juvenil");
		} else if(idade >= 18 && idade <= 20) {
			System.out.println("seu jogador esta classificado na categoria júnior");
		} else if(idade == 42) {
			System.out.println("seu jogador esta classificado na categoria TRANSCENDIA MAXIMA");
		} else if(idade > 20) {
			System.out.println("seu jogador esta classificado na categoria profissional");
		} else {
			System.out.println("A idade digitada não esta classificada");
		}
	}

}
