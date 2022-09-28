import java.util.Scanner;

public class main {
	public static void main(String[] avgs) {
		
		Scanner input = new Scanner(System.in);
		float[] a=new float[6];
		int sum=0;
		
		for (int i=0; i<6; i++) {
			a[i]= input.nextFloat();
			if(a[i]>0) {
				sum++;
			}
		}
		
		System.out.println(sum);
		
	}

}
