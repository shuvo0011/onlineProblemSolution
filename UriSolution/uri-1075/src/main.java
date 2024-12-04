import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		for(int i=0;i<=1000;i++) {
			if(i%a==2) {
				System.out.println(i);
			}
		}
		

	}

}
