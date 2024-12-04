import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for(int i=1;i<=n;i++) {

			for(int j=1;j<4;j++) {
				System.out.print(Math.pow(i, j)+" ");
			}
			
			System.out.println();
		}

	}

}
