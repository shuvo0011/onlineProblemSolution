import java.util.Scanner;

public class mian {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float[] a = new float[5];
		int c=0,d=0,e=0,f=0;
		
		for(int i=0; i<a.length;i++) {
			a[i]=input.nextFloat();
			if(a[i]>=0) {
				c++;
			}
			else if(a[i]<0) {
				d++;
			}else if(a[i]%2==0) {
				e++;
			}
			else if(a[i]%2!=0) {
				f++;
			}
		}
		
		System.out.println(e+" valores par");
		System.out.println(f+" valores imar");
		System.out.println(c+" valores positivos");
		System.out.println(d+" valores negative");


	}

}