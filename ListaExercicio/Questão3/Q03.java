import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner recebe = new Scanner(System.in);
		int a, b, c = 0;
		double delta, x1, x2 = 0;
		
		System.out.println("Digite o valor A da equação de segundo grau: ");
		a = recebe.nextInt();
		
		System.out.println("Digite o valor B da equação de segundo grau: ");
		b = recebe.nextInt();
		
		System.out.println("Digite o valor C da equação de segundo grau: ");
		c = recebe.nextInt();
		
		recebe.close();
		
		delta = (Math.pow(b, 2)) - (4 * a * c );
		
		if(delta > 0) {
			x1 = ((b * -1) + (Math.sqrt(delta))) / (2 * a);
			x2 = ((b * -1) - (Math.sqrt(delta))) / (2 * a);
			System.out.println("As raízes da equação são " + x1 + " e " + x2);			
		} else if (delta == 0) {
			x1 = ((b * -1) + (Math.sqrt(delta))) / (2 * a);
			System.out.println("As raízes da equação são ambas " + x1);
		} else {
			System.out.println("Não existe raízes reais");
		}
	}
}
