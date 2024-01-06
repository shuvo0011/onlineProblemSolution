import java.util.Scanner;

public class main {
	
	public static void main(String[] avgs) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int[] sum = new int[a];
		
		int b,c;
		
		for (int i=0; i<a;i++) {
			
			b = input.nextInt();
			c = input.nextInt();
			if(b>c) {
				int t=b;
				b=c;
				c=t;
			}

			for(int j=b+1;j<c;j++) {
				if(j%2!=0) {
					sum[i]+=j;
				}
			}
			
		}
		
		
		for(int i=0;i<a;i++) {
			System.out.println(sum[i]);
		}
		
	}

}
