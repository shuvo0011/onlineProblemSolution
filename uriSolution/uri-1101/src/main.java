import java.util.Scanner;

public class main {

	
	public static void main(String[] avgs) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int sum=0;
		
		if(a>b) {
			int t=a;
			a=b;
			b=t;
		}
		
		for(int i=a;i<=b;i++) {
			System.out.print(i+" ");
			sum+=i;
		}
		System.out.print(sum);
		
	}
	
}
