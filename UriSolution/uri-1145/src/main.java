import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x,y,c;
		
		x = input.nextInt();
		y = input.nextInt();
		
		c = 1;
		
		for(int a=1; a<=y;) {
			for(int b=1;b<=x;b++) {
				System.out.print(c+" ");
				c++;
				a++;
			}
			System.out.println();
		}
		

	}

}
