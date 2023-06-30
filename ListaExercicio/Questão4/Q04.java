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
			System.out.println(ano + " não é um ano válido");
		} else if (leapYear.isLeapYear()) {
			System.out.println(ano + " é bissexto");
		} else {
			System.out.println(ano + " não é bissexto");
		}
		
	}

}
