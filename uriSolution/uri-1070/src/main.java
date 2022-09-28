import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		for(int i=a; i<a+12;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}