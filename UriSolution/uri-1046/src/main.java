import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a,b;
		
		a=input.nextInt();
		b=input.nextInt();
		
		if(a==b) {
			System.out.println("O JOGO DUROU "+(24-a-b)+" HORA (S)");
		}
		else if(a>b) {
			System.out.println("O JOGO DUROU "+(24-(a-b))+" HORA (S)");
		}else if(a<b) {
			System.out.println("O JOGO DUROU "+(b-a)+" HORA (S)");
		}

	}

}
