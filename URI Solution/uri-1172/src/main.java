import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] x = new int[10];
		
		//int n = input.nextInt();
		
		for(int i=0;i<x.length;i++ ) {
			x[i] = input.nextInt();
			if(x[i]==0 || x[i]<0) {
				x[i]=1;
			}
		}
		
//		for(int i=0; i<x.length;i++) {
//			if(x[i]==0 || x[i]<0) {
//				x[i]=1;
//			}
//		}
		
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
		
	}

}
