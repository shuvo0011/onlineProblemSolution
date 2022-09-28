import java.util.Scanner;

public class mian {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		for(int i=0; i<a;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}

		}
	}

}