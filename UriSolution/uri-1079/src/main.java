import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		float sum=0;
		
		float[][] m= new float[a][3];
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<3;j++) {
				m[i][j]=input.nextFloat();
			}
			
			System.out.print("new");
		}
		
		for(int i=0;i<a;i++) {
			sum = m[i][0]*2+m[i][1]*3+m[i][2]*5;
			System.out.println(sum/10);
			
		}
		

	}

}
