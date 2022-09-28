import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		float a,b,c;
		
		a = input.nextFloat();
		b = input.nextFloat();
		c = input.nextFloat();
		
		float s = a+b+c;
		float t = ((a+b)/2)*c;
		
		if(a+b>c && b+c>a && c+a>b ) {
			System.out.println("Perimetro = "+s);
		}
		else{
			
			System.out.println("Area = "+t);
			
		}

	}

}
