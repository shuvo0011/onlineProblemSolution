import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sum=0;
		
		int m = input.nextInt();
		
		for(int i=1;i<m;i++) {
			
			if(m%i==0) {
				sum=sum+i;
			}
		}
		
		if(sum==m) {
			System.out.println(sum);
		}else {
			System.out.println("finish");
		}
		
		
	}

}
