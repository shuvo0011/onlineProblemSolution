import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int  a,n,sum=0;
		
		a = input.nextInt();
		n = input.nextInt();
		

		
		while(n<1) {
			n = input.nextInt();
		}
		
	
		for(int i=1; i<=n; i++) {
			sum=sum+a;
			a++;
		}
		
		System.out.println(" "+sum);

	}

}
