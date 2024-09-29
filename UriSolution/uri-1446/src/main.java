import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		for(int a=1; a<=x; a++) {
			if(x==0) {
				break;
			}
			System.out.print(a);
		}
		

	}

}
