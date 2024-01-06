import java.util.Scanner;

public class main {
	
	
	int[] ascending(int[] x) 
	{
		
		int[] y = new int[3];
		
		if(x[0]>x[1] && x[0]>x[2]) 
		{
				y[0]=x[0];
				if(x[1]>x[2]) {
					y[1]=x[1];
					y[2]=x[2];
				}else {
					y[1]=x[2];
					y[2]=x[1];
				}
		}
		else if(x[0]<x[1] && x[0]<x[2])
		{
			if(x[1]>x[2]) {
				y[0]=x[1];
				y[1]=x[2];
			}
			else {
				y[0]=x[2];
				y[1]=x[1];
			}
			y[2]=x[0];
		}
		else if(x[0]>x[1] && x[0]<x[2])
		{
			if(x[1]>x[2]) {
				y[0]=x[1];
				y[2]=x[2];
			}
			else {
				y[0]=x[2];
				y[2]=x[1];
			}
			y[1]=x[0];
		}
		else if(x[0]<x[1] && x[0]>x[2])
		{
			if(x[1]<x[2]) {
				y[0]=x[2];
				y[2]=x[1];
			}
			else {
				y[0]=x[1];
				y[2]=x[2];
			}
			y[1]=x[0];
		}
		
		return y;
		
	}
	

	public static void main(String[] avgs) {
		
		Scanner input = new Scanner(System.in);
		main ob = new main();
		int[] x=new int[3];
		for (int i=0 ; i<3 ; i++) {
			x[i] = input.nextInt();
		}
		
		
		x = ob.ascending(x);
		
		for (int i=0 ; i<3 ; i++) {
			System.out.println(x[i]);
		}
		
		
		
	}


	
	
}


