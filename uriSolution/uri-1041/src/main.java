import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float x,y;
		
		x = input.nextFloat();
		y = input.nextFloat();
		
		if(x==0 && y==0) {
			System.out.println("Origem");
		}
		else if(y==0) {
			System.out.println("Eixo X");
		}
		else if(x==0) {
			System.out.println("Eixo Y");
		}
		else if(x>0 && y>0) {
			System.out.println("Q1");
		}
		else if(x<0 && y>0) {
			System.out.println("Q2");
		}
		else if(x<0 && y<0) {
			System.out.println("Q3");
		}
		else if(x>0 && y<0) {
			System.out.println("Q4");
		}
		
		
		

	}

}
