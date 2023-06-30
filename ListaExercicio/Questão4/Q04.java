import java.util.Scanner;

public class Q04 {
	
	public static void main(String[] args) {
		Scanner recebe = new Scanner(System.in);
		VerifyLeapYear leapYear = new VerifyLeapYear();
		
		int ano = 0;
		
		System.out.println("Digite um ano: ");
		ano = recebe.nextInt();
		
		leapYear.setYear(ano);
		
		recebe.close();
		
		if(ano < 0) {
			System.out.println(ano + " n�o � um ano v�lido");
		} else if (leapYear.isLeapYear()) {
			System.out.println(ano + " � bissexto");
		} else {
			System.out.println(ano + " n�o � bissexto");
		}
		
	}

}
