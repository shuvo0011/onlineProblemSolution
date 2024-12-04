import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int i,v;
		
		System.out.println("enter integer");
		v = input.nextInt();
		
		for(i=1;i<=v;i++) {
			
			if((v%i)==0) {
				System.out.println(i);
			}
		}
		

	}

}
