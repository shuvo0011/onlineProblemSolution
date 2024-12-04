import java.util.Scanner;

public class main {
	
	public static void main(String[] avgs) {
		
		Scanner input = new Scanner(System.in);
		int a,b;
		
		a = input.nextInt();
		b = input.nextInt();
		
		if(b%a==0) {
			System.out.print("Sao Multiplos ");
		}
		else {
			System.out.println("Nao sao Multiplos ");
		}
		
	}

}
