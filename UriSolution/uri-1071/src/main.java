import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int p=0,m;
		int a = input.nextInt();
		int b = input.nextInt();
		
		if(a>b) {
			m=a;
			a=b;
			b=m;
		}
		
		for(int i=a+1; i<b;i++) {
			if(i%2!=0) {
				p=p+i;
			}
		}
		System.out.println(p);
	}

}