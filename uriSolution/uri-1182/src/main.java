import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		int c ;
		String t;
		int[][] a = new int[12][12];
	
		double sum=0;
		
		Scanner input = new Scanner(System.in);
		
		
		for(int i=0; i<12;i++) {
			for(int j=0;j<12;j++) {
				a[i][j] = (i+1)*(j+1);
			}
		}
		
		for(int i=0; i<12;i++) {
			for(int j=0;j<12;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
			
			
		c = input.nextInt();
		
		
		
		for(int i=0;i<12;i++) {
			sum = sum+a[i][c];
		}
		
		System.out.println(sum);
		
		
		
		
	}

}
