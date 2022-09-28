import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int c=0;
		
		int n = input.nextInt();
		
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				c++;
			}
		}
		
		if(c>0) {
			System.out.println("not prime number");
		}else {
			System.out.println("priime");
		}

	}

}
