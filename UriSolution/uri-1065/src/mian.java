import java.util.Scanner;

public class mian {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float[] a = new float[5];
		int c=0;
		
		for(int i=0; i<a.length;i++) {
			a[i]=input.nextFloat();
			if(a[i]>0) {
				c++;

			}
		}
		System.out.println(c+" valores positivos");


	}

}